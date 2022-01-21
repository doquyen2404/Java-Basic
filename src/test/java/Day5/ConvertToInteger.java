package Day5;

public class ConvertToInteger {
    public static void main(String[] args) {
        String price = "5";
       // int i = Integer.MAX_VALUE; //(in so cuc dai)
        int i = Integer.MIN_VALUE;
        System.out.println(i);
        int p = Integer.parseInt(price);

        System.out.println(p + 4);
        System.out.println(String.valueOf(p) + 4); //(int -> string)
        System.out.println(4 + 10 + "hello: " + "hihi");
      //  System.out.println(Integer.parseInt(4 + 9 + "hello: ") + 7); //bao loi

    }
}
