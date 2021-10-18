class UTringle{
	public static void main(String[] args){
		int n=5;
		int str=9;
		int spc=0;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=spc;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=str;j++){
				System.out.print("* ");
			}
			System.out.println("");
			str=str-2;
			spc++;
			}
		}
	}