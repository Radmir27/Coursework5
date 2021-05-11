package laba4;

import java.io.IOException;

public class OSAGOwithPromo extends OSAGO {
	
	public float calculation(int category_try, int city_try, int cbm_try, int age_try, int experience_try, int cm_try,
			String promo_try) throws IOException {
		setConf(category_try, city_try, cbm_try, age_try, experience_try, cm_try);
		if (!promo_try.equals("USATU") && !promo_try.equals("Pricep11") && !promo_try.equals("project5")) {	//проверка промокода
	    	  promo = 1;
	    	  }
		cpr = 1;
		int tbInt = (int) (((btMax - btMin)*100*staf+btMin)*ct*cbm*csv*cm*cpr*promo);
		float tb = tbInt/100;
		return tb;
	}
}
