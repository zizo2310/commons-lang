package org.apache.commons.lang3.math;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExtremeMultiplicationTest {

	 @Test
	   public void testExtremeSubtract() {	
		 
		 ExtremeMultiplication e1 = new ExtremeMultiplication(16, 4);
	      assertEquals(e1.extremeMultiply(), 64);     
	   }
}