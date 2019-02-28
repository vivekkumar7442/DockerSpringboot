package com.configure.app.appconfig.entity;

import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
	List<User> findAll(Specification<User>specification );

}
