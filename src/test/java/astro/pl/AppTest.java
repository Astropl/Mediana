package astro.pl;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );

    }

    @Test
    public void checkMediana()
    {
        //Given
        double tab [] = {1.0, 2.0, 3.0, 4.0, 4.0, 8.0, 9.0, 16.0, 23.0, 27.0, 77.0, 87.0}; //{1.0, 4.0, 16.0, 2.0, 23.0, 3.0, 27.0, 87.0, 4.0, 9.0, 77.0, 8.0}
        //When
        double result = App.mediana(tab);

        //Then

        Assert.assertEquals("Error",8.5 ,result, 0);
    }
}
