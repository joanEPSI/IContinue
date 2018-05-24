package integrationcontinue;

import integrationcontinue.exceptions.InvalidArrayException;

public class NumberService {

   public int biggestNumber(int[] list) throws InvalidArrayException {
      int index = 0;
      int max = Integer.MIN_VALUE;

      if (list == null) {
         throw new InvalidArrayException("Array parameter can't be null");
      }

      if (list.length == 0) {
         throw new InvalidArrayException("Array parameter can't be empty");
      }
      for (index = 0; index < list.length; index++) {
         if (list[index] > max) {
            max = list[index];
         }
      }

      return max;
   }

   public int biggestNumberV6(int[] list) {
      int index = 0;
      int max = Integer.MIN_VALUE;

      for (index = 0; index < list.length; index++) {
         if (list[index] > max) {
            max = list[index];
         }
      }

      return max;
   }

   public int biggestNumberV5(int[] list) {
      int index = 0;
      int max = 0;

      for (index = 0; index < list.length; index++) {
         if (list[index] > max) {
            max = list[index];
         }
      }

      return max;
   }

   public int biggestNumberV4(int[] list) {
      int index = 0;
      int max = 0;

      for (index = 0; index < list.length - 1; index++) {
         if (list[index] > max) {
            max = list[index];
         }
      }

      return max;
   }

   public int biggestNumberV3(int[] list) {
      int index,max = Integer.MAX_VALUE;

      for (index = 0; index < list.length - 1; index++) {
         if (list[index] > max) {
            max = list[index];
         }
      }

      return max;
   }

   public int biggestNumberV2(int[] list) {
      return 9;
   }

   public int biggestNumberV1(int[] list) {
      return 0;
   }

}
