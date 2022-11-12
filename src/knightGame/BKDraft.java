//package knightGame;
//
//public class BKDraft {
//
//    package knightGame;
//
//    public class BlackKnight {
//        private int arms;
//        private int legs;
//        private int head;
//        private String name;
//        private Boolean alive;
//
//        public BlackKnight(){
//
//        }
//        public BlackKnight (String name){
//            this.name=name;
//            this.arms=2;
//            this.legs=2;
//            this.head=1;
//            this.alive=true;
//        }
//
//        public int cutOffArm() {
//
//            if (arms <= 0) {
//                System.out.println("no more arms to cut ");
//                // toString();
//            }
//            if (arms >= 0) {
//                arms--;
//            }
//            return arms;
//
//        }
//
//
//        public int cutoffLeg(){
//            if (legs==0){
//                System.out.println("no more legs to cut ");
//            }else legs --;
//            System.out.println(" legs left "+legs);
//            return legs;
//        }
//
//        public int  cutOffHead() {
//            head--;
//            alive=false;
//            System.out.println("knight " + name + " is no longer alive");
//            return head;
//        }
//
//        public void strike( knightGame.BlackKnight knight){
//            System.out.println("Black Knight status: " + knight.toString());
//            System.out.println("You cutted: " + knight.cutOffArm() + " arm"); // 1th arm
//            System.out.println("You cutted: " + knight.cutOffArm() + " arm");//2th arm
//            System.out.println("You cutted: " + knight.cutOffArm() + " arm"); // should return no more arms to cut
//
//
//            System.out.println("--------------------------");
//
//        }
//        public String toString() {
//            //System.out.println( "name: " + this.name + ", arms: " +arms+", legs: "+legs+", head: "+head);
//            return  "name: " + this.name + ", arms: " +arms+", legs: "+legs+", head: "+head;
//
//        }
//
//        public static void main (String[] args){
//            knightGame.BlackKnight blackKnight = new knightGame.BlackKnight();
////        blackKnight.toString();
////        blackKnight.cutOffArm();
////      //  blackKnight.parameters();
////        blackKnight.cutOffArm();
////      //  blackKnight.parameters();
////    blackKnight.cutOffArm();
////    blackKnight.cutoffLeg();
////        blackKnight.cutOffHead();
////        blackKnight.toString();
//            blackKnight.strike(new knightGame.BlackKnight("alex"));
//
//
//        }
//
//    }
//
//
//
////class "BlackKnight"
//    //      fields==> arms, legs, head, alive, name
//    //     actions===> cutOffArm(), cutoffLeg(), cutOffHead(), strike()
//
//}
