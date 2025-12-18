package com.n8n.agent.whatsapp_facilitator.service;

import com.n8n.agent.whatsapp_facilitator.repository.NotesRepository;
import com.n8n.agent.whatsapp_facilitator.entity.NotesEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotesService {

    private final NotesRepository notesRepository;

    public List<NotesEntity> getNotesByUserId(String userId) {
        return notesRepository.findByUserId(userId);
    }
}
