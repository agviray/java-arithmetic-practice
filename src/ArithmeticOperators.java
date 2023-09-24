public class ArithmeticOperators
{
    public static void main(String[] args)
    {
//        - Initialize variables a and b
        int a=14, b=5;

//        - Initialize variable c as quotient of variable a divide by variable b
        int c=a/b;
//        - Specify that we want the result to be a float data type by using "type casting"
//        when we initialize variable cAsFloatDataType.
        float cAsFloatDataType=(float)a/b;

//        - Initialize variable r as the result of a mod b.
        int r=a%b;

//        Print c and r in console.
        System.out.println(c);
        System.out.println(r);
        System.out.println(cAsFloatDataType);
    }
}