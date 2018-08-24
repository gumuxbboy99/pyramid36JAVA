class p28{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=5;pcol>=prow;pcol--) {
	System.out.print(pcol);
	}
	for(int pcol=1;pcol<=prow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=2;pcol<=prow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=prow;pcol<=5;pcol++) {
	System.out.print(pcol);
	}
	System.out.println("");
}
}
}