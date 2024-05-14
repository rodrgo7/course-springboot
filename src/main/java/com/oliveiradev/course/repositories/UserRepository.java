package com.oliveiradev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oliveiradev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
