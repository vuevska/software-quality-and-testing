package InputSpacePartitioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

/**
 * This class contains 4 JUnit tests for the notInBothTeams method.
 * These are the characteristics:
 * C1: team1 is not null
 * C2: team2 is not null
 * C3: the result set is not null
 * Each characteristic has a boolean partition
 */

public class NotInBothTeamsTest {

    private Set<String> team1;
    private Set<String> team2;

    @BeforeEach
    public void setup() {
        team1 = new HashSet<>();
        team2 = new HashSet<>();
    }

    // This test is covered by the characteristic C3
    // T - team1 is not null
    // T - team2 is not null
    // T - result is not null
    @Test
    public void testResultHasElements() {
        team1.add("ID1");
        team1.add("ID2");

        team2.add("ID3");
        team2.add("ID2");

        Set<String> result = NotInBothTeams.notInBothTeams(team1, team2);

        boolean resultSetItems = result.size() > 0;
        assertTrue(resultSetItems, "The result set should not be empty!");
    }

    // This test is covered by the characteristic C3
    // T - team1 is not null
    // T - team2 is not null
    // F - result is null
    @Test
    public void testResultDoesNotHaveElements() {
        team1.add("ID4");

        team2.add("ID4");

        Set<String> result = NotInBothTeams.notInBothTeams(team1, team2);

        boolean resultSetItems = result.size() > 0;
        assertFalse(resultSetItems, "The result set should be empty!");

    }

    // This test is covered by the characteristic C1
    // T - team1 is not null
    // F - team2 is null
    // T - result is not null
    @Test
    public void testTeam1_HasElements() {
        team1.add("ID5");
        team1.add("ID6");

        Set<String> result = NotInBothTeams.notInBothTeams(team1, team2);
        boolean resultSetItems = result.size() > 0;
        assertTrue(resultSetItems, "Team1 should have elements!");
    }

    // This test is covered by the characteristic C2
    // F - team1 is null
    // T - team2 is not null
    // T - result is not null
    @Test
    public void testTeam2_HasElements() {
        team2.add("ID7");
        team2.add("ID8");

        Set<String> result = NotInBothTeams.notInBothTeams(team1, team2);
        assertEquals(team2, result);
    }
}
