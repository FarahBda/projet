package com.example.storyapp;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DataFill {

    static ArrayList<ListData> dataArrayList = new ArrayList<>();


    public static ArrayList<ListData> fillData()
    {   ArrayList<Pages> pagesArrayList1 = new ArrayList<>();
        pagesArrayList1.add(new Pages(R.drawable.a,"Un après-midi, Violette se promène dans le château. Elle emprunte plusieurs escaliers, traverse des couloirs qu'elle ne connaît pas vraiment, et découvre une grande porte en bois."));
        pagesArrayList1.add(new Pages(R.drawable.b,"Elle pousse la porte, celle-ci fait beaucoup de bruit en s'ouvrant, ce qui effraie un peu la princesse ! Mais la curiosité de Violette est trop forte, elle veut savoir ce que cache cette pièce..."));
        pagesArrayList1.add(new Pages(R.drawable.c,"Elle passe la tête, la pièce est très sombre, il y a des draps blancs et de grandes ombres sur les murs. Violette fait un pas dans la pénombre mais un petit bruit de craquement la fait s'enfuir en courant."));
        pagesArrayList1.add(new Pages(R.drawable.d,"Violette veut savoir ce qui se cache dans cet endroit, mais elle n'est pas assez courageuse pour y aller seule. Elle réfléchit pour savoir qui pourrait l'accompagner sans être effrayé... \" Mais oui, GASPARD !\""));
        pagesArrayList1.add(new Pages(R.drawable.a,"La princesse court à toute vitesse vers les écuries et raconte son histoire de pièce secrète à son ami Gaspard. \" Je viendrai avec toi princesse, mais il faut que je finisse de nettoyer les boxes des chevaux avant...\" lui répond le garçon. \"Je vais t'aider, on ira plus vite tous les deux\" s'écrie Violette."));
        pagesArrayList1.add(new Pages(R.drawable.b,"Violette attrape de la paille et commence à en éparpiller dans le boxe. \"Oups, pardon Gaspard je ne t'avais pas vu...\" s'excuse la princesse. Gaspard relève la tête, il a plein de paille sur le dos. \"Princesse c'est le boxe qu'il faut pailler, pas moi !\" plaisante-t-il. Les enfants rigolent et poursuivent leur travail."));
        pagesArrayList1.add(new Pages(R.drawable.picture_1,"\"Bien, nous avons terminé, allons voir la pièce secrète princesse !\" déclare Gaspard. Violette attrape Gaspard et une fois dans le château, ils se dirigent vers la grande porte en bois que Violette à découverte il y a maintenant quelques heures."));
        pagesArrayList1.add(new Pages(R.drawable.picture_2,"Gaspard pousse la porte, Violette se cache derrière lui. Le jeune garçon se dirige vers de grands rideaux et les tire, une lumière envahit la pièce et les ombres disparaissent aussitôt. Violette attrape un drap et le soulève pour dévoiler ce qui s'y trouve en dessous."));
        pagesArrayList1.add(new Pages(R.drawable.picture_3,"\" Ouah !\" les deux enfants ont les yeux et la bouche grands ouverts. Devant eux se trouvent un magnifique miroir orné d'or, Gaspard soulève un drap à son tour, une somptueuse coiffeuse en acajou puis une canne ornée de pierres précieuses ou encore un tas de draps de soie. \"Le trésor du château...\" murmura Violette."));
        pagesArrayList1.add(new Pages(R.drawable.picture_4,"Leur découverte est interrompue par la reine Velda qui se tient sur le pas de la porte. \" Que faites-vous là les enfants ?\" demande-t-elle \" Regarde maman, c'est le trésor du château !\" annonce Violette les yeux toujours écarquillés par ce magnifique spectacle."));
        pagesArrayList1.add(new Pages(R.drawable.picture_1,"La reine Velda étouffe un petit rire. \" Princesse, c'est ce qu'on appelle un héritage. Ces meubles appartenaient à tes grands-parents qui eux les ont reçu de tes arrière-grands-parents et un jour ils seront à toi et à ton mari... Ce sont des meubles qu'on transmet de famille en famille et ils sont très importants, nous les sortons seulement pour les grandes occasions, car nous ne voulons pas qu'ils soient abîmés.\" explique la reine. "));


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

        ArrayList<Pages> pagesArrayList8 = new ArrayList<>();
        pagesArrayList8.add(new Pages(R.drawable.picture_1,"1ère page"));
        pagesArrayList8.add(new Pages(R.drawable.picture_2,"2ème page"));
        pagesArrayList8.add(new Pages(R.drawable.picture_3,"3ème page"));
        pagesArrayList8.add(new Pages(R.drawable.picture_4,"4ème page"));

        dataArrayList.add(new ListData("Violette et la pièce secrète","6 pages",R.drawable.a,false,pagesArrayList1));
        dataArrayList.add(new ListData("Cendrillon","2 pages",R.drawable.cendrillon,false,pagesArrayList2));
        dataArrayList.add(new ListData("Hansel et Gretel","3 pages",R.drawable.hanselgretel,false,pagesArrayList3));
        dataArrayList.add(new ListData("Les trois petits cochons","5 pages",R.drawable.lespetitscochons,false,pagesArrayList4));
        dataArrayList.add(new ListData("Peter Pan","4 pages",R.drawable.peterpan,false,pagesArrayList5));
        dataArrayList.add(new ListData("Petit poucet","2 pages",R.drawable.petitpoucet,false,pagesArrayList6));
        dataArrayList.add(new ListData("Pinocchio","4 pages",R.drawable.pinocchio,false,pagesArrayList7));
        dataArrayList.add(new ListData("Le Petit Prince","4 pages",R.drawable.petit_prince,false,pagesArrayList7));
        return dataArrayList;
    }
}
