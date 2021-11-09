package programmer.ucup.ganteng.application;

public class EqualsApp {

  public static void main(String[] args) {

    String first = "Yusuf";
    first = first + " " + "Nur Wahid";

    System.out.println(first);

    String second = "Yusuf Nur Wahid";
    System.out.println(second);

    System.out.println(first == second);
    System.out.println(first.equals(second));

    String third = "Yusuf Nur Wahid";
    System.out.println(second == third);
    System.out.println(second.equals(third));
  }
}
