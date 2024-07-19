package lv.acodemy.classroom;

public class PezDispenser {
    private String name;
    private String color;
    private String series;
    private int maximumCapacity;
    private int minimumCapacity;
    private int currentCapacity;

    public PezDispenser(String name, String color, String series, int maximumCapacity, int minimumCapacity, int currentCapacity) {
        this.name = name;
        this.color = color;
        this.series = series;
        this.maximumCapacity = maximumCapacity;
        this.minimumCapacity = minimumCapacity;
        this.currentCapacity = currentCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public int getMinimumCapacity() {
        return minimumCapacity;
    }

    public void setMinimumCapacity(int minimumCapacity) {
        this.minimumCapacity = minimumCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", series='" + series + '\'' +
                ", maximumCapacity=" + maximumCapacity +
                ", minimumCapacity=" + minimumCapacity +
                ", currentCapacity =" + currentCapacity +
                '}';
    }

    public void giveOneCandy() {
        if (currentCapacity > minimumCapacity) {
            this.currentCapacity = currentCapacity - 1;
            System.out.printf("1 was given and %d left \n", currentCapacity);
        }
        if (currentCapacity == minimumCapacity) {
            System.out.println("Pez is empty");
        }
    }

    public void giveFewCandy(int pcs) {
        if (currentCapacity > minimumCapacity) {
            this.currentCapacity = currentCapacity - pcs;
            if (currentCapacity < minimumCapacity) {
                System.out.println("All was given and pez is empty");
            }
            if (currentCapacity < 0) {
                System.out.println("Pez is already empty. No candy");
            } else
                System.out.printf("%d was given and %d left \n", pcs, currentCapacity);

        }
    }

    public void loadToFull() {
        if (currentCapacity < maximumCapacity)
            this.currentCapacity = currentCapacity + (maximumCapacity - currentCapacity);
        System.out.println(currentCapacity);
    }

    public void loadOneCandy() {
        if (currentCapacity < maximumCapacity) {
            this.currentCapacity = currentCapacity + 1;
            System.out.println(currentCapacity);
        }
        if (currentCapacity == maximumCapacity) {
            this.currentCapacity = maximumCapacity;
            System.out.println("Pez is full");
        }
    }

    public void loadFewCandy(int pcs) {
        if (currentCapacity < maximumCapacity) {
            this.currentCapacity = currentCapacity + pcs;
            if (currentCapacity > maximumCapacity) {
                System.out.println("Cant load more Candy. Pez is full");
            } else {
                System.out.println(currentCapacity);

            }
        }
    }

}


