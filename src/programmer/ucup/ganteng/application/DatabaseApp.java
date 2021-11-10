package programmer.ucup.ganteng.application;

import programmer.ucup.ganteng.error.DatabaseError;

public class DatabaseApp {

  public static void main(String[] args) {
    connectDatabase("ucup", null);
    System.out.println("Sukses");
  }

  public static void connectDatabase(String username, String password) {
    if (username == null || password == null) {
      throw new DatabaseError("Gagal terhubung ke database");
    }
  }
}
