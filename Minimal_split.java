public class Minimal_split {
	public static int minSplit(int amount){
		int count = 0;
		int[] change = {1, 5, 10, 20, 50};
		while(amount != 0){
			for(int i = 4; i > -1; i--){
				if (amount - change[i] >= 0){
					amount -= change[i];
					count++;
					break;
				}
			}
		}
		return count;
	}
}
