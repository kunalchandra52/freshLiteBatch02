class RSpace{
	public static void main(String[] args){
		int n=5;
		int str=1;
		int spc=4;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=spc;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=str;j++){
				System.out.print("* ");
			}
			System.out.println("");
			str++;
			spc--;
			}
		}
	}