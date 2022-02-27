package com.Nirmal.SchoolManagement.serviceImpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nirmal.SchoolManagement.Repo.SubjectsRepo;
import com.Nirmal.SchoolManagement.Repo.TimeTableRepo;
import com.Nirmal.SchoolManagement.model.SubjectsEntity;
import com.Nirmal.SchoolManagement.model.TimeTableEntity;
import com.Nirmal.SchoolManagement.service.TimeTableService;

@Service
public class TimeTableServiceImpl implements TimeTableService {
	@Autowired
	TimeTableRepo timeTableRepo; 
	@Autowired
	SubjectsRepo subjectsRepo;

	@Override
	public TimeTableEntity CreateTimeTable(TimeTableEntity timeTableEntity) {
		
		return timeTableRepo.save(timeTableEntity);
	}

	@Override
	public TimeTableEntity GetTimeTable(int timeTableId) {
	
			return timeTableRepo.findById(timeTableId).get();
		}

	@Override
	public TimeTableEntity updateTimeTable(int dayId, TimeTableEntity timeTableEntity) {
		TimeTableEntity timeTableUpdate=timeTableRepo.findById(dayId).get();
		if(Objects.nonNull(timeTableEntity.getDay())&&!"".equals(timeTableEntity.getDay())) {
			timeTableUpdate.setDay(timeTableEntity.getDay());
		}
		if(Objects.nonNull(timeTableEntity.getTimeSlots())&&!"".equals(timeTableEntity.getTimeSlots())) {
			timeTableUpdate.setTimeSlots(timeTableEntity.getTimeSlots());
			
		}
		if(Objects.nonNull(timeTableEntity.getUserId())&&!"".equals(timeTableEntity.getUserId())) {
			timeTableUpdate.setUserId(timeTableEntity.getUserId());
			
		}
		return timeTableRepo.save(timeTableUpdate);
		
	}
	
		
    @Override
	public String DeleteTimeTable(int timeTableId) {
		timeTableRepo.deleteById(timeTableId);
		 return "Timeslot deleted Successfully";
	}

}
