

package com.Nirmal.SchoolManagement.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Subjects_tbl")
@TableGenerator(name="subjects", initialValue=1000, allocationSize=50)
public class SubjectsEntity {
	
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="subjects")
    private int subjectId;
    private String subjectName;
    private int userId;

    
}
