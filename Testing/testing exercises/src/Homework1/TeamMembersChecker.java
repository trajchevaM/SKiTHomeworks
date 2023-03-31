package Homework1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TeamMembersChecker {
    public Set<String> notInBothTeams (Set<String> team1, Set<String> team2){
        if(team1==null || team2==null){
            return new HashSet<>();
        }
        Set<String> notInBothTeams = new HashSet<String>(team1);
        notInBothTeams.addAll(team2);
        Set<String> temp = new HashSet<String>(team1);
        temp.retainAll(team2);
        notInBothTeams.removeAll(temp);
        return notInBothTeams;
    }
    public static void main(String[] args) {
        TeamMembersChecker teamMembersChecker = new TeamMembersChecker();
        Set<String> set1 = new HashSet<String>(Arrays.asList("apple", "peas", "brush"));
        Set<String> set2 = new HashSet<String>(Arrays.asList("apple", "bug", "peas"));
        Set<String> notInBothTeams = teamMembersChecker.notInBothTeams(set1, set2);
        System.out.println(notInBothTeams); // prints [brush,bug]
    }
}
