class p12{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=2;pcol<=prow;pcol++) {
	System.out.print(" ");
	}

	for(int pcol=prow;pcol<=10-prow;pcol++){
		System.out.print(pcol);
	}
	System.out.println("");
}
}
}