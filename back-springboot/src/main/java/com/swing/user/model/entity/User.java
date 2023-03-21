package com.swing.user.model.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	@Id
	private String userId;
	
	private String nickname;
	
	private String profileImageUrl;
	
	private Integer sentencyCnt;
	
	private Integer fiveCnt;
	
	private Integer coupon;
}