class Hello
{
    public static void main(String[] args)
    {
        int num1=7;
        int num2=5;
        int sum=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is: "+sum);
    }
}



class Increment
{
    public static void main(String[] args)
    {
        int num1=7;
        num1=num1+2;
        num1++;       // increment
        num1+=2;
        System.out.println("The incremented value is: "+num1);
    }
}



class Increment2
{
    public static void main(String[] args)
    {
        int num=7;
        int num2=5;
        num=num+2;
        num++;
        ++num;
        System.out.println("The decremented value is: "+num);
    }
}


class Decrement
{
    public static void main(String[] args)
    {
        int num=7;
        num=num-2;
        num--;
        --num;
        System.out.println("The decremented value is: "+num);
    }
}




public class test
{
    public static void main(String[] args)
    {
        int x=6;
        int y=5;
        boolean result=x<y;
        System.out.println(result);
    }
}




public class test2
{
    public static void main(String[] args)
    {
        int x=7;
        int y=5;
        int a=5;
        int b=9;

        boolean result=(x>y) && (a<b);
        System.out.println(result);
    }
}