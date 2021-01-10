package population;
import inter.*;
import tools.randomsi;
import world.River;
import enums.*;
import Exception.*;


public class Trolls implements swim,talk {
    private String name;
    private int hp;
    private int id;
    private Tail tail;


    public Trolls(String name,int hp,int id){

        try {
            if(hp<1) {
                throw new ValueHealthException("Показатель здоровья принял недопустимое значение "+hp+", оно было изменено на 1");
            }
        }catch (ValueHealthException e){
            e.printStackTrace();
            hp=1;
        }
        this.name=name;
        this.hp=hp;
        this.id=id;
        this.tail=new Tail();


    }
public void eat(objectForEat object, Emotions emotions,String food){
        System.out.println(toString()+object.getContent()+" "+food+" и попробовал");
        this.Say(emotions.getContent());

}
public walk walk= new walk() {
    @Override
    public void go(String typeOfMovement, String placeOfArrival) {
        System.out.println(name+" " + typeOfMovement + " к " +placeOfArrival);
    }};


public void bowedDown(){
        System.out.println(toString()+" Склонился ");
}

    @Override
    public String toString() {
        return this.name;

    }

    Trolls(String name,int id){
        this.name=name;
        this.id=id;
    }
    public static void description(){

    }


    @Override
    public boolean saveAir() {
        if (randomsi.random(0,10)<=3){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean rowing(River river) {
        if (river.getCondition()==1){

            if(saveAir()){
                System.out.println("На "+this.name+" нахлынула вода, но он успел задержать дыхание");
                return true;
            }else {
                if(this.hp>1){
                    this.Say("На меня нахлынула вода, и я потерял здоровье, теперь у меня: " +this.hp +" здоровья");
                    hp=hp-1;
                    return true;
                }else {
                    this.Say("Я тону");
                    return false;

                }
            }

        }else {
            this.Say("Я приближаюсь к шляпе");
            return true;
        }


    }

    @Override
    public boolean startSwim(int k,River river,LoginType loginType, TypeOfSwimming typeOfSwimming,boolean swimmerCondition, Trolls friend) throws SwimmingAreaException {
        if (river == null){
            throw new SwimmingAreaException("Смусмурику негде плавать");
        }
        int liveTrol=1;
        System.out.println(toString()+" "+loginType.getContent()+ " и поплыл "+ typeOfSwimming.getName());
        if(swimmerCondition){Say("Вода теплая,я чувствую себя комфортно");}else{Say("Вода холодная и ячувствую себя не комфортно");}
        for(int i=0; i<k;++i){
            if (this.rowing(river)){
                friend.Say(Emotions.JOY.getContent()+ " "+ this.toString()+" приближается к цели ");
                if (i==k-1){
                    Say("Я подруливаю к берегу");
                    tail.wave();
                    friend.Say(Emotions.JOY.getContent()+ " "+ this.toString()+" практически на береге ");
                }else if(i==k/2){
                    Say("Вижу берег");

                }
            }else {
                liveTrol=0;
                friend.Say(Emotions.GRIEF.getContent()+ " "+ this.toString()+"Утонул");
                break;
            }
        }
        if (liveTrol==1){
            return true;
        }else {

            return false;
        }
    }


    @Override
    public void Say(String content) {
        System.out.println(toString()+": "+ content);


    }
    private class Tail{
        public void wave(){
            System.out.println(Trolls.this.toString()+" махнул хвостом");
        }

    }
}
