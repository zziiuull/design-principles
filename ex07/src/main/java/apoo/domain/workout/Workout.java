package apoo.domain.workout;

import apoo.domain.exercise.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private Integer workoutDuration;

    public Workout(List<Exercise> exercises) {
        this.exercises = exercises;
        this.workoutDuration = getTotalWorkoutDuration();
    }

    public Integer getTotalWorkoutDuration() {
        return exercises.stream().mapToInt(Exercise::getDuration).sum();
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public Integer getWorkoutDuration() {
        return workoutDuration;
    }

    public void setWorkoutDuration(Integer workoutDuration) {
        this.workoutDuration = workoutDuration;
    }
}
