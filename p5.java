class p5{
public static void main (String args[]){
for(int prow=1;prow<=4;prow++) {
	for(int pcol=1;pcol<=4-prow;pcol++) {
	System.out.print(" ");
	}
	System.out.print(prow);

	for(int pcol=2;pcol<=prow;pcol++){
	System.out.print("**");
	}
	System.out.print(prow);
	System.out.println("");
}
for(int prow=3;prow>=1;prow--) {
	for(int pcol=1;pcol<=4-prow;pcol++) {
	System.out.print(" ");
	}
	System.out.print(prow);
	for(int pcol=2;pcol<=prow;pcol++){
	System.out.print("**");
	}
	System.out.print(prow);
	System.out.println("");
}
}
}