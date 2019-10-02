package accenture.digital.tr;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class FactoryWithDictionary {
    Hashtable<String, Insight> insights = new Hashtable<String, Insight>();

    public FactoryWithDictionary(){
        insights.put("A", new InsightTypeA());
        insights.put("B", new InsightTypeB());
    }

    public Insight getInsight(String insightType) {
        return insights.get(insightType).getInstance();
    }
}
