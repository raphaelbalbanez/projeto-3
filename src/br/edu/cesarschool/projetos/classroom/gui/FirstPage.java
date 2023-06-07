package br.edu.cesarschool.projetos.classroom.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

public class FirstPage {

	protected Shell shlStratroom;
	private Text txtProjetos;
	private Text txtMural;
	private Text txtAtividades;
	private Text txtPessoas;
	private Text txtNotas;
	private Label lblFoto;
	private Label lblGoogleAgenda;
	private Label lblSemAtividadesPor;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FirstPage window = new FirstPage();
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
		shlStratroom.open();
		shlStratroom.layout();
		while (!shlStratroom.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlStratroom = new Shell();
		shlStratroom.setBackground(SWTResourceManager.getColor(255, 255, 255));
		shlStratroom.setSize(560, 360);
		shlStratroom.setText("Stratroom");
		
		Button btnCriar = new Button(shlStratroom, SWT.NONE);
		btnCriar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Ativ atv = new Ativ();
				shlStratroom.close();
				atv.open();
			}
		});
		btnCriar.setBounds(38, 57, 75, 25);
		btnCriar.setText("+Criar");
		
		Label label = new Label(shlStratroom, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setForeground(SWTResourceManager.getColor(192, 192, 192));
		label.setBackground(SWTResourceManager.getColor(255, 255, 255));
		label.setBounds(0, 38, 544, 13);
		
		Label label_1 = new Label(shlStratroom, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setForeground(SWTResourceManager.getColor(192, 192, 192));
		label_1.setBackground(SWTResourceManager.getColor(255, 255, 255));
		label_1.setBounds(38, 88, 473, 13);
		
		txtProjetos = new Text(shlStratroom, SWT.NONE);
		txtProjetos.setBackground(SWTResourceManager.getColor(255, 255, 255));
		txtProjetos.setEditable(false);
		txtProjetos.setText("Projetos 3");
		txtProjetos.setBounds(10, 11, 76, 21);
		
		txtMural = new Text(shlStratroom, SWT.NONE);
		txtMural.setText("Mural");
		txtMural.setEditable(false);
		txtMural.setBackground(SWTResourceManager.getColor(255, 255, 255));
		txtMural.setBounds(127, 11, 37, 21);
		
		txtAtividades = new Text(shlStratroom, SWT.NONE);
		txtAtividades.setForeground(SWTResourceManager.getColor(0, 0, 255));
		txtAtividades.setText("Atividades");
		txtAtividades.setEditable(false);
		txtAtividades.setBackground(SWTResourceManager.getColor(255, 255, 255));
		txtAtividades.setBounds(186, 11, 61, 21);
		
		txtPessoas = new Text(shlStratroom, SWT.NONE);
		txtPessoas.setText("Pessoas");
		txtPessoas.setEditable(false);
		txtPessoas.setBackground(SWTResourceManager.getColor(255, 255, 255));
		txtPessoas.setBounds(260, 11, 47, 21);
		
		txtNotas = new Text(shlStratroom, SWT.NONE);
		txtNotas.setText("Notas");
		txtNotas.setEditable(false);
		txtNotas.setBackground(SWTResourceManager.getColor(255, 255, 255));
		txtNotas.setBounds(322, 11, 61, 21);
		
		Button btnGoogleAgenda = new Button(shlStratroom, SWT.CHECK);
		btnGoogleAgenda.setEnabled(false);
		btnGoogleAgenda.setBounds(322, 61, 13, 16);
		
		lblFoto = new Label(shlStratroom, SWT.NONE);
		lblFoto.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\classroom.png"));
		lblFoto.setBounds(48, 106, 447, 172);
		
		lblGoogleAgenda = new Label(shlStratroom, SWT.NONE);
		lblGoogleAgenda.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblGoogleAgenda.setBounds(341, 61, 82, 15);
		lblGoogleAgenda.setText("Google Agenda");
		
		lblSemAtividadesPor = new Label(shlStratroom, SWT.NONE);
		lblSemAtividadesPor.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblSemAtividadesPor.setBounds(199, 293, 160, 15);
		lblSemAtividadesPor.setText("Sem atividades por enquanto. ");

	}
}
