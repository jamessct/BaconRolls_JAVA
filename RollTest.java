import static org.junit.Assert.assertEquals;
import org.junit.*;

public class RollTest{
  Roll roll;
  Bacon bacon;

  @Before 
  public void before(){
    roll = new Roll("breakfast");
    bacon = new Bacon();
  }

  @Test
  public void hasName(){
    assertEquals("breakfast", roll.getName());
  }

  @Test
  public void rollStartsEmpty(){
    assertEquals(0, roll.baconCount());
  }

  @Test
  public void needsMoreBacon(){
    for(int i = 0; i < 3; i++){
      roll.addBacon(bacon);
    }
    assertEquals(false, roll.heartAttackImminent());
  }

  @Test
  public void cannotAddMoreBaconWhenHeartAttackIsImminent(){
    for(int i = 0; i < 5; i++ ){
      roll.addBacon(bacon);
    }
    assertEquals(4, roll.baconCount());
  }

  @Test
  public void noBaconForVegetarians(){
    roll.vegetarian();
    assertEquals(0, roll.baconCount());
  }
}