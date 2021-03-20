package com.PaoloProjects.excelsamples;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ExcelWriter {

    private static String[] columns = {"Name", "Email", "Date of Birth", "Salary"};
    private static List<com.PaoloProjects.excelsamples.src.main.java.Employee> employees = new ArrayList<>();

    static {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1992,7,21);
        employees.add(new com.PaoloProjects.excelsamples.src.main.java.Employee("Paolo Ballesteros", "paolo@example.com",
                dateOfBirth.getTime(), 120000.0));

        dateOfBirth.set(1965,10,15);
        employees.add(new com.PaoloProjects.excelsamples.src.main.java.Employee("Nathan Scott", "nathan@example.com",
                dateOfBirth.getTime(), 100000.0));

        dateOfBirth.set(1988,9,21);
        employees.add(new com.PaoloProjects.excelsamples.src.main.java.Employee("Michael Scott", "mike@example.com",
                dateOfBirth.getTime(), 80000.0));
    }



    public static void main (String[] args) throws IOException, InvalidFormatException{

        Workbook workbook = new XSSFWorkbook();

        CreationHelper createHelper = workbook.getCreationHelper();

        Sheet sheet = workbook.createSheet("Employee");

        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        Row headerRow = sheet.createRow(0);

        for(int i = 0; i < columns.length; i++){
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        int rowNum = 1;
        for(com.PaoloProjects.excelsamples.src.main.java.Employee employee: employees){
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(employee.getName());

            row.createCell(1).setCellValue(employee.getEmail());

            Cell dateOfBirthCell = row.createCell(2);
            dateOfBirthCell.setCellValue(employee.getDateOfBirth());
            dateOfBirthCell.setCellStyle(dateCellStyle);

            row.createCell(3).setCellValue(employee.getSalary());
        }

        for(int i = 0; i< columns.length; i++){
            sheet.autoSizeColumn(i);
        }

        FileOutputStream fileOut = new FileOutputStream("poi-generated-file.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        workbook.close();
    }
}
