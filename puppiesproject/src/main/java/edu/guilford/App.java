package edu.guilford;

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
    puppy puppy1 = new puppy();

    //set the attributes
    puppy1.setName("Carrot");
    puppy1.setAge(1);
    puppy1.setBreed("Labrador");
    puppy1.setColor("Brown");
    puppy1.setFurtype("Short");
    puppy1.setWeight(10.5);
    puppy1.setSpots(false);
    puppy1.setFemale(true);

    //print the attributes
    System.out.println("Name: " + puppy1.getName());
    System.out.println("Age: " + puppy1.getAge());
    System.out.println("Breed: " + puppy1.getBreed());
    System.out.println("Color: " + puppy1.getColor());
    System.out.println("Furtype: " + puppy1.getFurtype());
    System.out.println("Weight: " + puppy1.getWeight());
    System.out.println("Spots: " + puppy1.isSpots());
    System.out.println("Female:" + puppy1.isFemale());

    //call the additional methods
    puppy1.bark();
    puppy1.eat();
    puppy1.cuddle();
    puppy1.sleep();
    

    }
}
