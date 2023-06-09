package br.edu.cesarschool.projetos.classroom.gui;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import br.edu.cesarschool.projetos.classroom.entidades.Conteudo;
import br.edu.cesarschool.projetos.mediators.ClassroomMediator;
import br.edu.cesarschool.projetos.mediators.CriadorMediator;

public class Ativ {

	protected Shell shlStratroom;
	private Text txtTitulo;
	private Text txtDescricao;
	private Label imgAtividade;
	private Label lblAnexar;
	private Button btnStrateegia;
	private Button btnDrive;
	private Button btnYoutube;
	private Button btnShare;
	private Button btnLink;
	private Label lblAtividade;
	private Label label;
	private CriadorMediator criadorMediator = CriadorMediator.getInstance();
	private ClassroomMediator classMediator = ClassroomMediator.getInstance();

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Ativ window = new Ativ();
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
		shlStratroom.setSize(1024, 668);
		shlStratroom.setText("Stratroom");
		
		txtTitulo = new Text(shlStratroom, SWT.BORDER | SWT.WRAP);
		txtTitulo.setBounds(44, 113, 388, 25);
		
		Label lblDescricao = new Label(shlStratroom, SWT.NONE);
		lblDescricao.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblDescricao.setBounds(44, 181, 55, 15);
		lblDescricao.setText("Descrição");
		
		Label lblTitulo = new Label(shlStratroom, SWT.NONE);
		lblTitulo.setText("Título");
		lblTitulo.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblTitulo.setBounds(45, 92, 55, 15);
		
		txtDescricao = new Text(shlStratroom, SWT.BORDER | SWT.WRAP);
		txtDescricao.setBounds(44, 202, 417, 125);
		
		imgAtividade = new Label(shlStratroom, SWT.NONE);
		imgAtividade.setBackground(SWTResourceManager.getColor(255, 255, 255));
		imgAtividade.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\atividadePNG.png"));
		imgAtividade.setBounds(40, 28, 42, 43);
		
		lblAnexar = new Label(shlStratroom, SWT.NONE);
		lblAnexar.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblAnexar.setBounds(44, 488, 55, 15);
		lblAnexar.setText("Anexar");
		
		btnStrateegia = new Button(shlStratroom, SWT.NONE);
		btnStrateegia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if(txtTitulo.getText() == null || txtTitulo.getText().strip() == "") {
					JOptionPane.showMessageDialog(null, "Insira um título para a atividade.");
				}
				else if(txtDescricao.getText() == null || txtDescricao.getText().strip() == "") {
					JOptionPane.showMessageDialog(null, "Insira uma descrição para a atividade.");
				}
				else{
					Conteudo conteudo = new Conteudo(txtDescricao.getText(), classMediator.getSalaDeAula());
					classMediator.adicionarAtividade(txtTitulo.getText(), LocalDateTime.now(), conteudo);
					ConnectStrateegia connector = new ConnectStrateegia();
					connector.open();
				}
			}
		});
		btnStrateegia.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\strateegia.png"));
		btnStrateegia.setBounds(103, 514, 64, 43);
		
		btnDrive = new Button(shlStratroom, SWT.NONE);
		btnDrive.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\drive.png"));
		btnDrive.setBounds(260, 514, 64, 43);
		
		btnYoutube = new Button(shlStratroom, SWT.NONE);
		btnYoutube.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\youtube.png"));
		btnYoutube.setBounds(433, 514, 64, 43);
		
		btnShare = new Button(shlStratroom, SWT.NONE);
		btnShare.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\share.png"));
		btnShare.setBounds(609, 514, 64, 43);
		
		btnLink = new Button(shlStratroom, SWT.NONE);
		btnLink.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\link.png"));
		btnLink.setBounds(784, 514, 64, 43);
		
		lblAtividade = new Label(shlStratroom, SWT.NONE);
		lblAtividade.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblAtividade.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		lblAtividade.setBounds(88, 28, 113, 37);
		lblAtividade.setText("Atividade");
		
		Button btnBack = new Button(shlStratroom, SWT.NONE);
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				FirstPage fp = new FirstPage();
				shlStratroom.close();
				fp.open();
			}
		});
		btnBack.setBounds(10, 23, 18, 25);
		btnBack.setText("X");
		
		label = new Label(shlStratroom, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setForeground(SWTResourceManager.getColor(192, 192, 192));
		label.setBackground(SWTResourceManager.getColor(255, 255, 255));
		label.setBounds(38, 466, 937, 13);

	}
}
