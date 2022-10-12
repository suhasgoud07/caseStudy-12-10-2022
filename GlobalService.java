package com.gl.GlobalExchangeCentre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.GlobalExchangeCentre.bean.CompanyShare;
import com.gl.GlobalExchangeCentre.repository.GlobalExchangeCentreRepository;

@Service
public class GlobalService {
	@Autowired//in order to initailize interface autowired will automatically do it
	 private GlobalExchangeCentreRepository repository;
		
		public void save(CompanyShare global) {
			repository.save(global);//this will directly save to database
			
		}
		
		public List<CompanyShare> findAll(){
			
			return repository.findAll();
		}
		
		public CompanyShare findById(Long id) {
			return repository.getById(id);
		}
		public Long generateCompanyId()
		{
			Long val=repository.findMaxCompanyId();
			if(val==null)
			   val=100001L;
			else
				val=val+1;
			return val;
		}
		public void delete(long id)
		{
			repository.deleteById(id);
		}
		
	}