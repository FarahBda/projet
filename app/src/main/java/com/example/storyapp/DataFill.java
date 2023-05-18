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
        pagesArrayList1.add(new Pages(R.drawable.e,"La princesse court à toute vitesse vers les écuries et raconte son histoire de pièce secrète à son ami Gaspard. \" Je viendrai avec toi princesse, mais il faut que je finisse de nettoyer les boxes des chevaux avant...\" lui répond le garçon. \"Je vais t'aider, on ira plus vite tous les deux\" s'écrie Violette."));
        pagesArrayList1.add(new Pages(R.drawable.f,"Violette attrape de la paille et commence à en éparpiller dans le boxe. \"Oups, pardon Gaspard je ne t'avais pas vu...\" s'excuse la princesse. Gaspard relève la tête, il a plein de paille sur le dos. \"Princesse c'est le boxe qu'il faut pailler, pas moi !\" plaisante-t-il. Les enfants rigolent et poursuivent leur travail."));
        pagesArrayList1.add(new Pages(R.drawable.g,"\"Bien, nous avons terminé, allons voir la pièce secrète princesse !\" déclare Gaspard. Violette attrape Gaspard et une fois dans le château, ils se dirigent vers la grande porte en bois que Violette à découverte il y a maintenant quelques heures."));
        pagesArrayList1.add(new Pages(R.drawable.h,"Gaspard pousse la porte, Violette se cache derrière lui. Le jeune garçon se dirige vers de grands rideaux et les tire, une lumière envahit la pièce et les ombres disparaissent aussitôt. Violette attrape un drap et le soulève pour dévoiler ce qui s'y trouve en dessous."));
        pagesArrayList1.add(new Pages(R.drawable.i,"\" Ouah !\" les deux enfants ont les yeux et la bouche grands ouverts. Devant eux se trouvent un magnifique miroir orné d'or, Gaspard soulève un drap à son tour, une somptueuse coiffeuse en acajou puis une canne ornée de pierres précieuses ou encore un tas de draps de soie. \"Le trésor du château...\" murmura Violette."));
        pagesArrayList1.add(new Pages(R.drawable.j,"Leur découverte est interrompue par la reine Velda qui se tient sur le pas de la porte. \" Que faites-vous là les enfants ?\" demande-t-elle \" Regarde maman, c'est le trésor du château !\" annonce Violette les yeux toujours écarquillés par ce magnifique spectacle."));
        pagesArrayList1.add(new Pages(R.drawable.k,"La reine Velda étouffe un petit rire. \" Princesse, c'est ce qu'on appelle un héritage. Ces meubles appartenaient à tes grands-parents qui eux les ont reçu de tes arrière-grands-parents et un jour ils seront à toi et à ton mari... Ce sont des meubles qu'on transmet de famille en famille et ils sont très importants, nous les sortons seulement pour les grandes occasions, car nous ne voulons pas qu'ils soient abîmés.\" explique la reine. "));


        ArrayList<Pages> pagesArrayList2 = new ArrayList<>();
        pagesArrayList2.add(new Pages(R.drawable.aa,"La princesse Violette est impatiente, car ce soir a lieu le bal masqué et elle a enfin l'âge de s'y rendre. Son père le roi Hubert et sa mère la reine Velda organisent chaque année un bal masqué en l'honneur de tous les amis du royaume."));
        pagesArrayList2.add(new Pages(R.drawable.bb,"Violette a toujours rêvé d'y aller et de pouvoir s'amuser avec ses amis. Elle enfile une magnifique robe rouge à volants, se pose sur le visage un masque de la même couleur, puis elle descend au salon où se passent les festivités. Elle y retrouve Ronan, Zena et Chloé, ses amis de toujours. \"Comme tu es belle Violette dans cette robe !\" complimente Ronan. \"Oh, oui et ton masque comme il brille ! \" lance Zena."));
        pagesArrayList2.add(new Pages(R.drawable.cc,"Les quatre amis dansent ensemble, ils s'amusent beaucoup. Ils essayent de deviner qui se cache derrière les masques tout en dégustant des hors-d'oeuvres."));
        pagesArrayList2.add(new Pages(R.drawable.dd,"Les quatre amis dansent ensemble, ils s'amusent beaucoup. Ils essayent de deviner qui se cache derrière les masques tout en dégustant des hors-d'oeuvres.\n" +
                "\n" +
                "Violette aperçoit Gaspard qui vient de passer la porte du salon, elle l'a invité à participer à cette soirée."));
        pagesArrayList2.add(new Pages(R.drawable.ee,"Le garçon porte un élégant costume qui a été confectionné par la couturière du château. C'est la maman de Violette qui le lui a offert pour son anniversaire."));
        pagesArrayList2.add(new Pages(R.drawable.ff,"Le garçon porte un élégant costume qui a été confectionné par la couturière du château. C'est la maman de Violette qui le lui a offert pour son anniversaire.\n" +
                "\n" +
                "\"Bonsoir Gaspard, tiens, je t'ai gardé un masque\" \"Merci Princesse, tu es vraiment très jolie, ta robe te va très bien ! \" dit-il en enfilant son masque. Violette rougit et attrape Gaspard par le bras pour aller danser."));
        pagesArrayList2.add(new Pages(R.drawable.gg,"\"Bonsoir Gaspard, tiens, je t'ai gardé un masque\" \"Merci Princesse, tu es vraiment très jolie, ta robe te va très bien ! \" dit-il en enfilant son masque. Violette rougit et attrape Gaspard par le bras pour aller danser.\n" +
                "\n" +
                "La reine Velda, arrive à la hauteur du groupe d'amis et déclare d'une voix douce qu'il est l'heure d'aller au lit. Violette salue sa petite troupe."));
        pagesArrayList2.add(new Pages(R.drawable.hh,"Elle monte les escaliers du château en direction de sa chambre avec pleins de merveilleux souvenirs en tête."));


        ArrayList<Pages> pagesArrayList3 = new ArrayList<>();
        pagesArrayList3.add(new Pages(R.drawable.aaa,"\"Princesse, il est l'heure pour vous d'aller au lit !\", s'écrie la gouvernante, tandis que Violette joue encore avec sa brosse à dents."));
        pagesArrayList3.add(new Pages(R.drawable.bbb,"La princesse se glisse au fond de son lit et avant même que la gouvernante ait éteint la lumière, Violette rêve déjà."));
        pagesArrayList3.add(new Pages(R.drawable.ccc,"Violette se promène dans un grand jardin, les fleurs laissent échapper d'agréables odeurs. Une petite rivière coule, les oiseaux gazouillent."));
        pagesArrayList3.add(new Pages(R.drawable.ddd,"Violette se promène dans un grand jardin, les fleurs laissent échapper d'agréables odeurs. Une petite rivière coule, les oiseaux gazouillent.\n" +
                "\n" +
                "Violette se penche et observe son reflet dans l'eau. Elle aperçoit au loin une petite fée qui arrive dans sa direction. Violette la trouve très belle car elle a les ailes qui scintillent de mille feux."));
        pagesArrayList3.add(new Pages(R.drawable.eee,"Violette se penche et observe son reflet dans l'eau. Elle aperçoit au loin une petite fée qui arrive dans sa direction. Violette la trouve très belle car elle a les ailes qui scintillent de mille feux.\n" +
                "\n" +
                "Violette se redresse et rejoint la fée qui s'est arrêtée au-dessus d'une fleur. \"Que fais-tu? \" demande Violette. \"J'embellis tes rêves, princesse ! \" chantonne la fée en arrosant les fleurs autour d'elle."));
        pagesArrayList3.add(new Pages(R.drawable.fff,"\"Comment?\", l'interroge Violette. \"En te faisant découvrir de magnifiques endroits ! Par exemple, je sais que tu aimes les papillons... Et bien regarde! \" La fée agite sa baguette et des milliers de papillons apparaissent.\n"));
        pagesArrayList3.add(new Pages(R.drawable.ggg,"Violette rit et se met à courir après les papillons. Elle monte même sur le dos d'un oiseau pour ne pas les perdre."));
        pagesArrayList3.add(new Pages(R.drawable.hhh,"Violette rit et se met à courir après les papillons. Elle monte même sur le dos d'un oiseau pour ne pas les perdre.\n" +
                "\n" +
                "L'oiseau l'emmène plus haut, encore plus haut. Violette voit son château qui parait minuscule. Elle rencontre d'autres oiseaux de toutes les couleurs avant de revenir dans le jardin."));
        pagesArrayList3.add(new Pages(R.drawable.iii,"\"Le jour ne va pas tarder à se lever princesse, il va être temps de se réveiller! \" Violette demande à la fée si elle va la revoir. Celle-ci lui répond : \"Princesse, toutes les nuits je vous fais vivre de nouvelles aventures, il vous suffit de vous mettre au lit pour que j'apparaisse comme par magie! \""));
        pagesArrayList3.add(new Pages(R.drawable.jjj,"\"Le jour ne va pas tarder à se lever princesse, il va être temps de se réveiller! \" Violette demande à la fée si elle va la revoir. Celle-ci lui répond : \"Princesse, toutes les nuits je vous fais vivre de nouvelles aventures, il vous suffit de vous mettre au lit pour que j'apparaisse comme par magie! \"\n" +
                "\n" +
                "Alors que le soleil se lève, Violette ouvre les yeux. Elle est impatiente de se coucher à nouveau ce soir."));

        ArrayList<Pages> pagesArrayList4 = new ArrayList<>();
        pagesArrayList4.add(new Pages(R.drawable.a_1png,"\uFEFFViolette est une princesse dotée d’une grande imagination. Elle s’imagine que des monstres sont cachés dans son placard et ne veut plus dormir dans sa chambre. Sa maman lui répète que les monstres n’existent pas mais Violette ne veut pas la croire."));
        pagesArrayList4.add(new Pages(R.drawable.b_1,"Un après-midi, Violette se promène avec Gaspard et elle lui raconte son histoire de monstres dans le placard. \"Toi, tu es courageux Gaspard, tu veux bien m'aider à chasser ces monstres ? \" \"Oui, bien sûr princesse ! \""));
        pagesArrayList4.add(new Pages(R.drawable.c_1,"Le soir venu, Gaspard déguisé en chevalier arrive au château armé d'une épée en bois. Violette et lui prennent la direction de la chambre, arrivés devant la porte, Violette se cache derrière Gaspard. \"Ne sois pas effrayée princesse, tout va bien se passer ! \""));
        pagesArrayList4.add(new Pages(R.drawable.d_1,"Gaspard entre dans la chambre. « Regardons dans le placard...\" dit Violette. Gaspard ouvre la porte de l'armoire et il se met à rire très fort.\n" +
                "\n" +
                "Violette prend alors ses rires pour des cris, et s'imagine qu'un monstre est sur le point d'attaquer son chevalier Elle pousse brutalement la porte de la chambre. « Tu dois lâcher Gaspard, vilain monstre ! \""));
        pagesArrayList4.add(new Pages(R.drawable.f_1,"Violette prend alors ses rires pour des cris, et s'imagine qu'un monstre est sur le point d'attaquer son chevalier Elle pousse brutalement la porte de la chambre. « Tu dois lâcher Gaspard, vilain monstre ! \"\n" +
                "\n" +
                "Mais Gaspard est en réalité en train de rire. « Que fais-tu ? \" demande Violette \"Regarde ton monstre princesse...\" Violette ouvre grands les yeux, c'est Ponpon son lapin."));
        pagesArrayList4.add(new Pages(R.drawable.g_1,"Mais Gaspard est en réalité en train de rire. « Que fais-tu ? \" demande Violette \"Regarde ton monstre princesse...\" Violette ouvre grands les yeux, c'est Ponpon son lapin."));
        pagesArrayList4.add(new Pages(R.drawable.h_1,"Violette est gênée, elle rougit. « Je suis désolée Gaspard que tu te sois déplacé pour rien \" « Je suis heureux de t’avoir rendu Ponpon ! \" dit-il en riant."));
        pagesArrayList4.add(new Pages(R.drawable.j_1,"Les deux enfants rigolent, et ramènent Ponpon dans sa cage. \"Tu seras mieux là, que dans le placard !\" lui disent-ils. Violette embrasse Gaspard sur la joue pour le remercier."));

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

        dataArrayList.add(new ListData("Violette et la pièce secrète","11 pages",R.drawable.b,false,pagesArrayList1));
        dataArrayList.add(new ListData("Violette au bal","8 pages",R.drawable.aa,false,pagesArrayList2));
        dataArrayList.add(new ListData("Violette et la fée","10 pages",R.drawable.hhh,false,pagesArrayList3));
        dataArrayList.add(new ListData("Violette et le coucher","8 pages",R.drawable.d_1,false,pagesArrayList4));
        dataArrayList.add(new ListData("Peter Pan","4 pages",R.drawable.peterpan,false,pagesArrayList5));
        dataArrayList.add(new ListData("Petit poucet","2 pages",R.drawable.petitpoucet,false,pagesArrayList6));
        dataArrayList.add(new ListData("Pinocchio","4 pages",R.drawable.pinocchio,false,pagesArrayList7));
        dataArrayList.add(new ListData("Le Petit Prince","4 pages",R.drawable.petit_prince,false,pagesArrayList7));
        return dataArrayList;
    }
}
