
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mehre
 */
import java.util.ArrayList;

class Task {

    int iniTime;
    int value ;

    public Task(int t,int v){
           this.iniTime = t;
           this.value = v;
    }
    public void setIniTime(int t) {
        this.iniTime = t;
    }

    public void setValue(int t) {
        this.value = t;
    }

    public int getIniTime() {
        return this.iniTime;
    }

    public int getValue() {
        return this.value;
    }

}

public class ProblemB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] ss = input.split(" ");
        //Task[] taskArray = new Task[Integer.parseInt(ss[0])];
        ArrayList<Task> server = new ArrayList<Task>();
        int[] reqArray = new int[Integer.parseInt(ss[0])];
        int kk = Integer.parseInt(ss[1]);

        for (int j = 0; j < kk; j++) {
            server.add(new Task(0,0));
        }
        for (int j = 0; j < reqArray.length; j++) {
            reqArray[j] = sc.nextInt();
        }
        for (int j = 0; j < reqArray.length; j++) {
           
            setTask(server, reqArray[j],kk);
        }
        //  System.out.println("Server size"+server.size());
        System.out.println(server.size()/kk);

    }

    public static void setTask(ArrayList<Task> server, int t,int kk) {
        boolean isSet = false;
        for (Task d : server) {
            if (d.getValue() == 0) {
                d.setIniTime(t);
                d.setValue(1000);
                isSet = true;
                break;
            } else {
                d.setValue(1000 - (t - d.getIniTime()));
                if (d.getValue() <=0) {
                    d.setIniTime(t);
                    d.setValue(1000);
                    isSet = true;
                break;
                }
            }
        }
        if(!isSet){
            server.add(new Task(1000,t));
            for (int j = 0; j < kk-1; j++) {
            server.add(new Task(0,0));
        }
            
        }

        
    }
}
