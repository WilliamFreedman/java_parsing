import javalang


def extract_methods(node,method_map):
    if isinstance(node, javalang.tree.MethodDeclaration):
        method_map[node.name] = node


def is_recursive_method(java_code: str, method_name: str) -> bool:
    tree = javalang.parse.parse(java_code)

    method_map = {}

    for path, node in tree:
        extract_methods(node,method_map)

    def check_recursion(method_node, visited_methods):
        if method_node.name in visited_methods:
            return True

        visited_methods.add(method_node.name)

        for path, node in method_node:
            if isinstance(node, javalang.tree.MethodInvocation):
                invoked_method_name = node.member
                if invoked_method_name == method_node.name:
                    return True
                if invoked_method_name in method_map:
                    if check_recursion(method_map[invoked_method_name], visited_methods):
                        return True
        visited_methods.remove(method_node.name)
        return False
    if method_name not in method_map:
        raise ValueError(f"Method '{method_name}' not found in the provided Java code.")

    return check_recursion(method_map[method_name], set())


def is_iterative_method(java_code: str, method_name: str) -> bool:

    tree = javalang.parse.parse(java_code)

    method_map = {}

    for path, node in tree:
        extract_methods(node,method_map)

    def check_for_loops(method_node, visited_methods):
        if method_node.name in visited_methods:
            return False

        visited_methods.add(method_node.name)

        for path, node in method_node:
            if isinstance(node, (javalang.tree.ForStatement,
                                 javalang.tree.WhileStatement,
                                 javalang.tree.DoStatement)):
                return True

            if isinstance(node, javalang.tree.MethodInvocation):
                invoked_method_name = node.member
                if invoked_method_name in method_map:
                    if check_for_loops(method_map[invoked_method_name], visited_methods):
                        return True

        return False

    if method_name not in method_map:
        raise ValueError(f"Method '{method_name}' not found in the provided Java code.")

    return check_for_loops(method_map[method_name], set())
