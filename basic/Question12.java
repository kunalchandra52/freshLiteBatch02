class Question12{
	public static void main(String[] args){
		int n=7;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i%2==1){
					if(j%2==0)
						System.out.print("0");
					else
						System.out.print("1");
				}
				else{
					if(j%2==0)
						System.out.print("1");
					else
						System.out.print("0");
				}				
			}
			System.out.println();
		}
	}
}