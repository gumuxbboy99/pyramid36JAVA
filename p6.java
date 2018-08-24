class p6{
public static void main (String args[]){
for(int prow=1;prow<=7;prow++) {
	for(int pcol=2;pcol<=1+prow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=1;pcol<=1;pcol++){
	System.out.print(pcol);
	}
	for(int pcol=prow;pcol<=6;pcol++){
	System.out.print("01");
	}
	System.out.println("");
}
}
}