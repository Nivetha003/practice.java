import java.util.*;
public class Arr2dqu3
{
    public static void eachRow(int arr[][],int row,int col){
        for(int i=0;i<arr.length;i++){
             int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum = sum+arr[i][j];
                
                
            }
            System.out.println(sum);
        }
       // System.out.println(sum);
    }
    	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int row = sc.nextInt();
	    int col = sc.nextInt();
	    int [][]arr =  new int[row][col];
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    
		eachRow(arr,row,col);
	}
}
