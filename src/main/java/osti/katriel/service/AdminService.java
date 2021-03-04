package osti.katriel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import osti.katriel.model.admin.Admin;
import osti.katriel.repo.admin.IAdminRepo;

@Service
public class AdminService {

	@Autowired
	private IAdminRepo repo;
	
	public void registrar(Admin t) {
		repo.save(t);
	}
	
	public List<Admin> listar() {
		return repo.findAll();
	}
	
}
