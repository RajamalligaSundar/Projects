import java.util.Scanner;

public class tictactoe
{
    static Scanner sc = new Scanner(System.in);
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
        String name = sc.nextLine();
        return name;
    }
    public static void Print_GameRules()
    {
        Print("-------------------------------------------------------------------------------------------\n");
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
    public static void Game_Board()
    {
        String[][] array = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        Print_2D_Array(array);
    }
    
    public static void Play_Game()
    {
        Print_GameRules();
        Print("Enter Name of Player 1: ");
        String player1 = Get_PlayerName();
        Print("Enter Name of Player 2: ");
        String player2 = Get_PlayerName();

        
        Game_Board();
        
    }

}