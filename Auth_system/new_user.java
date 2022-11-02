package Auth_system;
import java.util.*;

class new_user
{
    Scanner sc = new Scanner(System.in);
    private String name = "";
    private int age = 0;
    private String dob="";
    private String username="";
    private String password =""; 
    private String c_password =""; 
    
    //name
    public String get_name()
    {    return name;  }
    
    public void set_name(String name)
    {   this.name = name;   }

    //age 
    public int get_age()
    {    return age;  }
    
    public void set_age(int age)
    {   this.age = age;   }

    //dob
    public String get_dob()
    {  return dob;  }
    
    public void set_dob(String dob)
    {   this.dob = dob;   }

    //user_name
    public String get_username()
    {   ;return username;  }
    
    public void set_username(String username)
    {   this.username = username;   }

    //password
    public String get_password()
    {     return password;  }
    
    public void set_password(String password)
    {   this.password = password;   }

     //cpassword
     public String get_cpassword()
     {     return c_password;  }
     
     public void set_cpassword(String c_password)
     {   this.c_password = c_password;   }

    public void New_Registration()
    {
        System.out.println("\nNew-Registration\n");
        System.out.print("Enter Name: ");
        set_name(sc.next());
        System.out.print("Enter Age: ");
        set_age(sc.nextInt());
        System.out.print("Enter DOB: ");
        set_dob(sc.next());
        System.out.print("Enter User Name: ");
        set_username(sc.next());
        System.out.print("Enter Password: ");
        set_password(sc.next());
        System.out.print("Confirm Password: ");
        set_cpassword(sc.next());
        System.out.print("\nRegistered Successfully");
    }
    public String[] user_name_list()
    {
        String[] user_name_list = new String[100];
        for(int i=0; i<i+1; i++)
        {
            user_name_list[i]=get_username();
        }
        return user_name_list;
    }
    public String[] password_list()
    {
        String[] password_list = new String[100];
        for(int i=0; i<i+1; i++)
        {
            password_list[i]=get_password();
        }
        return password_list;
    }

}