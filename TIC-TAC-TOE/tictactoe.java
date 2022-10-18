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
        Print("\n-------------------------------------------------------------------------------------------\nTIC-TAC-TOE\n\nGAME RULES:\n1. Enter Player Name\n2. Choose X or O\n3. Enter position where you want to place\n4. Wait for the other player to play \n5. Results are declared based on the game played\n-------------------------------------------------------------------------------------------\nLet's Play");
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
        Print("\nRandom Toss Is Done To Make any of you two to Start first ");
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

    public static void choice1(String choice1, String[][] new_array, String choice2, int count)
    {
        String element = choice1;
        Print("Enter row (1-3): ");
        int row = sc.nextInt();
        Print("Enter column (1-3): ");
        int column = sc.nextInt();
        count++;

        new_array[row-1][column-1] = element;
        Print_2D_Array(new_array);
        //System.out.println(count);
        String win = Winning_State(new_array, count);
        if (win.equals("none"))
        {
        choice2(choice2, new_array, choice1, count);
        }
    }

    public static void choice2(String choice2, String[][] new_array, String choice1, int count)
    {
        String element = choice2;
        Print("Enter row (1-3): ");
        int row = sc.nextInt();
        Print("Enter column (1-3): ");
        int column = sc.nextInt();
        count++;

        new_array[row-1][column-1] = element;
        Print_2D_Array(new_array);
        //System.out.println(count);
        String win = Winning_State(new_array, count);
        if (win.equals("none"))
        {
        choice1(choice1, new_array, choice2, count);
        }
    }

    public static String Winning_State(String[][] new_array, int count)
    {
        String a ="x";
        String b ="0";
        String draw = "draw";
        String x="xxx";
        String y ="ooo";
        
        if (count>=5)
        {
        //System.out.println(count);
        String x1 = new_array[0][0]+new_array[0][1]+new_array[0][2]; //1
        if (x1.equals(x)) 
        {
            System.out.println("x won");
            return a;
        }
        String y1 = new_array[0][0]+new_array[0][1]+new_array[0][2];
        if(y1.equals(y))
        {
            System.out.println("o won");
            return b;
        }
        String x2 = new_array[1][0]+new_array[1][1]+new_array[1][2]; //2
        if(x2.equals(x)) 
        {
            System.out.println("x won");
            return a;
        }
        String y2 = new_array[1][0]+new_array[1][1]+new_array[1][2];
        if(y2.equals(y))
        {
            System.out.println("o won");
            return b;
        }
        String x3 = new_array[2][0]+new_array[2][1]+new_array[2][2];//3
        if(x3.equals(x)) 
        {
            System.out.println("x won");
            return a;
        }
        String y3 = new_array[2][0]+new_array[2][1]+new_array[2][2];
        if(y3.equals(y))
        {
            System.out.println("o won");
            return b;
        }
        String x4 = new_array[0][0]+new_array[1][0]+new_array[2][0]; //4
        if(x4.equals(x))
        {
            System.out.println("x won");
            return a;
        }
        String y4 = new_array[0][0]+new_array[1][0]+new_array[2][0];
        if(y4.equals(y)) 
        {
             System.out.println("o won");
             return b;
        }
        String x5 = new_array[0][1]+new_array[1][1]+new_array[2][1]; //5
        if(x5.equals(x)) 
        {
            System.out.println("x won");
            return a;
        }
        String y5 = new_array[0][1]+new_array[1][1]+new_array[2][1];
        if(y5.equals(y))
        {
            System.out.println("o won");
            return b;
        }
        String x6 = new_array[0][2]+new_array[1][2]+new_array[2][2]; //6
        if(x6.equals(x)) 
        {
            System.out.println("x won");
            return a;
        }
        String y6 = new_array[0][2]+new_array[1][2]+new_array[2][2]; 
        if(y6.equals(y)) 
        {
            System.out.println("o won");
            return b;
        }
        String x7 = new_array[0][0]+new_array[1][1]+new_array[2][2]; //7
        if(x7.equals(x)) 
        {
            System.out.println("x won");
            return a;
        }
        String y7 = new_array[0][0]+new_array[1][1]+new_array[2][2];
        if(y7.equals(y)) 
        {
            System.out.println("o won");
            return b;
        }
        String x8 = new_array[0][2]+new_array[1][1]+new_array[2][0];
        if(x8.equals(x)) //8 
        {
            System.out.println("x won");
            return a;
        }
        String y8 = new_array[0][2]+new_array[1][1]+new_array[2][0];
        if(y8.equals(y))
        {
            System.out.println("o won");
            return b;
        }
        else if (count==8)
        {
            System.out.println("draw");
            return draw;
        }
    }
    return "none";
    }
    public static void Game_Flow(String[][] array, String toss_won, String player1, String Player2, String choice1, String choice2)
    {
        String [][]new_array = array;
        //Boolean flag = true;
        String element ="";
        int count = 0; 

         if(toss_won == player1)
        {
            element = choice1;
            Print("Enter row (1-3): ");
            int row = sc.nextInt();
            Print("Enter column (1-3): ");
            int column = sc.nextInt();

            new_array[row-1][column-1] = element;
            Print_2D_Array(new_array);
            count++;
            choice2(choice2, new_array, choice1, count);
        }
        else if(toss_won == Player2)
        {
           element = choice2;
           Print("Enter row (1-3): ");
           int row = sc.nextInt();
           Print("Enter column (1-3): ");
           int column = sc.nextInt();

           new_array[row-1][column-1] = element;
           Print_2D_Array(new_array);
           count++;
           choice1(choice1, new_array, choice2, count);
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