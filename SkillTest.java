import static org.junit.Assert.*; 
import org.junit.*; 

public class SkillTest
{
  @Test
  public void greetingTest()
  {
      Skill skill = new Skill("Johannes");
      assertEquals("Why hello Onat", skill.Greeting());
  }
}
