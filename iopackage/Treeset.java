package iopackage;
import java.util.*;
class Treeset {
public static void main(String[] args) {
	

	TreeSet t=new TreeSet(new Mycomparator());
	t.add(20);
	t.add(50);
	t.add(25);
	t.add(24);
	System.out.println(t);

}			}
class Mycomparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		if(I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else return 0;
	}
		
	}
	
