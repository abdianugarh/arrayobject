package tugas;

public class main {

	
	public static void main(String[] args) {
		
		//kotak
		kotak data = new kotak();
		//menggunakan method setter
		data.setpanjang(20);
		data.setlebar(20);
		data.setluas(data.getpanjang() * data.getlebar());
		//menggunakan method getter
		System.out.println("-------kotak------");
		System.out.println("panjang kotak  : "+data.getpanjang());
		System.out.println("lebar kotak    : "+data.getlebar());
		System.out.println("luas kotak     : "+data.getluas());
		System.out.println("keliling kotak : "+data.getkeliling());
		System.out.println("-------mahasiswa-------");

		//mahasiswa
		mahasiswa data3 = new mahasiswa();
		//menggunakan method setter
		data3.setnama("abdi anugrah");
		data3.setnim("d0217531");
		data3.setalamat("desa parappe");
		data3.setgdarah("B");
		data3.setstatus("berpacaran");
		data3.setTbadan(167);
		data3.setBbadan(50);
		//menggunakan method getter
		System.out.println("nama : "+data3.getnama());
		System.out.println("nim  : "+data3.getnim());
		System.out.println("alamata : "+data3.getalamat());
		System.out.println("golongan darah : "+data3.getgdarah());
		System.out.println("status : "+data3.getstatus());
		System.out.println("tinggi badan : "+data3.getTbadan()+"cm");
		System.out.println("berat badan  : "+data3.getbbadan()+"kg");
		System.out.println("--------node----------");
		
		//node
		node data2 = new node();
		//menggunakan method setter
		data2.setlabel("distro");
		data2.setvalue(10);
		//menggunakan method getter
		System.out.println("label : "+data2.getlabel());
		System.out.println("value : "+data2.getvalue());
		System.out.println("-------stack----------");
		
		//stack
		stack data1 = new stack (); 
		data1.total(100);
		data1.setpush("buku1");data1.setpush("buku2");data1.setpush("buku3");data1.setpush("buku4");data1.setpush("buku5");data1.setpush("buku6");data1.setpush("buku7");data1.setpush("buku8");data1.setpush("buku9");data1.setpush("buku10");
		data1.setpush("kertas");data1.setpush("kertas2");data1.setpush("kertas3");data1.setpush("kertas4");data1.setpush("kertas5");data1.setpush("kertas6");data1.setpush("kertas7");data1.setpush("kertas8");data1.setpush("kertas9");data1.setpush("kertas10");
		data1.setpush("buku11");data1.setpush("buku12");data1.setpush("buku13");data1.setpush("buku14");data1.setpush("buku15");data1.setpush("buku16");data1.setpush("buku16");data1.setpush("buku18");data1.setpush("buku19");data1.setpush("buku20");
		data1.setpush("buku21");data1.setpush("buku22");data1.setpush("buku23");data1.setpush("buku24");data1.setpush("buku25");data1.setpush("buku26");data1.setpush("buku27");data1.setpush("buku28");data1.setpush("buku29");data1.setpush("buku30");
		data1.setpush("buku31");data1.setpush("buku32");data1.setpush("buku33");data1.setpush("buku34");data1.setpush("buku35");data1.setpush("buku36");data1.setpush("buku37");data1.setpush("buku38");data1.setpush("buku39");data1.setpush("buku40");
		data1.setpush("buku141");data1.setpush("buku42");data1.setpush("buku43");data1.setpush("buku44");data1.setpush("buku45");data1.setpush("buku46");data1.setpush("buku47");data1.setpush("buku48");data1.setpush("buku49");data1.setpush("buku50");
		data1.setpush("kertas11");data1.setpush("kertas12");data1.setpush("kertas13");data1.setpush("kertas14");data1.setpush("kertas15");data1.setpush("kertas16");data1.setpush("kertas17");data1.setpush("kertas18");data1.setpush("kertas19");data1.setpush("kertas20");
		data1.setpush("buku51");data1.setpush("buku52");data1.setpush("buku53");data1.setpush("buku54");data1.setpush("buku55");data1.setpush("buku56");data1.setpush("buku57");data1.setpush("buku58");data1.setpush("buku59");data1.setpush("buku60");
		data1.setpush("buku61");data1.setpush("buku62");data1.setpush("buku63");data1.setpush("buku64");data1.setpush("buku65");data1.setpush("buku66");data1.setpush("buku67");data1.setpush("buku68");data1.setpush("buku69");data1.setpush("buku70");
		data1.setpush("buku71");data1.setpush("buku72");data1.setpush("buku73");data1.setpush("buku74");data1.setpush("buku75");data1.setpush("buku76");data1.setpush("buku77");data1.setpush("buku78");data1.setpush("buku79");data1.setpush("buku80");
		data1.setpush("buku81");
		System.out.print("total stack adalah : "+data1.gettotal());
	}

}
