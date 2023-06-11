package br.edu.cesarschool.projetos.classroom.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import br.edu.cesarschool.projetos.strateegia.gui.JornadaGUI;

public class Loading {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Loading window = new Loading();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() throws InterruptedException{
		Display display = Display.getDefault();
		createContents();
		shell.open();
		Thread.sleep(3000);
		JornadaGUI telaJornada = new JornadaGUI();
		shell.close();
		telaJornada.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	protected void createContents() {
		shell = new Shell();
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\img\\strateegia.png"));
		shell.setSize(475, 280);
		shell.setText("Stratroom");
		
		Label lblCarregandoStrateegia = new Label(shell, SWT.NONE);
		lblCarregandoStrateegia.setBounds(160, 144, 126, 15);
		lblCarregandoStrateegia.setText("Carregando Strateegia...");
	
		
		Label imgStrateegia = new Label(shell, SWT.NONE);
		imgStrateegia.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\img\\strateegia.png"));
		imgStrateegia.setBounds(199, 96, 39, 42);

		
	}
}
