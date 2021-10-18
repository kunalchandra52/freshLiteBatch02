class LsTringle{
	public static void main(String[] args){
		int n=5;
		int str=1;
		int spc=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=str;j++){
				System.out.print("* ");
			}
			System.out.println("");
			if(i<=n/2)
				str++;
			else
				str--;
		}
	}
}