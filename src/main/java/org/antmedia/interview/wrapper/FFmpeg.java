package org.antmedia.interview.wrapper;

import org.antmedia.interview.exception.ConverterException;
import org.bytedeco.javacpp.Loader;

public class FFmpeg implements Converter {

    @Override
    public void convert(String filePath, String outputPath) throws ConverterException {
        try {
            String ffmpeg = Loader.load(org.bytedeco.ffmpeg.ffmpeg.class);
            ProcessBuilder pb = new ProcessBuilder(ffmpeg, "-i", filePath, "-vcodec", "h264", outputPath);
            pb.inheritIO().start().waitFor();
        } catch (Exception e) {
            throw new ConverterException("Converter has exception", e);
        }
    }
}
