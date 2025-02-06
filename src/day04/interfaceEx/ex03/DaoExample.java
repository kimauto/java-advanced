package day04.interfaceEx.ex03;

public class DaoExample {

    public static void main(String[] args) {

        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }

    private static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
}
