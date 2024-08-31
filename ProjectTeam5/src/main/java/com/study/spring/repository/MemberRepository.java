package com.study.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.spring.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>{

}