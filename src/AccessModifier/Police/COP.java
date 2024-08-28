package AccessModifier.Police;

public class COP {
         private String name;
        private int gun;

        public  COP(String name,int gun){
            this.name=name;
            this.gun=gun;

        }
        protected void canIShoot(){
            System.out.println("Yes u can shoot");


        } public void printDetails(){
        System.out.println("the name is :"+name   +", Gun:"+gun);
    }

    }


