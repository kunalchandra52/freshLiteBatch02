class Question13{
	public static void main(String[] args){
		int n=15;
		for(int i=1;i<=n/3;i++){
			for(int j=1;j<=i;j++){
				if(j==1)
					System.out.print(i+" ");
				else if(j==2)
					System.out.print((i+4)+" ");
				else if(j==3)
					System.out.print((i+7)+" ");
				else if(j==4)
					System.out.print((i+9)+" ");
				else if(j==5)
					System.out.print((i+10)+" ");
			}
			System.out.println();
		}
	}
}