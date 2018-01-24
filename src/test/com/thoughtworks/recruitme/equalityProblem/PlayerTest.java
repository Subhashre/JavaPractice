package com.thoughtworks.recruitme.equalityProblem;

import com.thoughtworks.recruitme.services.MethodNotImplementedException;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Provide equality implementation for @{@link Player} to pass all tests.
 */
public class PlayerTest {

  @Test
  public void twoPlayersWithSameNameAndDifferentJerseyNumbersAreNotEqual() throws MethodNotImplementedException {
    Player dhoni = new Player("Dhoni", 7);
    Player dhoniTwo = new Player("Dhoni", 10);
    Assert.assertFalse(dhoni.equals(dhoniTwo));
  }

  @Test
  public void twoPlayersWithDifferentNameAndSameJerseyNumbersAreNotEqual() throws MethodNotImplementedException {
    Player dhoni = new Player("Dhoni", 7);
    Player kohli = new Player("Kohli", 7);
    Assert.assertFalse(dhoni.equals(kohli));
  }

  @Test
  public void twoPlayersWithDifferentNameAndDifferentJerseyNumbersAreNotEqual() throws MethodNotImplementedException {
    Player dhoni = new Player("Dhoni", 7);
    Player kohli = new Player("Kohli", 18);
    Assert.assertFalse(dhoni.equals(kohli));
  }

  @Test
  public void twoPlayersWithSameNameAndJerseyNumbersAreEqual() throws MethodNotImplementedException {
    Player dhoni = new Player("Dhoni", 7);
    Player dhoniTwo = new Player("Dhoni", 7);
    Assert.assertTrue(dhoni.equals(dhoniTwo));
  }

  @Test
    public void twoEqualPlayersWhenAddedToAHashSetShouldAddOnlyOne(){
      Set<Player> players = new HashSet<Player>();
      players.add(new Player("Sachin",10));
      players.add(new Player("Sachin",10));
      Assert.assertEquals(1,players.size());
  }
  
}
