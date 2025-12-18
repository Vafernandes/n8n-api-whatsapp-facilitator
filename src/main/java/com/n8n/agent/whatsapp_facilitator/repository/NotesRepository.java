package com.n8n.agent.whatsapp_facilitator.repository;

import com.n8n.agent.whatsapp_facilitator.entity.NotesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepository extends MongoRepository<NotesEntity, String> {

    List<NotesEntity> findByUserId(String userId);
}
