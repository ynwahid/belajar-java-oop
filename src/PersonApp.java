public class PersonApp {

  public static void main(String[] args) {

    var person1 = new Person("Yusuf", "Banyuwangi");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Budi");

    Person person2 = new Person("Joko");

    Person person3;
    person3 = new Person();
    person3.name = "Eko";
    person3.address = "Subang";
    person3.sayHello("Budi");
  }
}
