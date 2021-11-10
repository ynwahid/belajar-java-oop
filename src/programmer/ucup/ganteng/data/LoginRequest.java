package programmer.ucup.ganteng.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("","");
    }
}
