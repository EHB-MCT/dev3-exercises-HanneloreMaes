import java.sql.DriverManager
import java.util.*

fun  main(){
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()
    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword

    // Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                credentials.databaseHost +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

    println("Choose your Departure City: Brussel, Antwerpen-Centraal or Halle")
    val start= readLine()
    println("Choose your Destination: Asse, Genk or Leuven")
    val destination= readLine()
    val statement = connection.prepareStatement(
        "SELECT * FROM S6_trains INNER JOIN S6_rides ON S6_trains.id = S6_rides.train_id WHERE city_A=? AND city_B=? ORDER BY time_depart LIMIT 1 ")
    statement.setString(1, start)
    statement.setString(2, destination)
    // The result of your query will be a type ResultSet
    // This is a bit similar to collections in Kotlin
    // But since the library is based on Java, we get a type from Java
    val result = statement.executeQuery()
    while(result.next()) {
        val depart = result.getString("city_A")
        val dest = result.getString("city_B")
        val time = result.getString("time_depart")
        println(depart + " " + "to" + " "  + dest)
        println(time)
    }


}