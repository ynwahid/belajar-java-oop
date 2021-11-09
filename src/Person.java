class Person {
  final String country = "Indonesia";
  String name;
  String address;

  Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  Person(String paramName) {
    this(paramName, null);
  }

  Person() {
    this(null);
  }

  void sayHello(String name) {
    System.out.println("Hello " + name + ". My name is " + this.name + ".");
  }
}
