package com.eureka.repository;

import com.eureka.domain.ChildEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildEventRepository extends JpaRepository<ChildEvent,Integer> {
}
