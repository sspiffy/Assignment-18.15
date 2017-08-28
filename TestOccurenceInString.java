import org.junit.Test;
import org.junit.Assert;


public class TestOccurenceInString
{
    @Test
    public void OccurenceInString()
    {

        String s1 = "This is a test";
        char a1 = 't';

        String s2 = "This is another test string";
        char a2 = 's';

        String s3 = "The cat jumped through the hoop";
        char a3 = 'b';

        String s4 = "Newcastle beer is just mediocre";
        char a4 = 'u';

        String s5 = "fasdf asdef aw asg wg g asdf awe";
        char a5 = 'w';

        String s6 = "I am learning how to use JUnit";
        char a6 = 'i';

        int[] expectedResults = new int[6];
        expectedResults[0] = 2;
        expectedResults[1] = 4;
        expectedResults[2] = 0;
        expectedResults[3] = 1;
        expectedResults[4] = 3;
        expectedResults[5] = 2;

        int[] computedResults = new int[6];
        computedResults[0] = OccurenceInString.count(s1, a1);
        computedResults[1] = OccurenceInString.count(s2, a2);
        computedResults[2] = OccurenceInString.count(s3, a3);
        computedResults[3] = OccurenceInString.count(s4, a4);
        computedResults[4] = OccurenceInString.count(s5, a5);
        computedResults[5] = OccurenceInString.count(s6, a6);

        Assert.assertArrayEquals(expectedResults, computedResults);
    }

}
