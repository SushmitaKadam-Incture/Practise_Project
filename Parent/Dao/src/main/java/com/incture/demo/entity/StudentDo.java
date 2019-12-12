package com.incture.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "STUDENT")
@Data
public class StudentDo implements BaseDo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STUDENT_ID")
	private String studentId;

	@Column(name = "STUDENT_NAME", columnDefinition = "NVARCHAR(50)")
	private String studentName;

	@Column(name = "STUDENT_MARKS", precision = 7, scale = 2)
	private BigDecimal studentMarks;

	@Column(name = "JOINING_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date joiningDate;

	@ManyToOne()
	@JoinColumn(name = "CLASS_ID")
	private ClassDo parent;

}
