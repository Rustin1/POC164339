package com.fitness.tracker;

class WorkoutSession {
    private String activityName;
    private int durationMinutes;

    public WorkoutSession(String activityName, int durationMinutes){
        this.activityName = activityName;
        this.durationMinutes = durationMinutes;
        if (this.durationMinutes<1)
            this.durationMinutes = 30;
    }
    //getters


    public String getActivityName() {
        return activityName;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
    //setters

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes<1)
            this.durationMinutes = durationMinutes;
    }
}
