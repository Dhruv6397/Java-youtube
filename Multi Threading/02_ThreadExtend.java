//ThreadExtend.java
class Demo extends Thread{
    Demo(String name){
        super(name);
    }
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("I am thread: "+this.getName());
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }        
        }
    }
}
public class ThreadExtend {
    public static void main(String[] args) {
        Demo d01 = new Demo("First");
        Demo d02 = new Demo("Second");
        Demo d03 = new Demo("Third");
        d01.start();
        d02.start();
        d03.start();

    }
}
