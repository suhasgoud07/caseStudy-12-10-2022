package com.gl.GlobalExchangeCentre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.GlobalExchangeCentre.bean.CompanyShare;
@Repository
public interface GlobalExchangeCentreRepository extends JpaRepository<CompanyShare,Long> {
@Query("select max(companyId)from CompanyShare")
	public Long findMaxCompanyId();

}