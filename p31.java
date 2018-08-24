class p31{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=prow;pcol<=5;pcol++) {
	System.out.print(prow);	
	}
	for(int pcol=2;pcol<=prow;pcol++) {
	System.out.print("  ");
	}
	for(int pcol=0;pcol<=5-prow;pcol++) {
	System.out.print("*");	
	}
	System.out.println("");
}
}
}