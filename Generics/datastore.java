package Generics;

public class datastore<T> {
	private T data;
	
	public void set(T data) {
		this.data=data;
	}
	public T get() {
		return data;
	}
	
	
}
