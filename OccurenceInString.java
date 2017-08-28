public class OccurenceInString
{
    //instance variables
    private static int charCounter;

    public static int count(String s, char a)
    {
        charCounter=0;
        return count(s, a, s.length() - 1);
    }
    public static int count(String s, char a, int high)
    {

        if (high == 1)
        {
            if (s.charAt(1) == a)
            {
                charCounter++;
                return charCounter;
            }
            else
            {
                return charCounter;
            }
        }
        else
        {
            if (s.charAt(high) == a)
            {
                charCounter++;
                return count(s, a, high-1);
            }
            else
            {
                return count(s, a, high-1);
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Count the occurrence of the letter 'g' in the string 'We are winning'");
        System.out.println("Number of occurrences of the letter 'g': " + count("We are winning", 'g'));

        System.out.println("Count the occurrence of the letter 'o' in the string 'Welcome to your organized home'");
        System.out.println("Number of occurrences of the letter 'o': " + count("Welcome to your organized home", 'o'));

        System.out.println("Count the occurrence of the letter 'g' in the string 'This is a test'");
        System.out.println("Number of occurrences of the letter 'g': " + count("This is a test", 'g'));
    }
}

