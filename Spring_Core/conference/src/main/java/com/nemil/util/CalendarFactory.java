package com.nemil.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalendarFactory implements FactoryBean<Calendar>{

    private Calendar instance = Calendar.getInstance();

    public Calendar getObject() throws Exception {
        return instance;
    }

    public Class<?> getObjectType() {
        return Calendar.class;
    }

    public void addDays(int num){
        instance.add(Calendar.DAY_OF_YEAR, num);
    }
}
