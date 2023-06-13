package br.edu.cesarschool.projetos.strateegia.gui;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class JornadaGUI {

	protected Shell shell;
	//private Button btnJornada1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			JornadaGUI window = new JornadaGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(1024, 668);
		shell.setText("Stratroom");
		
		Button btnPonto1 = new Button(shell, SWT.NONE);
		btnPonto1.setBounds(48, 42, 72, 58);
		btnPonto1.setText("+");
		
		Button btnPonto2 = new Button(shell, SWT.NONE);
		btnPonto2.setEnabled(false);
		btnPonto2.setBounds(89, 103, 72, 58);
		
		Button btnPonto3 = new Button(shell, SWT.NONE);
		btnPonto3.setEnabled(false);
		btnPonto3.setBounds(126, 42, 72, 58);
		
		Button btnPonto4 = new Button(shell, SWT.NONE);
		btnPonto4.setEnabled(false);
		btnPonto4.setBounds(168, 103, 72, 58);
		
		Button btnPonto5 = new Button(shell, SWT.NONE);
		btnPonto5.setEnabled(false);
		btnPonto5.setBounds(204, 42, 72, 58);
		
		Button btnPonto6 = new Button(shell, SWT.NONE);
		btnPonto6.setEnabled(false);
		btnPonto6.setBounds(248, 103, 72, 58);
		
		Label lblMinhasJornadas = new Label(shell, SWT.NONE);
		lblMinhasJornadas.setBounds(10, 10, 164, 14);
		lblMinhasJornadas.setText("Minhas Jornadas | Protótipo");
		
		Button btnApplets = new Button(shell, SWT.NONE);
		btnApplets.setBounds(841, 454, 134, 46);
		btnApplets.setText("applets");
		
		Button btnLinkUteis = new Button(shell, SWT.NONE);
		btnLinkUteis.setText("links úteis");
		btnLinkUteis.setBounds(841, 506, 134, 35);
		
		Button btnAnalises = new Button(shell, SWT.NONE);
		btnAnalises.setText("análises ");
		btnAnalises.setBounds(841, 547, 134, 41);
		
		Button btnPonto4_1 = new Button(shell, SWT.NONE);
		btnPonto4_1.setEnabled(false);
		btnPonto4_1.setBounds(282, 42, 72, 58);
		
		Button btnPonto4_2 = new Button(shell, SWT.NONE);
		btnPonto4_2.setEnabled(false);
		btnPonto4_2.setBounds(326, 103, 72, 58);
		
		Button btnPonto4_3 = new Button(shell, SWT.NONE);
		btnPonto4_3.setEnabled(false);
		btnPonto4_3.setBounds(360, 42, 72, 58);
		
		Button btnPonto4_4 = new Button(shell, SWT.NONE);
		btnPonto4_4.setEnabled(false);
		btnPonto4_4.setBounds(404, 103, 72, 58);
		
		Button btnPonto4_5 = new Button(shell, SWT.NONE);
		btnPonto4_5.setEnabled(false);
		btnPonto4_5.setBounds(438, 42, 72, 58);
		
		Button btnPonto4_6 = new Button(shell, SWT.NONE);
		btnPonto4_6.setEnabled(false);
		btnPonto4_6.setBounds(482, 103, 72, 58);
		
		Button btnPonto4_7 = new Button(shell, SWT.NONE);
		btnPonto4_7.setEnabled(false);
		btnPonto4_7.setBounds(516, 42, 72, 58);
		
		Button btnPonto4_8 = new Button(shell, SWT.NONE);
		btnPonto4_8.setEnabled(false);
		btnPonto4_8.setBounds(560, 103, 72, 58);
		
		Button btnPonto4_9 = new Button(shell, SWT.NONE);
		btnPonto4_9.setEnabled(false);
		btnPonto4_9.setBounds(594, 42, 72, 58);
		
		Button btnPonto4_10 = new Button(shell, SWT.NONE);
		btnPonto4_10.setEnabled(false);
		btnPonto4_10.setBounds(638, 103, 72, 58);
		
		Button btnPonto4_11 = new Button(shell, SWT.NONE);
		btnPonto4_11.setEnabled(false);
		btnPonto4_11.setBounds(672, 42, 72, 58);
		
		Button btnPonto4_12 = new Button(shell, SWT.NONE);
		btnPonto4_12.setEnabled(false);
		btnPonto4_12.setBounds(716, 103, 72, 58);
		
		Button btnPonto4_13 = new Button(shell, SWT.NONE);
		btnPonto4_13.setEnabled(false);
		btnPonto4_13.setBounds(750, 42, 72, 58);
		
		Button btnPonto4_14 = new Button(shell, SWT.NONE);
		btnPonto4_14.setEnabled(false);
		btnPonto4_14.setBounds(794, 103, 72, 58);
		
		Button btnPonto4_15 = new Button(shell, SWT.NONE);
		btnPonto4_15.setEnabled(false);
		btnPonto4_15.setBounds(828, 42, 72, 58);
		
		Button btnPonto4_16 = new Button(shell, SWT.NONE);
		btnPonto4_16.setEnabled(false);
		btnPonto4_16.setBounds(875, 103, 72, 58);
		
		Button btnPonto4_17 = new Button(shell, SWT.NONE);
		btnPonto4_17.setEnabled(false);
		btnPonto4_17.setBounds(906, 42, 72, 58);
		
		Button btnPonto4_18 = new Button(shell, SWT.NONE);
		btnPonto4_18.setEnabled(false);
		btnPonto4_18.setBounds(953, 103, 72, 58);
		
		Button btnPonto4_19 = new Button(shell, SWT.NONE);
		btnPonto4_19.setEnabled(false);
		btnPonto4_19.setBounds(984, 42, 72, 58);
		
		Button btnPonto4_20 = new Button(shell, SWT.NONE);
		btnPonto4_20.setEnabled(false);
		btnPonto4_20.setBounds(48, 167, 72, 58);
		
		Button btnPonto4_21 = new Button(shell, SWT.NONE);
		btnPonto4_21.setEnabled(false);
		btnPonto4_21.setBounds(126, 167, 72, 58);
		
		Button btnPonto4_22 = new Button(shell, SWT.NONE);
		btnPonto4_22.setEnabled(false);
		btnPonto4_22.setBounds(204, 167, 72, 58);
		
		Button btnPonto4_23 = new Button(shell, SWT.NONE);
		btnPonto4_23.setEnabled(false);
		btnPonto4_23.setBounds(282, 167, 72, 58);
		
		Button btnPonto4_24 = new Button(shell, SWT.NONE);
		btnPonto4_24.setEnabled(false);
		btnPonto4_24.setBounds(360, 167, 72, 58);
		
		Button btnPonto4_25 = new Button(shell, SWT.NONE);
		btnPonto4_25.setEnabled(false);
		btnPonto4_25.setBounds(438, 167, 72, 58);
		
		Button btnPonto4_26 = new Button(shell, SWT.NONE);
		btnPonto4_26.setEnabled(false);
		btnPonto4_26.setBounds(516, 167, 72, 58);
		
		Button btnPonto4_27 = new Button(shell, SWT.NONE);
		btnPonto4_27.setEnabled(false);
		btnPonto4_27.setBounds(594, 167, 72, 58);
		
		Button btnPonto4_28 = new Button(shell, SWT.NONE);
		btnPonto4_28.setEnabled(false);
		btnPonto4_28.setBounds(672, 167, 72, 58);
		
		Button btnPonto4_29 = new Button(shell, SWT.NONE);
		btnPonto4_29.setEnabled(false);
		btnPonto4_29.setBounds(750, 167, 72, 58);
		
		Button btnPonto4_30 = new Button(shell, SWT.NONE);
		btnPonto4_30.setEnabled(false);
		btnPonto4_30.setBounds(828, 167, 72, 58);
		
		Button btnPonto4_31 = new Button(shell, SWT.NONE);
		btnPonto4_31.setEnabled(false);
		btnPonto4_31.setBounds(906, 167, 72, 58);
		
		Button btnPonto4_32 = new Button(shell, SWT.NONE);
		btnPonto4_32.setEnabled(false);
		btnPonto4_32.setBounds(984, 167, 72, 58);
		
		Button btnPonto2_1 = new Button(shell, SWT.NONE);
		btnPonto2_1.setEnabled(false);
		btnPonto2_1.setBounds(89, 231, 72, 58);
		
		Button btnPonto4_33 = new Button(shell, SWT.NONE);
		btnPonto4_33.setEnabled(false);
		btnPonto4_33.setBounds(168, 231, 72, 58);
		
		Button btnPonto6_1 = new Button(shell, SWT.NONE);
		btnPonto6_1.setEnabled(false);
		btnPonto6_1.setBounds(248, 231, 72, 58);
		
		Button btnPonto4_2_1 = new Button(shell, SWT.NONE);
		btnPonto4_2_1.setEnabled(false);
		btnPonto4_2_1.setBounds(326, 231, 72, 58);
		
		Button btnPonto4_4_1 = new Button(shell, SWT.NONE);
		btnPonto4_4_1.setEnabled(false);
		btnPonto4_4_1.setBounds(404, 231, 72, 58);
		
		Button btnPonto4_6_1 = new Button(shell, SWT.NONE);
		btnPonto4_6_1.setEnabled(false);
		btnPonto4_6_1.setBounds(482, 231, 72, 58);
		
		Button btnPonto4_8_1 = new Button(shell, SWT.NONE);
		btnPonto4_8_1.setEnabled(false);
		btnPonto4_8_1.setBounds(560, 231, 72, 58);
		
		Button btnPonto4_10_1 = new Button(shell, SWT.NONE);
		btnPonto4_10_1.setEnabled(false);
		btnPonto4_10_1.setBounds(638, 231, 72, 58);
		
		Button btnPonto4_12_1 = new Button(shell, SWT.NONE);
		btnPonto4_12_1.setEnabled(false);
		btnPonto4_12_1.setBounds(716, 231, 72, 58);
		
		Button btnPonto4_14_1 = new Button(shell, SWT.NONE);
		btnPonto4_14_1.setEnabled(false);
		btnPonto4_14_1.setBounds(794, 231, 72, 58);
		
		Button btnPonto4_16_1 = new Button(shell, SWT.NONE);
		btnPonto4_16_1.setEnabled(false);
		btnPonto4_16_1.setBounds(875, 231, 72, 58);
		
		Button btnPonto4_18_1 = new Button(shell, SWT.NONE);
		btnPonto4_18_1.setEnabled(false);
		btnPonto4_18_1.setBounds(953, 231, 72, 58);
		
		Button btnPonto4_20_1 = new Button(shell, SWT.NONE);
		btnPonto4_20_1.setEnabled(false);
		btnPonto4_20_1.setBounds(48, 295, 72, 58);
		
		Button btnPonto4_21_1 = new Button(shell, SWT.NONE);
		btnPonto4_21_1.setEnabled(false);
		btnPonto4_21_1.setBounds(126, 295, 72, 58);
		
		Button btnPonto4_22_1 = new Button(shell, SWT.NONE);
		btnPonto4_22_1.setEnabled(false);
		btnPonto4_22_1.setBounds(204, 295, 72, 58);
		
		Button btnPonto4_23_1 = new Button(shell, SWT.NONE);
		btnPonto4_23_1.setEnabled(false);
		btnPonto4_23_1.setBounds(282, 295, 72, 58);
		
		Button btnPonto4_24_1 = new Button(shell, SWT.NONE);
		btnPonto4_24_1.setEnabled(false);
		btnPonto4_24_1.setBounds(360, 295, 72, 58);
		
		Button btnPonto4_25_1 = new Button(shell, SWT.NONE);
		btnPonto4_25_1.setEnabled(false);
		btnPonto4_25_1.setBounds(438, 295, 72, 58);
		
		Button btnPonto4_26_1 = new Button(shell, SWT.NONE);
		btnPonto4_26_1.setEnabled(false);
		btnPonto4_26_1.setBounds(516, 295, 72, 58);
		
		Button btnPonto4_27_1 = new Button(shell, SWT.NONE);
		btnPonto4_27_1.setEnabled(false);
		btnPonto4_27_1.setBounds(594, 295, 72, 58);
		
		Button btnPonto4_28_1 = new Button(shell, SWT.NONE);
		btnPonto4_28_1.setEnabled(false);
		btnPonto4_28_1.setBounds(672, 295, 72, 58);
		
		Button btnPonto4_29_1 = new Button(shell, SWT.NONE);
		btnPonto4_29_1.setEnabled(false);
		btnPonto4_29_1.setBounds(750, 295, 72, 58);
		
		Button btnPonto4_30_1 = new Button(shell, SWT.NONE);
		btnPonto4_30_1.setEnabled(false);
		btnPonto4_30_1.setBounds(828, 295, 72, 58);
		
		Button btnPonto4_31_1 = new Button(shell, SWT.NONE);
		btnPonto4_31_1.setEnabled(false);
		btnPonto4_31_1.setBounds(906, 295, 72, 58);
		
		Button btnPonto4_32_1 = new Button(shell, SWT.NONE);
		btnPonto4_32_1.setEnabled(false);
		btnPonto4_32_1.setBounds(984, 295, 72, 58);
		
		btnPonto1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				PontoGUI ponto = new PontoGUI();
//				shell.close();
				ponto.open();
			}
		});
	}
}
