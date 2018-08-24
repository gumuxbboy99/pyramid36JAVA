class p9{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=3;pcol<=1+prow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=0;pcol<=5-prow;pcol++){
		System.out.print(prow);
	}
	for(int pcol=0;pcol<=4-prow;pcol++){
		System.out.print(prow);
	}
	System.out.println("");
}
}
}