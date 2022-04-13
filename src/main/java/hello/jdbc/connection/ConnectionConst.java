package hello.jdbc.connection;

// 상수로 만들거기 때문에 객체 생성 못하도록 abstract로 막아둠
public abstract class ConnectionConst {
    public static final String URL = "jdbc:h2:tcp://localhost/~/test";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "";
}
