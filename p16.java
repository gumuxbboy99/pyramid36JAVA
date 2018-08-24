class p16{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	
	for(int pcol=prow;pcol>=1;pcol--){
		System.out.print(pcol);
	}

	for(int pcol=1;pcol<=5-prow;pcol++){
		System.out.print("  ");
	}

	for(int pcol=prow;pcol>=1;pcol--){
		System.out.print("*");
	}

	System.out.println("");
}
}
}