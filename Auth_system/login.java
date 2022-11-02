package Auth_system;
import java.util.*;

class login
{
    Scanner sc = new Scanner(System.in);
    String username="";
    private String password=""; 
    public String get_username()
    {   ;return username;  }
    
    public void set_username(String username)
    {   this.username = username;   }

    //password
    public String get_password()
    {     return password;  }
    
    public void set_password(String password)
    {   this.password = password;   }

    public void Login_User()
    {
        System.out.println("\nLogin to your Account\n");
        System.out.print("Enter User Name: ");
        set_username(sc.next());
        System.out.print("Enter Password: ");
        set_password(sc.next());
    }
}