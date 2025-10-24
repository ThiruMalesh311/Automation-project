package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeDataIntoExcel {

	public static void main(String[] args) throws IOException  {
//in order to convert high level data into low level or stream of binaries
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
Workbook wb=WorkbookFactory.create(fis);
//in order to write data into excel we should create object of workbook interface using workbookFactory.create(fis);
//create (fis) will create workbook object and load the data into the object

wb.getSheet("createUser").getRow(1).getCell(2).setCellValue("Darshan@sandalwood.com");//getCell()-for modification(existing data)
//using wb reference we need to get the required sheet using getsheet(string sheetName);
//using Sheet Reference we need to call getRow(int index);
//using row reference we need to call getCell(int index);
//using cell address we should use SetcellValue(string,value);

//--- SETcellvalue(string value)will write the data in low level language;----//

//whenever we need to enter a new data into cell(empty cell) we should create the cell using createCell(int index);
wb.getSheet("createUser").getRow(1).createCell(4).setCellValue("pass");//createCell()- for entering new data to cell(empty cell);

//in order to convert the low level data into high level data we use FileOUTputStream
FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
wb.write(fos);//in order to write the high level data into the original excell file we use write(OutputStream fos)from workbook
wb.close();//to close excell file;




	}

}
