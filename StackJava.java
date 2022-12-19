import java.util.Scanner;
import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Besar Stack yang di-inginkan : ");
        int n = sc.nextInt();

        System.out.print("\nMasukkan elemen dari Stack (Sebanyak " + n +") : " );
        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        sc.close();

        System.out.print("\nStack : " + s);

        int removedele = s.pop();
        System.out.print("\nElemen yang dihapus > " + removedele);

        System.out.println("\nSisa Elemen :" +s);

        int head = s.peek();
        System.out.println("\nKepala dari Stack tersebut > " + head);

        int size = s.size();
        System.out.println("Besar Stack setelah di berubah >" + size);
    }
}