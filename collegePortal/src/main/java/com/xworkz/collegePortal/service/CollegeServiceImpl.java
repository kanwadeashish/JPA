package com.xworkz.collegePortal.service;

import com.xworkz.collegePortal.DAO.CollegeDAO;
import com.xworkz.collegePortal.DTO.CollegeDTO;
import com.xworkz.collegePortal.entity.CollegeEntity;
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
    public String saveAll(CollegeDTO collegeDTO) {

        CollegeEntity collegeEntity = new CollegeEntity();
        BeanUtils.copyProperties(collegeDTO,collegeEntity);
        collegeDAO.save(collegeEntity);

        return "Saved";
    }

    @Override
    public List<CollegeDTO> getData() {

        List<CollegeEntity> read = collegeDAO.read();

        if (!read.isEmpty()){

            List<CollegeDTO> list = new ArrayList<>();

            read.forEach(collegeEntity -> {

                CollegeDTO collegeDTO = new CollegeDTO();
                BeanUtils.copyProperties(collegeEntity,collegeDTO);

                list.add(collegeDTO);
            });
            return list;
        }else {
            return Collections.emptyList();
        }

    }
}
