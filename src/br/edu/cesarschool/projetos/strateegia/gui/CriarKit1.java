package br.edu.cesarschool.projetos.strateegia.gui;

import java.net.MalformedURLException;
import java.net.URL;

//import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class CriarKit1 {

	protected Shell shell;
	private Text txtLink;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CriarKit1 window = new CriarKit1();
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
		
		Button btnVoltar = new Button(shell, SWT.NONE);
		btnVoltar.setBounds(10, 10, 94, 27);
		btnVoltar.setText("Voltar");
		
		Label lblCriarKit = new Label(shell, SWT.NONE);
		lblCriarKit.setBounds(32, 43, 52, 14);
		lblCriarKit.setText("Criar Kit");
		
		Button btnUm = new Button(shell, SWT.NONE);
		btnUm.setEnabled(false);
		btnUm.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnUm.setBounds(10, 100, 62, 43);
		btnUm.setText("1");
		
		Button btnDois = new Button(shell, SWT.NONE);
		btnDois.setEnabled(false);
		btnDois.setText("2");
		btnDois.setBounds(91, 100, 62, 43);
		
		Button btnTres = new Button(shell, SWT.NONE);
		btnTres.setEnabled(false);
		btnTres.setText("3");
		btnTres.setBounds(171, 100, 62, 43);
		
		Label lblLinkDoClassroom = new Label(shell, SWT.NONE);
		lblLinkDoClassroom.setBounds(10, 185, 150, 14);
		lblLinkDoClassroom.setText("Link do Classroom (URL)");
		
		Combo cmbAtividades = new Combo(shell, SWT.NONE);
		cmbAtividades.setEnabled(false);
		cmbAtividades.setBounds(171, 181, 94, 22);
		cmbAtividades.setText("Atividades");
		
		txtLink = new Text(shell, SWT.BORDER);
		txtLink.setBounds(10, 238, 521, 19);
		
		Button btnSetaBaixo = new Button(shell, SWT.NONE);
		btnSetaBaixo.setEnabled(false);
		btnSetaBaixo.setText("↓");
		btnSetaBaixo.setBounds(445, 281, 40, 36);
		
		Button btnSetaCima = new Button(shell, SWT.NONE);
		btnSetaCima.setText("↑");
		btnSetaCima.setBounds(481, 281, 40, 36);
		
		btnVoltar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DivergenciaGUI divergencia = new DivergenciaGUI();
				shell.close();
				divergencia.open();
			}
		});
		
		btnSetaCima.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String link = txtLink.getText();
		        if (isLinkValido(link)) {
		            CriarKit2 kit2 = new CriarKit2();
		            shell.close();
		            kit2.open();
		        }
		        else {
		        	MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
		            messageBox.setMessage("O link não é válido.");
		            messageBox.setText("Erro");
		            messageBox.open();
		        }
			}
		});

	}
	
	private boolean isLinkValido(String link) {
	    if (link.startsWith("http://") || link.startsWith("https://")) {
	        try {
	            new URL(link);
	            return true;
	        } catch (MalformedURLException e) {
	            return false;
	        }
	    } else {
	        return false;
	    }
	}

}