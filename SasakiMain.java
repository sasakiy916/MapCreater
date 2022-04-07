import java.util.*;
public class SasakiMain{
	public static void main(String[] args){
		System.out.print("幅>>");
		int width = new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int height = new Scanner(System.in).nextInt();
		final char[] MAPS = {'森','草','岩','水'};
		char[][] mapCreates = new char[height][width];
		for(int i=0;i<mapCreates.length;i++){
			for(int j=0;j<mapCreates[i].length;j++){
				int random = new Random().nextInt(MAPS.length);
				mapCreates[i][j] = MAPS[random];
				System.out.print(mapCreates[i][j]);
			}
			System.out.println();
		}
	}
}
