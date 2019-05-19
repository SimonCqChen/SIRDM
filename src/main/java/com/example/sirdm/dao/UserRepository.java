package com.example.sirdm.dao;

import com.example.sirdm.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.List;

@Repository
@Table(name="User")
@Qualifier("UserRepository")
@RepositoryRestResource(path="user")
public interface UserRepository extends JpaRepository<User, Integer> {
}
