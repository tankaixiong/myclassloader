package tank.test;

import java.util.Scanner;

import tank.classloader.ClassLoaderManager;

/**
 * @author tank
 * @date:2015年1月4日 下午4:35:03
 * @description:
 * @version :0.1
 */

public class TestClassManagerReloader {
	public static void main(String[] args) {

		ClassLoaderManager loader = ClassLoaderManager.getInstance();
		loader.reloadJar("d:/pig.jar");
		Scanner s = new Scanner(System.in);
		while (true) {

			loader.invokeMethod("pig.jar","test.loader.Pig", "printName", null, null);
			System.out.println("等待输入:");
			String name = s.nextLine();
			if ("exit".equals(name)) {
				System.exit(0);
			} else if ("reload".equals(name)) {
				loader.reloadJar("d:/pig.jar");
			}

		}
	}
}
