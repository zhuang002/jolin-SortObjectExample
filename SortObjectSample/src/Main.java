import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer computer1=new Computer();
		computer1.brand ="ABC";
		computer1.preference =101;
		
		Computer computer2 = new Computer("MNO",4);
		String name = computer2.brand;
		
		Computer computer3 =new Computer("XYZ");
		computer3.preference = 50;
		
		System.out.println(computer1+","+computer2+","+computer3);
		
		Computer[] arComputer = {computer1,computer2,computer3};
		Arrays.sort(arComputer, (x,y)->x.preference - y.preference);
		for (Computer c:arComputer) {
			System.out.print(c);
		}
		System.out.println();
		
		ArrayList<Computer> alComputer = new ArrayList<>();
		alComputer.add(computer1);
		alComputer.add(computer2);
		alComputer.add(computer3);
		
		Collections.sort(alComputer, (x,y) -> x.brand.compareTo(y.brand));
		
		for (Computer c:alComputer) {
			System.out.print(c);
		}
		System.out.println();
	}

}


class Computer implements Comparable<Computer> {
	String brand;
	int preference;
	
	public Computer() {
		
	}
	
	public Computer(String b, int p) {
		this.brand=b;
		this.preference=p;
	}
	
	public Computer(String b) {
		this.brand=b;
	}
	
	@Override
	public String toString() {
		return "("+brand+","+preference+")";
	}

	@Override
	public int compareTo(Computer o) {
		// TODO Auto-generated method stub
		return this.preference- o.preference;
	}
	
}
