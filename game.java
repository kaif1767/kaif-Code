//Write a Java program to create a simple stone paper scissor game. 
import java.util.*;
import java.util.random.*;
public class game 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner (System.in);
      Random r=new Random();
      System.out.println("Apna naem bataiye");
      String name=sc.nextLine();
      int c=0;
      int u=0;
      for(int i=0;i<11;i++)
      {
        System.out.println("Choose a random (stone, paper, scissor):");
        String user=sc.nextLine();
        int bot=r.nextInt(3);
        switch (user.toLowerCase()) 
        {
          case "scissor":
          if(bot==0)
          {
            System.out.println("computer win the point with stone");
            c++;
          }
          else if(bot==1)
          {
            System.out.println("computer loose the point with paper");
            u++;  
          }
          else
          {
            System.out.println("computer and "+ name  +" both choose scissor");
          }
            break;
              
          case "stone":
          if(bot==1)
          {
            System.out.println("computer win the point with paper");
            c++;
          }
          else if(bot==2)
          {
            System.out.println("computer loose the game with scissor");
            u++;
          }
          else
          {
            System.out.println("computer and "+ name  +" both choose stone");
          }
            break;

          case "paper":
          if(bot==0)
          {
            System.out.println("computer loose the point with stone");
            u++;
          }
          else if(bot==2)
          {
            System.out.println("computer wins the point with scissor");
            c++; 
          }
          else
          {
            System.out.println("computer and "+ name  +" both choose paper");
          } 
            break;              
          default:   
          System.out.println("wrong input typed");
          i--;
          break;
            
        }
      }

    
      System.out.println( );
      System.out.println("        ~~~~~GAME OVER~~~~~     ");
      System.out.println( );
      System.out.println("    ~~~~~CONCLUSION OF THE GAME~~~~~");
      System.out.println( );
      if(u>c)
      {
        System.out.println(name + " win the game with " + u + " points and Computer loose the game with " + c + " points");
      }
      else if(c>u)
      {
        System.out.println("Computer wins the game with " + c + " points and " + name +" loose the game with " + u + " points");
      }
      else
      {
        System.out.println("Game draw with " + c + " points");
      }
    }
  }