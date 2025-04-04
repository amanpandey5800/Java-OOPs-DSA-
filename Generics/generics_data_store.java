package Generics;
public class generics_data_store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datastore<Integer> intstore = new datastore<>();
		intstore.set(200);
		System.out.println(intstore.get());
		
		datastore<String> stringstore=new datastore<>();
		stringstore.set("hello");
		System.out.println(stringstore.get());	
	}

}
