package osti.katriel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import osti.katriel.model.user.User;
import osti.katriel.repo.user.IUserRepo;

@Service
public class UserService {

	@Autowired
	private IUserRepo repo;
	
	public void registrar(User t) {
		repo.save(t);
	}
	
	public List<User> listar() {
		return repo.findAll();
	}
	
}
