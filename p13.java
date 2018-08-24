class p13{
public static void main (String args[]){
for(int prow=1;prow<=5;prow++) {
	for(int pcol=2;pcol<=prow;pcol++) {
	System.out.print("  ");
	}
	for(int pcol=11;pcol>=11;pcol--){
	System.out.print(pcol-prow-prow);
	}
	for(int pcol=10;pcol>=6+prow;pcol--){
	System.out.print(pcol-prow-prow);
	}
	for(int pcol=5;pcol>=1+prow;pcol--){
	System.out.print(pcol-prow);
	}
	System.out.println("");
}
}
}