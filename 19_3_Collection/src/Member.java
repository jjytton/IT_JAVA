
public class Member {
	private String id;
	private String name;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+": "+name;
	}
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
