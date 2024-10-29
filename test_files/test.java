// importing the File class
import java.io.File;

class Main {
  private int fib(int n)
  {
    if (n==0 || n ==1)
    {
        return 0;
    }
    return fib2(n-1)+fib2(n-2);
  }
  private int fib2(int n)
  {
    if (n==0 || n ==1)
    {
        return 0;
    }
    return fib(n-1)+fib(n-2);
  }
  public static void main(String[] args) {
    fib(1);

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {
      while (True)
      {
        break;
      }
      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}