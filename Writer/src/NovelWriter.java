
public class NovelWriter implements Writer {

	@Override
	public void writeNovel(int type) {
		switch (type) {
		case 1:
			System.out.println("Historic novel...");
			break;
		case 2:
			System.out.println("Romantc novel...");
			break;
		case 3:
			System.out.println("Thriller nove...");
			break;
		default:
			System.out.println("Unknown novel type...");
			break;

		}
	}
}
