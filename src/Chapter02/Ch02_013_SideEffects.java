package Chapter02;

/**
 * Created by Gerka on 11-Feb-18.
 */
public class Ch02_013_SideEffects {
    // Демонстрация роли побочных эффектов
    public static void main(String[] args) {
        int i;
        i = 0;

        if (false & (++i < 100)) System.out.println("This String won't be shown");
        System.out.println("IF works, i is equal to: " + i);

        if (false && (++i < 100)) System.out.println("This String won't be shown");
        System.out.println("IF works, but i is still: " + i);
    }
}
