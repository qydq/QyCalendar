package com.qydq.qycalendarview;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<DayAndPrice> list = new ArrayList<DayAndPrice>();
        DayAndPrice dAndPrice = new DayAndPrice("sleep", 2016, 2, 20);
        DayAndPrice dAndPrice1 = new DayAndPrice("sleep", 2016, 2, 10);
        DayAndPrice dAndPrice21 = new DayAndPrice("sleep", 2016, 2, 15);
        DayAndPrice dAndPrice22 = new DayAndPrice("sleep", 2016, 2, 1);
        DayAndPrice dAndPrice2 = new DayAndPrice("sleep", 2016, 2, 18);
        DayAndPrice dAndPrice3 = new DayAndPrice("sleep", 2016, 2, 25);
        DayAndPrice dAndPrice4 = new DayAndPrice("sleep", 2016, 3, 5);
        DayAndPrice dAndPrice5 = new DayAndPrice("sleep", 2016, 3, 11);
        DayAndPrice dAndPrice6 = new DayAndPrice("sleep", 2016, 3, 15);
        DayAndPrice dAndPrice7 = new DayAndPrice("sleep", 2016, 4, 25);
        DayAndPrice dAndPrice8 = new DayAndPrice("sleep", 2016, 4, 1);
        DayAndPrice dAndPrice9 = new DayAndPrice("sleep", 2016, 4, 13);
        DayAndPrice dAndPrice10 = new DayAndPrice("sleep", 2016, 5, 16);
        DayAndPrice dAndPrice11 = new DayAndPrice("sleep", 2016, 5, 2);
        DayAndPrice dAndPrice12 = new DayAndPrice("sleep", 2016, 5, 4);
        DayAndPrice dAndPrice13 = new DayAndPrice("sleep", 2016, 5, 25);
        DayAndPrice dAndPrice14 = new DayAndPrice("", 2016, 8, 7);
        DayAndPrice dAndPrice15 = new DayAndPrice("sleep", 2016, 8, 5);
        list.add(dAndPrice);
        list.add(dAndPrice15);
        list.add(dAndPrice14);
        list.add(dAndPrice1);
        list.add(dAndPrice2);
        list.add(dAndPrice3);
        list.add(dAndPrice4);
        list.add(dAndPrice5);
        list.add(dAndPrice6);
        list.add(dAndPrice7);
        list.add(dAndPrice8);
        list.add(dAndPrice9);
        list.add(dAndPrice10);
        list.add(dAndPrice11);
        list.add(dAndPrice12);
        list.add(dAndPrice13);
        list.add(dAndPrice21);
        list.add(dAndPrice22);
//        List<WorkOrRelax> listDate = new ArrayList<WorkOrRelax>();
//        WorkOrRelax workOrRelax = new WorkOrRelax(2016, 2, 6, 0);
//        WorkOrRelax workOrRelax1 = new WorkOrRelax(2016, 2, 7, 1);
//        WorkOrRelax workOrRelax2 = new WorkOrRelax(2016, 2, 8, 1);
//        WorkOrRelax workOrRelax3 = new WorkOrRelax(2016, 2, 9, 1);
//        WorkOrRelax workOrRelax4 = new WorkOrRelax(2016, 2, 10, 1);
//        WorkOrRelax workOrRelax5 = new WorkOrRelax(2016, 2, 11, 1);
//        WorkOrRelax workOrRelax6 = new WorkOrRelax(2016, 2, 12, 1);
//        WorkOrRelax workOrRelax7 = new WorkOrRelax(2016, 2, 13, 1);
//        WorkOrRelax workOrRelax8 = new WorkOrRelax(2016, 2, 14, 1);
//        listDate.add(workOrRelax);
//        listDate.add(workOrRelax1);
//        listDate.add(workOrRelax2);
//        listDate.add(workOrRelax3);
//        listDate.add(workOrRelax4);
//        listDate.add(workOrRelax5);
//        listDate.add(workOrRelax6);
//        listDate.add(workOrRelax7);
//        listDate.add(workOrRelax8);
        setContentView(R.layout.activity_main);
        final CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.setListDayAndPrice(list);
//        calendarView.setListWorkOrRelax(listDate);
        calendarView.setDateViewClick(new CalendarView.DateViewClick() {

            @Override
            public void dateClick() {
                Toast.makeText(getApplication(), "点击了：" + calendarView.getSelectMonth(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
