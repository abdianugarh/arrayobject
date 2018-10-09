package tugas;

public class mahasiswa {
	//atribut
	private String nama,nim,alamat,gdarah,status;
	private int tbadan,bbadan;
	
	//method getter
		public String getnama(){
			return nama=nama;
		}
		public String getnim(){
			return nim=nim;
		}
		public String getalamat(){
			return alamat=alamat;
		}
		public String getgdarah(){
			return gdarah=gdarah;
		}
		public String getstatus(){
			return status=status;
		}
		public int getTbadan(){
			return tbadan=tbadan;
		}
		public int getbbadan(){
			return bbadan=bbadan;
		}
		
	//method setter	
		public void setnama(String nama){
			this.nama=nama;
		}
		public void setnim(String nim){
			this.nim=nim;
		}
		public void setalamat(String alamat){
			this.alamat=alamat;
		}
		public void setgdarah(String gdarah){
			this.gdarah=gdarah;
		}
		public void setstatus(String status){
			this.status=status;
		}
		public void setTbadan(int tbadan){
			this.tbadan=tbadan;
		}
		public void setBbadan(int bbadan){
			this.bbadan=bbadan;
		}
		
		public static void main(String[] args) {
			
		}
}
