package Auth_system;
import java.util.*;

public class Authentication_System{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        new_user p1 = new new_user();
        login u1 = new login();
        System.out.println("\n\nEnter 1 for new registration and 2 for Signin");
        int check = sc.nextInt();
        int N=25;
        
        if(check == 1)
        {
            p1.New_Registration();
            u1.Login_User();
            if(p1.get_username().equals(u1.get_username())&&p1.get_password().equals(u1.get_password()))
            {
                System.out.println("\nLogin Successful\n\n");
            }

        }
        else if(check == 2)
        {
            System.out.println("Login");
            u1.Login_User();
            String[] username_list = new String[N];
            username_list = p1.user_name_list();
            String[] password_list = new String[N];
            password_list = p1.password_list();
            
            int user_count = 0;
            for(int i=0; i<username_list.length ;i++)
            {
                user_count++;
                if((username_list[i]).equals(u1.get_username()))
                {
                    break;
                }
            }
            int password_count = 0;
            for(int i=0; i<password_list.length ;i++)
            {
                password_count++;
                if((password_list[i]).equals(u1.get_password()))
                {
                    break;
                }
            }
            if(user_count == password_count)
            {
                System.out.println("Valid User");
            }
            else
            {
                System.out.println("Invalid User ---- Try again");
                u1.Login_User();
            }
        }
        else
        {
            System.out.println("Enter valid input");
        }
        
        //System.out.print(p1.get_name());
        


        
    }

}


