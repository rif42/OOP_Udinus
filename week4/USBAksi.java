package week4;

import java.util.Scanner;

class MotherBoard {
    // static nested class
    static class USB{
        int getTotalPorts(int usb2, int usb3){
            return usb2 + usb3;
        }
    }
}

public class USBAksi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int usb3 = input.nextInt();
		int usb2 = input.nextInt();
        input.close();

		MotherBoard.USB usb = new MotherBoard.USB(); 
		int total = usb.getTotalPorts(usb2, usb3);
		System.out.println("Total Ports = " + total);
    }
}