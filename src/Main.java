import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean q = false;
        int x=3;
        String name1, name2, smt;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        name1 = in.next();
        System.out.println("Введите имя второго игрока: ");
        name2 = in.next();
        while (!q){
            new TicTac(x, name1, name2);
            System.out.println("Если вы хотите закончить игру, то введите: yes\n Для того, чтобы продолжить игру введите любой символ.");
            smt = in.next();
            if (smt.equals("0")) {
                q = true;
            }
        }
    }

}