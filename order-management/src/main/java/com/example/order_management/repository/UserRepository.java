package com.example.order_management.repository;

import com.example.order_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mhmnazem
 * @since 8/22/24
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
