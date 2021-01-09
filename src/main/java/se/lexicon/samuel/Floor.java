package se.lexicon.samuel;
//this class takes care of the floor size
public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        if(width < 0){
            this.width = 0;
        }
        this.length = length;
        if(length < 0){
            this.length = 0;
        }
    }
    public double getArea(){
        double area = width * length;
        return area;
    }
}
//this class takes care of the Carpet cost
class Carpet{
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
        if(cost < 0){
            this.cost = 0;
        }
    }
    public double getCost(){
        return cost;
    }
}
//this class, the floor and the carpet cost are passed directly into the class calculator
class Calculator{
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}