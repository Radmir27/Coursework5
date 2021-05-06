package laba4;

import java.io.IOException;

public class OSAGOwithTrailer extends OSAGO {
    
    /*public void peredacha() 
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
    }*/

	public void calculation(int category_try, int city_try, int cbm_try, int age_try, int experience_try, int cm_try,
			int pricep_try, String promo_try) throws IOException {
		setConf(category_try, city_try, cbm_try, age_try, experience_try, cm_try, pricep_try);
		promo = 1;
		tb = ((btMax - btMin)*staf+btMin)*ct*cbm*csv*cm*cpr*promo;
	}

}
