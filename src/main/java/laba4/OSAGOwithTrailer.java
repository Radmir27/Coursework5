package laba4;

public class OSAGOwithTrailer extends OSAGO implements Trailer {
	public float ctr = 1;
	
    public void getCtr() {
    	switch (category) {             
    	case 0 : //  "�, � ���������, ������ � ������ �����������"
    	 ctr = (float) 1.16;
    	 break;
    	case 1 :  //  "B, BE ���������� ���, �������������� ����������������"
       	 ctr = (float) 1;
       	 break;
    	case 2 :  //     "�, �� ����������� ���"
       	 ctr = (float) 1.16;
       	 break;
    	case 3 :  //     "B, BE ������������ � �������� �����"
       	 ctr = (float) 1.16;
       	 break;
    	case 4 :  //     "C, CE � ����������� ������������ ������ 16 ���� � �����"
       	 ctr = (float) 1.4;
       	 break;
    	case 5 : //     "C, CE � ����������� ������������ ������ ����� 16 ����"
       	 ctr = (float) 1.25;
       	 break;
    	case 6 :  //     "D, DE � ������ ������������ ���� �� 16 ������������"
       	 ctr = (float) 1;
       	 break;
    	case 7 :  //     "D, DE � ������ ������������ ���� ����� 16
       	 ctr = (float) 1;
       	 break;
    	case 8 :  //     "D, DE ������������ �� ���������� ����������"
       	 ctr = (float) 1;
       	 break;  
    	case 9 :  //      "��������, ���������� �������-������������ � ���� ������"
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
