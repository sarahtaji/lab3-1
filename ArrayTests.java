import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReverseInPlace1(){
    int[] arr = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(arr);
    assertArrayEquals(new int[]{3,2,1}, arr);
  }

  @Test 
  public void testReverse1(){
    int[] arr = {1,2,3};
    int [] arr2 = ArrayExamples.reversed(arr);
    assertArrayEquals(new int[]{3,2,1}, arr2);
  }
}