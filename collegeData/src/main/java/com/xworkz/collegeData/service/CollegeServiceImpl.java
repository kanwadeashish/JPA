package com.xworkz.collegeData.service;

import com.xworkz.collegeData.DAO.CollegeDAO;
import com.xworkz.collegeData.DTO.CollegeDTO;
import com.xworkz.collegeData.entity.CollegeEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService{

    @Autowired
    CollegeDAO collegeDAO;

    @Override
    public void saveData(CollegeDTO collegeDTO) {
        System.out.println("Service Data : "+collegeDTO);
        CollegeEntity collegeEntity = new CollegeEntity();

        BeanUtils.copyProperties(collegeDTO,collegeEntity);

        collegeDAO.save(collegeEntity);
    }

    @Override
    public List<CollegeDTO> getDTO() {
        List<CollegeEntity> collegeEntities = collegeDAO.getStudentData();

        if (!collegeEntities.isEmpty()) {

            List<CollegeDTO> collegeDTOS = new ArrayList<>();

            collegeEntities.forEach(collegeEntity -> {

                CollegeDTO dto = new CollegeDTO();

               BeanUtils.copyProperties(collegeEntity,dto);

                collegeDTOS.add(dto);
            });
            return collegeDTOS;
        } else {
            return Collections.emptyList();
        }
    }
}
