package org.integrallis.drools.upsell;

import org.integrallis.drools.upsell.domain.Customer;
import org.integrallis.drools.upsell.domain.DateUtil;
import org.integrallis.drools.upsell.domain.Product;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a decision table.
 */
public class DecisionTableUpsell {

    public static final void main(String[] args) {
	    KieSession knowledgeSession = null;
	    try {
	    		// load up the knowledge base
	    		KieServices ks = KieServices.Factory.get();
	        KieContainer kContainer = ks.getKieClasspathContainer();
	        knowledgeSession = kContainer.newKieSession("ksession-rules");
			
            // go !
            Customer customer = new Customer("Brian Sam-Bodden", 1300.00, DateUtil.getDate("2007-06-21"));
            customer.addProducts(Product.CHECKING_ACCOUNT);
            knowledgeSession.insert(customer);
            knowledgeSession.fireAllRules();
            System.out.println(customer);
            for (Product product : customer.getRecommended()) {
				System.out.println("Recommended Product ===> " + product);
			}
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
			knowledgeSession.dispose();
        }
    }


}
