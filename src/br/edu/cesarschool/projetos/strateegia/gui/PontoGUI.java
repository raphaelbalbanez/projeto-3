package br.edu.cesarschool.projetos.strateegia.gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;

public class PontoGUI {

	protected Shell shell;
	//private Button btnPontoDeDivergencia;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PontoGUI window = new PontoGUI();
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
		
		Label lblAddPonto = new Label(shell, SWT.NONE);
		lblAddPonto.setBounds(206, 29, 144, 14);
		lblAddPonto.setText("Adicionar ponto ao mapa:");
		
		Button btnPontoDeDivergencia = new Button(shell, SWT.NONE);
		btnPontoDeDivergencia.setText("Ponto de divergência");
		btnPontoDeDivergencia.setBounds(196, 77, 166, 37);
		
		Button btnPontoDeConvergencia = new Button(shell, SWT.NONE);
		btnPontoDeConvergencia.setEnabled(false);
		btnPontoDeConvergencia.setText("Ponto de convergência");
		btnPontoDeConvergencia.setBounds(196, 167, 166, 37);
		
		Button btnPontoDeConversao = new Button(shell, SWT.NONE);
		btnPontoDeConversao.setEnabled(false);
		btnPontoDeConversao.setText("Ponto de conversão");
		btnPontoDeConversao.setBounds(196, 210, 166, 37);
		
		Button btnPontoDeAviso = new Button(shell, SWT.NONE);
		btnPontoDeAviso.setEnabled(false);
		btnPontoDeAviso.setText("Ponto de aviso");
		btnPontoDeAviso.setBounds(196, 253, 166, 37);
		
		Button btnPontoDePartida = new Button(shell, SWT.NONE);
		btnPontoDePartida.setEnabled(false);
		btnPontoDePartida.setText("Ponto de partida");
		btnPontoDePartida.setBounds(196, 124, 166, 37);
		
		btnPontoDeDivergencia.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DivergenciaGUI divergencia = new DivergenciaGUI();
				shell.close();
				divergencia.open();
			}
		});

	}

}
