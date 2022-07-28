public class MovingFrog {
    public static void main(String[] args) {
        char movement = ' ';
        String spacing = "\n";
        //Frog
        String Frog1 = "  o";
        String Frog2 = "_`O'_";
        for(int i = 0; i <= 15; i++)
        {
         for(int x = 0; x < 3; x++)
        {
            Frog1 = movement + Frog1;
            Frog2 = movement + Frog2;
        }
        for(int x = 0; x < 20; x++)
        {
            System.out.println(spacing);
        }
            System.out.println(Frog1);
            System.out.println(Frog2);
        try 
        {
            Thread.sleep(50);
        } 
        catch (InterruptedException ie) 
        {
            Thread.currentThread().interrupt();
        }
    }
    }
}