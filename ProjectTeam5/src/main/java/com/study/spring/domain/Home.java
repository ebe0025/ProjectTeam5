package com.study.spring.domain;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Home {
	@Id
	@SequenceGenerator (
			name="hSEQ",
			sequenceName = "H_SQ",
			allocationSize = 1
			)	
	@GeneratedValue(generator="hSEQ")
	private Long hNum;
	
	private String hName;
	@NonNull
	private String bTitle;
	private String bContent;
	private String createDate;
	private String updateData;
	private String imgName;
	private String imgPath;
}
