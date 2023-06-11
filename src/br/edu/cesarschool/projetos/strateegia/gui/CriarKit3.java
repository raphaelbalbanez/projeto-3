package br.edu.cesarschool.projetos.strateegia.gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;

public class CriarKit3 {

	protected Shell shell;
	private Text txtDescricao;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CriarKit3 window = new CriarKit3();
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
		
		Button btnVoltar = new Button(shell, SWT.NONE);
		btnVoltar.setText("Voltar");
		btnVoltar.setBounds(10, 10, 94, 27);
		
		Label lblCriarKit = new Label(shell, SWT.NONE);
		lblCriarKit.setText("Criar Kit");
		lblCriarKit.setBounds(30, 43, 59, 14);
		
		Button btnCheck = new Button(shell, SWT.NONE);
		btnCheck.setText("✓");
		btnCheck.setEnabled(false);
		btnCheck.setBounds(10, 99, 62, 43);
		
		Button btnCheck2 = new Button(shell, SWT.NONE);
		btnCheck2.setText("✓");
		btnCheck2.setEnabled(false);
		btnCheck2.setBounds(99, 99, 62, 43);
		
		Button btnTres = new Button(shell, SWT.NONE);
		btnTres.setText("3");
		btnTres.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnTres.setEnabled(false);
		btnTres.setBounds(185, 99, 62, 43);
		
		Label lblQualADescricao = new Label(shell, SWT.NONE);
		lblQualADescricao.setBounds(10, 191, 149, 14);
		lblQualADescricao.setText("Qual a descrição do kit?");
		
		txtDescricao = new Text(shell, SWT.BORDER);
		txtDescricao.setBounds(10, 218, 519, 58);
		
		Button btnSetaBaixo = new Button(shell, SWT.NONE);
		btnSetaBaixo.setText("↓");
		btnSetaBaixo.setBounds(307, 292, 40, 36);
		
		Button btnSalvar = new Button(shell, SWT.NONE);
		btnSalvar.setText("Salvar e adicionar a jornada");
		btnSalvar.setBounds(344, 292, 175, 36);
		
		
		btnVoltar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DivergenciaGUI divergencia = new DivergenciaGUI();
				shell.close();
				divergencia.open();
			}
		});
		
		btnSetaBaixo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CriarKit2 kit2 = new CriarKit2();
				shell.close();
				kit2.open();
			}
		});
		
		btnSalvar.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        String descricao = txtDescricao.getText();
		        if (!descricao.isEmpty() && descricao.length() <= 1000) {
		            PontoCriadoGUI pontoCriado = new PontoCriadoGUI();
		            shell.close();
		            pontoCriado.open();
		        } 
		        else {
		            MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
		            if (descricao.isEmpty()) {
		                messageBox.setMessage("A descrição está vazia.");
		            } 
		            else {
		                messageBox.setMessage("A descrição deve ter no máximo 1000 caracteres.");
		            }
		            messageBox.setText("Erro");
		            messageBox.open();
		        }
		    }
		});
	}

}
