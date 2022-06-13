package daily2_5;

public class Test01 {

	public static void main(String[] args) {
        int i=1;
        boolean inf = true;
        while(true) {
        	if(i%2==0 && inf == true) {
            	System.out.print(i+" ");
            }

            if(i%2==1 && inf == false) {
                System.out.print(i+" ");
            }
            i++;
            if(i>10 && inf == true) {
                i=1; inf = false;
                System.out.println("\n");
            }else if(i>10 && inf == false) {
                break;
            }
        }
    }
}
