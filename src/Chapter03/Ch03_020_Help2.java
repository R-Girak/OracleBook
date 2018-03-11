package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_020_Help2 {
    // Simple Help V.2
    public static void main(String[] args)
            throws java.io.IOException {
        char choise, ignore;

        do {
            System.out.println("Help menu:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do while\n");
            System.out.print("Choose an item: ");

            choise = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (choise < '1' | choise > '5');

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
            case '3':
                System.out.println("for:\n");
                System.out.println("for (init; condition; iteration) {");
                System.out.println("operator;");
                System.out.println("}");
                break;
            case '4':
                System.out.println("while:\n");
                System.out.println("while (condition) {");
                System.out.println("operator;");
                System.out.println("}");
                break;
            case '5':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println("operator");
                System.out.println("}");
                System.out.println("while (condition) ;");
                break;
        }
    }
}
