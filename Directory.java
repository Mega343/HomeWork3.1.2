package com.goit.gojavaonline;



import java.util.List;

public class Directory {

 private  List<Textfile> text;
 private   List<AudioFile> audio;
 private   List<Imigefile> imige;
 private   File file;

   public List<Textfile> getText() {
      return text;
   }

   public void setText(List<Textfile> text) {
      this.text = text;
   }

   public List<AudioFile> getAudio() {
      return audio;
   }

   public void setAudio(List<AudioFile> audio) {
      this.audio = audio;
   }

   public List<Imigefile> getImige() {
      return imige;
   }

   public void setImige(List<Imigefile> imige) {
      this.imige = imige;
   }

   public File getFile() {
      return file;
   }

   public void setFile(File file) {
      this.file = file;
   }
}
