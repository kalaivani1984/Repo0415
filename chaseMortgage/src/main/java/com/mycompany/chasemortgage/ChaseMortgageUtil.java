/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasemortgage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author vidhi
 */
public class ChaseMortgageUtil {
     public static ChaseMortgageVo getMortgage() throws IOException{
    
        FileInputStream inputStream= new FileInputStream(new File("c:\\Data\\chaseMortagage.xlsx"));      
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet secondSheet= workbook.getSheetAt(0);
        Row r= secondSheet.getRow(0);
        Cell c = r.getCell(1);//url
        String url= c.getStringCellValue();  
        
        r= secondSheet.getRow(1);
        c= r.getCell(1);
         double amount= c.getNumericCellValue();
        
         r = secondSheet.getRow(2);
         c = r.getCell(1);
         double down_payment = c.getNumericCellValue();  
        
        
        r= secondSheet.getRow(3);
        c= r.getCell(1);
         double zip_code = c.getNumericCellValue();
        
       ChaseMortgageVo ChaseMortgageVo = new ChaseMortgageVo(url,amount,down_payment,zip_code);
     //   System.out.println(loginvo);
        inputStream.close();
        return ChaseMortgageVo;
       
        
    }
    
}
