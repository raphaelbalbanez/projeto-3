package br.edu.cesarschool.projetos.classroom.gui;


import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class ConnectStrateegia {

	protected Shell shlStratroom;
	private Text txtLinkClassroom;
	private Display display = Display.getDefault();

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ConnectStrateegia window = new ConnectStrateegia();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
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
	protected void createContents(){
		shlStratroom = new Shell();
		shlStratroom.setBackground(SWTResourceManager.getColor(255, 255, 255));
		shlStratroom.setSize(500, 280);
		shlStratroom.setText("Stratroom");
		shlStratroom.setLayout(null);
		
		Label imgLogoStrateegia = new Label(shlStratroom, SWT.NONE);
		imgLogoStrateegia.setBackground(SWTResourceManager.getColor(255, 255, 255));
		imgLogoStrateegia.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\logoStrateegia.png"));
		imgLogoStrateegia.setBounds(100, 51, 269, 78);
		
		txtLinkClassroom = new Text(shlStratroom, SWT.BORDER | SWT.WRAP);
		txtLinkClassroom.setBackground(SWTResourceManager.getColor(225, 225, 225));
		txtLinkClassroom.setForeground(SWTResourceManager.getColor(128, 128, 128));
		txtLinkClassroom.setText("https://classroom.google.com/c/NTQyNDU3NDgxMDM4/a/NjA3NDE5NDc3MzU2/details");
		txtLinkClassroom.setEditable(false);
		txtLinkClassroom.setBounds(68, 135, 312, 34);
		
		Button btnCopy = new Button(shlStratroom, SWT.NONE);
		btnCopy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String toCopy = txtLinkClassroom.getText();
				Clipboard clipboard = new Clipboard(display);
				TextTransfer txtTransfer = TextTransfer.getInstance();
				clipboard.setContents(new Object[] {toCopy}, new TextTransfer[] {txtTransfer});
				
				clipboard.dispose();
				shlStratroom.close();
				Loading load = new Loading();
				try {
					load.open();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnCopy.setImage(SWTResourceManager.getImage("C:\\Users\\RODRIGO\\eclipse-workspace\\projeto-3\\bin\\copy.png"));
		btnCopy.setBounds(386, 135, 75, 34);

	}
}
