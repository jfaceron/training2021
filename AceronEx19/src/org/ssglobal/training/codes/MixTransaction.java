package org.ssglobal.training.codes;

import java.io.File;
import java.io.FileNotFoundException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MixTransaction {

	private static Logger logger = LogManager.getLogger("matrixLogger");
	public boolean fileExists(String filename) throws FileNotFoundException {
		logger.info("working");
		File file = new File (filename);
		return file.exists();
	}
	
	public boolean isInt(String strVal) throws NumberFormatException, 
			Exception {
		try{
			Integer.parseInt(strVal);			
		} catch (NumberFormatException e) {
			logger.error("Error message: {}", e.getMessage() );
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error message: {}", e.getMessage() );
		}
		return true;
	}
	
	public boolean isDouble(String strVal) throws NumberFormatException{
		try{
			Double.parseDouble(strVal);
		} catch (NumberFormatException e) {
			logger.error("Error message: {}", e.getMessage() );
			return false;
		} catch (Exception e) {
			logger.error("Error message: {}", e.getMessage() );
			e.printStackTrace();
		}
		return true;
	}
	
	public int[][] convertMatrix(String filename) throws 
		WrongMatrixValuesException, WrongMatrixDimensionsException, 
		FileNotFoundException, Exception{
			
		if (fileExists(filename)!=true) {
			logger.error("File Was Not Found");
			throw new FileNotFoundException("no file");			
		}
		return null;
	}	
}
