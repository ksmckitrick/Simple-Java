package carpetCalculator;

public class RoomCarpet {

    private RoomDimension roomDimensions;
    private double costOfCarpet;

    public RoomCarpet(RoomDimension roomDimensions, double costOfCarpet) {
    	this.roomDimensions = roomDimensions;
        this.costOfCarpet = costOfCarpet;
    }

    public double getTotalCost() {
        return costOfCarpet * roomDimensions.getArea();
    }

    public String toString() {
        return  roomDimensions
        		+ "\nCost of Carpet=" + costOfCarpet + "\n"
                + "Total Cost=" + getTotalCost();
    }

}
