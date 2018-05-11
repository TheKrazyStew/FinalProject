package view;

import java.awt.Color;

public class MechGarage {
	
	public static Mech
	pMech1 = new Mech("SC-WD",35,12,4,6,10,false,0,0,Color.BLUE),
	pMech2 = new Mech("SC-LV",30,9,2,5,12,false,0,1,Color.BLUE),
	pMech3 = new Mech("SC-AT",15,10,3,10,10,false,1,1,Color.BLUE),
	pMech4 = new Mech("SC-UF",20,8,3,12,20,true,1,0,Color.BLUE),

	eMech1 = new Mech("SC-LT",35,12,4,6,10,false,18,18,Color.RED),
	eMech2 = new Mech("SC-HV",30,9,2,5,12,false,19,18,Color.RED),
	eMech3 = new Mech("SC-AT",15,10,3,10,10,false,19,19,Color.RED),
	eMech4 = new Mech("SC-FO",20,8,3,12,20,true,18,19,Color.RED);

	public static Mech[] Battlers =
		{pMech1, pMech2, pMech3, pMech4, eMech1, eMech2, eMech3, eMech4};
	
}

