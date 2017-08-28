import org.junit.jupiter.api.Test;

public class TestOccurenceInString
{
    @Test
    public void OccurenceInString()
    {
        String s = "This is a test";
        char a = 't';

        int expected = 3;
        int result = OccurenceInString.count("This is a test", 't');
    }
}
