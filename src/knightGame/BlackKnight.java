package knightGame;

public class BlackKnight {
    private int arms;
    private int legs;
    private int head;
    private String name;
    private Boolean alive;

    public BlackKnight (String name){
        this.name=name;
        this.arms=2;
        this.legs=2;
        this.head=1;
        this.alive=true;
    }

    public void cutOffArm(){
    arms --;
    }
    public void cutoffLeg(){

}

    public void  cutOffHead(){
        alive=false;
        System.out.println("knight" + name + "is no longer alive");
    }
    public void strike(){

    }

}



//class "BlackKnight"
  //      fields==> arms, legs, head, alive, name
   //     actions===> cutOffArm(), cutoffLeg(), cutOffHead(), strike()
