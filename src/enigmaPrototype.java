import java.util.Scanner;

public class enigmaPrototype {

    Scanner in = new Scanner(System.in);

    void go(){

        int input;
        input = in.nextInt();

        if (input > 0 && input < 27) {
            char ch = (char)(input + 64);
            System.out.println(ch);
        }

        else if (input == 27){
            char ch = (char)(0x00C6);
            System.out.println(ch);

        }

        else if (input == 28){
            char ch = (char)(0x00D8);
            System.out.println(ch);

        }

        else if (input == 29){
            char ch = (char)(0x00C5);
            System.out.println(ch);

        }


    }

    public static void main(String[] args) {
        new enigmaPrototype().go();
    }

}