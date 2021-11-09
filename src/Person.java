class Person {
  final String country = "Indonesia";
  String name;
  String address;

  Person(String paramName, String paramAddress) {
    name = paramName;
    address = paramAddress;
  }

  Person(String paramName) {
    this(paramName, null);
  }

  Person() {
    this(null);
  }

  void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ". My name is " + name + ".");
  }
}
