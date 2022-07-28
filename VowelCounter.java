import java.util.Scanner;
class VowelCounter{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String statement;
    System.out.print("Welcome!\nThis program's purpose is to demonstrate the understading of 'for' statements and character counting of a string of your choice. \nEnjoy - Josiah Uwanaka Jr");
    System.out.println("\n\nWhat is your Word/Phrase?");
    statement = input.nextLine();
    input.close();
    int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0, counts = 0;
    for (int x = 0; x < statement.length(); x++){
      char ch = statement.charAt(x);
      if (ch == 'a' || ch == 'A'){
        counta++;
      }
      else if (ch == 'e' || ch == 'E'){
        counte++;
      }
      else if (ch == 'i' || ch == 'I'){
        counti++;
      }
      else if (ch == 'o' || ch == 'O'){
        counto++;
      }
      else if (ch == 'u' || ch == 'U'){
        countu++;
      }
      else if (ch == ' '){
        counts++;
      }
    }
    System.out.println("\nStatement: " + statement + "\nNumbers of A's: " + counta + "\nNumbers of E's: " + counte + "\nNumbers of I's: " + counti + "\nNumbers of O's: " + counto + "\nNumbers of U's: " + countu + "\nNumbers of Spaces: " + counts + "\n\nHope You Enjoyed!");
  }
}