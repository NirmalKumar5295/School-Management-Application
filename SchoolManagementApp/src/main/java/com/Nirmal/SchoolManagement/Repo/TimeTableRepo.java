package com.Nirmal.SchoolManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nirmal.SchoolManagement.model.TimeTableEntity;

public interface TimeTableRepo extends JpaRepository<TimeTableEntity, Integer>{

}
