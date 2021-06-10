package application.modele;

import java.util.ArrayList;
import java.util.HashMap;



public class Environnement {
	private int width,height;	
	private ArrayList<LesActeurs> acteurs;
	private Tiled tl;
	private HashMap<Integer,Boolean> obstacle;
	
	public Environnement(int width, int height, Tiled tl) {
		this.width = width;
		this.height = height;
		this.tl = tl;
		this.acteurs= new ArrayList<>();
		obstacle = new HashMap<Integer, Boolean>(); //True -> Obstacle, false -> Traversable
		obstacle.put(1, false); //herbe1
		obstacle.put(2, true); //CATHEDRALE17
		obstacle.put(3, true); //CATHEDRALE18
		obstacle.put(4, true); //CATHEDRALE19
		obstacle.put(5, true); //CATHEDRALE20
		obstacle.put(6, true); //CHATEAU29
		obstacle.put(7, true); //CHATEAU30
		obstacle.put(8, true); //CHATEAU31
		obstacle.put(9, true); //CHATEAU32
		obstacle.put(10, true); //EAUSABLE
		
		obstacle.put(11, true); //GRILLE
		obstacle.put(12, false); //herbe2
		obstacle.put(13, false); //1cote1.4
		obstacle.put(14, false); //1chemin
		obstacle.put(15, false); //1cote1.2
		obstacle.put(16, true); //1COTE2.4.4
		obstacle.put(17, true); //1COTE3.4
		obstacle.put(18, true); //EAUHERBECOTE4
		obstacle.put(19, true); //EAUPONT
		obstacle.put(20, true); //ROCHEEAU1
		
		obstacle.put(21, true); //EAUHERBEBORD1
		obstacle.put(22, true); //EAUHERBECOIN3
		obstacle.put(23, false); //2cote4
		//obstacle.put(24, false);
		//obstacle.put(25, false); 
		obstacle.put(26, true); //CATHEDRALE13
		obstacle.put(27, true); //CATHEDRALE14
		obstacle.put(28, true); //CATHEDRALE15
		obstacle.put(29, true); //CATHEDRALE16
		obstacle.put(30, false); //BARRIEREHERBE1
		
		obstacle.put(31, false); //BARRIERETERRE
		obstacle.put(32, false); //BARRIEREEAUHERBE
		//obstacle.put(33, false);
		obstacle.put(34, false); //2coin1
		obstacle.put(35, false); //pontsimple
		obstacle.put(36, true); //CATHEDRALE8
		obstacle.put(37, true); //CATHEDRALE9
		obstacle.put(38, true); //CATHEDRALE10
		obstacle.put(39, true); //CATHEDRALE11
		obstacle.put(40, true); //CATHEDRALE12
		  
		//obstacle.put(41, false);
		obstacle.put(42, false); //1coin1.1
		obstacle.put(43, false); //1cote1.1
		obstacle.put(44, false); //1bord1.3
		obstacle.put(45, false); //1bord1.4
		obstacle.put(46, false); //1coin1.2
		obstacle.put(47, false); //pontherbe5
		obstacle.put(48, false); //pontherbe1
		obstacle.put(49, false); //pontenveloppe1
		obstacle.put(50, false); //eauponthaut1
		
		obstacle.put(51, false); //pontherbe7
		obstacle.put(52, false); //CATHEDRALE3
		obstacle.put(53, false); //CATHEDRALE4
		obstacle.put(54, false); //CATHEDRALE5
		obstacle.put(55, false); //CATHEDRALE6
		obstacle.put(56, false); //CATHEDRALE7
		obstacle.put(57, true); //EAUHERBECOTE1
		obstacle.put(58, false); //1bord1.1
		obstacle.put(59, false); //1cote1.3
		obstacle.put(60, false); //1coin1.3
		
		obstacle.put(61, true); //pontherbe6
		obstacle.put(62, false); //2cote4
		obstacle.put(63, false); //2cote4
		obstacle.put(64, true); //pontenveloppe2
		obstacle.put(65, true); //pontherbe8
		obstacle.put(66, false); //CATHEDRALE1
		obstacle.put(67, false); //CATHEDRALE2
		//obstacle.put(68,);
		obstacle.put(69, true); //BARRIEREHERBE2
		//obstacle.put(70,);
		
		obstacle.put(71, true); //BARRIEREHERBE3
		obstacle.put(72, false); //2coin4
		//obstacle.put(73,);
		//obstacle.put(74,);
		//obstacle.put(75,);
		obstacle.put(76, true); //TOUR1
		obstacle.put(77, true); //TOUR2
		obstacle.put(78, true); //TOUR3
		obstacle.put(79, true); //TOUR4
		obstacle.put(80, false); //MUR1
		
		obstacle.put(81, false); //porte
		obstacle.put(82, false); //MUR2
		obstacle.put(83, true); //TOUR5
		obstacle.put(84, true); //TOUR6
		obstacle.put(85, true); //1COTE2.4
		obstacle.put(86, true); //EAUHERBECOTE3
		obstacle.put(87, false); //herbesable1
		obstacle.put(88, false); //herbesable3
		obstacle.put(89, false); //herbesable2
		obstacle.put(90, false); //TOUR7
		
		obstacle.put(91, false); //TOUR8
		obstacle.put(92, true); //EAUHERBECOTE2
		obstacle.put(93, false); //2coin1
		obstacle.put(94, false); //2cote1
		obstacle.put(95, false); //2coin2
		obstacle.put(96, false); //BARRIEREEAU
		obstacle.put(97, true); //EAUHERBECOIN4
		obstacle.put(98, false); //1cote1.4
		obstacle.put(99, false); //1chemin
		obstacle.put(100, false); //1cote1.2
		
		//obstacle.put(101,);
		obstacle.put(102, false); //1coin1.4
		obstacle.put(103, false); //1bord1.2
		obstacle.put(104, false); //2bord3
		obstacle.put(105, false); //2chemin
		obstacle.put(106, false); //2cote2
		//obstacle.put(107,);
		obstacle.put(108, false); //2cote1
		//obstacle.put(109,);
		obstacle.put(110, false); //2cote4
		
		//obstacle.put(111,);
		//obstacle.put(112,);
		obstacle.put(113, false); //2bord1
		obstacle.put(114, false); //2cote3
		obstacle.put(115, false); //2coin3
		//obstacle.put(116,); 
		obstacle.put(117, false); //2cote3
		//obstacle.put(118,);
		obstacle.put(119, true); //EAUHERBECOIN1
		obstacle.put(120, true); //EAUHERBECOTE1
		
		obstacle.put(121, true); //EAUHERBECOIN2
		//obstacle.put(122,);
		//obstacle.put(123,);
		//obstacle.put(124,);
		//obstacle.put(125,);
		obstacle.put(126, true); //EAUHERBEBORD4
		obstacle.put(127, true); //EAUHERBEBORD3
		obstacle.put(128, false); //2coin3
		obstacle.put(129, true); //1COTE2.1
		obstacle.put(130, true); //1COIN2.3
		 
		obstacle.put(131, true); //EAUHERBEBORD2
		obstacle.put(132, true); //1COTE3.1
		obstacle.put(133, true); //ROCHEEAU2
		obstacle.put(134, false); //2bord4
		obstacle.put(135, true); //COQUILLAGE
		obstacle.put(136, false); //eauponthaut1
		//obstacle.put(137, false);
		obstacle.put(138, true); //ETOILE
		obstacle.put(139, false); //2coin4
		obstacle.put(140, false); //2bord2
		
		obstacle.put(141, true); //eaupontbas1
		obstacle.put(142, true); //SABLECOIN1
		obstacle.put(143, true); //SABLECOTE1
		obstacle.put(144, true); //SABLECOIN2
		obstacle.put(145, true); //BARRIERE1
		obstacle.put(146, true); //SABLECOTE4
		obstacle.put(147, false); //sable
		obstacle.put(148, true); //SABLEBORD4
		obstacle.put(149, true); //ROCHEEAU3
		obstacle.put(150, true); //SABLEBORD3
		 
		obstacle.put(151, true); //ROCHERCOIN1
		obstacle.put(152, true); //ROCHERCOTE1
		obstacle.put(153, true); //ROCHERCOIN2
		obstacle.put(154, true); //ROCHERCOTE4
		obstacle.put(155, true); //ROCHERTOIT
		obstacle.put(156, true); //ROCHERCOTE2
		obstacle.put(157, true); //ROCHERCOIN2.1
		obstacle.put(158, true); //ROCHERCOTE2.1
		obstacle.put(159, true); //ROCHERCOIN2.2
		obstacle.put(160, true); //ROCHERCOIN4
		 
		obstacle.put(161, true); //ROCHERCOTE3
		obstacle.put(162, true); //ROCHERCOIN3
		obstacle.put(163, true); //ROCHERCOTE2.4
		obstacle.put(164, true); //ROCHERCOTE2.2
		obstacle.put(165, false); //ROCHESABLE
		obstacle.put(166, true); //SABLECOTE2
		obstacle.put(167, false); //2coin2
		obstacle.put(168, false); //escaliergauche
		obstacle.put(169, true); //ARBREHAUT
		obstacle.put(170, true); //ARBREBAS
		
		obstacle.put(171, true); //EAUCOIN1
		obstacle.put(172, true); //EAUCOTE1
		obstacle.put(173, true); //EAUCOIN2
		obstacle.put(174, true); //ROCHERCOIN2.4
		obstacle.put(175, true); //ROCHERCOTE2.3
		obstacle.put(176, true); //ROCHERCOIN2.3
		obstacle.put(177, true); //EAUCOTE4
		obstacle.put(178, true); //EAUSABLE
		obstacle.put(179, true); //EAUBORD4
		obstacle.put(180, true); //EAUBORD1
		
		obstacle.put(181, true); //EAUCOTE3
		obstacle.put(182, true); //EAUCOIN3
		obstacle.put(183, true); //SABLEBORD1
		obstacle.put(184, true); //SABLECOIN3
		obstacle.put(185, false); //foretcoin1
		obstacle.put(186, false); //foretcoin2
		obstacle.put(187, true); //EAUCOTE2
		obstacle.put(188, true); //SABLECOTE3
		obstacle.put(189, true); //SABLEBORD2
		obstacle.put(190, false); //foretcote2.4
		
		obstacle.put(191, false); //foretcote2.2
		obstacle.put(192, true); //SABLECOIN4
		obstacle.put(193, false); //foretcote2.1
		obstacle.put(194, false); //foretcote1.1
		obstacle.put(195, false); //foretbord3
		obstacle.put(196, false); //foretbord4
		obstacle.put(197, false); //foretchemin
		obstacle.put(198, false); //foretbord1
		obstacle.put(199, false); //foretcote1.3
		obstacle.put(200, false); //foretbord2

		obstacle.put(201, false); //foretcote2.3
		obstacle.put(202, false); //foretcoin3
		obstacle.put(203, false); //herbe3
		obstacle.put(204, false); //foretcote1.2
		obstacle.put(205, false); //foretcote1.4
		obstacle.put(206, false); //foretcoin1
		obstacle.put(207, false); //foretcoin2
		obstacle.put(208, true); //EAUCOIN4
		obstacle.put(209, false); //foretbord3
		obstacle.put(210, false); //foretbord4
		 
		obstacle.put(211, false); //foretbord1
		obstacle.put(212, false); //foretbord2
		obstacle.put(213, true); //pontenveloppe3
		obstacle.put(214, false); //foretcoin3
		obstacle.put(215, false); //foretcoin4
		obstacle.put(216, true); //pontherbe2
		obstacle.put(217, true); //1COIN3.3
		obstacle.put(218, true); //EAUBORD2
		obstacle.put(219, true); //CHATEAU28
		obstacle.put(220, true); //CHATEAU27
		
		obstacle.put(221, true); //CHATEAU26
		obstacle.put(222, true); //CHATEAU25
		obstacle.put(223, true); //CHATEAU24
		obstacle.put(224, true); //CHATEAU23
		obstacle.put(225, true); //CHATEAU22
		obstacle.put(226, true); //CHATEAU21
		obstacle.put(227, true); //CHATEAU20
		obstacle.put(228, true); //CHATEAU19
		obstacle.put(229, true); //CHATEAU18
		obstacle.put(230, true); //CHATEAU17
 		
		obstacle.put(231, true); //CHATEAU16
		obstacle.put(232, true); //CHATEAU15
		obstacle.put(233, true); //CHATEAU14
		obstacle.put(234, true); //CHATEAU13
		obstacle.put(235, false); //CHATEAU12
		obstacle.put(236, false); //CHATEAU11
		obstacle.put(237, false); //CHATEAU10
		obstacle.put(238, false); //CHATEAU9
		obstacle.put(239, false); //CHATEAU8
		obstacle.put(240, false); //CHATEAU7
		 
		obstacle.put(241, false); //CHATEAU6
		obstacle.put(242, false); //CHATEAU5
		obstacle.put(243, false); //CHATEAU4
		obstacle.put(244, false); //CHATEAU3
		obstacle.put(245, false); //CHATEAU2
		obstacle.put(246, false); //CHATEAU1
		
		//FIN DU CALQUE 1
		//obstacle.put(247,);
		//obstacle.put(248,);
		//obstacle.put(249,);
		
		obstacle.put(250, true);
		obstacle.put(251, true);
		//obstacle.put(252,);
		obstacle.put(253, true);
		obstacle.put(254, true);
		obstacle.put(255, true);
		obstacle.put(256, true);
		//obstacle.put(257,);
		obstacle.put(258, true);
		obstacle.put(259, true);
		obstacle.put(260, true);
		
		obstacle.put(261, true);
		obstacle.put(262, true);
		obstacle.put(263, true);
		obstacle.put(264, true);
		obstacle.put(265, true);
		obstacle.put(266, true);
		obstacle.put(267, true);
		obstacle.put(268, true);
		obstacle.put(269, true);
		obstacle.put(270, true);
		
		obstacle.put(271, true);
		obstacle.put(272, true);
		obstacle.put(273, true);
		obstacle.put(274, true);
		obstacle.put(275, true);
		obstacle.put(276, true);
		obstacle.put(277, true);
		obstacle.put(278, true);
		obstacle.put(279, true);
		obstacle.put(280, true);
		
		obstacle.put(281, true);
		obstacle.put(282, true);
		obstacle.put(283, true);
		obstacle.put(284, true);
		obstacle.put(285, true);
		obstacle.put(286, true);
		obstacle.put(287, true);
		obstacle.put(288, true);
		obstacle.put(289, true);
		obstacle.put(290, true);

		obstacle.put(291, true);
		obstacle.put(292, true);
		obstacle.put(293, true);
		obstacle.put(294, true);
		obstacle.put(295, true);
		obstacle.put(296, true);
		obstacle.put(297, true);
		//obstacle.put(298,);
		//obstacle.put(299,);
		obstacle.put(300, true);
	
		
	}
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public ArrayList<LesActeurs> getActeurs() {
		return this.acteurs;
	}
	
	public void ajouterActeur(LesActeurs ac) {
		this.acteurs.add(ac);
	}
	
	public LesActeurs proximité(LesActeurs acteurQuiAttaque) {

		for(LesActeurs a : acteurs) {
			if ( (Math.pow( (double)(a.getX() - acteurQuiAttaque.getX()), 2.0) + Math.pow( (double)(a.getY() - acteurQuiAttaque.getY()), 2.0)) < 5*5 && a.getId() != acteurQuiAttaque.getId() ) 
				return a;
		}
		
		return null;
		
	}
	
	public HashMap<Integer, Boolean> getObstacle() {
		return this.obstacle;
	}
	
	public boolean verifPlacement(int x, int y){
		return (x<0 || y<0 || x>=this.width || y>=this.height);
	}
	
	public boolean estObstacle(int x, int y) {
		return (this.obstacle.get(this.tl.getValTab(y,x)));
	}
	
}