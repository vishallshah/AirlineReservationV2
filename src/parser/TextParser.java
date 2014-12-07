package parser;
import common.Itenary;



public class TextParser extends GeneralParser{
	
	private static String RECORDLOCATORSTARTTAG = "*rlStart=";
	private static String RECORDLOCATORENDTAG = "*rlEnd";
	private static String FNAMESTARTTAG = "*fNameStart=";
	private static String FNAMEENDTAG = "*fNameEnd";
	private static String LNAMESTARTTAG = "*lNameStart=";
	private static String LNAMEENDTAG = "*lNameEnd";
	
public Itenary parseGeneral(String audioType, String fileName) {
		Itenary textItenary = new Itenary();
		textItenary.setRecordLocator( Integer.toString((int) (Integer.parseInt(fileName.substring(fileName.indexOf(RECORDLOCATORSTARTTAG)+RECORDLOCATORSTARTTAG.length(),fileName.indexOf(RECORDLOCATORENDTAG)))*Math.random()) ) );
		textItenary.setfName(fileName.substring(fileName.indexOf(FNAMESTARTTAG)+FNAMESTARTTAG.length(),fileName.indexOf(FNAMEENDTAG)));
		textItenary.setlName(fileName.substring(fileName.indexOf(LNAMESTARTTAG)+LNAMESTARTTAG.length(),fileName.indexOf(LNAMEENDTAG)));
		return textItenary;
        
			
	}
}
