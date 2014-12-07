package gds;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

import common.Constants;
import common.Itenary;
import common.Utils;
import parser.GeneralParser;

public class GDSStreamSimulator {

	public static void main(String[] args) throws IOException, InterruptedException {
		int counter=0;
		GeneralParser generalParser = new GeneralParser();
		Utils utilityClass = Utils.getInstance();		
		String inputType,inputContent;
		ArrayList<Itenary> arryIt= new ArrayList<Itenary>();
		
		//String inputContent = "*rlStart=123*rlEnd*fNameStart=456*fNameEnd*lNameStart=7890*lNameEnd";
		
		while((true)&& counter < 10){
			for(File currentFile : utilityClass.getNextLevelFiles(Constants.fileLocation)){
				Thread.currentThread().sleep(200);;
				//System.out.println(currentFile.getName());
				inputType = currentFile.getName().substring(currentFile.getName().indexOf("-")+1, currentFile.getName().indexOf("%"));
				//System.out.print(inputType+" : ");
				inputContent = FileUtils.readFileToString(currentFile);
				Itenary currentItenary= generalParser.parse(inputType, inputContent);
				arryIt.add(currentItenary);
				System.out.print(currentItenary.getRecordLocator());
				System.out.print(currentItenary.fName());
				System.out.println(currentItenary.lName());
			}
			counter++;
		}
		
		/*for(Itenary one : arryIt){
			x.checkNames();
			x.checkWatchlist();
			x.doxyz();
		}*/
		
		
		
		

		//Itenary currentItenary= generalParser.parse(inputType, inputContent);
		//System.out.println(currentItenary.getRecordLocator());

	}
}
