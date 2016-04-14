
public class Interface05 {

	public static void doWork(DataAccessObject d){
		d.select();
		d.insert();
		d.update();
		d.delete();
	}
	public static void main(String[] args) {
		doWork(new OracleDao());
		doWork(new MysqlDao());
	}

}
