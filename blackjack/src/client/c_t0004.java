package client;

import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import data.toss;
import client.client;

public class c_t0004 {

	public toss c_t0004_send(
			toss toss, JPanel contentPane, 
			JTextField tf_connsetting_svip, JTextField tf_connsetting_svpt, 
			JTextField tf_connsetting_dbpt, JTextField tf_connsetting_dbip, 
			JTextField tf_connsetting_dbpt2, JTextField tf_connsetting_dbsid, 
			JTextField tf_connsetting_dbsname, JTextField tf_connsetting_dbid, JTextField pf_connsetting_dbpw)
	{	
		toss.setSvIP				(tf_connsetting_svip.getText());
		toss.setSvPT				(tf_connsetting_svpt.getText());
		toss.setDbIP			(tf_connsetting_dbip.getText());
		toss.setDbPT			(tf_connsetting_dbpt.getText());
		toss.setDbSID			(tf_connsetting_dbsid.getText());
		toss.setDbSNAME		(tf_connsetting_dbsname.getText());
		toss.setDbID			(tf_connsetting_dbid.getText());
		toss.setDbPW			(pf_connsetting_dbpw.getText());
		
		JOptionPane.showMessageDialog(contentPane, "설정이 저장되었습니다.", "BLACKJACK", JOptionPane.INFORMATION_MESSAGE);
		
		tf_connsetting_svip			.setText("");
		tf_connsetting_svpt			.setText("");
		tf_connsetting_dbip			.setText("");
		tf_connsetting_dbpt			.setText("");
		tf_connsetting_dbsid			.setText("");
		tf_connsetting_dbsname	.setText("");
		tf_connsetting_dbid			.setText("");
		pf_connsetting_dbpw		.setText("");
		
		return toss;
	}
}
