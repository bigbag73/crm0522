package chapter05;

public class runtime {
	public static void main (String[] args) {
Process process = Runtime.getRuntime().exec("Word.exe");
process.waitfor( );
}
}