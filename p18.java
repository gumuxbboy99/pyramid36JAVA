class p18{
public static void main (String args[]){
int pcol;
for(int prow=1;prow<=5;prow++) {
	for(pcol=prow;pcol<=prow;pcol++) {
	System.out.print(pcol);	
	}
	for(pcol=1;pcol<=prow;pcol++) {
	System.out.print(" ");
	}
	System.out.print(pcol-1);
	for(pcol=1;pcol<=6-prow;pcol++) {
	System.out.print(" ");
	}
	System.out.print(pcol+3);
	System.out.println("");
}
}
}