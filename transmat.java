package Matrix_trans;

import java.util.Arrays;
import java.util.Scanner;

public class transmat {
	public static int[][] Tran(int arr[][],int n,int m){
		int dummy=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i<j) {
					dummy=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=dummy;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();			
			}
		}
		
		int value[][]=Tran(arr,n,m);
		for(int []val : value) {
			System.out.println(Arrays.toString(val));
		}

	}

}