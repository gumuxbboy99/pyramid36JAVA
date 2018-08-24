class p33{
public static void main (String args[]){
for(int prow=1;prow<=3;prow++) {
	for(int pcol=1;pcol<=3-prow;pcol++) {	
	System.out.print(" ");
	}
	for(int pcol=1;pcol<=prow;pcol++){
	System.out.print("*");
	}
	for(int pcol=2;pcol<=prow;pcol++){
	System.out.print("*");
	}
	for(int pcol=1;pcol<=3-prow;pcol++) {
	System.out.print(" ");
	}
	System.out.println("");
}
for(int prow=2;prow>=1;prow--) {
	for(int pcol=1;pcol<=3-prow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=1;pcol<=prow;pcol++){
	System.out.print("*");
	}
	for(int pcol=2;pcol<=prow;pcol++){
	System.out.print("*");
	}
	for(int pcol=1;pcol<=3-prow;pcol++) {
	System.out.print(" ");
	}
	System.out.println("");
}

}
}