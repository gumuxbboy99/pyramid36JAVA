class p29{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	System.out.print(prow);
	System.out.print(" ");
	System.out.print(2+prow);
	for(int pcol=1;pcol<=2+prow;pcol++) {
	System.out.print("*");
	}
	System.out.println("");
}
}
}