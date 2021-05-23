import java.util.Random;


public class Album {

	private String title;
	private int year;
	private String producer;
	private int numOfSongs;
	private String[] songList;
	private String[] singerList;
	private String[] composerList;
	private int[] durationList; //in seconds.
	private double price;

	public Album(String title, int year, String producer, int numSongs, double price ) {
		this.title = title;
		this.year = year;
		this.producer = producer;
		this.numOfSongs = numSongs;
		this.price = price;
		songList = new String[numOfSongs];
		singerList = new String[numOfSongs];
		composerList = new String[numOfSongs];
		durationList = new int[numOfSongs];
	}
	
	public void addSongs(String[] songs) {
		songList = songs;
	}

	public void addSingers(String[] singers) {
		singerList = singers;
	}
	
	public void addComposers(String[] composers) {
		composerList = composers;
	}
	
	public void addDurations(int[] list) {
		durationList = list;
	}
	
	public void playSong(int index) {
		if(index < 0 || index > numOfSongs-1 )
			System.out.println("Wrong song index");
		else {
			String songToPlay = songList[index];
			System.out.println("Playing track "+index+" : "+songToPlay);
		}
	}

	public void playAllSongs() {
		for(int i=0; i < numOfSongs; i++) {
			String songToPlay = songList[i];
			System.out.println("Playing track "+i+" : "+songToPlay);
		}
	}

	public void playSongsShuffle() {
		Random randomGenerator = new Random();
		int index = randomGenerator.nextInt(numOfSongs);
		String songToPlay = songList[index];
		System.out.println("Playing track "+index+" : "+songToPlay);
	}

	public void printSongList() {
		for(int i=0; i < numOfSongs; i++) {
			System.out.format("%1$2d : %2$-30s, %3$-20s , Composer: %4$-20s , %5$5s sec\n",i,songList[i],singerList[i],composerList[i],durationList[i]);
		}
	}
	
	public String getDuration(){
		int totalDuration = 0;
		for(int i=0; i < numOfSongs; i++) {
			totalDuration += durationList[i];
		}
		int min = totalDuration / 60;
		int sec = totalDuration % 60;
		return min+":"+sec;
	}
	
	public void printAlbumInfo() {
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Album title : "+title+" , a production of "+producer+" , "+year+" , Dur: "+getDuration()+" , Price: "+price+" euros");
		System.out.println("----------------------------------------------------------------------------------------------");
	}
}
