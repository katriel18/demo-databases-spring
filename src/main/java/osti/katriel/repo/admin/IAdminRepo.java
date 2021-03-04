package osti.katriel.repo.admin;

import org.springframework.data.jpa.repository.JpaRepository;

import osti.katriel.model.admin.Admin;

public interface IAdminRepo extends JpaRepository<Admin, Integer> {

}
