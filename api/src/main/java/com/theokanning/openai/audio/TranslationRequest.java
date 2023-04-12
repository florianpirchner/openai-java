package com.theokanning.openai.audio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Translates audio into into English.
 * <p>
 * https://platform.openai.com/docs/api-reference/audio/create
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TranslationRequest {

    /**
     * ID of the model to use. Only whisper-1 is currently available.
     * Required.
     */
    String model;

    /**
     * An optional text to guide the model's style or continue a previous audio segment.
     * The prompt should be in English.
     */
    String prompt;

    /**
     * The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.<br>
     * Defaults to json.
     */
    @JsonProperty("response_format")
    String responseFormat;

    /**
     * The sampling temperature, between 0 and 1.
     * Higher values like 0.8 will make the output more random,
     * while lower values like 0.2 will make it more focused and deterministic.
     * <p>
     * If set to 0, the model will use log probability to automatically increase the temperature until certain thresholds are hit.
     */
    Double temperature;

}
