package Ex_080102024;

public class lab095 {
    public static void main(String[] args) {
        VmoLogin vmologin =new VmoLogin("sandy","pwd1234");
        System.out.println(vmologin.getUsername());
        vmologin.setPassword("premji",true);
        System.out.println(vmologin.getPassword());
    }

}

class VmoLogin {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isauth) {
        if (isauth){
            this.password = password;
    } else {
            System.out.println("not allowed ");
        }}

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    public VmoLogin(String username, String password){
          this.username=username;
          this.password=password;


     }


}



