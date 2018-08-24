class p2 {
public static void main (String args[]){
for(int prow=1;prow<=4;prow++) {
	for(int pcol=prow;pcol<=prow+2;pcol++) {
		System.out.print(pcol);
	}
	
	for(int pcol=0;pcol<=1+prow;pcol++){
		System.out.print("*");	
	}
	
	System.out.println("");
}
}
}