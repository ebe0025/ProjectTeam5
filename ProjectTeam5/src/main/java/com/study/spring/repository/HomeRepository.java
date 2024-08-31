package com.study.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.spring.domain.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {

}
