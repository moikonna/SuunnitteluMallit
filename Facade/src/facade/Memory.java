package facade;

import java.util.ArrayList;
import java.util.List;

public class Memory {
	private List<Character> data = new ArrayList<>();

	public void load(long position, char[] data) {
		for (int i = 0; i < data.length; i++) {
			this.data.add((int) position + i, data[i]);
		}
		System.out.println("Memory load: " + new String(data) + " at position " + position);
	}

	public char read(long position) {
		char c = this.data.get((int) position);
		System.out.println("Memory read: " + c + " at position " + position);
		return c;
	}
}