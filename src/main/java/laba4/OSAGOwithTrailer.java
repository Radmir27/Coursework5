package laba4;

public class OSAGOwithTrailer extends OSAGO implements Trailer {
	public float ctr = 1;
	
    public void getCtr() {
    	switch (category) {             
    	case 0 : //  "А, М Мотоциклы, мопеды и легкие квадрициклы"
    	 ctr = (float) 1.16;
    	 break;
    	case 1 :  //  "B, BE физических лиц, индивидуальных предпринимателей"
       	 ctr = (float) 1;
       	 break;
    	case 2 :  //     "В, ВЕ юридических лиц"
       	 ctr = (float) 1.16;
       	 break;
    	case 3 :  //     "B, BE используемые в качестве такси"
       	 ctr = (float) 1.16;
       	 break;
    	case 4 :  //     "C, CE с разрешенной максимальной массой 16 тонн и менее"
       	 ctr = (float) 1.4;
       	 break;
    	case 5 : //     "C, CE с разрешенной максимальной массой более 16 тонн"
       	 ctr = (float) 1.25;
       	 break;
    	case 6 :  //     "D, DE с числом пассажирских мест до 16 включительно"
       	 ctr = (float) 1;
       	 break;
    	case 7 :  //     "D, DE с числом пассажирских мест более 16
       	 ctr = (float) 1;
       	 break;
    	case 8 :  //     "D, DE используемые на регулярных перевозках"
       	 ctr = (float) 1;
       	 break;  
    	case 9 :  //      "Тракторы, самоходные дорожно-строительные и иные машины"
       	 ctr = (float) 1.24;
       	 break;
    	}
    }
    
    public void peredacha() 
    {
    	getCtr();
    	getBTmin();
    	getCT();
    	getCBM();
    	getCSV();
    	getCM();
    	Calculation calculation = new Calculation();
    	calculation.setBTmin(btMin);
    	calculation.setBTmax(btMax);
    	calculation.setKT(ct);
    	calculation.setKBM(cbm);
    	calculation.setKSV(csv);
    	calculation.setKM(cm);
    	calculation.setKPR(ctr);
    	calculation.calculation();
    	totalMin = calculation.getTotalMin();
    	totalMax = calculation.getTotalMax();
    }

}
