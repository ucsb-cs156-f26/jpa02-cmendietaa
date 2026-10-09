package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Cris M.", Developer.getName());
    }

    @Test 
    public void getGithubId_returns_correct_github_id() {
        assertEquals("cmendietaa", Developer.getGithubId());
    }

    @Test 
    public void getTeam_returns_correct_team() {
        Team team = Developer.getTeam();
        assertEquals("f26-10", team.getName());
        assertTrue(team.getMembers().contains("Ataman Y."), "Team members should contain Ataman Y.");
        assertTrue(team.getMembers().contains("Nathan Z."), "Team members should contain Nathan Z.");
        assertTrue(team.getMembers().contains("Cris M."), "Team members should contain Cris M.");
        assertTrue(team.getMembers().contains("Shivansh G."), "Team members should contain Shivansh G.");
        assertTrue(team.getMembers().contains("Yongxin Z."), "Team members should contain Yongxin Z.");
        assertTrue(team.getMembers().contains("Zhewen J."), "Team members should contain Zhewen J.");
    }
    @Test
    public void getTeam_returns_exact_members_in_order() {
        assertEquals(List.of("Ataman Y.", "Nathan Z.", "Cris M.", "Shivansh G.",
                "Yongxin Z.", "Zhewen J."), Developer.getTeam().getMembers());
    }

}
