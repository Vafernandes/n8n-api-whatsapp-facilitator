package com.n8n.agent.whatsapp_facilitator.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.util.List;

@Document("notes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotesEntity {

    @Id
    @Field("_id")
    private String mongoId;

    private String userMessage;

    @Field("id")
    private String externalId;

    private String userId;
    private String type;
    private Content content;
    private Metadata metadata;
    private String status;
    private Source source;
    private Instant createdAt;
    private Instant updatedAt;
    private String toolCallId;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Content {
        private String text;
        private String caption;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Metadata {
        private Instant remindAt;
        private String url;
        private String imageUrl;
        private String audioUrl;
        private Long duration;
        private Double confidence;
        private List<String> tags;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Source {
        private String channel;
        private String messageId;
    }
}
