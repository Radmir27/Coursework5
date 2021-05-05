package laba4;

import javax.swing.JOptionPane;

public class OSAGOwithPromo extends OSAGO implements Promo{
	public float skidka = 1;
	public String promo = "";

    public void setPromo(String promo) {
        this.promo = promo;

        
    }
    public void  getSkidka() {  
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
 }
    public void peredacha() 
    {
    	getSkidka();
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
    	calculation.setPromo(skidka);
    	calculation.calculation();
    	totalMin = calculation.getTotalMin();
    	totalMax = calculation.getTotalMax();
  
    }

}
