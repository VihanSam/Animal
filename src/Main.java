public class Main {
    public static void main (String args[]) {
        // Create my cat object
        Animal myCat = new Animal();
        //Set my cat name
        myCat.setName("Johnny");
        //Get my cat name and display output
        System.out.println("My Cat name is " + myCat.getName());

        // Create my dog object
        Animal myDog = new Animal();
        // Set my dog name
        myDog.setName("Tammy");
        // Get my dog name and display output
        System.out.println("My Dog name is " + myDog.getName());

        // Make animals Noise
        // Make cat bark
        System.out.println(myCat.getName() + " Meows");
        // Make dog bark
        System.out.println(myDog.getName() + " Barks");
    }
}
