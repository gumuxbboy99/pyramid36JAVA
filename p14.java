class p14{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=2;pcol<=0+prow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=prow;pcol<=prow;pcol++) {
	System.out.print(prow);
	}
	System.out.print(prow+1);
	for(int pcol=1;pcol<=5-prow;pcol++){
	System.out.print("  ");
	}
	for(int pcol=prow;pcol<=prow;pcol++) {
	System.out.print(prow+1);
	}
	System.out.print(prow);
	System.out.println("");
}
}
}