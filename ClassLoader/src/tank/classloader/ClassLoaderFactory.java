package tank.classloader;

import tank.api.IClassLoader;

/**
 * @author tank
 * @date:2015年1月20日 下午12:08:15
 * @description:
 * @version :0.1
 */

public class ClassLoaderFactory {

	public static IClassLoader createClassLoaer(Class cs,String jarPath) {
		if (cs == CustomerJarUrlLoader.class) {
			return new CustomerJarUrlLoader(jarPath);
		}
		return null;
	}

}
