package test1;

public class elma {
	 public static void main (String args [])
{
		 int space_number=9;
		 int star_number=0;
		 for(int i=0;i<10;i++)
		 {
			 for(int j=0;j<space_number-i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=0;k<i*2+1;k++)
			 {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
		
		 char ch=97;
		 System.out.println(ch);
}
}