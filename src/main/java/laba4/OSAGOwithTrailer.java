package laba4;

import java.io.IOException;

public class OSAGOwithTrailer extends OSAGO {

	public float calculation(int category_try, int city_try, int cbm_try, int age_try, int experience_try, int cm_try,
			String promo_try) throws IOException {
		setConf(category_try, city_try, cbm_try, age_try, experience_try, cm_try);
		promo = 1;
		int tbInt = (int) (((btMax - btMin)*staf+btMin)*ct*cbm*csv*cm*cpr*promo*100);
		float tb = tbInt/100;
		return tb;
	}

}
