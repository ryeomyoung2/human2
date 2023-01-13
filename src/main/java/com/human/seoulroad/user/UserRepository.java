package com.human.seoulroad.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<SiteUser, Long>{
	Optional<SiteUser> findByEmail(String email);
}
