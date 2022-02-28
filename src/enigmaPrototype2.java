import java.util.Scanner;

public class enigmaPrototype2 {

    Scanner in = new Scanner(System.in);

    void go() {

        char i;
        i = in.next().charAt(0);

        if (i >= 'A' && i <= 'Z') {
            int cc = (i - 64);
            System.out.println(cc);
        } else if (i == 'Ø') {
            int cc = (i - 189);
            System.out.println(cc);

        } else if (i == 'Æ') {
            int cc = (i - 170);
            System.out.println(cc);

        } else if (i == 'Å') {
            int cc = (i - 168);
            System.out.println(cc);

        }

    }

    public static void main(String[] args) {
        new enigmaPrototype2().go();


    }

}
