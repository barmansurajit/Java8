import java.util.*;

public class ArrList{
	public static void  main(String[] args){
		int[] array = {6,9,8};
		List<Integer> list = new ArrayList<>();
		list.add(array[0]);
		list.add(array[2]);
		System.out.println(list);
		list.set(1, array[1]);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
	}
}