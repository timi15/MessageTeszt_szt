import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.*;


public class MessageTest {

    String message= "Hello Word";
    Message message1= new Message(message);
    Message message2= new Message("szia");

    @Test
    @DisplayName("Message tesz")
    public void testPrintMessage(){
        assertEquals(message, message1.printMessage());
        assertEquals("szia", message2.printMessage());

        assertEquals("szia", message2.printMessage());





    }


}
