package Chapter03;

/**
 * Created by Gerka on 25-Feb-18.
 */
public class Ch03_008_Help {
    // Simple Help
    public static void main(String[] args)
            throws java.io.IOException {
        char choise;

        System.out.println("Help menu:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.print("Choose an item: ");
        choise = (char) System.in.read();

        System.out.println("\n");

        switch (choise) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if (condition) operator;");
                System.out.println("else operator;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch (statement) {");
                System.out.println("case const:");
                System.out.println("operators sequense");
                System.out.println("break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Incorrect item no.");
        }
    }
}
