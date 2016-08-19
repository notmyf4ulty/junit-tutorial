import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

   @Test
   public void testAdd() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }

   String testString = "What about NO?";
   MessageUtil messageUtil = new MessageUtil("ss");

   @Test
   public void testPrintMessage() {
      assertEquals(testString,messageUtil.printMessage());
   }
}