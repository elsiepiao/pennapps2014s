package pennapps.scavangel;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class Activity_Form extends MainActivity {
	
	String username;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form);
		Intent intent = getIntent();
		username = intent.getExtras().getString("username");

	}

	public void onCreateButtonClick(View v){
		Intent i = new Intent(this, Create_Hunt.class);
		i.putExtra("username", username);
		startActivityForResult(i, 1);
	}
	
	public void onParticipateButtonClick(View v){
		Intent i = new Intent(this, Join_Hunt.class);
		startActivityForResult(i,  2);
	}
}
