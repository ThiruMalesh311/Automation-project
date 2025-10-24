package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Handling_excelFile_readData {

	public static void main(String[] args) throws IOException {
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");//in order to conver high level data into low level or stream of binaries

//in order to read data from excel file we should create object of workbook interface using workbookFactory.create(fis);

Workbook wb=WorkbookFactory.create(fis);//create(fis) will create workbook object and load the data into the object;
String data = wb.getSheet("createUser").getRow(1).getCell(2).getStringCellValue();

//using wb reference we need to get the required sheet using getsheet(string sheetName),using sheet reference we
//need to call getRow(int index),using row reference we need to call getcell(int index),using cell address we need 
//to get the string data using getStringCellValue() or numeric data using getNumericCellValue();
//in excel file use ' for numerical value to convert numerical into string...to avoid exception

System.out.println(data);

	}

}
