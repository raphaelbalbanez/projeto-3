package br.edu.cesarschool.projetos.strateegia.gui;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class tela_jornada {

	protected Shell shell;
	//private Button btnJornada1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			tela_jornada window = new tela_jornada();
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
		shell.setText("SWT Application");
		
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
		btnApplets.setEnabled(false);
		btnApplets.setBounds(438, 229, 100, 26);
		btnApplets.setText("applets");
		
		Button btnLinkUteis = new Button(shell, SWT.NONE);
		btnLinkUteis.setEnabled(false);
		btnLinkUteis.setText("links úteis");
		btnLinkUteis.setBounds(438, 261, 100, 26);
		
		Button btnAnalises = new Button(shell, SWT.NONE);
		btnAnalises.setEnabled(false);
		btnAnalises.setText("análises ");
		btnAnalises.setBounds(438, 293, 100, 26);
		
		btnPonto1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tela_ponto ponto = new tela_ponto();
				shell.close();
				ponto.open();
			}
		});
	}
}
