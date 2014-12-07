package parser;

import common.Itenary;

public class MediaAdapter implements Parser {

	AdvancedParser advancedParser;

	   public MediaAdapter(String type){
	      if(type.equalsIgnoreCase("json") ){
	    	  advancedParser = new JSONParser();			
	      } else if (type.equalsIgnoreCase("http")){
	    	  advancedParser = new HttpParser();
	      }	
	   }
	
	public Itenary parse(String type, String fileName) {
		if(type.equalsIgnoreCase("json")){
			return advancedParser.parseJson(fileName);
	      }else if(type.equalsIgnoreCase("http")){
	    	return advancedParser.parseHttp(fileName);
	      }
		return null;
	}
	

}
