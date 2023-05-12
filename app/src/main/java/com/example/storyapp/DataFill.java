package com.example.storyapp;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DataFill {

    static ArrayList<ListData> dataArrayList = new ArrayList<>();


    public static ArrayList<ListData> fillData()
    {
        ArrayList<Pages> pagesArrayList = new ArrayList<>();
        pagesArrayList.add(new Pages(R.drawable.picture_1,"1ère page"));
        pagesArrayList.add(new Pages(R.drawable.picture_2,"2ème page"));
        pagesArrayList.add(new Pages(R.drawable.picture_3,"3ème page"));
        pagesArrayList.add(new Pages(R.drawable.picture_4,"4ème page"));

        dataArrayList.add(new ListData("Alice","3 pages",R.drawable.alice,false,pagesArrayList));
        dataArrayList.add(new ListData("Cendrillon","2 pages",R.drawable.cendrillon,false,pagesArrayList));
        dataArrayList.add(new ListData("Hansel et Gretel","3 pages",R.drawable.hanselgretel,false,pagesArrayList));
        dataArrayList.add(new ListData("Les trois petits cochons","5 pages",R.drawable.lespetitscochons,false,pagesArrayList));
        dataArrayList.add(new ListData("Peter Pan","4 pages",R.drawable.peterpan,false,pagesArrayList));
        dataArrayList.add(new ListData("Petit poucet","2 pages",R.drawable.petitpoucet,false,pagesArrayList));
        dataArrayList.add(new ListData("Pinocchio","4 pages",R.drawable.pinocchio,false,pagesArrayList));

        return dataArrayList;
    }
}
