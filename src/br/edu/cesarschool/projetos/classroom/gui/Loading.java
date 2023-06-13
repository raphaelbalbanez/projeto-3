package br.edu.cesarschool.projetos.classroom.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Monitor;
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
	public void open() throws InterruptedException {
	    Display display = Display.getDefault();
	    createContents();
	    
	    // Center the shell on the screen
	    Monitor primaryMonitor = display.getPrimaryMonitor();
	    Rectangle displayBounds = primaryMonitor.getBounds();
	    Rectangle shellBounds = shell.getBounds();
	    int x = (displayBounds.width - shellBounds.width) / 2;
	    int y = (displayBounds.height - shellBounds.height) / 2;
	    shell.setLocation(x, y);
	    
	    shell.open();
	    Thread.sleep(5000);
	    
	    JornadaGUI telaJornada = new JornadaGUI();
	    shell.close();
	    telaJornada.open();
	    shell.dispose(); // Closing the shell properly
	}

	protected void createContents() {
		shell = new Shell();
		shell.setTouchEnabled(true);
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\img\\strateegia.png"));
		shell.setSize(475, 280);
		shell.setText("Stratroom");

		Label lblCarregandoStrateegia = new Label(shell, SWT.NONE);
		lblCarregandoStrateegia.setBounds(160, 144, 126, 15);
		lblCarregandoStrateegia.setText("Carregando Strateegia...");

		Label imgStrateegia = new Label(shell, SWT.NONE);
		imgStrateegia.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\img\\strateegia.png"));
		imgStrateegia.setBounds(199, 96, 39, 42);

		shell.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				Display.getDefault().dispose();
			}
		});
	}
}
