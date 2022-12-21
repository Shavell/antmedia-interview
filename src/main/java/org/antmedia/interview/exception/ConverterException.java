package org.antmedia.interview.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ConverterException extends Exception {

    private final String message;
    private final Exception e;
}
