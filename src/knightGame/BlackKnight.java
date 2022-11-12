package knightGame;

public class BlackKnight {
    private byte arms=2;
    private byte legs=2;
    private byte head=1;
    private String name;
    private Boolean alive=true;
    public static int numOfAliveKnights = 0;
    public static int numOfDeadKnights = 0;

    public static BlackKnight[] allKnights = new BlackKnight[10]; // can contain 10 players

    //constructor overload
public BlackKnight(){
    this.name ="Anonymous knight";
}
//constructor
    public BlackKnight (String name){
        this.name=name;
    }

    public void cutOffArm() {
        arms--;
    }


    public void cutoffLeg(){
        legs--;
}

    public void  cutOffHead() {
        head--;
        }

    public void strike() {
        if (alive) {
            if(arms >0){
                cutOffArm();
            } else if (legs>0) {
                cutoffLeg();
            } else  {
                cutOffHead();
                alive = !alive;
            }

        } else{
            System.out.println("Stop! He is already dead");
        }
    }

        @Override
        public String toString () {
            //System.out.println( "name: " + this.name + ", arms: " +arms+", legs: "+legs+", head: "+head);
            return "BlackKnights { " + "\n"+
                    "name: " +name +"\n"+
                    ", arms: " + arms +"\n"+
                    ", legs: " + legs +"\n"+
                    ", head: " + head+"\n"+
                    "alive " +alive+
                    " }";

        }

        public static void main (String[] args){
//            BlackKnight knight1 = new BlackKnight("Arthur");
//            allKnights[0]=knight1; // set 1th knight in array be arthur
//            BlackKnight.numOfAliveKnights++; // increase nr. of alive knights
//            allKnights[0].strike();
//            allKnights[0].strike();
//            allKnights[0].strike();
//            allKnights[0].strike();
//            allKnights[0].strike();
//            allKnights[0].strike();
//
//           System.out.println(allKnights[0].toString());

// from constructor overload
            BlackKnight knight2 = new BlackKnight();
            System.out.println(knight2.toString());
        }

    }



//class "BlackKnight"
  //      fields==> arms, legs, head, alive, name
   //     actions===> cutOffArm(), cutoffLeg(), cutOffHead(), strike()
