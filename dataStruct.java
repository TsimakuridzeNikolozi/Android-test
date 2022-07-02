import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class dataStruct {
	ArrayList<Integer> data;
	HashMap<Integer, Integer> valuesAndIndexes;
	
	public dataStruct(){
		data = new ArrayList<Integer>();
		valuesAndIndexes = new HashMap<Integer, Integer>();
	}
	
	public void add(int value){
		if (valuesAndIndexes.get(value) == null){
			data.add(value);
			valuesAndIndexes.put(value, data.size() - 1);
		}
	}
	
	public int peek(){
		return data.get(0);
	}
	
	public Iterator<Integer> iterator(){
		Iterator<Integer> i = data.iterator();
		return i;
	}
	
	public void remove(int value){
		Integer i = valuesAndIndexes.get(value);
		System.out.println(i);
		if (i != null){
			int lastElement = data.get(data.size() - 1);
			Collections.swap(data, i, data.size() - 1);
			
			data.remove(data.size() - 1);
			valuesAndIndexes.remove(value);
			
			valuesAndIndexes.put(lastElement, i);
		}
	}
}
