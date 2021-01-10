package world;

import enums.*;
import population.Trolls;
import tools.*;
import  Exception.*;

public class Planet extends Nature {
     private int  wind;
     private String nameWind;
     private River river,river1;



public Planet(String name){
    this.setName(name);
    setTemperature(randomsi.random(-10,10));
    if (getTemperature()<=0){
        setSound("слышен шорох снега,создаваемый животными. Реки еще не замерли.");
    }else{
        setSound("слышно щебетание птиц");
    }
    wind=randomsi.random(0, 30);


    if (wind>20 ){
        nameWind="cильный ветер";

    }else if (wind>10){
        nameWind="cредний ветер";
    }else {
        nameWind="cлабый ветер";
    }
   getInfoPlanet();
    createRive(name);
    startPlotHat();


}
    Trolls mumiTrol= new Trolls("Муми-троль",6,1);
    Trolls smusTrol= new Trolls("Смусмурик",6,2);


private void createRive(String namePlanet){
    River river=new River(getTemperature(),"Трольская речушка ",wind,namePlanet);
    River river1=new River(namePlanet,wind);
    this.river=river;
    this.river1=river1;
    class Fish{
        public void creatFish(){
            System.out.println("В этой реке живет рыба ");
        }
    }
    Fish fish = new Fish();
    fish.creatFish();
     }

     private void getInfoPlanet(){
    System.out.println("");
    System.out.println("На планете: "+ getName()+ " Температура: "+getTemperature()+" и "+nameWind+" на улице "+getSound());
     }

     private  void startPlotHat(){
         smusTrol.bowedDown();
         smusTrol.Say("Муми-троль, случилось ужасное. Волшебная шляпа упала в реку, если ее не достать мир не будет прежним.Что будем делать ?");
         System.out.println("У муми троля сверкнуло в глазах.");
         mumiTrol.walk.go("побежал","реке");
         smusTrol.walk.go("побежал","реке");
         mumiTrol.Say(Emotions.PENSIVE.getContent()+" О нет, это ужасно. Мы должны сделать все чтоб спасти эту планету. Я готов пожертвовать собой и отправиться в плавь зе ней ");
         System.out.println("Опасная шляпа упала в реку и грозит испортить ее. Муми-троль бросается в реку, чтоб вытащить ее от туда ");


        try {
         if (river1.hashCode()<river.hashCode()){
             if(mumiTrol.startSwim(8,river, LoginType.SLIPPED, TypeOfSwimming.DOG, false, smusTrol)){
                 System.out.println("Ура, Муми-троль смог достать шляпу планета будет спасена");
                 checkWater();
             }else {
                 System.out.println("К сожалению, Муми-троль утонул, мир теперь не будет прежним");
             }


         }else{

             if(mumiTrol.startSwim(10,river,LoginType.SLIPPED,TypeOfSwimming.DOG, false,smusTrol)){
                 river.setClear(false);
                 System.out.println("Ура, Муми-троль смог достать шляпу планета будет спасена");
                 checkWater();
             }else {
                 System.out.println("К сожалению, Муми-троль утонул, мир теперь не будет прежним");
             }

         }
        }catch (SwimmingAreaException e){
            e.printStackTrace();

        }
         mumiTrol.eat(objectForEat.PAW,Emotions.JOY2,"красной воде");



     }
     private void checkWater(){
        if (river.equals(this.river1)){
            System.out.println("Муми-троль успел достать шляпу прежде чем она заглязинила воду");
        }else {
            System.out.println("К сожалению, Муми-троль смог достать шляпу не так быстро и теперь вниз по течению текла красная струя, это и была та красная вода о которой говорил Смусмурик    ");
        }

     }
     


}





