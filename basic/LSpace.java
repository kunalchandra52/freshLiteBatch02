class LSpace{
	public static void main(String[] args){
		int n=5;
		int str=5;
		int spc=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=spc;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=str;j++){
				System.out.print("* ");
			}
			System.out.println("");
			str--;
			spc++;
			}
		}
	}