class p21{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=prow;pcol<=7;pcol++){
	System.out.print(" ");
	}
	System.out.print(prow);
	for(int pcol=1;pcol<=prow;pcol++){
	System.out.print(" ");
	}
	for(int pcol=prow;pcol<=prow;pcol++){
	System.out.print(8-prow);
	}
	System.out.println("");
}
}
}