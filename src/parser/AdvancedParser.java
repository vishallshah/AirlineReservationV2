package parser;

import common.Itenary;

public interface AdvancedParser {
	   public Itenary parseJson(String fileName);
	   public Itenary parseHttp(String fileName);
}
