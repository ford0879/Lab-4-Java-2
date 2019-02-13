import java.util.Arrays;

/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class ZooTest
{

    /**
     * Test the Zoo constructor and the getters
     */
    public void constructorTest() throws AssertException
    {
        // Create initial conditions for zoo
        Zoo zoo = new Zoo(2);
        
        String color1 = "Blue";
        String name1 = "Monkey";
        Double height1 = 0.0;
        Double weight1 = 0.0;
        Animal animal1 = new Animal(color1,name1,weight1,height1);
        
        String color2 = "Purple";
        String name2 = "Dinosaur";
        Double height2 = 6.5;
        Double weight2 = 256.32;
        Animal animal2 = new Animal(color2,name2,weight2,height2);
        
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);

        // The totalHeight 6.5, averageWeight (no color) 128.00, and averageWeight (color) 256.00
        Assert.assertEquals(6.5, zoo.getTotalHeight(), 0.000000001);
        Assert.assertEquals(128.00, zoo.getAverageWeight(), 0.00000001);
        Assert.assertEquals(256.00, zoo.getAverageWeight(color2), 0.00000001);
    }
    
    /**
     * Test the expandZoo method
     * @throws AssertException
     */
    public void expandZooTest() throws AssertException
    {
     // Create initial conditions for zoo
        Zoo zoo = new Zoo(1);
        String color1 = "Blue";
        String name1 = "Monkey";
        Double height1 = 0.0;
        Double weight1 = 0.0;
        Animal animal1 = new Animal(color1,name1,weight1,height1);
        
        String color2 = "Purple";
        String name2 = "Dinosaur";
        Double height2 = 6.5;
        Double weight2 = 256.32;
        Animal animal2 = new Animal(color2,name2,weight2,height2);
        
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        
        Assert.assertEquals(2, zoo.getCapacity());
    }

    /**
     * Test the addAnimal method
     * @throws AssertException
     */
    public void addAnimalTest() throws AssertException
    {
     // Create initial conditions for zoo
        Zoo zoo = new Zoo(2);
        String color1 = "Blue";
        String name1 = "Monkey";
        Double height1 = 0.0;
        Double weight1 = 0.0;
        Animal animal1 = new Animal(color1,name1,weight1,height1);
        
        
        String color2 = "Purple";
        String name2 = "Dinosaur";
        Double height2 = 6.5;
        Double weight2 = 256.32;
        Animal animal2 = new Animal(color2,name2,weight2,height2);
        
        // Fill zoo with test animals
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        
        // Create test parameters
        Animal[] expected = {animal1,animal2};
        Animal[] actual = zoo.getAnimals();

        // Check if contents of parameters equal one another
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
        
    }
    
    /**
     * Test toString method in Zoo class
     * @throws AssertException
     */
    public void toStringTest() throws AssertException
    {
        // Creates initial zoo
        Zoo zoo = new Zoo(1);
       
        // Creates animal for test
        String color1 = "Blue";
        String name1 = "Monkey";
        Double height1 = 0.0;
        Double weight1 = 0.0;
        Animal animal = new Animal(color1,name1,weight1,height1);
        
        zoo.addAnimal(animal);
        
        // Creates string we want to see
        String expectedString = "These animals live in the zoo: \n" + animal.toString();
        
        Assert.assertEquals(expectedString, zoo.toString());
    }
}