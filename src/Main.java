import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
Scanner sc = null;
try {
	sc = new Scanner(new File("sql/INIT.sql"));
} catch (FileNotFoundException e) {
	e.printStackTrace();
}
String query = "";
while(sc.hasNext()) {
	query += sc.nextLine();
}
String queryList [] = query.split(";");
for ( int i =0; i<queryList.length;i++) {
	System.out.println(queryList[i]);
}
	}
}

