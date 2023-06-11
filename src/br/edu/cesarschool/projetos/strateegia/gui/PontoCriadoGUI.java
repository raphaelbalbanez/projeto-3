package br.edu.cesarschool.projetos.strateegia.gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class PontoCriadoGUI {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PontoCriadoGUI window = new PontoCriadoGUI();
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
		shell.setSize(551, 363);
		shell.setText("Stratroom");
		
		Label lblMinhasJornadas = new Label(shell, SWT.NONE);
		lblMinhasJornadas.setText("Minhas Jornadas | Protótipo");
		lblMinhasJornadas.setBounds(10, 10, 164, 14);
		
		Button btnPontoAtvClass = new Button(shell, SWT.NONE);
		btnPontoAtvClass.setText("Atv Class");
		btnPontoAtvClass.setBounds(49, 44, 79, 58);
		
		Button btnPonto2 = new Button(shell, SWT.NONE);
		btnPonto2.setBounds(134, 44, 79, 58);
		
		Button btnPonto3 = new Button(shell, SWT.NONE);
		btnPonto3.setEnabled(false);
		btnPonto3.setBounds(219, 44, 79, 58);
		
		Button btnPonto4 = new Button(shell, SWT.NONE);
		btnPonto4.setBounds(95, 108, 79, 58);
		
		Button btnPonto5 = new Button(shell, SWT.NONE);
		btnPonto5.setEnabled(false);
		btnPonto5.setBounds(180, 108, 79, 58);
		
		Button btnPonto6 = new Button(shell, SWT.NONE);
		btnPonto6.setEnabled(false);
		btnPonto6.setBounds(267, 108, 79, 58);
		
		Button btnApplets = new Button(shell, SWT.NONE);
		btnApplets.setText("applets");
		btnApplets.setEnabled(false);
		btnApplets.setBounds(439, 236, 100, 26);
		
		Button btnLinkUteis = new Button(shell, SWT.NONE);
		btnLinkUteis.setText("links úteis");
		btnLinkUteis.setEnabled(false);
		btnLinkUteis.setBounds(439, 268, 100, 26);
		
		Button btnAnalises = new Button(shell, SWT.NONE);
		btnAnalises.setText("análises ");
		btnAnalises.setEnabled(false);
		btnAnalises.setBounds(439, 300, 100, 26);

	}

}
