import java.util.Scanner;
class Demo implements Room
{
  Scanner keyboard = new Scanner(System.in);
  
  demo()
  {
    System.out.println("Please enter the first letter of the room you'd like to observe.");
    System.out.println("Bedroom: 'b' , or , Living Room 'l'.");
  
    Char input = keyboard.nextChar();
    System.out.println("You chose " + input ". We will now be entering that room.");
  
    if(input == 'b' || input == 'B')
    {
      bedroom();
    }
    else if(input == 'l' || input == 'L')
    {
      livingRoom();
    }
  
    System.out.println("Would you like to choose another room? (Y/N)");
    input = keyboard.nextChar();
    if(input == 'y' || input == 'Y')
    {
      demo();
    }
    else if(input == 'n' || input == 'N')
    {
      System.exit();
    }
}
