package laba4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Information {
	
	public void subversion() {
	final JFrame main_GUI = new JFrame("����������");	// �������� ������������ ����
	main_GUI.setTitle ("���������� � �������������");
	main_GUI.setBounds(525,215,390,150);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_dev5 = new JLabel("���������: ��������� �.�., ������������ �����: 19130598"); // ����������� ������ ��� �����������
	laba_dev5.setBounds(10,10,400,25);
	main_panel.add(laba_dev5);
	
	JLabel laba_dev6 = new JLabel("�����������: ��������� �.�., ������������ �����: 19130623"); // ����������� ������ ��� �����������
	laba_dev6.setBounds(10,45,400,25);
	main_panel.add(laba_dev6);
	
	JLabel laba_dev7 = new JLabel("�����������: ������ �.�., ������������ �����: 19130644"); // ����������� ������ ��� �����������
	laba_dev7.setBounds(10,80,400,25);
	main_panel.add(laba_dev7);
	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
	
}
