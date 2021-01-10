package world;

public abstract class Nature {
     private String name;
     private String sound;
     private int Temperature;

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setSound(String sound) {
          this.sound = sound;
     }
     public String getSound() {
          return sound;
     }

     public int getTemperature() {
          return Temperature;
     }

     public void setTemperature(int temperature) {
          Temperature = temperature;
     }
}
