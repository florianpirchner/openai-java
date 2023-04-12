package com.theokanning.openai.audio;

import lombok.Data;

/**
 * Object containing a response from the chat translation api.
 */
@Data
public class TranslationResult {

    /**
     * The translated text in the format {@link TranslationRequest#responseFormat}
     */
    String text;
}
