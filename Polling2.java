import java.util.Scanner;
public class Polling2{
	public static void main(String[] args){
		rating();
	}
	public static void rating(){
		Scanner input = new Scanner(System.in);
		String [] issues = {"corruption","arm banditry","poor education system","housing and infrastructure","poor maintennance of roads"};
		int [][] display = new int [issues.length][10];
		float one = 0; int sum = 0;
		float two = 0; int sum2 = 0;
		float three = 0; int sum3 = 0;
		float four = 0; int sum4 = 0;
		float five = 0; int sum5 = 0;
		float six = 0; int sum6 = 0;
		float seven = 0; int sum7 = 0;
		float eight = 0; int sum8 = 0;
		float nine = 0; int sum9 = 0;
		float ten = 0; int sum10 = 0;
		int collating = 0;
	while(collating<2){
		for(int index = 0;index<issues.length;index++){
				System.out.println("Based on"+" "+ issues[index]+" "+ "please rate on a scale from 1 to 10");
				int user_input = input.nextInt();
				if(user_input==1){
					display[index][0]=1;
					one+=1;
					sum+=display[index][0];
				} 
				if(user_input==2){
					display[index][1]=2;
					two+=1;
					sum2+=display[index][1];
				} 
				if(user_input==3){
					display[index][2]=3;
					three+=1;
					sum3+=display[index][2];
				} 
				if(user_input==4){
					display[index][3]=4;
					four+=1;
					sum4+=display[index][3];
				} 
				if(user_input==5){
					display[index][4]=5;
					five+=1;
					sum5+=display[index][4];
				} 
				if(user_input==6){
					display[index][5]=6;
					six+=1;
					sum6+=display[index][5];
				} 

				if(user_input==7){
					display[index][6]=7;
					seven+=1;
					sum7+=display[index][6];
				} 
				if(user_input==8){
					display[index][7]=8;
					eight+=1;
					sum8+=display[index][7];
				} 
				if(user_input==9){
					display[index][8]=9;
					nine+=1;
					sum9+=display[index][8];
				}
				if(user_input==10){
					display[index][9]=10;
					ten+=1;
					sum10+=display[index][9];
				} 
	}
	collating++;
	}
 			float [] newRating = {one,two,three,four,five,six,seven,eight,nine,ten};
			float highest = newRating[0];
			float lowest = newRating[0];

			for(int counted = 0;counted<newRating.length;counted++){
				if(highest<newRating[counted]){
					highest = newRating[counted];
				}
				if(lowest>newRating[counted]){
					lowest = newRating[counted];
				}
			}
			one = sum/one;
			two = sum2/two;
			three = sum3/three;
			four = sum4/four;
			five = sum5/five;
			six = sum6/six;
			seven = sum7/seven;
			eight = sum8/eight;
			nine = sum9/nine;
			ten = sum10/ten;

			float [] average = {one,two,three,four,five,six,seven,eight,nine,ten};
		
		for(int show = 0;show<5;show++){
			System.out.println(issues[show]);
			for(int show2 = 0;show2<average.length;show2++){
				System.out.println(" "+display[show][show2]+" "+average[show2]);
			}
		}
		}
		}