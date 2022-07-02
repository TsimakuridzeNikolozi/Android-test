public class Steps {
	public static int numVariants(int stearsCount){
		if (stearsCount < 1) return 0;
		if (stearsCount < 3) return stearsCount;
		
		return numVariants(stearsCount - 1) + numVariants(stearsCount - 2);
	}
}
