package com.paoloprojects.excelexample;

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
    private static List<Employee> employees = new ArrayList<Employee>();

    static {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1992,7,21);
        employees.add(new Employee("Paolo Ballesteros", "paolo@example.com",
                dateOfBirth.getTime(), 120000.0));

        dateOfBirth.set(1965,10,15);
        employees.add(new Employee("Nathan Scott", "nathan@example.com",
                dateOfBirth.getTime(), 100000.0));

        dateOfBirth.set(1988,9,21);
        employees.add(new Employee("Michael Scott", "mike@example.com",
                dateOfBirth.getTime(), 80000.0));
    }



    public static void main (String[] args) throws IOException, InvalidFormatException {

        // Workbook Creation
        Workbook workbook = new XSSFWorkbook();

        //CreationHelper helps us create instances of various things in a format independent
        CreationHelper createHelper = workbook.getCreationHelper();

        // Sheet creation
        Sheet sheet = workbook.createSheet("Employee");

        // Font style for header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        //Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Row creation
        Row headerRow = sheet.createRow(0);

        //Create Cells
        for(int i = 0; i < columns.length; i++){
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // CellStyle for formatting date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        // Create rows and cells for employees data
        int rowNum = 1;
        for(Employee employee: employees){
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(employee.getName());

            row.createCell(1).setCellValue(employee.getEmail());

            Cell dateOfBirthCell = row.createCell(2);
            dateOfBirthCell.setCellValue(employee.getDateOfBirth());
            dateOfBirthCell.setCellStyle(dateCellStyle);

            row.createCell(3).setCellValue(employee.getSalary());
        }

        // Resize all columns to fit the content size
        for(int i = 0; i< columns.length; i++){
            sheet.autoSizeColumn(i);
        }

        //Write output data
        FileOutputStream fileOut = new FileOutputStream("poi-generated-file.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        //Workbook close
        workbook.close();
    }

}
