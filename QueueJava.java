
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueJava {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Besar Queue yang di-inginkan : ");
		int n = sc.nextInt();

		System.out.print("\nMasukkan elemen dari Queue (Sebanyak " + n +") : " );
		for (int i = 0; i < n; i++) {
			q.add(sc.nextInt());
		}

		sc.close();

		System.out.print("\nQueue : " + q);

		int removedele = q.remove();
		System.out.print("\nElemen yang dihapus > " + removedele);

		System.out.println(q);

		int head = q.peek();
		System.out.println("\nKepala dari Queue tersebut > " + head);

		int size = q.size();
		System.out.println("Besar Queue setelah di berubah >" + size);
	}
}
