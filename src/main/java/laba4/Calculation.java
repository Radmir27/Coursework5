package laba4;

public class Calculation {
public int BTmin = 1;
public int BTmax = 1;
public float KT = 1;
public float KBM = 1;
public float KSV = 1;
public float KM = 1;
public float KPR = 1;
public float Promo = 1;
public int totalMin = 1;
public int totalMax = 1;

public void setBTmin(int BTmin) {
    this.BTmin = BTmin;
}
public void setBTmax(int BTmax) {
    this.BTmax = BTmax;
}
public void setKT(float ct) {
    this.KT = ct;
}
public void setKBM(float cbm) {
	this.KBM = cbm;
}
public void setKSV(float csv) {
	this.KSV = csv;
}
public void setKM(float cm) {
	this.KM = cm;
}
public void setKPR(float ctr) {
	this.KPR = ctr;
}
public void setPromo(float skidka) {
	this.Promo = skidka;
}

public int getTotalMin() {
	return totalMin;
}

public int getTotalMax() {
	return totalMax;
}
    
public void calculation() {
	totalMin=(int) (BTmin*KT*KBM*KSV*KM*KPR*Promo);
	totalMax=(int) (BTmax*KT*KBM*KSV*KM*KPR*Promo);
}}
	
