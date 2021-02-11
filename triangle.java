public class Challenge {
	public static int triangle(int n) {
		int cnt=2,i=1;  
		for(int j=1;j<n;j++) {
			i+=cnt;
		  cnt++;
		}
		return i;
  }
}
