package carsModel;

import abstracts.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarsModelInf extends Cars {

    private String model;
    public List<CarsModelInf> modelInfList=new ArrayList<>();


    public CarsModelInf(){

    }
    public CarsModelInf(String model) {
        this.model = model;
    }

    public String getModel(){
        return model;
    }


    public void setModel(String brand, int modelYear, String fuelType, int gear, double dailyPrice){

        this.model=model;
        super.setBrand(brand);
        super.setModelYear(modelYear);
        super.setFuelType(fuelType);
        super.setGear(gear);
        super.setDailyPrice(dailyPrice);

    }

    public List<CarsModelInf> getModelInfList() {
        return modelInfList;
    }

    public void setModelInfList(List<CarsModelInf> modelInfList) {
        this.modelInfList = modelInfList;
    }
}
