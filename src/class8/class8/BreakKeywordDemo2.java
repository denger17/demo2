package class8.class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while (temp<=105){
            if (temp<=100) {
                System.out.println("I love summer because Temperature is"+temp);
            }else {
                System.out.println("Its very hot"+temp);

            }
            temp+=5;

        }

    }
}
