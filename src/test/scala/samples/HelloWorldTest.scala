package samples

import org.cloudera.{App, HelloWorld}
import org.junit.Test
import org.junit.Assert.assertEquals

class HelloWorldTest {

  @Test
  def test1()
  {
    assertEquals("Hello", HelloWorld.hello)
  }

  @Test
  def test2()
  {
    assertEquals("Hello2", App.hello2)
  }

}
