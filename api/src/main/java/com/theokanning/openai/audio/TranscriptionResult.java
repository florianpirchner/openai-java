package com.theokanning.openai.audio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Object containing a response from the chat transcription api.
 */
@Data
public class TranscriptionResult {

    /**
     * The transcribed text in the format {@link TranscriptionRequest#responseFormat}
     */
    String text;
}
