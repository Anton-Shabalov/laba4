package enums;

public enum LoginType {JUMPED("прыгнул"),HASENTERED(" вошел"),SLIPPED("скользнул");
private String content;
LoginType(String content){
    this.content=content;
}
public String getContent(){
    return content+" в воду";
}
}
