import static org.junit.Assert.*;
import org.junit.Test;

public class Excercise3Test {
	@Test
	public void testTri0(){
		assertEquals(Excercise3.Tri(0), 0);
		
	}
	
	@Test
	public void testTri1(){
		assertEquals(Excercise3.Tri(1), 1);
		
	}
	
	@Test
	public void testTri2(){
		assertEquals(Excercise3.Tri(2), 3);
		
	}
	
	@Test
	public void testLazy0(){
		assertEquals(Excercise3.lazy(0), 1);
		
	}
	
	@Test
	public void testLazy1(){
		assertEquals(Excercise3.lazy(1), 2);
		
	}
	
	@Test
	public void testLazy2(){
		assertEquals(Excercise3.lazy(2), 4);
		
	}
}
