package InputSpacePartitioning;

import java.util.HashSet;
import java.util.Set;

public class NotInBothTeams {

    /**
     * Method that finds the employees that belong to only one of the
     * teams given as input parameters.
     *
     * @param team1 represents a set of all employee IDs
     *              for the employees that belong to team1
     * @param team2 represents a set of all employee IDs
     *              for the employees that belong to team2
     * @return the IDs of the employees that belong to only one of the teams
     */
    public static Set<String> notInBothTeams(Set<String> team1, Set<String> team2) {

        Set<String> result = new HashSet<>();
        for (String employeeId : team1) {
            if (!team2.contains(employeeId))
                result.add(employeeId);
        }

        for (String employeeId : team2) {
            if (!team1.contains(employeeId))
                result.add(employeeId);
        }

        return result;
    }
}
