package parser;

import common.Itenary;

public class JSONParser implements AdvancedParser{
	private static String RECORDLOCATORSTARTTAG = "#rlStart=";
	private static String RECORDLOCATORENDTAG = "#rlEnd";
	private static String FNAMESTARTTAG = "#fNameStart=";
	private static String FNAMEENDTAG = "#fNameEnd";
	private static String LNAMESTARTTAG = "#lNameStart=";
	private static String LNAMEENDTAG = "#lNameEnd";
	
	public Itenary parseJson(String fileName) {
		Itenary jsonItenary = new Itenary();
		jsonItenary.setRecordLocator( Integer.toString((int) (Integer.parseInt(fileName.substring(fileName.indexOf(RECORDLOCATORSTARTTAG)+RECORDLOCATORSTARTTAG.length(),fileName.indexOf(RECORDLOCATORENDTAG)))*Math.random()) ) );
		jsonItenary.setfName(fileName.substring(fileName.indexOf(FNAMESTARTTAG)+FNAMESTARTTAG.length(),fileName.indexOf(FNAMEENDTAG)));
		jsonItenary.setlName(fileName.substring(fileName.indexOf(LNAMESTARTTAG)+LNAMESTARTTAG.length(),fileName.indexOf(LNAMEENDTAG)));
	    return jsonItenary;
	   }

	   public Itenary parseHttp(String fileName) {
	      //do nothing
		   return null;
	   }
}
