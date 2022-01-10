package com.company;

public class Skeleton extends Boss {
  private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public String printInfo(){
        return super.printInfo() +"; Number of Arrows: "+ this.getNumberOfArrows();
    }


} //sword.set
