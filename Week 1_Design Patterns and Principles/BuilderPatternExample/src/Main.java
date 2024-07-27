import dependencies.Computer;

public class Main {
  public static void main(String[] args) {
    Computer pc1 = new Computer.Builder().setCPU("i9 13th Generation").setRAM("32 GB").setStorage("1 TB")
        .setGPU("RTX 4090ti")
        .build();

    Computer pc2 = new Computer.Builder().setCPU("AMD Ryzen 7").setRAM("64 GB").setStorage("2 TB")
        .setGPU("RX 7600XT")
        .build();

    System.out.println(pc1);
    System.out.println(pc2);
  }
}