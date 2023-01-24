package abstracts;

public abstract class Cars {
//marka, model, yakitTipi, vites ve gunlukUcret

   private String brand;
   private int modelYear;
   private String fuelType;
   private int gear;
   private double dailyPrice;

   public String getBrand() {
      return brand;
   }

   public int getModelYear() {
      return modelYear;
   }

   public String getFuelType() {
      return fuelType;
   }

   public int getGear() {
      return gear;
   }

   public double getDailyPrice() {
      return dailyPrice;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public void setModelYear(int modelYear) {
      this.modelYear = modelYear;
   }

   public void setFuelType(String fuelType) {
      this.fuelType = fuelType;
   }

   public void setGear(int gear) {
      this.gear = gear;
   }

   public void setDailyPrice(double dailyPrice) {
      this.dailyPrice = dailyPrice;
   }

   @Override
   public String toString() {
      return "Car{" +
              "brand='" + brand + '\'' +
              ", model=" + modelYear +
              ", fuelType='" + fuelType + '\'' +
              ", gear=" + gear +
              ", dailyPrice=" + dailyPrice +
              '}';
   }
}
