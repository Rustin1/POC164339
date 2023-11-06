package com.fitness.tracker;



public class TestWorkoutSession {
    public static void main(String[] args) {
        WorkoutSession WorkoutSession = new WorkoutSession("brzuszki", 0);
        System.out.println("ćwiczenie: " + WorkoutSession.getActivityName());
        System.out.println( "czas: " + WorkoutSession.getDurationMinutes() + " minut");
    }
}
