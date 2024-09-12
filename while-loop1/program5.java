/* 1 3 5 7
 * 9 11 13 15
 * 17 19 21 23
 * 25 27 29 31 */

class program5 {
	public static void main(String args[]) {
		int i=1;
		int num=1;
		while(i<=4) {
			int j=1;
			while(j<=4) {
				System.out.print(num +" ");
				num=num+2;
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
