public class PolymorphismApp {

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
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("Hello I'm VP " + vicePresident.name + ".");
    } else if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.println("Hello I'm Manager " + manager.name + ".");
    } else {
      System.out.println("Hello I'm Employee " + employee.name + ".");
    }
  }
}
