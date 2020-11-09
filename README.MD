springboot 整个mybatis 。。。花了很长时间。application.yml 配置始终有问题。



mybatis:


    mybatis:
    mapper-locations: classpath:mappers/*.xml
    type-aliases-package: com.yangjie.entity

mybatis 必须定头写。我没有顶头写 前面有空格 导致。读取不到配置文件。一直报错

application.yml注意事项

1 不同等级用冒号隔开

2 次等级的前面是空格，不能使用制表符（tab）

3 冒号之后如果有值，那么冒号和值之间至少有一个空格（实际上紧贴着也不影响）

4 要么用application.properties，要么用application.yml，不要同时存在，否则的话yml中书写的时候，idea编辑器可能没有补全功能了

如果要把.XML文件放在src/main/java里面 必须在maven里面配置。

        <resources>
            <!-- mapper.xml文件在java目录下 -->
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource>
            <!-- mapper.xml文件在resources目录下-->
            <resource>
                <directory>src/main/resources</directory>
            </resource>
        </resources>

不然读取不到xml

        