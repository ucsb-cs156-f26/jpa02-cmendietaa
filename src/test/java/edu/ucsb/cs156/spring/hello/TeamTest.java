package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }
    @Test
public void equals_same_object() {
    assertTrue(team.equals(team));
}

@Test
public void equals_different_class() {
    assertFalse(team.equals("test-team"));
}

@Test
public void equals_same_name_same_members() {
    Team other = new Team("test-team");
    assertTrue(team.equals(other));
}

@Test
public void equals_same_name_different_members() {
    Team other = new Team("test-team");
    other.addMember("Alice");

    assertFalse(team.equals(other));
}

@Test
public void equals_different_name_same_members() {
    Team other = new Team("other-team");

    assertFalse(team.equals(other));
}

@Test
public void equals_different_name_different_members() {
    Team other = new Team("other-team");
    other.addMember("Bob");

    assertFalse(team.equals(other));
}
@Test
public void hashCode_equal_objects() {
    Team t1 = new Team();
    t1.setName("foo");
    t1.addMember("bar");

    Team t2 = new Team();
    t2.setName("foo");
    t2.addMember("bar");

    assertEquals(t1.hashCode(), t2.hashCode());
}
   @Test
public void hashCode_expected_value() {
    int result = team.hashCode();
    int expectedResult = -1226298695;

    assertEquals(expectedResult, result);
}
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
