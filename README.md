# MyFirstSpringMvcWeb

*version:1.1*

*lastUpdateDate:2016/11/14*



	项目是springmvc最简单的搭建,使用maven+springmvc+jackson+jetty

##运行

	1.jetty运行项目:mvn clean -Djetty.port=8080 jetty:run
	2.请求例子:http://localhost:8080/myfirstspringmvcweb/area/getProvince

##更新细节
	
	2016/11/14更新如下:
	1.修复maven部署项目时中文乱码的情况
	2.部署项目命令,增加clean:清空target的缓存
	
	2016/11/11更新如下:
	1.创建最基础的springmvc项目,实现最基本的请求，使用前后分离技术(使用jackson返回json数据)
	2.使用git版本管理器,使用*.gitignore*使用忽略不提交的文件
	2.增加请求返回结果码(code)和信息(message),并把数据封装到data字段内

	