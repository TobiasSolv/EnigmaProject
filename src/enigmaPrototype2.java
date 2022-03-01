import java.util.Scanner;

public class enigmaPrototype2 {

    Scanner in = new Scanner(System.in);

    void go() {

        char input;
        input = in.next().charAt(0);

        if (input >= 'A' && input <= 'Z') {
            int cc = (input - 64);
            System.out.println(cc);
        } else if (input == 'Ø') {
            int cc = (input - 189);
            System.out.println(cc);

        } else if (input == 'Æ') {
            int cc = (input - 170);
            System.out.println(cc);

        } else if (input == 'Å') {
            int cc = (input - 168);
            System.out.println(cc);

        }

    }

    public static void main(String[] args) {
        new enigmaPrototype2().go();


    }

}
