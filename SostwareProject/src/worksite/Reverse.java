package worksite;

public class Reverse {

    int num = 1234;
    int reverse = 0;

    void reverse() {
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;


        }
        System.out.println("the reverse of given number num is " + reverse);
    }
}
      class test3{
          public static void main(String[] args) {
              Reverse ob=new Reverse();
              ob.reverse();
          }
      }
