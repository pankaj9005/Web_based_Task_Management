package com.codewithpankaj.fullstackbackend.Reposistry;

import com.codewithpankaj.fullstackbackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposistry extends JpaRepository<User,Long> {
}
