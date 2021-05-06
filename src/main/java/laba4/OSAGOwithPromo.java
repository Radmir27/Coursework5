package laba4;

import java.io.IOException;

public class OSAGOwithPromo extends OSAGO {
	//public float skidka = 1;
	//public String promo = "";

    /*public void setPromo(String promo) {
        this.promo = promo;

        
    }*/
    /*public void  getSkidka() {  
      if ((promo).equals("USATU") || (promo).equals("Pricep11")||(promo).equals("project5")) //проверка промокода
      {
    	  skidka = (float) 0.9;
    	  JOptionPane.showMessageDialog(null, "Промокод действителен. Скидка 10%");
      }
      else if((promo).equals("")){}
      else
      {
    	  skidka = (float) 1;
    	  JOptionPane.showMessageDialog(null, "Промокод недействителен ");
      }
      System.out.println(promo);
    }*/
    /*public void calculation() 
    {
    	getSkidka();
    	getBTmin();
    	getCT();
    	getCBM();
    	getCSV();
    	getCM();
    	Hello calculation = new Hello();
    	calculation.setBTmin(btMin);
    	calculation.setBTmax(btMax);
    	calculation.setKT(ct);
    	calculation.setKBM(cbm);
    	calculation.setKSV(csv);
    	calculation.setKM(cm);
    	calculation.setPromo(skidka);
    	calculation.calculation();
    	totalMin = calculation.getTotalMin();
    	totalMax = calculation.getTotalMax();
    }*/
	
	public void calculation(int category_try, int city_try, int cbm_try, int age_try, int experience_try, int cm_try,
			int pricep_try, String promo_try) throws IOException {
		setConf(category_try, city_try, cbm_try, age_try, experience_try, cm_try, pricep_try);
		if (promo_try != "USATU" || promo_try != "Pricep11" || promo_try != "project5") {	//проверка промокода
	    	  promo = 1;
	    	  }
		cpr = 1;
		tb = ((btMax - btMin)*staf+btMin)*ct*cbm*csv*cm*cpr*promo;
	}
}
