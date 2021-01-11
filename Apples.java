//This is a reference class

class Apples
{
  //1) Instance Variables
  private String type;
  private double size; //inches in diameter
  private boolean isTart;
  private int redness;  //0 = no red; 10 = all red

  //2) Constructors
  public Apples ()
  {
    type = null;
    size = 0;
    isTart = false;
    redness = 0;
  }//end zero-arg constructor


  //3) toString
  public String toString()
  {
    String output = "Type: " + type +
                    "\nSize (inches diameter): " + size +
                    "\nIs it tart?: " + isTart +
                    "\nAmount of red (0-10): " + redness;
    return output; 
  }//end toString
}//end class Apples