# Readme

### Request

```
For the 2nd interview,
our request from you is to code a small application that converts an flv file to an mp4 file with java (no transcoding is required). 
Library names are javacpp, javacpp-presets / ffmpeg that you can use. 
You can put the code on github, or we can go over your own PC during the interview, both are fine.
```

### DoD
```
Program is not passing arguments for this case. Working only static variables. 
Therefore only converting predefined (on github) video. 
```

### Usage
#### With Docker:
- mkdir -p out/
- docker build -t converter-app .
- docker run --rm -it -v out:/app/out converter-app

#### Without Docker (with jar):
- mvn clean package
- java -jar target/example.jar


### Used Dependencies
- JDK 11
- javacpp:1.5.8
- javacpp-presets:ffmpeg:5.1.2 (support all architecture (macosx,windows,linux,android;x86,arm,etc))
- Lombok:1.18.24

### Sources
- https://filesamples.com/formats/flv
- https://github.com/bytedeco/javacpp-presets/tree/master/ffmpeg
- http://bytedeco.org/javacpp-presets/ffmpeg/apidocs/org/bytedeco/ffmpeg/ffmpeg.html