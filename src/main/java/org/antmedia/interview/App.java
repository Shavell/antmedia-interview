package org.antmedia.interview;

import org.antmedia.interview.exception.ConverterException;
import org.antmedia.interview.wrapper.Converter;
import org.antmedia.interview.wrapper.FFmpeg;

public class App {
    private static final String EXAMPLE_INPUT_FILE = "src/main/resources/example/sample_960x400_ocean_with_audio.flv";
    private static final String OUTPUT_FILE = "output/out.mp4";

    public static void main(String[] args) throws ConverterException {
        // Create which one converter class
        Converter converter = new FFmpeg();
        // Prepare example conversion
        converter.convert(EXAMPLE_INPUT_FILE, OUTPUT_FILE);
    }
}
