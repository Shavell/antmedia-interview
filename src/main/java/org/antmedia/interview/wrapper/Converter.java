package org.antmedia.interview.wrapper;

import org.antmedia.interview.exception.ConverterException;

public interface Converter {

    void convert(String filePath, String outputPath) throws ConverterException;
}
