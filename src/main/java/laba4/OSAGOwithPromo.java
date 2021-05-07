package laba4;

import java.io.IOException;

public class OSAGOwithPromo extends OSAGO {
	
	public float calculation(int category_try, int city_try, int cbm_try, int age_try, int experience_try, int cm_try,
			String promo_try) throws IOException {
		setConf(category_try, city_try, cbm_try, age_try, experience_try, cm_try);
		if (promo_try != "USATU" || promo_try != "Pricep11" || promo_try != "project5") {	//проверка промокода
	    	  promo = 1;
	    	  }
		cpr = 1;
		float tb = ((btMax - btMin)*staf+btMin)*ct*cbm*csv*cm*cpr*promo;
		return tb;
	}
}
