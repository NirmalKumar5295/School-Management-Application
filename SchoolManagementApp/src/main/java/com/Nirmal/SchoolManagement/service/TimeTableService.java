package com.Nirmal.SchoolManagement.service;

import com.Nirmal.SchoolManagement.model.TimeTableEntity;

public interface TimeTableService {
	public TimeTableEntity CreateTimeTable(TimeTableEntity timeTableEntity);
	public TimeTableEntity GetTimeTable(int TimeTableId);
	public TimeTableEntity updateTimeTable(int TimeTableId,TimeTableEntity timeTableEntity);
	public String DeleteTimeTable(int TimeTableId);
}
