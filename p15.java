class p15{
public static void main (String args[]){
for(int pprow=1;pprow<=5;pprow++) {
	for(int pcol=5;pcol>=pprow;pcol--) {
	System.out.print(pprow);
	}
	for(int pcol=1;pcol<=pprow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=2;pcol<=pprow;pcol++) {
	System.out.print(" ");
	}
	for(int pcol=5;pcol>=pprow;pcol--) {
	System.out.print(pprow);
	}
	System.out.println("");
}
}
}