public class ManagerApp {

  public static void main(String[] args) {

    var manager = new Manager("Yusuf");
    manager.sayHello("Budi");

    var vp = new VicePresident("Cakcup");
    vp.name = "Cakcup";
    vp.sayHello("Budi");
  }
}
