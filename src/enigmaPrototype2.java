import java.util.Scanner;

public class enigmaPrototype2 {

    Scanner in = new Scanner(System.in);

    void go() {

        char input;
        input = in.next().charAt(0);

        if (input >= 'A' && input <= 'Z') {
            int cc = (input - 64);


        } else if (input == 'Ø') {
            int cc = (input - 189);


        } else if (input == 'Æ') {
            int cc = (input - 170);


        } else if (input == 'Å') {
            int cc = (input - 168);


        }

    }

    public static void main(String[] args) {
        new enigmaPrototype2().go();


    }

}
