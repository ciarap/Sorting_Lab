
public class Date implements Comparable<Date> {

	private final int month, day , year;
	
	public Date(int m, int d, int y){
		month=m;
		day=d;
		year=y;
	}
	
	@Override
	public int compareTo(Date that) {
		if (this.year < that.year) return -1;
		if (this.year > that.year) return +1;
		if (this.month < that.month) return -1;
		if (this.month > that.month) return +1;
		if (this.day < that.day) return -1;
		if (this.day > that.day) return +1;
		return 0;
	}

	@Override
	public String toString() {
		return day+"/"+month+"/"+year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}
	
	public static void selectionSort(Comparable[] a){
		int N=a.length;
		for (int i=0;i<N;i++)
		{
			int min=i;
			for (int j= i+1; j<N; j++)
				if (less(a[j],a[min]))
					min=j;
			exch(a,i,min);
		}
	}
	
	public static void insertionSort(Comparable[] a){
		int N=a.length;
		for (int i=0;i<N;i++)
		 for (int j=i;j>0;j--)
		 {
				if (less(a[j],a[j-1]))
				  exch(a,j,j-1);
				else break;
		}
	}
	
	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) <0;
	}
	
	private static void exch(Comparable[] a,int i,int j){
		Comparable swap=a[i];
		a[i]=a[j];
		a[j]=swap; 
	}
}
