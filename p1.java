class p1 {
public static void main (String args[]){
for(int prow=1;prow<=4;prow++) {
	for(int pcol=2; pcol<=0+prow; pcol++) {
	System.out.print(" ");
	}
	for(int pcol=prow; pcol<=prow+1; pcol++) {
	System.out.print(prow);
	}
	for(int pcol=1; pcol<=4-prow; pcol++){
	System.out.print("**");
	}
	for(int pcol=prow; pcol<=prow+1; pcol++) {
	System.out.print(prow);
	}
	System.out.println("");
	}
}
}