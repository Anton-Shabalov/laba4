package enums;
public enum TypeOfSwimming {
    DOG("По-собачье"),FROG("По-лягушачье"),CRAWL("По-кролячьи");
    private String name;
TypeOfSwimming(String name){
    this.name=name;
}
public String getName(){return name;}
}

