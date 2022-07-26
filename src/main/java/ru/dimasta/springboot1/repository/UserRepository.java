package ru.dimasta.springboot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dimasta.springboot1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
