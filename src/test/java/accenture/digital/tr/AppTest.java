package accenture.digital.tr;

import static org.junit.Assert.assertTrue;

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
    public void shouldBeAbleToInstantiateServiceForTypeA() {

        FactoryWithDictionary fwd = new FactoryWithDictionary();
        Insight i = fwd.getInsight("A");
        assertTrue( i != null );
        assertTrue( i.getClass().getName().equals("accenture.digital.tr.InsightTypeA") );
    }

}
