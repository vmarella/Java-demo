// create an interface
interface Name {
  void getName(String name);
}

class Registration implements Name {

  // implementation of abstract method
  public void getName(String name) {
    System.out.println("Programming Language: " + name);
  }
}

class Main {
  public static void main(String[] args) {
    Registration reg = new Registration();
    reg.getName("Java");
  }
}
