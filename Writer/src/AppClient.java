
public class AppClient {
	public static void main(String[] args) {
		
		NovelWriter writerNew = new NovelWriter();
		writerNew.writeNovel(1);
		
		Writer oldSchool = new AdapterNovel(new SFNovelWriter());
		
		oldSchool.writeNovel(3);
		
	}
}
