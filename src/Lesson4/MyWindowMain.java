package Lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindowMain {
    public static void main(String[] args) {
        new MainWindow();
    }
}

class MainWindow extends JFrame {
    EditWindow editWindow;

    JTextField nameField;
    JTextField surnameField;
    JTextField patronymicField;

    public MainWindow() {

        setTitle("ФИО");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3,2));

        JLabel nameLabel = new JLabel("Фамилия:");
        JLabel surnameLabel = new JLabel("Имя:");
        JLabel patronymicLabel = new JLabel("Отчество:");

        this.nameField = new JTextField();
        this.surnameField = new JTextField();
        this.patronymicField = new JTextField();

        nameField.setEditable(false);
        surnameField.setEditable(false);
        patronymicField.setEditable(false);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(surnameLabel);
        panel.add(surnameField);
        panel.add(patronymicLabel);
        panel.add(patronymicField);

        JButton btn = new JButton("Введите ФИО");

        add(panel, BorderLayout.NORTH);
        add(btn, BorderLayout.SOUTH);

        setBounds(400,200,700,600);

        editWindow = new EditWindow(this);

        setVisible(true);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editWindow.setVisible(true);
                setEnabled(false);
            }
        });
    }

    public void sendFIO(String name, String surname, String patronymic){
        nameField.setText(name);
        surnameField.setText(surname);
        patronymicField.setText(patronymic);
    }
}

class EditWindow extends JFrame{
    MainWindow mainWindow;

    public EditWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;

        setTitle("Edit Window");

        JPanel panel = new JPanel(new GridLayout(3,2));

        JLabel nameLabel = new JLabel("Фамилия:");
        JLabel surnameLabel = new JLabel("Имя:");
        JLabel patronymicLabel = new JLabel("Отчество:");

        JTextField nameField = new JTextField();
        JTextField surnameField = new JTextField();
        JTextField patronymicField = new JTextField();

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(surnameLabel);
        panel.add(surnameField);
        panel.add(patronymicLabel);
        panel.add(patronymicField);

        JButton btn = new JButton("Отправить");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainWindow.sendFIO(nameField.getText(), surnameField.getText(), patronymicField.getText());
                mainWindow.setEnabled(true);
                setVisible(false);
            }
        });

        add(panel, BorderLayout.NORTH);
        add(btn, BorderLayout.SOUTH);

        setSize(500,400);
        Rectangle mainWindowBounds = mainWindow.getBounds();
        Rectangle editWindowBounds = this.getBounds();
        int posX = (int) (mainWindowBounds.getCenterX() - editWindowBounds.width/2);
        int posY = (int) (mainWindowBounds.getCenterY() - editWindowBounds.height/2);
        setLocation(posX, posY);

        setVisible(false);
    }
}