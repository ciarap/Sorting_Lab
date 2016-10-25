import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DateArrayGenerator {

	private static ArrayList<Date> dates=new ArrayList<Date>();
	
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the input size of the Date arrays: ");
		for (Date date: randomDateArray(input.nextInt())){
			System.out.println(date.toString());
		}
	}
	
	public static ArrayList<Date> randomDateArray(int n){
		Random random = new Random();
		
		int d,m,y;
		for (int i=0;i<n;i++){
			int randomMonth = random.nextInt(12 - 1) + 1;
			int randomDay;
			if(randomMonth==2){
				randomDay= random.nextInt(28 - 1) + 1;
			}
			else if(randomMonth==1|| randomMonth==3||randomMonth==5|| randomMonth==7||randomMonth==8||randomMonth==10||randomMonth==12){
				randomDay= random.nextInt(31 - 1) + 1;
			}
			else{
			randomDay= random.nextInt(31 - 1) + 1;
			}
			int randomYear= random.nextInt(2015-1915)+1915;
			dates.add(new Date(randomMonth,randomDay,randomYear));
		}
	
		return dates;
	}
}

