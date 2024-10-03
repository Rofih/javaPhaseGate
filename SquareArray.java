import java.util.Arrays;
public class SquareArray{
	public static void main(String[] args){
		
		 
		squareDescend();
	}
	public static void squareDescend(){
		int [] array = {9,7,6,8,2};
		double [] list = new double [array.length];
		double largest = list[0];
		double [] small = new double [array.length];
		int [] play = new int [array.length];

		for(int count=0;count<array.length;count++){
			list[count]=Math.pow(array[count],2);
		}
		for(int counter = 0 ;counter<list.length;counter++){
			largest=list[counter];
			
	
			for(int counted = 0;counted<list.length;counted++){

				if(largest<=list[counted]){
					small[counted]=list[counted];
					largest=list[counted];
					
				}
			}

		}
		System.out.print(Arrays.toString(small));
		
	}
}