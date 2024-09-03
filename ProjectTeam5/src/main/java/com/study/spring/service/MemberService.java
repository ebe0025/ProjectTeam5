package com.study.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.domain.Member;
import com.study.spring.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;

	public void insertMember(Member member) {
		memberRepository.save(member);
	}
	
	public boolean existsById(String userid) {
		return memberRepository.existsById(userid);
	}

	public void save(Member member) {
		memberRepository.save(member);
		
	}

	public Optional<Member> findById(String userid) {
		return memberRepository.findById(userid);
	}

}
