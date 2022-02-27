package com.Nirmal.SchoolManagement.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="timetable_tbl")
@TableGenerator(name="time", initialValue=2000, allocationSize=500)
public class TimeTableEntity {
@Id

@GeneratedValue(strategy=GenerationType.TABLE, generator="time")
  private int dayId;
@Enumerated (EnumType.STRING)
private DaysEnum day;
@Enumerated (EnumType.STRING)
private TimeSlotEnum timeSlots;
private int userId;

}
