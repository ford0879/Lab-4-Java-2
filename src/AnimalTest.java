

/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    /**
     * Test the full Animal constructor and getters
     */
    public void fullConstructorTest() throws AssertException
    {
        // Creates 2 animals for testing
        String color1 = "Blue";
        String name1 = "Monkey";
        Double height1 = 0.0;
        Double weight1 = 0.0;
        Animal animal1 = new Animal(color1,name1,weight1,height1);
        
        Assert.assertEquals("Blue", animal1.getColor());
        Assert.assertEquals("Monkey", animal1.getName());
        Assert.assertEquals(0, animal1.getHeight(), 0.0000001);
        Assert.assertEquals(0, animal1.getWeight(), 0.000001);
        
        String color2 = "Purple";
        String name2 = "Dinosaur";
        Double height2 = 6.5;
        Double weight2 = 256.32;
        Animal animal2 = new Animal(color2,name2,weight2,height2);
        
        Assert.assertEquals("Purple", animal2.getColor());
        Assert.assertEquals("Dinosaur", animal2.getName());
        Assert.assertEquals(6.5, animal2.getHeight(), 0.0000001);
        Assert.assertEquals(256.32, animal2.getWeight(), 0.000001);
    }
    
    /**
     *  Tests toString method in Animal class
     * @throws AssertException
     */
    public void toStringTest() throws AssertException
    {
         String expectedString = "Monkey, a Blue-colored animal. 0.0 pounds, 0.0 inches\n";
         String color1 = "Blue";
         String name1 = "Monkey";
         Double height1 = 0.0;
         Double weight1 = 0.0;
         Animal animal = new Animal(color1,name1,weight1,height1);
         
         Assert.assertEquals(expectedString, animal.toString());
    }
}

