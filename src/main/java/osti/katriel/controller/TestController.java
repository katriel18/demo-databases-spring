package osti.katriel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import osti.katriel.model.admin.Admin;
import osti.katriel.model.user.User;
import osti.katriel.service.AdminService;
import osti.katriel.service.UserService;

@RestController
@RequestMapping("/databases")
public class TestController {

	@Autowired
	private AdminService adminService;

	@Autowired
	private UserService userService;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/admin")
	public void registrarAdmin(@RequestBody Admin admin) {
		adminService.registrar(admin);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/user")
	public void registrarUser(@RequestBody User usuario) {
		userService.registrar(usuario);
	}
	
	//@ResponseStatus(HttpStatus.OK)	//POR DEFECTO
	@GetMapping("/admin")
	public List<Admin> listarAdmin() {
		return adminService.listar();
	}

	//@ResponseStatus(HttpStatus.OK)	//POR DEFECTO
	@GetMapping("/user")
	public List<User> listarUser() {
		return userService.listar();
	}
}
