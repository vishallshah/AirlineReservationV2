package parser;

import common.Itenary;

public class HttpParser implements AdvancedParser{
	public Itenary parseJson(String fileName) {
		//do nothing  
			return null;
	   }

	   public Itenary parseHttp(String fileName) {
		   System.out.println("Parsing HTTP");
		   return new Itenary();
	   }
}
