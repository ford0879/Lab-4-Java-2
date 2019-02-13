/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class EquipmentTest
{

    /**
     * Test the Equipment constructor and the getters
     */
    public void constructorTest() throws AssertException
    {
        // Create 1 item to be constructed
        String item1 = "Glue/0,0,0,sticky";
        Equipment equipment1 = new Equipment(item1);
       
        // The name should be "Glue", count totalWeight and totalPrice 0, and description "sticky".
        Assert.assertEquals("Glue", equipment1.getName());
        Assert.assertEquals(0, equipment1.getCount(), 0.0001);
        Assert.assertEquals(0, equipment1.getTotalWeight(), 0.0001);
        Assert.assertEquals(0, equipment1.getTotalPrice(), 0.0001);
        Assert.assertEquals("sticky", equipment1.getDescription());
        
        // Create another item to be constructed
        String item2 = "Stick/135,650,7852,breakable and brown";
        Equipment equipment2 = new Equipment(item2);
       
        // The name should be "Stick", count 135, totalWeight 650 and totalPrice 7852, and description "breakable and brown".
        Assert.assertEquals("Stick", equipment2.getName());
        Assert.assertEquals(135, equipment2.getCount(), 0.0001);
        Assert.assertEquals(650, equipment2.getTotalWeight(), 0.0001);
        Assert.assertEquals(7852, equipment2.getTotalPrice(), 0.0001);
        Assert.assertEquals("breakable and brown", equipment2.getDescription());
    }
    
    /**
     * Tests toString() method in Equipment class
     * @throws AssertException
     */
    public void toStringTest() throws AssertException
    {
        String expectedString = "Name: Glue, Number: 0, Weight: 0.00 lbs, Price: $0.00 - sticky";
        String item = "Glue/0,0,0,sticky";
        Equipment equipment = new Equipment(item);
        
        Assert.assertEquals(expectedString, equipment.toString());
    }
}