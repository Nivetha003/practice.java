import java.util.*;
public class Arr2dqu2
{
    public static double average(int arr[][],int row,int col){
        int sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum = sum+arr[i][j];
                
                
            }
        }
        double avg =(double) sum/(row*col);
        return avg;
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
	    
		System.out.println(average(arr,row,col));
	}
}
