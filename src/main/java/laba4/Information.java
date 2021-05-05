package laba4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Information {
	
	public void subversion() {
	final JFrame main_GUI = new JFrame("Информация");	// создание графического окна
	main_GUI.setTitle ("Информация о разработчиках");
	main_GUI.setBounds(525,215,390,150);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_dev5 = new JLabel("Модератор: Абкаримов Р.М., Студенческий номер: 19130598"); // Отображение текста или изображения
	laba_dev5.setBounds(10,10,400,25);
	main_panel.add(laba_dev5);
	
	JLabel laba_dev6 = new JLabel("Разработчик: Бражников Д.А., Студенческий номер: 19130623"); // Отображение текста или изображения
	laba_dev6.setBounds(10,45,400,25);
	main_panel.add(laba_dev6);
	
	JLabel laba_dev7 = new JLabel("Разработчик: Ушаков М.О., Студенческий номер: 19130644"); // Отображение текста или изображения
	laba_dev7.setBounds(10,80,400,25);
	main_panel.add(laba_dev7);
	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
	
}
