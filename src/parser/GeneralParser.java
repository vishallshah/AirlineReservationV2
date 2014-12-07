package parser;

import common.Itenary;

public class GeneralParser implements Parser {

	MediaAdapter mediaAdapter;
	Context context;
	
	public Itenary parse(String type, String fileName) {		
		
		//inbuilt support to play mp3 music files
	      if(type.equalsIgnoreCase("text") || type.equalsIgnoreCase("xml")){    	  
	    	  //playGeneral(audioType,fileName);
	    	  if(type.equalsIgnoreCase("text")){
	    	  context = new Context(new TextParser());
	    	  }
	    	  else if(type.equalsIgnoreCase("xml")){
		      context = new Context(new XmlParser());
		      }   	  
	    	  
	    	  return context.executeStrategy(type, fileName);
	      } 
	      //mediaAdapter is providing support to play other file formats
	      else if(type.equalsIgnoreCase("json") 
	         || type.equalsIgnoreCase("http")){
	         mediaAdapter = new MediaAdapter(type);
	         return mediaAdapter.parse(type, fileName);
	      }
	      else{
	         System.out.println("Invalid media. "+
	        		 type + " format not supported");
	      }
		return null;
	}
	
	public Itenary parseGeneral(String audioType, String fileName) {
		return null;
	}
}
