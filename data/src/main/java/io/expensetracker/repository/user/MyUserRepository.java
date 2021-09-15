package io.expensetracker.repository.user;

import io.expensetracker.model.user.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {

}
