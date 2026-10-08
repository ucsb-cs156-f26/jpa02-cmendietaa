package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // You may use just the name that is used on <https://bit.ly/cs156-f26-teams>
        // i.e. your first name, or your first and initial of last name

        return "Cris M.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "cmendietaa";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f26-10");
        team.addMember("Ataman Y.");
        team.addMember("Nathan Z.");
        team.addMember("Cris M.");
        team.addMember("Shivansh G.");
        team.addMember("Yongxin Z.");
        team.addMember("Zhewen J.");
        return team;
    }
}
