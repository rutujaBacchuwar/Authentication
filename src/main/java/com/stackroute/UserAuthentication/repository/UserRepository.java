package com.stackroute.UserAuthentication.repository;

import com.stackroute.UserAuthentication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{

     User findByNameAndPassword(String username, String password);

     boolean existsByName(String name);
}
