package programmer.ucup.ganteng.application;

import programmer.ucup.ganteng.annotation.Fancy;
import programmer.ucup.ganteng.data.LoginRequest;
import programmer.ucup.ganteng.error.ValidationException;
import programmer.ucup.ganteng.util.ValidationUtil;

public class ValidationApp {

  @Fancy(name = "ValidationMainMethod", tags = {"application", "java"})
  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("Yusuf", "Rahasia");
    //    LoginRequest loginRequest = new LoginRequest(null, null);

    try {
      ValidationUtil.validate(loginRequest);
      System.out.println("Data valid");
    } catch (ValidationException | NullPointerException exception) {
      System.out.println("Data tidak valid: " + exception.getMessage());
    } finally {
      System.out.println("Selalu dieksekusi");
    }

    LoginRequest loginRequest2 = new LoginRequest(null, null);
    ValidationUtil.validateRuntime(loginRequest2);
    System.out.println("Success");
  }
}
