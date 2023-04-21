package edu.guilford;

import java.util.Random;
import java.util.ArrayList;

/**
 * These are some puppies made through a puppy class!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "These are some puppies made through a puppy class!" );
    

    //instantiate a puppy object
    puppy puppy1 = new puppy("Carrot", 1, "Labrador", "Brown", "Short", 10.5, false, true, 3000);
    puppy puppy2 = new puppy("Monnie", 2, "Chihuahua", "Golden", "Short", 6.5, false, true, 7642);
    puppy puppy3 = new puppy("Laila", 2, "German Shepard", "Black", "Long", 45.5, true, true, 8173);
    System.out.println(puppy1.toString());
    System.out.println(puppy2.toString());
    System.out.println(puppy3.toString());
    
    //different puppies saying different things
    System.out.println(puppy1.getName()+ " says");
    puppy1.bark();
    System.out.println(puppy2.getName()+ " says");
    puppy2.eat();
    System.out.println(puppy3.getName()+ " says");
    puppy3.cuddle();


    //creating an ArrayList object that will store objects
    ArrayList<dogfood> dogfoods = new ArrayList<dogfood>();
    dogfood nextdogfood = new dogfood();
    //A loop that instantiates at least five objects and adds them to the ArrayList
    
    //A loop that prints out the attributes of each object in the ArrayList
    for (int i = 0; i <=5; i++) {
        dogfoods.add(nextdogfood);
        System.out.println(dogfoods.get(i));
    }

    //set the attributes
    //puppy1.setName("Carrot");
    //puppy1.setAge(1);
    //puppy1.setBreed("Labrador");
    //puppy1.setColor("Brown");
    //puppy1.setFurtype("Short");
    //puppy1.setWeight(10.5);
    //puppy1.setSpots(false);
    //puppy1.setFemale(true);

    //print the attributes
    //System.out.println("Name: " + puppy1.getName());
    //System.out.println("Age: " + puppy1.getAge());
    //System.out.println("Breed: " + puppy1.getBreed());
    //System.out.println("Color: " + puppy1.getColor());
    //System.out.println("Furtype: " + puppy1.getFurtype());
    //System.out.println("Weight: " + puppy1.getWeight());
    //System.out.println("Spots: " + puppy1.isSpots());
    //System.out.println("Female:" + puppy1.isFemale());

    //call the additional methods
    //puppy1.bark();
    //puppy1.eat();
    //puppy1.cuddle();
    //puppy1.sleep();
    
    }
    
}
