package com.Nirmal.SchoolManagement.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Nirmal.SchoolManagement.model.TimeTableEntity;
import com.Nirmal.SchoolManagement.serviceImpl.TimeTableServiceImpl;

@RestController
public class TimeTableController {

	@Autowired
	TimeTableServiceImpl 	timeTableServiceImpl ;
	
	@PostMapping("/createtimetable")
	public TimeTableEntity CreateTimeTable(@RequestBody TimeTableEntity timeTableEntity) {
		return timeTableServiceImpl.CreateTimeTable(timeTableEntity);
	}
	
	@GetMapping("/gettimetable/{dayId}")
	public TimeTableEntity CreateTimeTable(@PathVariable("dayId") int dayId) {
		return timeTableServiceImpl.GetTimeTable(dayId);
	}
	@PutMapping("/updatetimetable/{dayId}")
	public TimeTableEntity CreateTimeTable(@PathVariable int dayId,@RequestBody TimeTableEntity timeTableEntity) {
		return timeTableServiceImpl.updateTimeTable(dayId,timeTableEntity);
	}
	@DeleteMapping("deletetimetable/{dayId}")
		public String DeleteTimeTable(@PathVariable("dayId") int dayId) {
			return timeTableServiceImpl.DeleteTimeTable(dayId);
		}
	}
	
	

