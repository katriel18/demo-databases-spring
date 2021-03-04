package osti.katriel.repo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import osti.katriel.model.user.User;

public interface IUserRepo extends JpaRepository<User, Integer>{

}
