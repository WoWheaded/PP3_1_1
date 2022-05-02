package ru.dimasta.springboot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dimasta.springboot1.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
