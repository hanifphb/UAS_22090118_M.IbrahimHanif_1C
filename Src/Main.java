import java.util.ArrayList;
import java.util.Scanner;
import Model.Belanja;

public class Main {

	public static void main(String[] args) {
		int jum = 4;
		ArrayList<Belanja> p = new ArrayList<>();
		for(int index = 0; index < jum; index++){
			Belanja s = new Belanja();
			Scanner sc = new Scanner(System.in);
			System.out.print("Type Item Name = ");
			s.setNamaBarang(sc.nextLine());
			System.out.print("Type Item Price = ");
			s.setHargaBarang(sc.nextInt());
			System.out.print("Type Item QTY = ");
			s.setJumBarang(sc.nextInt());
			p.add(s);
		}

		System.out.println(".................................................................");
		System.out.format("TOTAL BELANJA :%60s", new Belanja().CetakInvoice(p));
	}	
}