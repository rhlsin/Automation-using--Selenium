

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excell {

public static XSSFWorkbook wb;

public static XSSFSheet sheet;

public static XSSFRow row;

public static XSSFCell cell;

public static FileInputStream fis;

public static void main(String[] args) throws IOException {

// TODO Auto-generated method stub

String value=getCelldata(2,2);

System.out.println(value);

String value1=getCelldata(1,2);

System.out.println(value1);

value=setCelldata("automation",2,2);

System.out.println(value);

}

public static String getCelldata( int rownum,int col) throws IOException

{

fis =new FileInputStream("D:\\My Doc\\Programs\\Automation\\exceldata.xlsx");

wb=new XSSFWorkbook(fis);

sheet=wb.getSheet("script");

row=sheet.getRow(2);

cell=row.getCell(2);

return cell.getStringCellValue();

}

public static String setCelldata(String text,int rownum,int col) throws IOException

{

fis =new FileInputStream("D:\\My Doc\\Programs\\Automation\\exceldata.xlsx");

wb=new XSSFWorkbook(fis);

sheet=wb.getSheet("script");

row=sheet.getRow(2);

cell=row.getCell(2);

cell.setCellValue(text);

String celldata1= cell.getStringCellValue();

return celldata1;

}

}