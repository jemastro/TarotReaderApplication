import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TarotDeck newDeck = new TarotDeck();
        //tarot pull :)
//        prompt the user for name
        Scanner userInput = new Scanner(System.in);

        System.out.println("Hi! What's your name?");
        String name = userInput.nextLine();
        System.out.println("Hi " + name + ", thanks for taking the time to look at my program. Would you like your tarot read?");
        String answer = userInput.nextLine();
        if (answer.startsWith("y") || answer.startsWith("Y")){
            System.out.println("Okay! Give me a moment and I will write the code :)");




        } else {
            System.out.println("Okay, have a good day, and come back if you would like a reading :)");
        }

//
//        pulls tarot card.
//
//                tarot spread is in linked hashmap (no order) so every pull will be random.
//
//        cards can be regular, or reversed
//
//        outputs to the user a sentence or two about their tarot pull.



    }
    }
