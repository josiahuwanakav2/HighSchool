public class Frog
{
  private int distance = 0;
  private int strength;
  private int cheerpower;
  private String name;
  Frog(String pname)
  {
    name = pname;
    strength = (int)(Math.random()*5) + 4;
    cheerpower = (int)(Math.random()*5) + 1;
  }
  public int getStrenth()
  {
    return strength;
  }
  public int getCheerPower()
  {
    return cheerpower;
  }
  public String getName()
  {
    return name;
  }
  
  public int Jump(boolean cheer)
  {
    int jump = 0;
    jump += (int)(Math.random()*(strength - 0));
    if (cheer)
    {
      jump += (int)(Math.random()*(cheerpower - (-3))) - 3;
    }
    return jump;
  }
  public int getDistance()
  {
    return distance;
  }
  public String toString()
  {
    return "Name: " + name + "||Strength: " + strength + "|| Cheer Power: " + cheerpower;
  }
}