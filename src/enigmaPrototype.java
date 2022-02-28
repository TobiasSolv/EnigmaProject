import java.util.Scanner;

public class enigmaPrototype {

    Scanner in = new Scanner(System.in);

    void go(){

        int n;
        n = in.nextInt();

        if (n > 0 && n < 27) {
            char ch = (char)(n + 64);
            System.out.println(ch);
        }

        else if (n == 27){
            char ch = (char)(0x00C6);
            System.out.println(ch);

        }

        else if (n == 28){
            char ch = (char)(0x00D8);
            System.out.println(ch);

        }

        else if (n == 29){
            char ch = (char)(0x00C5);
            System.out.println(ch);

        }


    }

    public static void main(String[] args) {
        new enigmaPrototype().go();
    }

}