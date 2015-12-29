# myclassloader
热加载操作封装
操作示例：

支持多个版本的共存模式：

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
	
	非多个版本共存模式：
	

		MyClassLoaderManager loader = MyClassLoaderManager.getInstance();
		loader.reloadJar("d:/pig.jar");
		Scanner s = new Scanner(System.in);
		while (true) {

			loader.invokeMethod("test.loader.Pig", "printName", null, null);
			System.out.println("等待输入:");
			String name = s.nextLine();
			if ("exit".equals(name)) {
				System.exit(0);
			} else if ("reload".equals(name)) {
				loader.reloadJar("d:/pig.jar");
			}

		}
	
