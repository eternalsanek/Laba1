package myfirstpackage;

public class MySecondClass {
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
