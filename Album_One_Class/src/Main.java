
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Album bestGreek = new Album("Best Greek",1994,"MINOS-EMI", 10, 8.99);

		String[] songs = new String[12];
		String[] singers = new String[12];
		String[] composers = new String[12];
		int[] durations = new int[12];

		songs[0] = "Mera magiou mou misepses";
		songs[1] = "Synnefiasmeni Kyriaki";
		songs[2] = "Tou kato kosmou ta poulia";
		songs[3] = "An itane na s'arnitho";
		songs[4] = "H Nyxta";
		songs[5] = "Gia piase gyfto";
		songs[6] = "Tis agapis aimata";
		songs[7] = "A bord de l'Aspasia";
		songs[8] = "Panta Gelastoi";
		songs[9] = "Etsi ki alliws se perimenw";

		composers[0] = "Mikis Theodorakis";
		composers[1] = "Vasilis Tsitsanis";
		composers[2] = "Stavros Kougioumtzis";
		composers[3] = "Stavros Kougioumtzis";
		composers[4] = "Stavros Ksarxakos";
		composers[5] = "Apostolos Kaldaras";
		composers[6] = "Mikis Theodorakis";
		composers[7] = "Thanos Mikroutsikos";
		composers[8] = "Thanos Mikroutsikos";
		composers[9] = "Panos Katsimixas";

		singers[0] = "Grigoris Bithikotsis";
		singers[1] = "Stelios Kazantzidis";
		singers[2] = "Giorgos Dalaras";
		singers[3] = "Giorgos Dalaras";
		singers[4] = "Giorgos Dalaras";
		singers[5] = "Giorgos Dalaras";
		singers[6] = "Grigoris Bithikotsis";
		singers[7] = "Giorgos Dalaras";
		singers[8] = "Dimitris Mitropanos";
		singers[9] = "Giorgos Dalaras";
		
		durations[0] = 198;
		durations[1] = 260;
		durations[2] = 222;
		durations[3] = 216;
		durations[4] = 249;
		durations[5] = 240;
		durations[6] = 250;
		durations[7] = 193;
		durations[8] = 195;
		durations[9] = 226;
		
		bestGreek.addComposers(composers);
		bestGreek.addSingers(singers);
		bestGreek.addSongs(songs);
		bestGreek.addDurations(durations);
		
		bestGreek.printAlbumInfo();
		bestGreek.printSongList();
	}
}
