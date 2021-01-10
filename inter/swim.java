package inter;

import enums.LoginType;
import enums.TypeOfSwimming;
import population.Trolls;
import world.River;
import Exception.*;

public interface swim {
    boolean saveAir();
    boolean rowing(River river);
    boolean startSwim(int k, River river, LoginType loginType, TypeOfSwimming typeOfSwimming, boolean swimmerСondition, Trolls friend) throws SwimmingAreaException;



}
