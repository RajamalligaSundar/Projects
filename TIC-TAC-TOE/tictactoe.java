import java.util.Random;
import java.util.Scanner;

public class tictactoe
{
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    public static void main(String[] args)
    {
       Play_Game();
    }
    public static void Print(String message)
    {
        System.out.println(message);
    }
    public static String Get_PlayerName()
    {
        String name = sc.next();
        return name;
    }
    public static void Print_GameRules()
    {
        Print("\n-------------------------------------------------------------------------------------------\n");
        Print("TIC-TAC-TOE\n\nGAME RULES:\n1. Enter Player Name\n2. Choose X or O\n3. Enter position where you want to place\n4. Wait for the other player to play \n5. Results are declared based on the game played\n");
        Print("-------------------------------------------------------------------------------------------\nLet's Play");
    }
    public static void Print_2D_Array(String[][] array)
    {
        String x ="\n\t |\t |\t |";
        x+="\n  _________________________________\n\n";
        for(int i=0; i<array[0].length;i++)
        {
            for(int j=0; j<array[1].length; j++)
            {
                x+= "\t | "+array[i][j];
            }
           x+="\n  _________________________________\n\n";
        }
        x+="\t |\t |\t |\n";
        System.out.println(x);
    }
    public static String[][] Game_Board(String[][] array)
    {
        //String[][] array = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
        Print_2D_Array(array);
        return array;
    }
    public static String Toss_To_Start(String player1, String player2) 
    {
        Print("\nRandom Toss Is Done To Make the any of you to Start first ");
        int result = r.nextInt(1,3);
        if (result == 1)
        {
            Print("\n"+player1+", You can start the game\n");
            return player1;
        }
        else{
            Print("\n"+player2+", You can start the game \n");
            return player2;
        }            
    }
  
    public static void Game_Flow(String[][] array, String toss_won, String player1, String Player2, String choice1, String choice2)
    {
        String [][]new_array = array;
        Boolean flag = true;
        String x="";
        String element ="";
        int count = 0; 

            if(toss_won == player1)
            {
                element = choice1;
                Print("Enter row (0-2): ");
                int row = sc.nextInt();
                Print("Enter column (0-2): ");
                int column = sc.nextInt();

                new_array[row][column] = element;
                Print_2D_Array(new_array);
                count++;
            }
            else if(toss_won == Player2)
            {
                element = choice2;
                Print("Enter row (0-2): ");
                int row = sc.nextInt();
                Print("Enter column (0-2): ");
                int column = sc.nextInt();

                new_array[row][column] = element;
                Print_2D_Array(new_array);
                count++;
            }


    }

    public static void Play_Game()
    {
        Print_GameRules();
        String[][] array = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};

        Print("\nEnter Name of Player 1: ");
        String player1 = Get_PlayerName();

        Print("Enter choice (X) or (O): ");
        String choice1 = sc.next();

        Print("\nEnter Name of Player 2: ");
        String player2 = Get_PlayerName();

        String choice2 = "";

        if (choice1 == "x")
        {
            choice2 = "o";
            Print("Your Play Sign is: "+choice2);
        }
        else
        {
            choice2 = "x";
            Print("Your Play Sign is: "+choice2);
        }
        
        Game_Board(array); 
        String toss_won = Toss_To_Start(player1, player2);
        Game_Flow(array,toss_won, player1, player2, choice1, choice2);

        
        
    }

}