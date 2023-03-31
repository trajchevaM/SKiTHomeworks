package Homework1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TeamMembersCheckerTest {
    private TeamMembersChecker teamMembersChecker;

    @BeforeEach
    public void init(){
        teamMembersChecker = new TeamMembersChecker();
    }

    public static Collection<Object[]> teams() {
        return Arrays.asList(new Object[][] {
            {new HashSet<String>(Arrays.asList("2", "3", "4")),new HashSet<String>(Arrays.asList("2", "8", "7")), new HashSet<String>(Arrays.asList("3", "4","8", "7"))},
                {null,new HashSet<String>(Arrays.asList("2", "8", "7")), new HashSet<String>(Arrays.asList())},
                {new HashSet<String>(Arrays.asList("2", "3", "4")),null, new HashSet<String>(Arrays.asList())},
                {null,null, new HashSet<String>(Arrays.asList())},
                {new HashSet<String>(Arrays.asList("apple", "peas", "brush")),new HashSet<String>(Arrays.asList("apple", "bug", "peas")), new HashSet<String>(Arrays.asList("brush", "bug"))}
        });
    }

    @ParameterizedTest
    @MethodSource("teams")
    public void testNotInBothTeams(Set<String> team1, Set<String> team2, Set<String> resultSet){
        assertEquals(resultSet, teamMembersChecker.notInBothTeams(team1, team2));
    }


}
