class p27{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	System.out.print(prow);
	for(int pcol=1;pcol<=prow;pcol++) {
	System.out.print(" ");	
	}
	for(int pcol=1;pcol<=prow;pcol++) {
	System.out.print("*");	
	}
	System.out.println("");
}
}
}