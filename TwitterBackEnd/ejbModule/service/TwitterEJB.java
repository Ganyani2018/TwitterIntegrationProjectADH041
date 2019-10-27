package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TwitterEntity;

/**
 * Session Bean implementation class TwitterEJB
 */
@Stateless
@LocalBean
public class TwitterEJB {

	@PersistenceContext
	private EntityManager em;
	
    public TwitterEJB() {
        // TODO Auto-generated constructor stub
    }
    public void addNew(TwitterEntity twitterEntity)
    {
    	System.out.println("===========addidng to database=======");
    	em.persist(twitterEntity);
    }

}
