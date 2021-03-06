package laba4;

import java.io.IOException;

public abstract class OSAGO {
	
	protected int btMin;
	protected int btMax;
	protected float ct;
	protected float cbm;
	protected float csv;
	protected float cm;
	protected float cpr;
	protected float promo;
	protected float staf;
	
	public void setConf(int category_try, int city_try, int cbm_try, int age_try, int experience_try, int cm_try) throws IOException {
		Coef coef = new Coef();
		coef.setParam();
		btMin = coef.btCoef[category_try][0];
		btMax = coef.btCoef[category_try][1];
		ct = coef.cityCoef[city_try];
		cbm = coef.cbmCoef[cbm_try];
		csv = coef.csvsCoef[age_try][experience_try];
		cm = coef.cmCoef[cm_try];
		cpr = coef.cprCoef[category_try];
		promo = coef.promoConf;
		staf = coef.stafConf;
	}
	
	abstract float calculation(int category_try, int city_try, int cbm_try, int age_try, int experience_try, int cm_try,
			String promo_try) throws IOException;
}
