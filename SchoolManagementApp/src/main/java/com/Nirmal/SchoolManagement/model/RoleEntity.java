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
@Table(name="Role_Tbl")
@TableGenerator(name="role", initialValue=100, allocationSize=50)
public class RoleEntity {
	
@Id
@GeneratedValue(strategy=GenerationType.TABLE, generator="role")
private int roleId;
private String roleName;
@OneToMany(targetEntity = UserEntity.class, cascade = CascadeType.ALL)
@JoinColumn(name = "roleId", referencedColumnName = "roleId")
private List<UserEntity> userEntity;




}
