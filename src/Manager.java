class Manager {

  String name;
  String company;

  Manager(String name) {
    this.name = name;
  }

  Manager(String name, String company) {
    this.name = name;
    this.company = company;
  }

  void sayHello(String name) {
    System.out.println("Hi " + name + ". My name is Manager " + this.name + ".");
  }
}
