package com.xworkz.readUpdate.updater;

import com.xworkz.readUpdate.entity.PersonEntity;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.persistence.*;
import java.io.FileInputStream;

public class ExcelToDbRunner {

    public static void main(String[] args) {

        String filePath = "D:/Xworkz/xcel/jdbc.xlsx";

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try (
                FileInputStream fis = new FileInputStream(filePath);
                Workbook workbook = new XSSFWorkbook(fis)
        ) {

            Sheet sheet = workbook.getSheetAt(0);

            transaction.begin();

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {

                Row row = sheet.getRow(i);

                int id = (int) row.getCell(0).getNumericCellValue();
                String name = row.getCell(1).getStringCellValue();
                long phoneNumber =
                        (long) row.getCell(2).getNumericCellValue();

                // ✅ Store Excel data into Entity
                PersonEntity entity =
                        new PersonEntity(id, name, phoneNumber);

                // ✅ Save / Update into DB
                entityManager.merge(entity);

                System.out.println("Saved to DB -> " + entity);
            }

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            entityManager.close();
            factory.close();
        }
    }
}
