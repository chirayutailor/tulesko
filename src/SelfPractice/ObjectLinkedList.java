package SelfPractice;

import java.util.Random;
import java.util.Scanner;

class LinkObject {
    private LinkObject objNextReference;
    private int intNumber;

    public LinkObject(LinkObject objNextReference, int intNumber) {
        this.objNextReference = objNextReference;
        this.intNumber = intNumber;
    }

    public LinkObject(int intNumber) {
        this.intNumber = intNumber;
    }

    public void setObjNextReference(LinkObject objNextReference) {
        this.objNextReference = objNextReference;
    }

    public LinkObject getObjNextReference() {
        return objNextReference;
    }

    public int getIntNumber() {
        return intNumber;
    }

}

public class ObjectLinkedList {

    public static void main(String[] args) {
        int maxCounter = 9;
        LinkObject obj = new LinkObject( ( int ) ( Math.random() * 100 ) );

        do {
            obj = new LinkObject( obj, ( int ) ( Math.random() * 100 ) );
        } while ( --maxCounter > 0 );

        int counter = 1;
        do {
            System.out.println( counter++ + " -> " + obj.getIntNumber() );
            obj = obj.getObjNextReference();
        } while( obj != null );
    }

}
