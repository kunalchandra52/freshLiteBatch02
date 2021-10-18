class Question9{
	public static void main(String[] args){
		int n=7;
		int spc=0;
		int spc2=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=spc;j++){
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++){
				System.out.print(j+" ");
			}
			System.out.println();
			spc++;
		}
		for(int i=1;i<=n-1;i++){
			for(int j=1;j<=spc2;j++){
				System.out.print("  ");
			}
			for(int j=n-i;j<=n;j++){
				System.out.print(j+" ");
			}
			System.out.println();
			spc2--;
		}
	}
}