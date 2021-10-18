class Diamond{
	public static void main(String[] args){
		int n=7;
		int str=1;
		int spc=6;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=spc;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=str;j++){
				System.out.print("* ");
			}
		System.out.println();
		if(i<=n/2){
			str++;
			spc--;
		}
		else{
			str--;
			spc++;
		}
		}
	}
}