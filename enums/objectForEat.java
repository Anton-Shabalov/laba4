package enums;

public enum objectForEat {SPOON(" набрал в ложку "),FORK(" надел на вилку "),PAW(" обмакнул руку в ");
    private String content;
    objectForEat(String content){
        this.content=content;
    }

    public String getContent() {
        return content;
    }
}
