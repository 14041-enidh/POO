import java.util.Scanner;

/**
 *
 * @author gu3st
 */
public class InputReader {

    private Scanner reader;

    public InputReader() {
        reader = new Scanner(System.in);
    }

    public int getIntegerNumber(String question) {

        showFormattedQuestion(question);

        while (!reader.hasNextInt()) {
            reader.nextLine();
            showFormattedQuestion(question);
        }

        int number = reader.nextInt();
        reader.nextLine();

        return number;
    }

    public String getText(String question) {

        showFormattedQuestion(question);

        return reader.nextLine();
    }

    public char getCharacter(String question) {
        String strAux = getText(question);
        //char letra = reader.nextLine().charAt(0);
        if (strAux.isEmpty()) {
            return ' ';
        }
        return strAux.charAt(0);
    }


    private void showFormattedQuestion(String question) {

        if (question == null) {
            question = "";
        }
        question += "> ";

        System.out.print(question);

    }
}