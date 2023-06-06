package telas;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.wb.swt.SWTResourceManager;

public class tela_criar_kit2 {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			tela_criar_kit2 window = new tela_criar_kit2();
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
		
		Button btnVoltar = new Button(shell, SWT.NONE);
		btnVoltar.setBounds(10, 10, 94, 27);
		btnVoltar.setText("Voltar");
		
		Label lblCriarKit = new Label(shell, SWT.NONE);
		lblCriarKit.setBounds(31, 43, 59, 14);
		lblCriarKit.setText("Criar Kit");
		
		Button btnDois = new Button(shell, SWT.NONE);
		btnDois.setText("2");
		btnDois.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnDois.setEnabled(false);
		btnDois.setBounds(98, 99, 62, 43);
		
		Button btnCheck = new Button(shell, SWT.NONE);
		btnCheck.setText("✓");
		btnCheck.setEnabled(false);
		btnCheck.setBounds(10, 99, 62, 43);
		
		Button btnTres = new Button(shell, SWT.NONE);
		btnTres.setText("3");
		btnTres.setEnabled(false);
		btnTres.setBounds(185, 99, 62, 43);
		
		Label lblEscolhaACor = new Label(shell, SWT.NONE);
		lblEscolhaACor.setBounds(10, 187, 112, 14);
		lblEscolhaACor.setText("Escolha a cor do kit");
		
		Button btnSetaBaixo = new Button(shell, SWT.NONE);
		btnSetaBaixo.setText("↓");
		btnSetaBaixo.setBounds(454, 295, 40, 36);
		
		Button btnSetaCima = new Button(shell, SWT.NONE);
		btnSetaCima.setText("↑");
		btnSetaCima.setBounds(489, 295, 40, 36);
		
		Button btnRadioAzul = new Button(shell, SWT.RADIO);
		btnRadioAzul.setBounds(14, 241, 58, 18);
		btnRadioAzul.setText("Azul");
		
		Button btnRadioRoxo = new Button(shell, SWT.RADIO);
		btnRadioRoxo.setEnabled(false);
		btnRadioRoxo.setBounds(70, 241, 59, 18);
		btnRadioRoxo.setText("Roxo");
		
		Button btnRadioTurquesa = new Button(shell, SWT.RADIO);
		btnRadioTurquesa.setEnabled(false);
		btnRadioTurquesa.setText("Turquesa");
		btnRadioTurquesa.setBounds(134, 241, 77, 18);
		
		Button btnRadioMagenta = new Button(shell, SWT.RADIO);
		btnRadioMagenta.setEnabled(false);
		btnRadioMagenta.setText("Magenta");
		btnRadioMagenta.setBounds(300, 241, 77, 18);
		
		Button btnRadioLaranja = new Button(shell, SWT.RADIO);
		btnRadioLaranja.setEnabled(false);
		btnRadioLaranja.setText("Laranja");
		btnRadioLaranja.setBounds(217, 241, 77, 18);
		
		Button btnRadioRosa = new Button(shell, SWT.RADIO);
		btnRadioRosa.setEnabled(false);
		btnRadioRosa.setBounds(383, 241, 59, 18);
		btnRadioRosa.setText("Rosa");
		
		Button btnRadioAmarelo = new Button(shell, SWT.RADIO);
		btnRadioAmarelo.setEnabled(false);
		btnRadioAmarelo.setBounds(448, 241, 71, 18);
		btnRadioAmarelo.setText("Amarelo");
		
		btnVoltar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tela_divergencia divergencia = new tela_divergencia();
				shell.close();
				divergencia.open();
			}
		});
		
		btnSetaCima.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        if (btnRadioAzul.getSelection()) {
		            tela_criar_kit3 kit3 = new tela_criar_kit3();
		            shell.close();
		            kit3.open();
		        } else {
		            MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
		            messageBox.setMessage("Selecione a cor.");
		            messageBox.setText("Erro");
		            messageBox.open();
		        }
		    }
		});
		
		btnSetaBaixo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				tela_criar_kit1 kit1 = new tela_criar_kit1();
				shell.close();
				kit1.open();
			}
		});

		
	}
}
