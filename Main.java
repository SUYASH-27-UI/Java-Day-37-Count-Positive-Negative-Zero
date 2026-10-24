public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = {10, -5, 0, 8, -2, 0, 15};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > 0)
            {
                positive++;
            }
            else if (numbers[i] < 0)
            {
                negative++;
            }
            else
            {
                zero++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }
}
