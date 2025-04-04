package Hashmap;
import java.util.*;
import java.util.Map.Entry;

public class hashmap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer,hashmap_student> map=new HashMap<Integer,hashmap_student>();

	hashmap_student s1=new hashmap_student("Aman",12,50,60);
	hashmap_student s2=new hashmap_student("Rick",11,20,70);
	hashmap_student s3=new hashmap_student("Harsh",13,30,40);
	hashmap_student s4=new hashmap_student("John",14,50,60);
	
	map.put(1, s1);
	map.put(2, s2);
	map.put(3, s3);
	map.put(4, s4);
	
	
	for(Entry<Integer,hashmap_student> i : map.entrySet()) {
		hashmap_student s5=i.getValue();
		System.out.println(i.getKey() + "  Name :" + s5.name + " Id "+ s5.id + ", marks cc : "+ s5.cc + " ,marks ml : "+ s5.ml);
	}
	
	}

}
