package com.vvelazquez.csvdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@RestController
@RequestMapping("controlador/")
public class Controlador {

	
	@PostMapping("post")
	public void uploadCSVFile(@RequestParam("file") MultipartFile file) {
		try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            // create csv bean reader
            CsvToBean<Modelo> csvToBean = new CsvToBeanBuilder<Modelo>(reader)
                    .withType(Modelo.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            // convert `CsvToBean` object to list of users
            List<Modelo> modelos = csvToBean.parse();
            
           System.out.println(modelos);

            // TODO: save users in DB?

            // save users list on model

        } catch (Exception ex) {
            System.out.println(ex);
        }
		
	}
	
}
