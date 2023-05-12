package LogicCoverage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetsBonusTest {

    private final Employee employee;
    private final boolean expected;

    public GetsBonusTest(Employee employee, boolean expected) {
        this.employee = employee;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {new Employee(true, true, 12), true},   // 1: T T T  P: T
                {new Employee(false, true, 7), false},  // 5: F T T  P: F
                {new Employee(false, false, 10), true}, // 7: F F T  P: T
                {new Employee(false, false, 3), false}  // 8: F F F  P: F
        });
    }

    @Test
    public void getsBonusTests() {
        assertEquals("Logic Coverage on getsBonus test", Employee.getsBonus(employee), expected);
    }
}
