package programmer.ucup.ganteng.application;

import programmer.ucup.ganteng.data.LoginRequest;

public class RecordApp {

  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("Yusuf", "Rahasia");

    System.out.println(loginRequest.username());
    System.out.println(loginRequest.password());
    System.out.println(loginRequest);

    System.out.println(new LoginRequest());
    System.out.println(new LoginRequest("Yusuf"));
    System.out.println(new LoginRequest("Yusuf", "Rahasia"));
  }
}
