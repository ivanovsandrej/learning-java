package lv.acodemy.classroom;

public class Car {
    // class fields
    private String carBrand;
    private String carModel;
    private int productionYear;
    private double mileage;
    private String color;
    private boolean isRunning = true;

    public Car(String carBrand, String carModel, int productionYear, double mileage, String color) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.color = color;
    }

    private Car(CarBuilder builder) {
        this.carBrand = builder.carBrand;
        this.carModel = builder.carModel;
        this.productionYear = builder.productionYear;
        this.mileage = builder.mileage;
        this.color = builder.color;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "Car Brand='" + carBrand + '\'' +
                ", Model='" + carModel + '\'' +
                ", Production Year=" + productionYear +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                '}';
    }

    public void start() {
        if (isRunning == true) {
            System.out.println("the car has started");
        } else {
            System.out.println("the car is already running");
        }
    }

    public void stop() {
        if (isRunning == false) {
            System.out.println(" the car has stopped");
        } else {
            System.out.println("already stopped");
        }
    }

    public void drive(double kilometers) {
        if (isRunning) {
            this.mileage = this.mileage + kilometers;
            System.out.printf("The car has driven %.2f kilometers. Total mileage is: %2f %n", kilometers, this.mileage);
        }
    }

    // Getters

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class CarBuilder {
        private String carBrand;
        private String carModel;
        private int productionYear;
        private double mileage;
        private String color;

        public CarBuilder() {
        }

        public CarBuilder setCarBrand(String carBrand) {
            this.carBrand = carBrand;
            return this;
        }

        public CarBuilder setModel(String carModel) {
            this.carModel = carModel;
            return this;
        }

        public CarBuilder setProductionYear(int productionYear) {
            this.productionYear = productionYear;
            return this;
        }

        public CarBuilder setmiliage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);

        }
    }

}


//Car myBmwCar = new Car()
//}
