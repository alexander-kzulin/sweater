package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessaqeRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
