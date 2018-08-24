class p32{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=1;pcol<=8-prow;pcol++) {
	System.out.print(pcol);	
	}
	for(int pcol=1;pcol<=2+prow;pcol++) {
	System.out.print(" ");	
	}
	System.out.print(prow+2);
	System.out.println("");
}
}
}