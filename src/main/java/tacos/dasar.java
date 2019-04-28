package tacos;

public class dasar {

	public static void main(String[] args) {
		// ini hanya comment tidak akan di baca oleh program abaikan saja
		
		// Sequence (Berurutan), setiap program berjalan secara berurutan dari atas sampai kebawah
		System.out.println("======Berurutan=======");
		System.out.println("Cara membuat kopi"); System.out.println("1. Masak Aer");
		System.out.println("2. Siapkan Cangkir dan Kopi");
		System.out.println("3. Seduh kopi dengan air panas");
		System.out.println("4. Seruput Kopi"); System.out.println("5. Selesai");

		//Selection atau pemilihan, adalah suatu yg berjalan secara berurutan dimana harus melewati
		//suatu kondisi tertentu dengan syarat tertentu, selection ini ada 5 jenis yaitu 
		//(if), (if else), (if else if), (nested if), (switch case)
		//boolean ada tipe data yg hanya memiliki dua value yaitu benar dan salah ( true or false )
		//tipe data boolean sering digunakan untuk penetuan didalam kondisi bilamana memenuhi syarat tertentu
		boolean mau_pake_gula = false;
		System.out.println("======Selection=======");
		System.out.println("Cara membuat kopi");
		System.out.println("1. Masak Aer");
		System.out.println("2. Siapkan Cangkir dan Kopi");
		if (mau_pake_gula) {
			System.out.println("3. Siapkan Cangkir dan Kopi");
		}
		System.out.println("4. Seduh kopi dengan air panas");
		System.out.println("5. Seruput Kopi");
		System.out.println("6. Selesai");
		
		//Repition (Perulangan), dimana proses dijalankan secara berulang sampai mencapai target atau kondisi
		//tertentu,
		System.out.println("======Perulangan=======");
		//bisa di lihat variable mau_pake_gula berbeda dengan mau_pake_Gula, dikarenakan java itu case sensitive
		//besar kecil huruf sangat krusial, mau_pake_gula dan mau_pake_Gula itu adalah variable yg berbeda
		boolean mau_pake_Gula = true;
		//kita juga bisa memasukan value kedalam variable sesuai tipe datanya
		String judul = "Contoh Membuat Kopi";
		//dan kita juga bisa panggil variablenya dengan value yg sama didalamnya
		System.out.println(judul);
		System.out.println("1. Masak Aer");
		System.out.println("2. Siapkan Cangkir dan Kopi");
		System.out.println("");
		if (mau_pake_gula) {
			System.out.println("3. pake Gula");
			//tipe data integer digunakan untuk menyimpan value angka
			int sendok=2;
			//kita disini menggunakan perulangan for
			//disini bisa dilihat integer i digunakan sebagai indikator syarat dari perulangan
			// dengan bentuk for(inisialisasi variable ; kondisi ; iteration #optional){}
			//perulangan ini akan berhenti bilamana besaran i lebih besar dari sendok
			for(int i=0; i < sendok ; i++) {
				System.out.println("3.1."+i+" Tuang gula Satu sendok");
			}
		}
		System.out.println("4. Seduh kopi dengan air panas");
		System.out.println("5. Seruput Kopi");
		System.out.println("6. Selesai");

	}

}
