from java_parse import is_iterative_method, is_recursive_method
file_map = {
    "file1.java": [
        ("iterativeMethod", False, True),
        ("recursiveMethod", True, False),
        ("mixedMethod", True, True),
    ],
    "file2.java": [
        ("isEven", True, False),
        ("isOdd", True, False),
        ("nestedIteration", False, True),
    ],
    "file3.java": [
        ("factorial", True, False),
        ("iterativeWhileLoop", False, True),
        ("combineRecursionAndIteration", True, True),
    ],
    "file4.java": [
        ("tailRecursiveSum", True, False),
        ("iterativeWithRecursion", True, True),
        ("simpleIteration", False, True),
    ],
    "file5.java": [
        ("doubleRecursion", True, False),
        ("iterativeFibonacci", False, True),
        ("hybridFibonacci", True, True),
    ],
    "file6.java": [
        ("mutualA", True, False),
        ("mutualB", True, False),
        ("iterationWithComplexCondition", False, True),
    ],
    "file7.java": [
        ("recursiveFactorial", True, False),
        ("iterativeSum", False, True),
        ("recursiveSumWithIteration", True, True),
    ]
}


idx = 1
for i in file_map:
    with open(f"./test_files/{i}", 'r') as file:
        data = file.read()
    good = True
    for j in file_map[i]:
        method_name = j[0]
        if is_recursive_method(data, method_name) != j[1]:
            print(f"Recursive error in {i}")
            good = False
        if is_iterative_method(data, method_name) != j[2]:
            print(f"Recursive error in {i}")
            good = False
    print(f"Passed on {i}")
