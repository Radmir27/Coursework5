package laba4; //пакет Java классов

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox category;
	private JComboBox city;
	private JComboBox kbm;
	private JComboBox age;
	private JComboBox experience;
	private JComboBox power;
	
	public Main() 
    {
        super("Калькулятор расчета ОСАГО");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
    	add(create_panel());
    	
        setSize(300, 200);
        setBounds(500,200,480,400);
        setVisible(true);
    }
    
    public JPanel create_panel() {
    	JPanel main_panel = new JPanel();
    	main_panel.setLayout(null);
    	
    	String[] categories = {
                "А, М Мотоциклы, мопеды и легкие квадрициклы",
                "B, BE физических лиц, индивидуальных предпринимателей",
                "В, ВЕ юридических лиц",
                "B, BE используемые в качестве такси",
                "C, CE с разрешенной максимальной массой 16 тонн и менее",
                "C, CE с разрешенной максимальной массой более 16 тонн",
                "D, DE с числом пассажирских мест до 16 включительно",
                "D, DE с числом пассажирских мест более 16",
                "D, DE используемые на регулярных перевозках",
                "Tb Троллейбусы",
                "Tm Трамваи",
                "Тракторы, самоходные дорожно-строительные и иные машины"
                };
        String[] cities = {
                "Уфа",
                "Воронеж",
                "Омск",
                "Челябинск",
                "Москва"
                }; 
        String[] kbms = {
                "M",
                "0",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13"
                };
        String[] ages = {
                "16 - 21",
                "22 - 24",
                "25 - 29",
                "30 - 34",
                "35 - 39",
                "40 - 49",
                "50 - 59",
                "старше 59"
                };
        String[] experiences = {
                "0",
                "1",
                "2",
                "3 - 4",
                "5 - 6",
                "7 - 9",
                "10 - 14",
                "более 14"
                };
        String[] powers = {
                "До 50",
                "От 51 до 70",
                "От 71 до 100",
                "От 101 до 120",
                "От 121 до 150",
                "От 151"
                };
    	String[] label_name = {
                "Категория",
                "Регион",
                "КБМ водителя",
                "Возраст",
                "Стаж (лет)",
                "Мощность (л.с.)",
                "Наличие прицепа",
                "Промокод",
                "Стоимость"
                };
    	final int label_x0 = 10;
    	int a = 10;
    	
    	for(int i = 0; i < label_name.length; i++) {
    		main_panel.add(create_Label(label_name[i], label_x0, a));
    		a+=35;
    	}
    	
    	main_panel.add(create_Label("––", 260, 290));
    	
    	final JTextField promo = new JTextField();
    	final JTextField totalMin = new JTextField();
    	final JTextField totalMax = new JTextField();
    	
    	final JComboBox category = new JComboBox(categories);
    	final JComboBox city = new JComboBox(cities);
    	final JComboBox kbm = new JComboBox(kbms);
    	final JComboBox age = new JComboBox(ages);
    	final JComboBox experience = new JComboBox(experiences);
    	final JComboBox power = new JComboBox(powers);
    	
    	kbm.setSelectedIndex(4);
    	kbm.setEnabled(false);
    	
    	main_panel.add(create_ComboBox(category, 75, 10, 385));
    	main_panel.add(create_ComboBox(city, 75, 45, 385));
    	main_panel.add(create_ComboBox(kbm, 110, 80, 350));
    	main_panel.add(create_ComboBox(age, 75, 115, 385));
    	main_panel.add(create_ComboBox(experience, 75, 150, 385));
    	main_panel.add(create_ComboBox(power, 110, 185, 350));
    	//220
    	main_panel.add(create_JTextField(promo, 75, 255));
    	main_panel.add(create_JTextField(totalMin, 75, 290));
    	main_panel.add(create_JTextField(totalMax, 280, 290));
    	
    	totalMin.setEditable(false);
    	totalMax.setEditable(false);
    	
    	ButtonGroup group = new ButtonGroup();
    	
    	final JRadioButton button1 = new JRadioButton("да (промокод не учитывается)", false);
    	button1.addActionListener(new ListenerButton() 
    	{
            @Override
            public void actionPerformed(ActionEvent e) {
                promo.setEditable(false);
                if(category.getSelectedIndex() == 9 || category.getSelectedIndex() == 10) {
                	category.setSelectedIndex(0);
            	}
                
         }});
    	
    	final JRadioButton button2 = new JRadioButton("нет", true);
    	button2.addActionListener(new ListenerButton() 
    	{
            @Override
            public void actionPerformed(ActionEvent e) {
            	if(category.getSelectedIndex() == 4 || category.getSelectedIndex() == 5) {
            		category.setSelectedIndex(0);
            	}
            	promo.setEditable(true);
         }});
    	
    	group.add(button1);
    	group.add(button2);

    	main_panel.add(button1);
    	main_panel.add(button2);
    	
    	button1.setBounds(135,220,235,25);
    	button2.setBounds(375,220,50,25);
    	
    	experience.addActionListener(new ListenerButton() 
    	{
			@Override
            public void actionPerformed(ActionEvent e) {
            	if (experience.getSelectedIndex() == 0) {
            		kbm.setSelectedIndex(4);
            		kbm.setEnabled(false);
            	} else {
            		kbm.setEnabled(true);
            	}
         }});
    	
    	category.addActionListener(new ListenerButton() 
    	{
            @Override
            public void actionPerformed(ActionEvent e) {
            	if(category.getSelectedIndex() == 4 || category.getSelectedIndex() == 5) {
            		button1.doClick();
            	} else if(category.getSelectedIndex() == 9 || category.getSelectedIndex() == 10) {
            		button2.doClick();
            	}
         }});
    	
    	JButton button_information = new JButton("Информация"); // добавляем кнопку "Информация"
    	button_information.setBounds(75,325,115,30);
    	button_information.addActionListener(new ListenerButton() 
    	{
            @Override
            public void actionPerformed(ActionEvent e) {
            	Information information = new Information();
            	information.subversion();
         }});
    	main_panel.add(button_information);
    	
    	JButton button_calculation = new JButton("Рассчитать"); // добавляем кнопку
    	button_calculation.setBounds(210,325,115,30);
    	button_calculation.addActionListener(new ListenerButton() 
    	{
            @Override
            public void actionPerformed(ActionEvent e) {
            	Calculation total = new Calculation();
            	if (button1.isSelected()) {
            		OSAGOwithTrailer osago = new OSAGOwithTrailer();
            		osago.setCategory(category.getSelectedIndex());
                	osago.setCity(city.getSelectedIndex());
                	osago.setCBM(kbm.getSelectedIndex());
                	osago.setAge(age.getSelectedIndex());
                	osago.setExperience(experience.getSelectedIndex());
                	osago.setCM(power.getSelectedIndex());
                	osago.peredacha();
                	totalMin.setText(String.valueOf(osago.getTotalMin()));
                	totalMax.setText(String.valueOf(osago.getTotalMax()));
            	} else {
            		OSAGOwithPromo osago = new OSAGOwithPromo();
            		osago.setCategory(category.getSelectedIndex());
                	osago.setCity(city.getSelectedIndex());
                	osago.setCBM(kbm.getSelectedIndex());
                	osago.setAge(age.getSelectedIndex());
                	osago.setExperience(experience.getSelectedIndex());
                	osago.setCM(power.getSelectedIndex());
                	osago.setPromo(promo.getText());
                	osago.peredacha();
                	totalMin.setText(String.valueOf(osago.getTotalMin()));
                	totalMax.setText(String.valueOf(osago.getTotalMax()));
            	}
         }
    	});
    	main_panel.add(button_calculation);
    	
    	JButton button_exit = new JButton("Выход"); // добавляем кнопку
    	button_exit.setBounds(355,325,105,30);
    	ActionListener actionListener = new ListenerButton(); //создаем слушатель
    	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
    	main_panel.add(button_exit);
    	
		return main_panel;
    }
    
    private JLabel create_Label(String name,int x0, int y0) {
    	JLabel label = new JLabel(name);
    	label.setBounds(x0,y0,185,25);
		return label;
	}
    
	private JComboBox create_ComboBox(JComboBox name,int x0, int y0, int x) {
    	name.setBounds(x0,y0,x,25);
		return name;
    }
	
	private JTextField create_JTextField(JTextField name,int x0, int y0) {
		name.setBounds(x0,y0,180,25);
		name.setVisible(true);
		return name;
	}
	
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		new Main();
		
	}
}