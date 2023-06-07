package br.edu.cesarschool.projetos.classroom.gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Ativ {

	protected Shell shlStratroom;
	private Text text;
	private Text text_1;
	private Label imgAtividade;
	private Label lblAnexar;
	private Button btnStrateegia;
	private Button btnDrive;
	private Button btnYoutube;
	private Button btnShare;
	private Button btnLink;
	private Label lblAtividade;

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
		shlStratroom.setSize(560, 360);
		shlStratroom.setText("Stratroom");
		
		text = new Text(shlStratroom, SWT.BORDER | SWT.WRAP);
		text.setBounds(44, 80, 378, 21);
		
		Label lblDescricao = new Label(shlStratroom, SWT.NONE);
		lblDescricao.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblDescricao.setBounds(44, 120, 55, 15);
		lblDescricao.setText("Descrição");
		
		Label lblTitulo = new Label(shlStratroom, SWT.NONE);
		lblTitulo.setText("Título");
		lblTitulo.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblTitulo.setBounds(45, 59, 55, 15);
		
		text_1 = new Text(shlStratroom, SWT.BORDER | SWT.WRAP);
		text_1.setBounds(44, 141, 378, 61);
		
		imgAtividade = new Label(shlStratroom, SWT.NONE);
		imgAtividade.setBackground(SWTResourceManager.getColor(255, 255, 255));
		imgAtividade.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\atividadePNG.png"));
		imgAtividade.setBounds(40, 10, 42, 43);
		
		lblAnexar = new Label(shlStratroom, SWT.NONE);
		lblAnexar.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblAnexar.setBounds(44, 221, 55, 15);
		lblAnexar.setText("Anexar");
		
		btnStrateegia = new Button(shlStratroom, SWT.NONE);
		btnStrateegia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				ConnectStrateegia connector = new ConnectStrateegia();
				connector.open();
			}
		});
		btnStrateegia.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\strateegia.png"));
		btnStrateegia.setBounds(69, 252, 64, 43);
		
		btnDrive = new Button(shlStratroom, SWT.NONE);
		btnDrive.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\drive.png"));
		btnDrive.setBounds(149, 252, 64, 43);
		
		btnYoutube = new Button(shlStratroom, SWT.NONE);
		btnYoutube.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\youtube.png"));
		btnYoutube.setBounds(236, 252, 64, 43);
		
		btnShare = new Button(shlStratroom, SWT.NONE);
		btnShare.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\share.png"));
		btnShare.setBounds(322, 252, 64, 43);
		
		btnLink = new Button(shlStratroom, SWT.NONE);
		btnLink.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\link.png"));
		btnLink.setBounds(419, 252, 64, 43);
		
		lblAtividade = new Label(shlStratroom, SWT.NONE);
		lblAtividade.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblAtividade.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		lblAtividade.setBounds(88, 10, 113, 37);
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
		btnBack.setBounds(10, 5, 18, 25);
		btnBack.setText("X");

	}
}
