package com.minishop.soure.basic;

public class TestEnum {
    Day day;

    public TestEnum(Day day) {
        this.day = day;
    }

    public void testDay() {
        switch (day) {
            case MONDAY:
                System.out.println("MONDAY");
                break;
            case FRIDAY:
                System.out.println("FRIDAY");
                break;
            case SATURDAY:
                System.out.println("SATURDAY");
                break;
            case THURSDAY:
                System.out.println("THURSDAY");
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;
            default:
                System.out.println("WEDNESDAY");
                break;
        }
    }
}
