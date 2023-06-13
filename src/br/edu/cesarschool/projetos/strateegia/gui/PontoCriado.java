package br.edu.cesarschool.projetos.strateegia.gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class PontoCriado {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			JornadaGUI jornada = new JornadaGUI();
			jornada.shell.close();
			PontoCriado window = new PontoCriado();
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
		
		Label lblMinhasJornadas = new Label(shell, SWT.NONE);
		lblMinhasJornadas.setText("Minhas Jornadas | Protótipo");
		lblMinhasJornadas.setBounds(10, 10, 164, 14);
		
		Button btnPontoAtvClass = new Button(shell, SWT.NONE);
		btnPontoAtvClass.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnPontoAtvClass.setText("Projetos 3");
		btnPontoAtvClass.setBounds(49, 44, 79, 58);
		
		Button btnApplets_1 = new Button(shell, SWT.NONE);
		btnApplets_1.setText("applets");
		btnApplets_1.setBounds(841, 464, 134, 46);
		
		Button btnAnalises_1 = new Button(shell, SWT.NONE);
		btnAnalises_1.setText("análises ");
		btnAnalises_1.setBounds(841, 557, 134, 41);
		
		Button btnLinkUteis_1 = new Button(shell, SWT.NONE);
		btnLinkUteis_1.setText("links úteis");
		btnLinkUteis_1.setBounds(841, 516, 134, 35);
		
		Button btnPonto1 = new Button(shell, SWT.NONE);
		btnPonto1.setText("+");
		btnPonto1.setBounds(101, 108, 72, 58);
		
		Button btnPonto1_1 = new Button(shell, SWT.NONE);
		btnPonto1_1.setText("+");
		btnPonto1_1.setBounds(134, 44, 72, 58);
		
		Button btnPonto3 = new Button(shell, SWT.NONE);
		btnPonto3.setEnabled(false);
		btnPonto3.setBounds(212, 44, 72, 58);
		
		Button btnPonto5 = new Button(shell, SWT.NONE);
		btnPonto5.setEnabled(false);
		btnPonto5.setBounds(290, 44, 72, 58);
		
		Button btnPonto4_1 = new Button(shell, SWT.NONE);
		btnPonto4_1.setEnabled(false);
		btnPonto4_1.setBounds(368, 44, 72, 58);
		
		Button btnPonto4_3 = new Button(shell, SWT.NONE);
		btnPonto4_3.setEnabled(false);
		btnPonto4_3.setBounds(446, 44, 72, 58);
		
		Button btnPonto3_1 = new Button(shell, SWT.NONE);
		btnPonto3_1.setEnabled(false);
		btnPonto3_1.setBounds(524, 44, 72, 58);
		
		Button btnPonto5_1 = new Button(shell, SWT.NONE);
		btnPonto5_1.setEnabled(false);
		btnPonto5_1.setBounds(602, 44, 72, 58);
		
		Button btnPonto4_1_1 = new Button(shell, SWT.NONE);
		btnPonto4_1_1.setEnabled(false);
		btnPonto4_1_1.setBounds(680, 44, 72, 58);
		
		Button btnPonto4_3_1 = new Button(shell, SWT.NONE);
		btnPonto4_3_1.setEnabled(false);
		btnPonto4_3_1.setBounds(758, 44, 72, 58);
		
		Button btnPonto4_1_1_1 = new Button(shell, SWT.NONE);
		btnPonto4_1_1_1.setEnabled(false);
		btnPonto4_1_1_1.setBounds(836, 44, 72, 58);
		
		Button btnPonto4_3_1_1 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_1.setEnabled(false);
		btnPonto4_3_1_1.setBounds(914, 44, 72, 58);
		
		Button btnPonto4_3_1_1_1 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_1_1.setEnabled(false);
		btnPonto4_3_1_1_1.setBounds(992, 44, 72, 58);
		
		Button btnPonto3_2 = new Button(shell, SWT.NONE);
		btnPonto3_2.setEnabled(false);
		btnPonto3_2.setBounds(179, 108, 72, 58);
		
		Button btnPonto5_2 = new Button(shell, SWT.NONE);
		btnPonto5_2.setEnabled(false);
		btnPonto5_2.setBounds(257, 108, 72, 58);
		
		Button btnPonto4_1_2 = new Button(shell, SWT.NONE);
		btnPonto4_1_2.setEnabled(false);
		btnPonto4_1_2.setBounds(335, 108, 72, 58);
		
		Button btnPonto3_1_1 = new Button(shell, SWT.NONE);
		btnPonto3_1_1.setEnabled(false);
		btnPonto3_1_1.setBounds(491, 108, 72, 58);
		
		Button btnPonto4_3_2 = new Button(shell, SWT.NONE);
		btnPonto4_3_2.setEnabled(false);
		btnPonto4_3_2.setBounds(413, 108, 72, 58);
		
		Button btnPonto5_1_1 = new Button(shell, SWT.NONE);
		btnPonto5_1_1.setEnabled(false);
		btnPonto5_1_1.setBounds(569, 108, 72, 58);
		
		Button btnPonto4_1_1_2 = new Button(shell, SWT.NONE);
		btnPonto4_1_1_2.setEnabled(false);
		btnPonto4_1_1_2.setBounds(647, 108, 72, 58);
		
		Button btnPonto4_3_1_2 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_2.setEnabled(false);
		btnPonto4_3_1_2.setBounds(725, 108, 72, 58);
		
		Button btnPonto4_1_1_1_1 = new Button(shell, SWT.NONE);
		btnPonto4_1_1_1_1.setEnabled(false);
		btnPonto4_1_1_1_1.setBounds(803, 108, 72, 58);
		
		Button btnPonto4_3_1_3 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_3.setEnabled(false);
		btnPonto4_3_1_3.setBounds(881, 108, 72, 58);
		
		Button btnPonto4_1_1_1_2 = new Button(shell, SWT.NONE);
		btnPonto4_1_1_1_2.setEnabled(false);
		btnPonto4_1_1_1_2.setBounds(959, 108, 72, 58);
		
		Button btnPonto3_3 = new Button(shell, SWT.NONE);
		btnPonto3_3.setEnabled(false);
		btnPonto3_3.setBounds(56, 172, 72, 58);
		
		Button btnPonto5_3 = new Button(shell, SWT.NONE);
		btnPonto5_3.setEnabled(false);
		btnPonto5_3.setBounds(134, 172, 72, 58);
		
		Button btnPonto4_1_3 = new Button(shell, SWT.NONE);
		btnPonto4_1_3.setEnabled(false);
		btnPonto4_1_3.setBounds(212, 172, 72, 58);
		
		Button btnPonto4_3_3 = new Button(shell, SWT.NONE);
		btnPonto4_3_3.setEnabled(false);
		btnPonto4_3_3.setBounds(290, 172, 72, 58);
		
		Button btnPonto3_1_2 = new Button(shell, SWT.NONE);
		btnPonto3_1_2.setEnabled(false);
		btnPonto3_1_2.setBounds(368, 172, 72, 58);
		
		Button btnPonto5_1_2 = new Button(shell, SWT.NONE);
		btnPonto5_1_2.setEnabled(false);
		btnPonto5_1_2.setBounds(446, 172, 72, 58);
		
		Button btnPonto4_1_1_3 = new Button(shell, SWT.NONE);
		btnPonto4_1_1_3.setEnabled(false);
		btnPonto4_1_1_3.setBounds(524, 172, 72, 58);
		
		Button btnPonto4_3_1_4 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_4.setEnabled(false);
		btnPonto4_3_1_4.setBounds(602, 172, 72, 58);
		
		Button btnPonto4_1_1_1_3 = new Button(shell, SWT.NONE);
		btnPonto4_1_1_1_3.setEnabled(false);
		btnPonto4_1_1_1_3.setBounds(680, 172, 72, 58);
		
		Button btnPonto4_3_1_1_2 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_1_2.setEnabled(false);
		btnPonto4_3_1_1_2.setBounds(758, 172, 72, 58);
		
		Button btnPonto4_3_1_4_1 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_4_1.setEnabled(false);
		btnPonto4_3_1_4_1.setBounds(836, 172, 72, 58);
		
		Button btnPonto4_3_1_1_2_1 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_1_2_1.setEnabled(false);
		btnPonto4_3_1_1_2_1.setBounds(992, 172, 72, 58);
		
		Button btnPonto4_1_1_1_3_1 = new Button(shell, SWT.NONE);
		btnPonto4_1_1_1_3_1.setEnabled(false);
		btnPonto4_1_1_1_3_1.setBounds(914, 172, 72, 58);
		
		Button btnPonto3_3_1 = new Button(shell, SWT.NONE);
		btnPonto3_3_1.setEnabled(false);
		btnPonto3_3_1.setBounds(101, 236, 72, 58);
		
		Button btnPonto5_3_1 = new Button(shell, SWT.NONE);
		btnPonto5_3_1.setEnabled(false);
		btnPonto5_3_1.setBounds(179, 236, 72, 58);
		
		Button btnPonto4_1_3_1 = new Button(shell, SWT.NONE);
		btnPonto4_1_3_1.setEnabled(false);
		btnPonto4_1_3_1.setBounds(257, 236, 72, 58);
		
		Button btnPonto4_3_3_1 = new Button(shell, SWT.NONE);
		btnPonto4_3_3_1.setEnabled(false);
		btnPonto4_3_3_1.setBounds(335, 236, 72, 58);
		
		Button btnPonto3_1_2_1 = new Button(shell, SWT.NONE);
		btnPonto3_1_2_1.setEnabled(false);
		btnPonto3_1_2_1.setBounds(413, 236, 72, 58);
		
		Button btnPonto5_1_2_1 = new Button(shell, SWT.NONE);
		btnPonto5_1_2_1.setEnabled(false);
		btnPonto5_1_2_1.setBounds(491, 236, 72, 58);
		
		Button btnPonto4_1_1_3_1 = new Button(shell, SWT.NONE);
		btnPonto4_1_1_3_1.setEnabled(false);
		btnPonto4_1_1_3_1.setBounds(569, 236, 72, 58);
		
		Button btnPonto4_3_1_4_2 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_4_2.setEnabled(false);
		btnPonto4_3_1_4_2.setBounds(647, 236, 72, 58);
		
		Button btnPonto4_1_1_1_3_2 = new Button(shell, SWT.NONE);
		btnPonto4_1_1_1_3_2.setEnabled(false);
		btnPonto4_1_1_1_3_2.setBounds(725, 236, 72, 58);
		
		Button btnPonto4_3_1_1_2_2 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_1_2_2.setEnabled(false);
		btnPonto4_3_1_1_2_2.setBounds(803, 236, 72, 58);
		
		Button btnPonto4_3_1_4_1_1 = new Button(shell, SWT.NONE);
		btnPonto4_3_1_4_1_1.setEnabled(false);
		btnPonto4_3_1_4_1_1.setBounds(881, 236, 72, 58);
		
		Button btnPonto4_1_1_1_3_1_1 = new Button(shell, SWT.NONE);
		btnPonto4_1_1_1_3_1_1.setEnabled(false);
		btnPonto4_1_1_1_3_1_1.setBounds(959, 236, 72, 58);

	}

}
