class p10{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=1;pcol<=5-prow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=1;pcol<=prow;pcol++){
	System.out.print(pcol);
	}
	for(int pcol=prow;pcol<=prow;pcol++){
	System.out.print(6-prow);
	}
	for(int pcol=prow;pcol>=1;pcol--){
	System.out.print(pcol);
	}
	System.out.println("");
}
}
}