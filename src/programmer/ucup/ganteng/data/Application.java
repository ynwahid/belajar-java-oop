package programmer.ucup.ganteng.data;

public class Application {

  public static final int PROCESSORS;

  static {
    System.out.println("Mengakses class application");
    PROCESSORS = Runtime.getRuntime().availableProcessors();
  }
}
