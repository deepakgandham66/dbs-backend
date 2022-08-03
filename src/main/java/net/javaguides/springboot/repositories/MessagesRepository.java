package net.javaguides.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.helpers.MessagesHelper;

@Repository
public interface MessagesRepository extends JpaRepository<MessagesHelper, String>{

}
