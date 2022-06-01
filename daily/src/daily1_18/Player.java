package daily1_18;

import java.util.Random;
import java.util.Scanner;

public abstract class Player {
   int hand;                     //손 (0:가위/1:바위/2:보)
   public abstract int nextHand();       //다음 손 결정
}

