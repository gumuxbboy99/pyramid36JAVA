class p7{
public static void main (String args[]){
for(int prow=1;prow<=7;prow++) {
	for(int pcol=0;pcol<=7-prow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=1;pcol<=1;pcol++){
	System.out.print(pcol);
	}
	for(int pcol=3;pcol<=1+prow;pcol++){
	System.out.print(pcol-1);
	}
	System.out.print(prow);
	for(int pcol=prow;pcol>=1;pcol--){
	System.out.print(pcol);
	}
	System.out.println("");
}
}
}