import myfirstpackage.*;


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

