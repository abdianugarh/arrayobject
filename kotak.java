package tugas;

public class kotak {
	private double panjang,lebar,luas,keliling;
		//method getter
		public double getpanjang(){
			return panjang=panjang;
		}
		public double getlebar(){
			return lebar=lebar;
		}
		public double getluas(){
			return luas;
		}
		public double getkeliling(){
			keliling=panjang+lebar+panjang+lebar;
			return keliling;
		}
		//method setter
		public void setpanjang(double panjang){
			this.panjang=panjang;
		}
		public void setlebar(double lebar){
			this.lebar=lebar;
		}
		public void setluas(double luas){
			this.luas=luas;
		}
		public void setkeliling(double sembarangkeliling){
			this.keliling=sembarangkeliling;
		}
	
	public static void main(String[] args) {
		kotak data = new kotak();
		//menggunakan method setter
		data.setpanjang(20);
		data.setlebar(20);
		data.setluas(data.getpanjang() * data.getlebar());
		//menggunakan method getter
		System.out.println("panjang kotak  : "+data.getpanjang());
		System.out.println("lebar kotak    : "+data.getlebar());
		System.out.println("luas kotak     : "+data.getluas());
		System.out.println("keliling kotak : "+data.getkeliling());

	}

}
