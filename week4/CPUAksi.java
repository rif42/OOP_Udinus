package week4;

public class CPUAksi {
    public static void main(String[] args) {
        CPU.Processor processor = new CPU.Processor();
        double cache = processor.getCache();
        System.out.println("Processor Cache = " + cache);

        CPU.RAM ram = new CPU.RAM();
        double clockSpeed = ram.getClockSpeed();
        System.out.println("Ram Clock speed = " + clockSpeed);
    }
}
