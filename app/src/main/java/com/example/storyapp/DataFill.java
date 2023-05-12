package com.example.storyapp;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DataFill {

    static ArrayList<ListData> dataArrayList = new ArrayList<>();


    public static ArrayList<ListData> fillData()
    {   ArrayList<Pages> pagesArrayList1 = new ArrayList<>();
        pagesArrayList1.add(new Pages(R.drawable.picture_1,"1ère page"));
        pagesArrayList1.add(new Pages(R.drawable.picture_2,"2ème page"));
        pagesArrayList1.add(new Pages(R.drawable.picture_3,"3ème page"));
        pagesArrayList1.add(new Pages(R.drawable.picture_4,"4ème page"));

        ArrayList<Pages> pagesArrayList2 = new ArrayList<>();
        pagesArrayList2.add(new Pages(R.drawable.picture_1,"1ère page"));
        pagesArrayList2.add(new Pages(R.drawable.picture_2,"2ème page"));
        pagesArrayList2.add(new Pages(R.drawable.picture_3,"3ème page"));
        pagesArrayList2.add(new Pages(R.drawable.picture_4,"4ème page"));

        ArrayList<Pages> pagesArrayList3 = new ArrayList<>();
        pagesArrayList3.add(new Pages(R.drawable.picture_1,"1ère page"));
        pagesArrayList3.add(new Pages(R.drawable.picture_2,"2ème page"));
        pagesArrayList3.add(new Pages(R.drawable.picture_3,"3ème page"));
        pagesArrayList3.add(new Pages(R.drawable.picture_4,"4ème page"));

        ArrayList<Pages> pagesArrayList4 = new ArrayList<>();
        pagesArrayList4.add(new Pages(R.drawable.picture_1,"1ère page"));
        pagesArrayList4.add(new Pages(R.drawable.picture_2,"2ème page"));
        pagesArrayList4.add(new Pages(R.drawable.picture_3,"3ème page"));
        pagesArrayList4.add(new Pages(R.drawable.picture_4,"4ème page"));

        ArrayList<Pages> pagesArrayList5 = new ArrayList<>();
        pagesArrayList5.add(new Pages(R.drawable.picture_1,"1ère page"));
        pagesArrayList5.add(new Pages(R.drawable.picture_2,"2ème page"));
        pagesArrayList5.add(new Pages(R.drawable.picture_3,"3ème page"));
        pagesArrayList5.add(new Pages(R.drawable.picture_4,"4ème page"));

        ArrayList<Pages> pagesArrayList6 = new ArrayList<>();
        pagesArrayList6.add(new Pages(R.drawable.picture_1,"1ère page"));
        pagesArrayList6.add(new Pages(R.drawable.picture_2,"2ème page"));
        pagesArrayList6.add(new Pages(R.drawable.picture_3,"3ème page"));
        pagesArrayList6.add(new Pages(R.drawable.picture_4,"4ème page"));

        ArrayList<Pages> pagesArrayList7 = new ArrayList<>();
        pagesArrayList7.add(new Pages(R.drawable.picture_1,"1ère page"));
        pagesArrayList7.add(new Pages(R.drawable.picture_2,"2ème page"));
        pagesArrayList7.add(new Pages(R.drawable.picture_3,"3ème page"));
        pagesArrayList7.add(new Pages(R.drawable.picture_4,"4ème page"));

        dataArrayList.add(new ListData("Alice","3 pages",R.drawable.alice,false,pagesArrayList1));
        dataArrayList.add(new ListData("Cendrillon","2 pages",R.drawable.cendrillon,false,pagesArrayList2));
        dataArrayList.add(new ListData("Hansel et Gretel","3 pages",R.drawable.hanselgretel,false,pagesArrayList3));
        dataArrayList.add(new ListData("Les trois petits cochons","5 pages",R.drawable.lespetitscochons,false,pagesArrayList4));
        dataArrayList.add(new ListData("Peter Pan","4 pages",R.drawable.peterpan,false,pagesArrayList5));
        dataArrayList.add(new ListData("Petit poucet","2 pages",R.drawable.petitpoucet,false,pagesArrayList6));
        dataArrayList.add(new ListData("Pinocchio","4 pages",R.drawable.pinocchio,false,pagesArrayList7));

        return dataArrayList;
    }
}
