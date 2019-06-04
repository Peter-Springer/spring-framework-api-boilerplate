package com.spring.starter.Repository;

import com.spring.starter.entity.Starter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarterRepository extends JpaRepository<Starter, Long>{
}
