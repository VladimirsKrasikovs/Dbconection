public class Dblogic {

    String url = "jdbc:mysql://localhost:3306/db2 ";
    String username = "root";
    String password = "0000";

    public void insert() {

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            String sql = "INSERT INTO users2 (email,name) VALUES ('baskin@ll.lv', 'Baskin')";

            stmt.executeUpdate(sql);

            System.out.println("Data is inserted");


        } catch (SQLException b) {
            b.printStackTrace();
        }
    }

    public void delete() {

        try {

            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            String sql = "DELETE FROM users2 WHERE idusers2 = 1";

            stmt.executeUpdate(sql);

            System.out.println("Data are deleted");


        } catch (SQLException b) {
            b.printStackTrace();
        }

    }

    public void update() {

        try {

            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            String sql = "UPDATE users2 SET email = 'rr@rr.lv' WHERE idusers2 = 2";

            stmt.executeUpdate(sql);

            System.out.println("Data is updated");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void select() {

        try {

            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT idusers2, email, name FROM users2");


            while(result.next()){
                System.out.println("idusers2: "+ result.getInt("idusers2"));
                System.out.println("email: "+ result.getString("email"));
                System.out.println("name: "+ result.getString("name"));;
                System.out.println("  ");


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
