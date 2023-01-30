package AbstractFactory;

public class FactoryProducer {
	   public static AbstractFactory getFactory(String merkki){   
	      if(merkki=="Adidas"){
	         return new AdidasFactory();         
	      }else{
	         return new BossFactory();
	      }
	   }
	}
