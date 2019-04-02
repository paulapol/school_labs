package g30126.pol.paula.l6.e4;




import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Test {
	@Test
	public void testSubseq()
	{
		ImplementCharSequence implementCharSequence=new ImplementCharSequence(new char[] {'a','b','c','d','e','f'});
		assertEquals("abc", implementCharSequence.subSequence(0,2));
	}


}
