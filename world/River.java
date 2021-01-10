package world;
import tools.*;

public class River extends Nature {
    private int waves;
    private boolean clear;
    private String namePlanet;
    public River(int temperature,String name, int wind,String namePlanet){
        this.namePlanet=namePlanet;
        clear=true;
        setTemperature(randomsi.random(temperature-5,temperature+5));
        setName(name);

        if (wind>20 ){
            waves=3;
            getInfo(name,"сильными","сильный грохот");
            setSound("сильный грохот");

        }else if (wind>10){
            waves=2;
            getInfo(name,"средними волнами","небольшой шум");
            setSound("небольшой шум");
        }else {
            waves=1;
            getInfo(name,"слабыми волнами","слабый звук характерный течению");
            setSound("слабый звук характерный течению");
        }
    }
    public River(String namePlanet,int wind){
        clear=true;
        this.namePlanet=namePlanet;
        if (wind>20 ){
            waves=3;
        }else if (wind>10){
            waves=2;
        }else {
            waves=1;
        }
    }
    public void getInfo(String name,String wavesName,String sound){
        System.out.println("На планете "+namePlanet+ " есть река под названием "+name+" c "+wavesName+".Температура ее " +getTemperature()+" градусов"+". От реки исходит "+sound);
        getInfo();
    }
    public void getInfo(){
        System.out.println("У этой реки есть продолжение, от состояния воды в этой части зависит будущее планеты "+  namePlanet);
    }
    public int getCondition(){
        if (randomsi.random(0,10)+waves<6){
            return 0;
        }else {
            return 1;
        }

    }

    public void setClear(boolean clear) {
        this.clear = clear;
    }

    @Override
    public boolean equals(Object obj){
        return clear==((River) obj).clear;
    }

    @Override
    public int hashCode() {
        return this.waves;
    }
}
