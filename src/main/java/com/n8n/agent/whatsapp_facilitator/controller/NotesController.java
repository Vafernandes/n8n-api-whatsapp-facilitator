package com.n8n.agent.whatsapp_facilitator.controller;

import com.n8n.agent.whatsapp_facilitator.service.NotesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/notes")
@RequiredArgsConstructor
@Tag(name = "Notes", description = "Gerenciamento de notas dos usuários")
public class NotesController {

    private final NotesService notesService;

    @GetMapping("/{userId}")
    @Operation(summary = "Busca notas de um usuário", description = "Retorna todas as notas vinculadas ao userId informado.")
    public ResponseEntity<?> getNotesByUserId(
            @Parameter(description = "Identificador do usuário", required = true, example = "558899956689")
            @PathVariable String userId) {
        var response = notesService.getNotesByUserId(userId);
        return ResponseEntity.ok(response);
    }
}
