package exam1;
import java.io.*; 

class EvenNum2 implements Runnable{
    int n;
    public EvenNum2(int n){
        this.n = n;
    }
    public void run(){
        try(BufferedWriter fw1 = new BufferedWriter(new FileWriter("Even.txt",true))){
            fw1.write(n+"\n");
            System.out.println(n+" is even, wrote to Even.txt");
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

class OddNum2 implements Runnable{
    int n;
    public OddNum2(int n){
        this.n = n;
    }
    public void run(){
        try(BufferedWriter fw2 = new BufferedWriter(new FileWriter("Odd.txt",true))){
            fw2.write(n+"\n");
            System.out.println(n+" is odd, wrote to Odd.txt");
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
        
public class MultFIleThreading {
    public static void main(String[] args){
        int n;
        try{
            File f1 = new File("Even.txt");
            if(f1.createNewFile()){
                System.out.println(f1.getName()+" is successfully created at "+f1.getAbsolutePath());
            }
            else{
                System.out.println(f1.getName()+" already exists at "+f1.getAbsolutePath());
            }
            
            File f2 = new File("Odd.txt");
            if(f2.createNewFile()){
                System.out.println(f2.getName()+" is successfully created at "+f2.getAbsolutePath());
            }
            else{
                System.out.println(f2.getName()+" already exists at "+f2.getAbsolutePath());
            }
            
            for(int i=1; i<=100; i++){
                n = i;
                if(n%2 ==0){
                    Thread t1 = new Thread(new EvenNum2(n));
                    t1.start();
                }
                else{
                    Thread t2 = new Thread(new OddNum2(n));
                    t2.start();
                }
                System.out.println("-------------------------------"); 
                Thread.sleep(100);
            }
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(InterruptedException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
