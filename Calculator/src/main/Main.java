package main;

import java.awt.EventQueue;

import forms.frmmain;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmmain window = new frmmain();
					window.frame.setVisible(true);
					
					int broj=1;
					
					int broj2 = 2;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	

	}

}
