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
public class Board {
	
	@Id
	@SequenceGenerator (
			name="bSEQ",
			sequenceName = "B_SQ",
			allocationSize = 1
			)	
	@GeneratedValue(generator="bSEQ")
	private Long bNum;
	
	@ManyToOne
    @JoinColumn(name = "id") 
    private Member member;
	
	@ManyToOne
    @JoinColumn(name = "hNum") 
    private Home home;
	
	@NonNull
	private String bTitle;
	private String bContent;
	private String sysdate;
	private String update;
	private String imgName;
	private String imgPath;
	
}
