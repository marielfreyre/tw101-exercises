package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float totalAreaOfRectangles = 0;
        int totalNumberOfRectangles = rectangles.length;
        for(int i = 0; i<totalNumberOfRectangles; i++){
            totalAreaOfRectangles += rectangles[i].area();
        }



        return totalAreaOfRectangles/totalNumberOfRectangles;
    }
}
