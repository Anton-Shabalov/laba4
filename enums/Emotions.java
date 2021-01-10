package enums;

public enum Emotions {JOY("Ура, "),GRIEF("О нет, "),PENSIVE("Задумался. "),JOY2("Радостно воскликнул 'Пи-хо'");
private String content;

Emotions(String content){
    this.content=content;

}

    public String getContent() {
        return content;
    }
}
