package data;

import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class Swinger extends SwingWorker<Boolean,Integer> {
		private JLabel readyConfirm;
	
	public Swinger(JLabel readyConfirm) {
		this.readyConfirm = readyConfirm;
	}

	@Override
	protected Boolean doInBackground() throws Exception {
		
		for(int i=0;i<=10;i++) {
			Thread.sleep(1000);
			publish(i);
		}
		return false;
	}
	
	protected void done() {
		boolean status;
		try {
			status = get();
			readyConfirm.setText("Completed with status:" + status);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}
	
	protected void process(List<Integer> chunks) {
		int mostRecentValue = chunks.get(chunks.size()-1);
		readyConfirm.setText(Integer.toString(mostRecentValue));
	}
}
