public class Polymorphism {

  public static void main(String[] args) {

    Employee employee = new Employee("Yusuf");
    employee.sayHello("Budi");

    employee = new Manager("Yusuf");
    employee.sayHello("Budi");

    employee = new VicePresident("Yusuf");
    employee.sayHello("Budi");

    sayHello(new Employee("Cakcup"));
    sayHello(new Manager("Nur"));
    sayHello(new VicePresident("Ucup"));
  }

  //  Method polymorphism
  static void sayHello(Employee employee) {
    System.out.println("Hello " + employee.name);
  }
}
