class p20{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=1;pcol<=prow;pcol++) {
	System.out.print(prow);	
	}
	for(int pcol=1;pcol<=prow;pcol++) {
	System.out.print(" ");	
	}
	for(int pcol=1;pcol<=prow;pcol++) {
	System.out.print(prow);	
	}
	System.out.println("");
}
}
}