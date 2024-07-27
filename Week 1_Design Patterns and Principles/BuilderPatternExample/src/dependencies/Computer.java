package dependencies;

public class Computer {
  private String CPU;
  private String RAM;
  private String Storage;
  private String GPU;

  private Computer(Builder builder) {
    this.CPU = builder.CPU;
    this.RAM = builder.RAM;
    this.Storage = builder.Storage;
    this.GPU = builder.GPU;
  }

  @Override
  public String toString() {
    return "CPU : " + this.CPU + " | " + "RAM : " + this.RAM + " | " + "Storage : " + this.Storage + " | " + "GPU : "
        + this.GPU;
  }

  public static class Builder {
    private String CPU;
    private String RAM;
    private String Storage;
    private String GPU;

    public Builder setCPU(String CPU) {
      this.CPU = CPU;
      return this;
    }

    public Builder setRAM(String RAM) {
      this.RAM = RAM;
      return this;
    }

    public Builder setStorage(String Storage) {
      this.Storage = Storage;
      return this;
    }

    public Builder setGPU(String GPU) {
      this.GPU = GPU;
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }
  }
}