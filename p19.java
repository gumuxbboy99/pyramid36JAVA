class p19{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=prow;pcol<=prow;pcol++) {
	System.out.print(pcol);	
	}
	for(int pcol=prow;pcol<=9;pcol++){
	System.out.print("*");
	}
	for(int pcol=2;pcol<=prow;pcol++){
	System.out.print(" ");
	}
	for(int pcol=prow;pcol<=prow;pcol++){
	System.out.print(6-prow);
	}
	System.out.println("");
}
}
}