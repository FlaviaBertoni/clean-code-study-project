package br.com.cleancode.capitulo2;

public class Exercicio5Refactor {

  private static final int NUMBER_OF_TASKS = 34;
  private static final int WORK_DAYS_PER_WEEK = 5;

  //...

  int getTotalTasksWeeks(int[] taskEstimate) {
    int realDaysPerIdealDay = 4;
    int sum = 0;
    
    for (int j=0; j<NUMBER_OF_TASKS; j++) {
      int realTasksDays = taskEstimate[j] * realDaysPerIdealDay;
      int realTasksWeeks = (realTasksDays / WORK_DAYS_PER_WEEK);
      sum += realTasksWeeks;
    }

    return sum;
  }

  //...
}