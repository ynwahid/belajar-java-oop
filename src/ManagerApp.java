public class ManagerApp {

  public static void main(String[] args) {

    var manager = new Manager();
    manager.name = "Yusuf";
    manager.sayHello("Budi");

    var vp = new VicePresident();
    vp.name = "Cakcup";
    vp.sayHello("Budi");
  }
}
