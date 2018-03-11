package Chapter03;

/**
 * Created by Gerka on 11-Mar-18.
 */
public class Ch03_029_Help3 {
    // Simple Help V.3 - final
    public static void main(String[] args)
            throws java.io.IOException {
        char choise, ignore;

        for (; ; ) {

            do {
                System.out.println("Help menu:");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do while");
                System.out.println("6. break");
                System.out.println("7. continue\n");
                System.out.print("Choose an item or click q to quit: ");

                choise = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (choise < '1' | choise > '7' & choise != 'q');

            if (choise == 'q') break;

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
                case '6':
                    System.out.println("break:\n");
                    System.out.println("break; or break label");
                    break;
                case '7':
                    System.out.println("continue:\n");
                    System.out.println("continue; or continue label");
                    break;
            }
        }
    }
}
