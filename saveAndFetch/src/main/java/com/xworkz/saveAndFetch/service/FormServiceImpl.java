package com.xworkz.saveAndFetch.service;

import com.xworkz.saveAndFetch.DTO.FormDTO;
import com.xworkz.saveAndFetch.entity.FormEntity;
import com.xworkz.saveAndFetch.repository.FormDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImpl implements FormService{

    @Autowired
    FormDAO formDAO;

    @Override
    public void saveData(FormDTO formDTO) {
        System.out.println("Service Data : "+formDTO);
        FormEntity formEntity = new FormEntity();
        formEntity.setName(formDTO.getName());
        formEntity.setSurname(formDTO.getSurname());
        formEntity.setUsername(formDTO.getUsername());
        formEntity.setAge(formDTO.getAge());
        formEntity.setPhoneNumber(formDTO.getPhoneNumber());
        formDAO.save(formEntity);
    }
}
