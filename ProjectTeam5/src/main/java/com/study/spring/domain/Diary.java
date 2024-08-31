package com.study.spring.domain;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Diary {
	
	@Id
	@SequenceGenerator (
			name="dSEQ",
			sequenceName = "D_SQ",
			allocationSize = 1
			)	
	@GeneratedValue(generator="dSEQ")
	private Long dNum;
	
	@ManyToOne
    @JoinColumn(name = "id") 
    private Member member;
	
	@ManyToOne
    @JoinColumn(name = "home") 
    private Home home;
	
	@NonNull
	private String dTitle;
	private String dContent;
	private String sysdate;
	private String update;
}
