package lesson35;

public class House extends RealEstate{
    private Double plotArea;
    private Double houseArea;
    private Integer price;

    public House(Double plotArea, Double houseArea, Integer price) {
        this.plotArea = plotArea;
        this.houseArea = houseArea;
        this.price = price;
    }

    public Double getPlotArea() {
        return plotArea;
    }

    public Double getHouseArea() {
        return houseArea;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "House{" +
                "plotArea=" + plotArea +
                ", houseArea=" + houseArea +
                ", price=" + price +
                '}';
    }
}
