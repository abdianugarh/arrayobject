package tugas;

public class nota {
	private int jumlah,harga,total;
	
	//method setter
	public void setjumlah(int jumlah){
		this.jumlah=jumlah;
			}
	public void setharga(int harga){
		this.harga=harga;
	}
	public void settotal(int total){
		this.total=total;
	}
	
	//method getter
	public int getjumlah(){
		return jumlah;
	}
	public int getharga(){
		return harga;
	}
	public int gettotal (){
		total=(int)jumlah*harga;
		return total;
	}
	public static void main(String[] args) {
		nota data = new nota();
		data.setharga(10000);
		data.setjumlah(12);
		System.out.println("harga fanta : Rp."+data.getharga());
		System.out.println("jumlah yang di beli : "+data.getjumlah());
		System.out.println("totalnya adalah : Rp."+data.gettotal());

	}

}
