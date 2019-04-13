//Import scanner class
import java.util.Scanner;
//My class
class MyProject {
  //Executeable code
  public static void main(String[] args) {
    //Creating scanner object
    Scanner myObj = new Scanner(System.in);
    //Print out line of text to screen
    System.out.println("Enter length of room in meters");
    //Read users inputted floating point number
    Float length = myObj.nextFloat();
    //Print out line of text to screen
    System.out.println("Enter width of room in meters");
    //Read users inputted floating point number
    Float width = myObj.nextFloat();
    //Print out line of text to screen
    System.out.println("Enter height of room in meters");
    //Read users inputted floating point number
    Float height = myObj.nextFloat();
    //Use users input to calculate the volume of the room
    Float volume = length * width * height;
    //Print out volume of the room in metres squared
    System.out.println("The volume of the room is: " + volume + "m\u00B2");
    //Use users input to calculate the area of the room
    Float area = length * width;
    //Print out area of the room in metres squared
    System.out.println("The area of the floor is: " + area + "m\u00B2");
    //Use users input to calculate the shortest wall area
    Float widthWalls = width * height;
    //Use users input to calculate the longest wall area
    Float lengthWalls = length * height;
    //Assuming no doors and windows - calculate the extra two walls
    Float allWidthWalls = widthWalls * 2;
    Float allLengthWalls = lengthWalls * 2;
    //Calculate the area of all the walls
    Float allWalls = allWidthWalls + allLengthWalls;
    //Calculate the amount of paint in litres required for the area of wall
    Float litres = allWalls / 12;
    //Print out amount of paint needed
    System.out.println("You will need: " + Math.ceil(litres) + " litres of paint");
  }
}
