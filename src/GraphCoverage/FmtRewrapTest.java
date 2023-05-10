package GraphCoverage;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FmtRewrapTest {

    private final String S;
    private final int N;
    private final String expected;

    public FmtRewrapTest(String S, int N, String expected) {
        this.S = S;
        this.N = N;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"T", 2, "T\n"},
                {"", 2, "\n"},
                {" ", 3, " \n"},
                {"\n\nt", 3, "\n\nt\n"},
                {"\n", 3, " \n"}
        });
    }

    @Test
    public void fmtRewrapTests() {
        assertEquals("Data flow FmtRewrap test", FmtRewrap.fmtRewrap(S, N), expected);
    }
}
