
public class AdapterNovel implements Writer {
	
	SFNovelWriter adapterWriter;
	
	public AdapterNovel(SFNovelWriter adapterWriter) {
		// TODO Auto-generated constructor stub
		this.adapterWriter=adapterWriter;
		
	}
	
	@Override
	public void writeNovel(int type) {
		// TODO Auto-generated method stub
		
		adapterWriter.writeSFNovel();

	}

}
