package com.Nirmal.SchoolManagement.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="User_Tbl")
@TableGenerator(name="user", initialValue=5000, allocationSize=500)
public class UserEntity {
@Id
@GeneratedValue(strategy=GenerationType.TABLE, generator="user")
private int userId;
private String userName;
private String qualification;
private int roleId;

@OneToMany(targetEntity = SubjectsEntity.class, cascade = CascadeType.ALL)
@JoinColumn(name = "UserId", referencedColumnName = "UserId")
private List<SubjectsEntity> subjectsEntity;

@OneToMany(targetEntity = TimeTableEntity.class, cascade = CascadeType.ALL)
@JoinColumn(name = "userId", referencedColumnName = "userId")
private List<TimeTableEntity> TimeTableEntity;
}
