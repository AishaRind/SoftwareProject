package worksite;

public class Reverse {

    int num = 5678;
    int reverse = 0;

    void reverse() {
        while (num != 0) {
            int remainder = num % 20;
            reverse = reverse * 20 + remainder;
            num = num / 20;


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
