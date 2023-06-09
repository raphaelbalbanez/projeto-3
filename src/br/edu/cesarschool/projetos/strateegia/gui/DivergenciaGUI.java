package br.edu.cesarschool.projetos.strateegia.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

public class DivergenciaGUI {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DivergenciaGUI window = new DivergenciaGUI();
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
	    
	    // Center the shell on the screen
	    Monitor primaryMonitor = display.getPrimaryMonitor();
	    Rectangle displayBounds = primaryMonitor.getBounds();
	    Rectangle shellBounds = shell.getBounds();
	    int x = (displayBounds.width - shellBounds.width) / 2;
	    int y = (displayBounds.height - shellBounds.height) / 2;
	    shell.setLocation(x, y);
	    
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
		shell.setSize(560, 360);
		shell.setText("Stratroom");
		
		Label lblPontosDeDivergencias = new Label(shell, SWT.NONE);
		lblPontosDeDivergencias.setBounds(24, 20, 134, 18);
		lblPontosDeDivergencias.setText("Pontos de divergências");
		
		Combo cmbCores = new Combo(shell, SWT.NONE);
		cmbCores.setEnabled(false);
		cmbCores.setBounds(291, 44, 108, 22);
		cmbCores.setText("todas as cores");
		
		Combo cmbOrdem = new Combo(shell, SWT.NONE);
		cmbOrdem.setEnabled(false);
		cmbOrdem.setBounds(414, 44, 108, 22);
		cmbOrdem.setText("mais recentes");
		
		Label lblFiltrarPorCor = new Label(shell, SWT.NONE);
		lblFiltrarPorCor.setBounds(291, 24, 83, 14);
		lblFiltrarPorCor.setText("filtrar por cor");
		
		Label lblOrdenarPor = new Label(shell, SWT.NONE);
		lblOrdenarPor.setBounds(414, 24, 74, 14);
		lblOrdenarPor.setText("ordenar por");
		
		Label lblMeusKits = new Label(shell, SWT.NONE);
		lblMeusKits.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblMeusKits.setBounds(24, 116, 66, 14);
		lblMeusKits.setText("MEUS KITS");
		
		Label lblKitsStrateegia = new Label(shell, SWT.NONE);
		lblKitsStrateegia.setBounds(99, 116, 108, 14);
		lblKitsStrateegia.setText("KITS STRATEEGIA");
		
		Label lblKitsComunidade = new Label(shell, SWT.NONE);
		lblKitsComunidade.setBounds(212, 116, 119, 14);
		lblKitsComunidade.setText("KITS COMUNIDADE");
		
		Button btnCriarKitBranco = new Button(shell, SWT.NONE);
		btnCriarKitBranco.setEnabled(false);
		btnCriarKitBranco.setBounds(24, 246, 94, 27);
		btnCriarKitBranco.setText("+ criar kit");
		
		Button btnCriarKitClass = new Button(shell, SWT.NONE);
		btnCriarKitClass.setText("+ criar kit");
		btnCriarKitClass.setBounds(226, 246, 94, 27);
		
		Label lblEmBranco = new Label(shell, SWT.NONE);
		lblEmBranco.setBounds(39, 211, 66, 14);
		lblEmBranco.setText("em branco");
		
		Label lblClassroom = new Label(shell, SWT.NONE);
		lblClassroom.setBounds(244, 211, 59, 14);
		lblClassroom.setText("classroom");
		
		btnCriarKitClass.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CriarKit1 kit1 = new CriarKit1();
				shell.close();
				kit1.open();
			}
		});

	}
}
