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
        pagesArrayList2.add(new Pages(R.drawable.dd,
                "Violette aperçoit Gaspard qui vient de passer la porte du salon, elle l'a invité à participer à cette soirée."));
        pagesArrayList2.add(new Pages(R.drawable.ee,"Le garçon porte un élégant costume qui a été confectionné par la couturière du château. C'est la maman de Violette qui le lui a offert pour son anniversaire."));
        pagesArrayList2.add(new Pages(R.drawable.ff,
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
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_1,"Il était une fois trois petits cochons qui vivaient ensemble dans une petite maison. Un jour, leur mère les appela et leur dit qu’il était temps qu’ils se construisent leur propre logis. Elle ajouta, cependant: \" Prenez garde qu'elle soit bien solide pour que le grand méchant loup ne puisse pas entrer et vous manger.\"\n" + "\n"));
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_2,"La maman embrassa ses trois petits et leur dit au-revoir les larmes aux yeux. Ils s'en allèrent de chez eux pour construire leur maison.\n" + "\n"));
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_3,"Le premier petit cochon rencontra un homme portant une botte de paille. \" Puis-je avoir un peu de votre paille pour construire ma maison ?\" demanda le petit cochon. L'homme accepta et lui donna de la paille.\n" +"\n"));
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_4,"Le second petit cochon rencontra un homme qui portait un chargement de bois. \"Puis-je avoir quelques bouts de bois pour construire ma maison?\" demanda le petit cochon. L'homme accepta et lui donna le bois.\n" +
                "\n"));
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_5,"Le troisième petit cochon, lui, rencontra un homme chargé de briques. \"S'il vous plaît, Monsieur, puis-je avoir quelques briques pour construire ma maison?\" L'homme lui donna assez de briques pour bâtir une grande et solide maison avec une cheminée.\n" +
                "\n"));
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_6,"Quelques jours plus tard, les petits cochons avaient terminé la construction de leur maison. Le loup les aperçut: \" Comme ils doivent être tendres! Lequel vais-je manger en premier?\" se demanda-t-il. \" Je vais commencer par le petit cochon dans la maison de paille!\"\n" +
                "\n"));
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_7,"Il frappa à la porte. Petit cochon, gentil petit cochon, puis-je entrer? \" Non, Non! Par le poil de mon menton !\" cria le premier petit cochon. \" Alors, je vais souffler, souffler très fort, ta maison s’envolera et je te mangerai! » Le loup gonfla ses joues, souffla, souffla de toutes ses forces, et la maison de paille s'envola. \" Au secours!\" cria le petit cochon en courant vers la maison de bois de son frère.\n" +
                "\n"));
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_8,"A peine celui-ci eut-il refermé la porte que le loup frappa. \" Petits cochons, gentils petits cochons, puis-je entrer ?\" \" Non, non! Par le poil de nos mentons !\" répondirent les deux frères. \" Alors,je vais souffler, souffler très fort, votre maison s’écroulera et je vous mangerai tous les deux! » Le loup gonfla ses joues, souffla, souffla de toutes ses forces, et la maison de bois s’écroula. \" Au secours!\" crièrent les deux petits cochons en courant vers la maison de briques de leur frère.\n" +
                "\n"));
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_9,"\" Ici, vous ne risquez rien!\" leur dit-il en refermant la porte juste à temps. Bientôt, la voix du loup résonna. \" Petits cochons, gentils petits cochons, puis-je entrer ?\" \" Non! non! Par le poil de nos mentons!\" répondirent les trois frères. \" Alors, vous allez voir, hurla le loup je vais souffler, souffler très fort votre maison s’écroulera et je vous mangerai tous les trois ! » Il prit alors sa plus profonde inspiration et souffla de toutes ses forces.\n" +
                "\n"));
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_10,"Mais cette fois-ci, il ne réussit pas à mettre la maison par-terre. Il se cogna même la tête contre les murs et se blessa. Le loup vit la cheminée. Il alla chercher une grande échelle pour grimper sur le toit et passer par le conduit.\n" +
                "\n"));
        pagesArrayList5.add(new Pages(R.drawable.petits_cochons_11,"Pendant que le loup marchait sur le toit, le troisième petit cochon, qui était très rusé, alluma un grand feu dans la cheminée et y posa un chaudron rempli d'eau. Quand le loup descendit il tomba dans le chaudron plein d’eau bouillante. Il poussa un hurlement si strident qu'on l'entendit à des kilomètres à la ronde. Le loup pris ses jambes à son cou et s'enfuit de la maison en hurlant. Quant aux trois petits cochons? Ils n'entendirent plus jamais parler de lui.\n" +
                "\n"));

        ArrayList<Pages> pagesArrayList6 = new ArrayList<>();
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_1,"Le petit Poucet était le plus jeune garçon d'une famille très pauvre de sept enfants. \n" +"Il était aussi le plus courageux et le plus dégourdi.\n"+"Un soir, alors que tous les enfants étaient couchés, le petit garçon entendit ses parents décider de les abandonner dans la forêt."));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_2,"\" Je n'ai plus de travail et nous n'avons plus rien à manger... \n" +"Dans la forêt, ils rencontreront sûrement quelqu'un qui aura pitié d'eux et qui les recueillera.\" dit le père."));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_3,"Le lendemain, ils partirent tous dans la forêt.\n" + "Le petit Poucet avait conservé le quignon de pain du matin, et il l'émietta discrètement tout au long du trajet pour pouvoir retrouver son chemin le moment venu."));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_4,"Mais malheureusement, le petit Poucet se rendit alors compte que les\n" + "oiseaux avaient mangé toutes les miettes et qu'il lui était désormais impossible de retrouver sa maison."));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_5,"Les enfants, effrayés, marchèrent dans la forêt à la recherche d'un refuge. \n" +"Et c'est ainsi qu'ils arrivèrent devant une grande maison au milieu d'une clairière."));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_6,"Une femme très aimable leur ouvrit la porte, et leur dit :\n" +"\" Que faites-vous là ? ne savez-vous pas qu'un ogre qui mange les enfants vit dans cette maison ?\n" +"- Donnez-nous quelque chose à manger, dit le petit Poucet. \n" +"Nous avons été abandonnés dans la forêt et nous n'avons rien à manger.\n" +"- D'accord, dit la femme, espérons seulement que l'ogre ne rentre pas trop vite !\""));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_7,"Il entrèrent dans la maison et la femme leur offrit un repas de rêve.\n" +"Jamais les pauvres enfants n'avaient vu autant de nourriture et n'avaient dégusté de plats aussi délicieux.\n" +"Tout à coup, un énorme bruit de pas résonna dans toute la maison. \n" +"L'ogre était de retour !"));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_8,"\" Ca sent les enfants ! Ca sent la chair fraîche !\" cria l'ogre d'une voix terrible.\n" +"\" Maudits garnements ! Vous ne m'échapperez pas !\""));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_9,"Le petit Poucet et ses frères étaient plus vifs et plus rapides que l'ogre. Mais l'ogre, lui, possédait un avantage considérable: il portait des bottes de sept lieues, des bottes magiques qui lui permettaient de courir très vite et de faire d’énormes bonds."));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_10,"Comme il était persuadé de pouvoir rattraper les enfants, il décida de faire une petite sieste. \n" + "Non loin de là, cachés derrière un rocher, le petit Poucet dit à ses frères :\n" +"\" Quand il dormira profondément, nous lui prendrons ses bottes.\""));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_11,"Au moment opportun, aucun des frères ne voulut quitter sa cachette. Seul le petit Poucet fut assez courageux pour s'y risquer.\n" + "Une à une, il retira les bottes des pieds de l'ogre. \n" +"Cet horrible personnage ne pouvait, désormais, plus les poursuivre !"));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_12,"Les bottes magiques s'ajustèrent, aussitôt, aux pieds du petit Poucet.\n" +"Avec ses frères, il pu parcourir la forêt et retrouver rapidement la\n" +"maison de leurs parents.\n" +"Quel bonheur ! Toute la famille était à nouveau réunie."));
        pagesArrayList6.add(new Pages(R.drawable.petit_poucet_13,"\" Ne soyez plus inquiets, nous ne mourrons plus jamais de faim, dit le petit Poucet. Ces bottes feront notre fortune.\"\n"+"Et c'est effectivement ce qui se passa. Le petit Poucet fut nommé messager du roi. \n" +"Il gagna tellement d'argent à transporter des messages urgents d'un pays à l'autre que sa famille ne manqua plus jamais de rien et ils purent vivre heureux tous ensemble à jamais."));




        ArrayList<Pages> pagesArrayList7 = new ArrayList<>();
        pagesArrayList7.add(new Pages(R.drawable.lapin_1,"Mimironron est le petit lapin blanc de Pâques. Sa mission est de distribuer à temps les oeufs en chocolats pour tous les enfants.\n" +
                "\n"));
        pagesArrayList7.add(new Pages(R.drawable.lapin_2,"Il est aidé par son équipe de super lapins qui eux aussi distribuent ces délices tant convoités.\n" +
                "\n"));
        pagesArrayList7.add(new Pages(R.drawable.lapin_3,"Il faut d’abord que l’équipe des lapin chefs pâtissiers confectionnent les oeufs dans l’atelier de cuisine. Les casseroles chauffent le chocolat, puis les lapins chefs pâtissiers le mettent dans des moules et attendent que tout soit prêt !\n" +
                "\n"));
        pagesArrayList7.add(new Pages(R.drawable.lapin_4,"Une fois que les gourmandises sont confectionnées, les lapins artistes les dessinent avec de jolies couleurs. Qu’ils sont jolis ! \n" +
                "\n"));
        pagesArrayList7.add(new Pages(R.drawable.lapin_5,"Tout est prêt ! Mimironron part alors avec son équipe de super lapins pour cacher les oeufs dans les jardins.\n" +
                "\n"));
        pagesArrayList7.add(new Pages(R.drawable.lapin_6,"La chasse aux oeufs commence et les enfants sont ravis ! Et les adultes aussi ! \n" +
                "\n"));



        ArrayList<Pages> pagesArrayList8 = new ArrayList<>();
        pagesArrayList8.add(new Pages(R.drawable.boucles_1,"Il était une fois une petite fille qu’on appelait Boucles d’Or, parce que sa chevelure bouclée avait la couleur de l’or. Dans la forêt, non loin de sa maison, vivait une famille d’ours : il y avait Papa Ours, Maman Ours et Bébé Ours.\n" +
                "\n"));
        pagesArrayList8.add(new Pages(R.drawable.boucles_2,"Un jour, en attendant que leur repas refroidisse, la famille Ours décida d’aller se promener. Boucles d’Or, qui était elle aussi en train de marcher, découvrit la maison de la famille Ours. Curieuse, elle y entra.\n" +
                "\n"));
        pagesArrayList8.add(new Pages(R.drawable.boucles_3,"Elle vit une table avec un repas dessus. La petite fille avait faim, alors elle saisit un premier bol de gruau : « Aïe ! C’est bien trop chaud ! » Elle le reposa, puis en saisit un second : « Gla gla, c’est froid ! » fit-elle, en reposant le bol. Elle saisit le dernier bol : « Miam ! Il est parfait » et le bu d’une traite.\n" +
                "\n"));
        pagesArrayList8.add(new Pages(R.drawable.boucles_4,"Après son repas, Boucles d’Or ressentit le besoin de dormir. Elle essaya donc les trois fauteuils qu’il y avait, mais elle cassa celui de l’ourson sans le faire exprès.\n" +
                "\n"));
        pagesArrayList8.add(new Pages(R.drawable.boucles_5,"Elle se résolut à trouver un lit. Après avoir essayé les trois lits, son choix se porta sur celui de l’ourson, car il était parfaitement à sa taille et elle s’assoupit.\n" +
                "\n"));
        pagesArrayList8.add(new Pages(R.drawable.boucles_6,"Boucles d’Or dormait encore dans la chambre, quand les trois ours rentrèrent de leur promenade. Ils trouvèrent leur maison sans dessus-dessous et se mirent en colère, bien décidés à retrouver le coupable.\n" +
                "\n"));
        pagesArrayList8.add(new Pages(R.drawable.boucles_7,"Arrivés dans la chambre, ils virent Boucles d’Or dormir paisiblement dans le lit de Bébé Ours. Attendris, ils se regardèrent d’un air complice. Mais ils décidèrent, quand même, de lui donner une leçon car on n’entre pas ainsi chez les gens. En chœur, ils grognèrent « Bouh! ». En les apercevant, Boucle d’Or fut si effrayée qu’elle s’enfuit en hurlant : « Aaah au secours !! Ils veulent me manger toute crue ! » bien décidée à ne plus jamais entrer chez quelqu’un sans qu’elle y soit invitée.\n" +
                "\n"));

        dataArrayList.add(new ListData("Violette et la pièce secrète","11 pages",R.drawable.b,false,pagesArrayList1));
        dataArrayList.add(new ListData("Violette au bal","8 pages",R.drawable.aa,false,pagesArrayList2));
        dataArrayList.add(new ListData("Violette et la fée","10 pages",R.drawable.hhh,false,pagesArrayList3));
        dataArrayList.add(new ListData("Violette et le coucher","8 pages",R.drawable.d_1,false,pagesArrayList4));
        dataArrayList.add(new ListData("Les trois petits cochons",pagesArrayList5.size()+" pages",R.drawable.petits_cochons_2,false,pagesArrayList5));
        dataArrayList.add(new ListData("Le Petit poucet",pagesArrayList6.size()+" pages",R.drawable.petit_poucet_10,false,pagesArrayList6));
        dataArrayList.add(new ListData("Le petit lapin de pâques",pagesArrayList7.size()+" pages",R.drawable.lapin_1,false,pagesArrayList7));
        dataArrayList.add(new ListData("Boucles d'or et les trois ours",pagesArrayList8.size()+" pages",R.drawable.boucles_1,false,pagesArrayList8));
        return dataArrayList;
    }
}
