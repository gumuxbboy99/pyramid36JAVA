class p8{
public static void main (String args[]){
for(int prow=1;prow<=7;prow++) {
	for(int pcol=3;pcol<=1+prow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=prow;pcol<=prow;pcol++){
		System.out.print(prow);
		System.out.print(prow+1);
		System.out.print(prow+2);
	}
	for(int pcol=2;pcol<=2+prow;pcol++){
		System.out.print("*");
	}

	System.out.println("");
}
}
}