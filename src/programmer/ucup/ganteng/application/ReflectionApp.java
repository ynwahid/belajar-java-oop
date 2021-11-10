package programmer.ucup.ganteng.application;

import programmer.ucup.ganteng.data.CreateUserRequest;
import programmer.ucup.ganteng.util.ValidationUtil;

public class ReflectionApp {

  public static void main(String[] args) {

    CreateUserRequest request = new CreateUserRequest();
    request.setUsername("Ucup");
    request.setPassword("Rahasia");
    request.setName("Yusuf");

    ValidationUtil.validationReflection(request);
  }
}
