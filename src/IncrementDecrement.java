// - Decrementing and incrementing values.
public class IncrementDecrement {
    public static void main(String[] args) {
        int x=5, y=4, z;

        z = 2 * x-- + 3 * ++x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = 2*x-- + 3 * ++x");
        System.out.println("What what will be the value of z?");
        System.out.println("************************************");
        System.out.println("In the first part of the expression, 2*x--, the x has the value of " + x);
        System.out.println("So, 2*x = " + 2 * x);
        System.out.println("Now we take into account the -- signs.");
        System.out.println("Since -- came after/to the right of the x, this means that we DECREMENT x AFTER the 2*x operation is completed.");
        System.out.println("So now x = " + (x - 1));
        System.out.println("At this point, x = " + (x - 1) + ", and our expression would look something like, z = 10 + 3 * ++x");
        System.out.println("Since x = 4, we can imagine that our expression can look something like, z = 10 + 3 * ++4");
        System.out.println("Notice the ++4. Since the ++ comes before/to the left of 4, this means that we INCREMENT before multiplying it by the number 3.");
        System.out.println("So now the ++4 becomes " + (4 + 1));
        System.out.println("Now we can multiply it by 3");
        System.out.println("Our expression should now look something like, z = 10 + 15");
        System.out.println("Completing the calculations, we are left with z = " + z);
    }
}