// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a, b, c, min, mid, max;
        int lim = Integer.parseInt(args[0]); 
		a = (int)(Math.random()*lim);
		b = (int)(Math.random()*lim);
		c = (int)(Math.random()*lim);
        min = Math.min(Math.min(a, b), c);
        max = Math.max(Math.max(a, b), c);
        mid = a + b + c - min - max;
		System.out.println(a + " " + b + " " + c);
        System.out.println(min + " " + mid + " " + max);
}
}

