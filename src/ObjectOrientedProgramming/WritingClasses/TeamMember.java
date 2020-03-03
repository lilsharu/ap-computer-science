
package ObjectOrientedProgramming.WritingClasses;

public class TeamMember {
    private String name;
    private String position;
    private String team;
    private boolean isGood;
    
    
    public TeamMember(String n, String pos, String t) {
        name = n;
        position = pos;
        team = t;
        isGood = false;
    }
    
    public TeamMember(String n) {
        name = n;
        position = "Unassigned";
        team = "Unassigned";
        isGood = false;
    }
    
    public TeamMember(String n, String pos, String t, boolean goodness){
        name = n;
        position = pos;
        team = t;
        isGood = goodness;
    }
}
