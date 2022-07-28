import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    boolean c1, c2;
    int f1distance = 0; int f2distance = 0;
    int f1jump; int f2jump;
    Frog f1 = new Frog("Joffrey");
    Frog f2 = new Frog("Harry");
    System.out.println(f1);
    System.out.println(f2);
    System.out.println("Do you Want to Cheer for " + f1.getName() + "? Give a True or False Answer (ex: true/false)");
    c1 = input.nextBoolean();
    System.out.println("Do you Want to Cheer for " + f2.getName() + "? Give a True or False Answer (ex: true/false)");
    c2 = input.nextBoolean();
    System.out.println("Click ENTER to Begin...");
    input.nextLine();
    input.close();
    while (f1distance < 96 && f2distance < 96)
    {
      char ch = ' ';
      //Frog 1
      String Frog1A = "  o";
      String Frog1B = "_`O'_";
      //Frog 2
      String Frog2A = "  o";
      String Frog2B = "_`O'_";
      String space = "\n";
      //Jumping Stuff
      f1jump = f1.Jump(c1);
      f2jump = f2.Jump(c2);
      f1distance += f1jump;
      f2distance += f2jump; 
      //Frog 1 Movement
      for(int x = 0; x < f1distance; x++)
      {
        Frog1A = ch + Frog1A;
        Frog1B = ch + Frog1B;
      }
      //Frog 2 Movement
      for(int x = 0; x < f2distance; x++)
      {
        Frog2A = ch + Frog2A;
        Frog2B = ch + Frog2B;
      }
      //Spacing
      for(int x = 0; x < 30; x++)
      {
        System.out.println(space);
      }
      //Printing
      System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
      System.out.println(Frog1A);
      System.out.println(Frog1B);
      System.out.println("---------------------------------------------------------------------------------------------------------------");
      System.out.println(Frog2A);
      System.out.println(Frog2B);
      System.out.println("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"); 
      System.out.println(f1.getName() + " Total Distance: " + f1distance);
      System.out.println(f2.getName() + " Total Distance: " + f2distance);
      System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
      try 
      {
        Thread.sleep(300);
      } 
      catch (InterruptedException ie) 
      {
        Thread.currentThread().interrupt();
      }
    }
    if (f1distance >= 96)
    {
      System.out.println(f1.getName() + " Won!!!!!");
    }
    else
    {
      System.out.println(f2.getName() + " Won!!!!!");
    }
  }
}