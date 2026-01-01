package com.invoicegenerator.project.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.invoicegenerator.project.entity.CompanyEntity;
import com.invoicegenerator.project.model.SignupForm;

@Repository
public interface UserRepository extends  JpaRepository<CompanyEntity, Integer>{

	@Query(value = "SELECT u FROM CompanyEntity u WHERE u.company_email = :email", nativeQuery = true)
    CompanyEntity loginCheck(@Param("email") String email);
	
	CompanyEntity findByCompanyEmail(String email);
	
	@Query(value = "SELECT password FROM company_details WHERE company_email = :email", nativeQuery = true)
	String getPassword(@Param("email") String email);

}
