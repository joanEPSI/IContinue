package integrationcontinue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import integrationcontinue.exceptions.InvalidArrayException;

public class TestNumberService {
   private NumberService numberService = new NumberService();

   @Test
   public void testBiggestNumber() {
      int[] list = new int[] { 7, 8, 9 };
      int biggest = numberService.biggestNumber(list);
      assertEquals(9, biggest);

      list = new int[] { 1, 2, 3 };
      biggest = numberService.biggestNumber(list);
      assertEquals(3, biggest);
   }

   @Test
   public void testBiggestNumberWithNegativeList() {
      int[] list = new int[] { -7, -8, -9 };
      int biggest = numberService.biggestNumber(list);
      assertEquals(-7, biggest);

      list = new int[] { -9, -8, -7 };
      biggest = numberService.biggestNumber(list);
      assertEquals(-7, biggest);

      list = new int[] { -8, -7, -9 };
      biggest = numberService.biggestNumber(list);
      assertEquals(-7, biggest);
   }

   @Test
   public void testBiggestNumberWithOneValue() {
      int[] list = new int[] { 1 };
      int biggest = numberService.biggestNumber(list);
      assertEquals(1, biggest);
   }

   @Test
   public void testBiggestNumberWithDuplicates() {
      int[] list = new int[] { 1, 4, 9, 9, 1 };
      int biggest = numberService.biggestNumber(list);
      assertEquals(9, biggest);
   }

   @Test(expected = InvalidArrayException.class)
   public void testBiggestNumberWithNullArray() {
      numberService.biggestNumber(null);
   }

   @Test(expected = InvalidArrayException.class)
   public void testBiggestNumberWithEmptyArray() {
      int[] list = new int[] {};
      numberService.biggestNumber(list);
   }

}
