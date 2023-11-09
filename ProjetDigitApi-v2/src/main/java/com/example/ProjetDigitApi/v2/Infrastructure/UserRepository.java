package com.example.ProjetDigitApi.v2.Infrastructure;

import com.example.ProjetDigitApi.v2.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}