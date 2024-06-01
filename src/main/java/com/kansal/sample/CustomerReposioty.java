package com.kansal.sample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReposioty extends JpaRepository<CustomerEntity, Integer> {

}
