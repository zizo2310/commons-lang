package org.apache.commons.lang3.math;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExtremeDivisionTest {

	 @Test
	   public void testExtremeDivide() {	
		 
	     ExtremeDivision e1 = new ExtremeDivision(16, 4);
	      assertEquals(e1.extremeDivide(), 4);     
	   }
}
