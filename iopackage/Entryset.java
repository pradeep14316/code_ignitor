package iopackage;

import java.util.HashMap;
import java.util.Map;

public class Entryset {

	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "Pradeep");
		hash.put(2, "kaushik");
		hash.put(3, "Manoj lanjey");
		hash.put(4, "Rishap");
		hash.put(5, "Ismail");
		hash.put(6, "Prashanth");
		System.out.println(hash);
		for (Map.Entry<Integer, String> entry : hash.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
}
	