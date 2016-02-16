package oop.apisamples;

import java.util.Arrays;

public class ArrayList {
    private int[] pole;
    
    public ArrayList(){       
        pole = new int[0];
    }
    
    public ArrayList(int[] pole){
        this.pole = new int[pole.length];
        copyArray(pole, this.pole);
    }
    
    public ArrayList(ArrayList list){
        this(list.pole);
    }
    
    public int get(int index){
        return pole[index];
    }    
    
    public void add(int prvek){
        int[] newPole = new int[pole.length + 1];
        copyArray(pole, newPole);
        newPole[newPole.length - 1] = prvek;
        pole = newPole;
    }    
    
    public void sort(){
        Arrays.sort(pole);
    }
    
    public int size(){
        return pole.length;        
    }
    
    private static void copyArray(int[] poleFrom, int[] poleTo){
        for(int i=0; i<poleFrom.length; i++){
            poleTo[i] = poleFrom[i];
        }
    }
    
    
}
