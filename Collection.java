package labbook;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection 
{
	public static void main(String[] args) 
	{
		List list=new LinkedList();
		System.out.println(list.size());
		list.add(10);
		list.add("hello");
		list.add("dj");
		list.add("vaseem");
		list.add("raasheed");
		System.out.println(list.size());
		list.remove(1);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
	
	}
}
