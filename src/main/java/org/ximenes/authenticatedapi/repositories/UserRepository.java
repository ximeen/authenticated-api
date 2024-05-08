package org.ximenes.authenticatedapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ximenes.authenticatedapi.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
