public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int data1[][]=new int[50][4];
		
//		for(int count1=0;count1<50;count1++) {
//			int data2[][] = new create_equation().create();
//			data1[count1][0]=data2[0][0];
//			data1[count1][1]=data2[0][1];
//			data1[count1][2]=data2[0][2];
//			data1[count1][3]=data2[0][3];
//		}

		int data1[][] = new create_equation().create();
		
		for(int count1=0;count1<50;count1++) {
			System.out.print(data1[count1][0]+" "+(char)data1[count1][1]+" "+data1[count1][2]+" "+"="+data1[count1][3]+" ");
			System.out.print("  ");//��ʽ��Ŀո�
			if(((count1+1)%4==0))//&&(count1!=0)
				System.out.print("\n");
			
		}
	}

}
