package prob4;

public class SmartPhone extends MusicPhone {
	public void execute ( String function ) {
		if ( function.equals("음악") ) {
			playMusic();
			return;
		} else if (function.equals("앱")) {
			app();
			return;
		}
		super.execute( function );
	}

	private void playMusic(){
		System.out.println("다운로드해서 음악재생");
	}
	
	private void app() {
		System.out.println("앱 실행");
	}

}
