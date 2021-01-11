import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int num1;
    String word1;
    Apples blechApples =  new Apples();

    System.out.print("Pick an int: ");
    num1 = kb.nextInt();
    System.out.print("What doesn't rhyme with \"orange\"? ");
    kb.nextLine();
    word1 = kb.nextLine();

    System.out.println("Hello world!");

    System.out.println("Today's lesson is brought to you by the number " + num1 + " and the word " + word1 + ".");

    System.out.println(blechApples);

  }// end main method
}// end Main class