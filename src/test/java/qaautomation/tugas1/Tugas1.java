package qaautomation.tugas1;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {

	public static void main(String[] args) {
	
	//Contoh TreeSet
	//Penyusunan nama peserta
	TreeSet<String> absenKelas = new TreeSet<String>();
	absenKelas.add("Salam");
	absenKelas.add("Adib");
	absenKelas.add("Mikail");
	absenKelas.add("Berto");
	absenKelas.add("Bale");
	absenKelas.add("Zaskia");
	absenKelas.add("Kana");
	absenKelas.add("Rendy");
	absenKelas.add("Nadi");
	absenKelas.add("Leslar");
	absenKelas.add("Adi H");
	
	System.out.println("Susunan absen peserta:");
	for (String absen : absenKelas)
		System.out.println(absen);
	System.out.println("Nama Pertama: " + absenKelas.first());
	System.out.println("Nama Terakhir: " + absenKelas.last());
	System.out.println("Jumlah peserta hadir: " + absenKelas.size());
		
	System.out.println("");
	
	
	//Contoh TreeMap
	//Menyusun Nomor Favorit berdasar abjad
	
	System.out.println("Nomor Kesukaan Berdasar urutan:");
	TreeMap<Integer, String> nomorKesukaan = new TreeMap<Integer, String>();
	nomorKesukaan.put(28, "Ardi");
	nomorKesukaan.put(7, "Upin");
	nomorKesukaan.put(19, "Hendro");
	nomorKesukaan.put(20, "Aldo");
	nomorKesukaan.put(11, "Argavi");
	nomorKesukaan.put(14, "Tomas");
	nomorKesukaan.put(17, "Leong");
	nomorKesukaan.put(8, "Bernard");
	nomorKesukaan.put(95, "Iswanto");
	nomorKesukaan.put(88, "Kulsum");
	
	for (Integer key : nomorKesukaan.keySet()) {
		System.out.println(key + " adalah " + "Nomor Kesukaan " + nomorKesukaan.get(key));
	}
	System.out.println("Nomor Terkecil " + nomorKesukaan.firstKey() + " milik " + nomorKesukaan.get(nomorKesukaan.firstKey()));
	System.out.println("Nomor Terbesar " + nomorKesukaan.lastKey() + " milik " + nomorKesukaan.get(nomorKesukaan.lastKey()));
	System.out.println("Jumlah nomor: " + nomorKesukaan.size());	
	}
}
