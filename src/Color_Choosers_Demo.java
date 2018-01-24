	import javax.swing.*;
	import java.awt.*;
	public class Color_Choosers_Demo {
		public static void main(String[] args) {
			JFrame frame = new JFrame("Color Choosers Demo");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			JPanel colorp = new JPanel();
			colorp.setBackground(Color.WHITE);
			colorp.setPreferredSize(new Dimension(250, 200));
		
			frame.getContentPane().add(colorp);
			frame.pack();
			frame.setVisible(true);
		
			Color chosen_color = Color.WHITE;
			int repeat;
		
			do {
				chosen_color=JColorChooser.showDialog(frame, "Choose a Color", chosen_color);
				colorp.setBackground(chosen_color);
				repeat = JOptionPane.showConfirmDialog(null, "New Color?");
			}
			while (repeat == JOptionPane.YES_OPTION);
		}
	}
