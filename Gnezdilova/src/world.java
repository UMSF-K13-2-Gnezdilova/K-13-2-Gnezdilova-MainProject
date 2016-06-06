import java.util.*;
public class world {

	public static void main(String[] args) {
		Random r = new Random();
		int q[]=new int [10];
        for (int i = 0; i<10;i++) 
        {
            q[i]=r.nextInt(20);
        System.out.println(q[i]);
        }
            int min=q[0];
        
           
        for(int x: q) {
                if(x < min) min = x;
        }
        System.out.println("Minimal element: " + min);
        
        
        
        for(int x: q) {
                if(x > min) min = x;
        }
        System.out.println("Max element: " + min);
	}
}


