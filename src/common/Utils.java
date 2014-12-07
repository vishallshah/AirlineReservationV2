package common;

import java.io.File;
import java.io.FileFilter;

public class Utils {
	private static Utils instance = new Utils();
	
	private  Utils(){
		
	}
	
	public static Utils getInstance(){
		return instance;
	}
	
	/**
	 * Returns array of files at location
	 * @param path
	 * @return
	 */
	public static File[] getNextLevelFiles(String path){
		File directory = new File(path);
		
		File[] files = directory.listFiles(new FileFilter() {
	           public boolean accept(File pathname) {
	           return pathname.isFile();
	        }
		});
		return files;
	}
}
