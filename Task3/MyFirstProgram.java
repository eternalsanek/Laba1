class MyFirstClass {
 	public static void main(String[] s) {
     		MySecondClass o = new MySecondClass(5, 3); 

        	System.out.println(o.mod()); 
      
        	for (int i = 1; i <= 8; i++) {
            		for (int j = 1; j <= 8; j++) {
                		o.setFirst(i);   
                		o.setSecond(j);  
                		System.out.print(o.mod()); 
				System.out.print(" ");
            		}
            		System.out.println();
        	}
 	}
}

class MySecondClass {
	private int first;
	private int second;

	public MySecondClass (int c, int d) { first = c; second = d; }

	public int getFirst() {
        	return first;
    	}

    	public int getSecond() {
        	return second;
    	}

    	public void setFirst(int a) {
     	   first = a;
    	}

    	public void setSecond(int b) {
    	    second = b;
    	}

	public int mod() {
        	if (second == 0) return 0;
        	return first % second;
    	}
}
