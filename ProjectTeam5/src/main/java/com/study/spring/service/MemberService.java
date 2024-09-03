package com.study.spring.service;

<<<<<<< HEAD
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> 5588326cd642120c2f87ff10480919d0badfb8a9

import com.study.spring.domain.Member;
import com.study.spring.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;

	public void insertMember(Member member) {
		memberRepository.save(member);
	}
<<<<<<< HEAD
	
	public boolean existsById(String userid) {
		return memberRepository.existsById(userid);
	}

	public void save(Member member) {
		memberRepository.save(member);
		
	}

	public Optional<Member> findById(String userid) {
		return memberRepository.findById(userid);
	}

=======
>>>>>>> 5588326cd642120c2f87ff10480919d0badfb8a9
}
