package tugas;


public class stack {
private int top;  
private String [] stackarray;  
private int max;
public void total (int s)  
{
top = s;  
stackarray = new String [top]; 
max = -1;  
}
//method setter
public void setpush(String data) 
{
if (max >= top-1)  
   
System.out.println("Karena stack penuh , Jadi " +data+ " tidak bisa masuk ");
else
{
max ++;
stackarray[max] = data;
System.out.println(data + " Bisa masuk ke stack ");
}

}
// method getter
public int gettotal (){
	return top;
}



}
