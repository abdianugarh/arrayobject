package tugas;

public class node {
	
	private String label;
	private int value;
	//method setter
	public void setlabel(String label){
		this.label=label;
	}
	public void setvalue(int value){
		this.value=value;
	}
	//method getter
	public String getlabel(){
		return label;
	}
	public int getvalue(){
		return value;
	}
	
	public static void main(String[] args) {
		node data = new node();
		//menggunakan method setter
		data.setlabel("distro");
		data.setvalue(10);
		//menggunakan method getter
		System.out.println("label : "+data.getlabel());
		System.out.println("value : "+data.getvalue());

	}

}
