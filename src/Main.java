public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-------q1---------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("-------q2---------");

    }

    public static boolean isPalindrome (int num) {
      num = Math.abs(num);
      char [] digits = String.valueOf(num).toCharArray();
      String reversed = "";
      for (int i=digits.length-1; i>=0; i--) {
          reversed += digits[i];
      }
      return reversed.equals(String.valueOf(num));
    }
}