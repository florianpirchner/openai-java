package com.theokanning.openai.service;

import com.theokanning.openai.audio.TranscriptionRequest;
import com.theokanning.openai.audio.TranscriptionResult;
import com.theokanning.openai.audio.TranslationRequest;
import com.theokanning.openai.audio.TranslationResult;
import com.theokanning.openai.image.Image;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class AudioTest {

    static String filePath = "src/test/resources/One-Two-Three.mp3";

    String token = System.getenv("OPENAI_TOKEN");
    OpenAiService service = new OpenAiService(token);

    @Test
    void createTranscription() {
        TranscriptionRequest request = TranscriptionRequest.builder()
                .model("gpt-4")
                .temperature(0.1d)
                .build();

        TranscriptionResult result = service.createTranscription(request, filePath);
    }

    @Test
    void createTranslation() {
        TranslationRequest request = TranslationRequest.builder()
                .model("gpt-4")
                .temperature(0.1d)
                .build();

        TranslationResult result = service.createTranslation(request, filePath);
    }

}
