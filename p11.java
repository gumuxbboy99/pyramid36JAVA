class p11{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=1;pcol<=5-prow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=prow;pcol<=prow;pcol++){
	System.out.print(prow);
	}
	for(int pcol=2;pcol<=prow;pcol++){
	System.out.print(" ");
	}
	System.out.print(prow);
	System.out.println("");
}
}
}