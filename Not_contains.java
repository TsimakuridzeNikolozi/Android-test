public class Not_contains {
	public static int notContains(int[] array){
		int size = array.length;
		boolean[] usedNums = new boolean[size + 1];
		for (int i = 0; i < size; i++){
			if (array[i] < size + 1 && array[i] > 0)
				usedNums[array[i]] = true;
		}
		
		for(int i = 1; i < size; i++){
			if (!usedNums[i])
				return i;
		}
 		return size + 1;
	}
}
