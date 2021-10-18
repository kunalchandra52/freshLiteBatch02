class Question10{
	public static void main(String[] args){
		int n=15;
		int spc=1;
		int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=spc;j++){
				System.out.print(" ");
			}
			if(num>0){
				for(int j=num;j<=n/2;j++){
					System.out.print(j+" ");
				}
			}
			if(i<=n/2-1){
				spc++;
				num++;
			}
			else if(i>n/2-1 && i<14){
				spc--;
				num--;
			}
			System.out.println();
		}
	}
}