# Spring inAction 学习笔记

### 第一章 Spring之旅

##### 一、依赖注入：营救女孩骑士只可以营救女孩，但勇敢的骑士可以解决所有继承了Quest接口的问题。具体的问题不是由骑士决定而是由问题本身决定，实现了解耦。

##### 二、AOP应用切面：呤游诗人记录骑士的事迹，但不侵入Knight。

##### 三、使用模板消除样板式代码：例如JDBC。

### 第二章 装配Bean

##### 一、声明Bean： 
            <bean id="id" class="com.thomas.class"/>
##### 二、通过构造器注入：
            <bean id="id" class="com.thomas.calss">
                <constructor-arg value="value" />
            </bean>`
##### 三、通过构造器引用对象
            <bean id="id" class="com.thomas.calss">
                <constructor-arg value="value" />
                <constructor-arg ref="id1" />
             </bean>
             <bean id="id1" class="com.thomas.class1"/>
##### 四、通过工厂方法创建Bean
            <bean id="id" class="com.thomas.calss" factory-method="method" />
##### 五、Bean的作用域：所有Spring Bean默认都是单例。如果需要每次请求时都获得唯一的Bean实例时，配置Bean的scope属性设为prototype.
          |helloe        |定义                                                                                  
          |----------    |-----------------------------------------------------------------------------------
          |singleton     |在每一个Spring容器中，一个Bean定义只有一个对象实例                                      
          |prototype     |允许Bean的定义可以被实例化任意次（每次调用都创建一个实例）                               
          |request       |在一次HTTP请求中，每个Bean定义对应一个实例。该作用域仅在基于Web的Spring上下文中才有效     
          |session       |在一个HTTP Session中，每个Bean定义对应一个实例。该作用域仅在基于Web的Spring上下文中才有效
          |global-session|在一个全局HTTP Session中，每个Bean定义对应一个实例。该作用域仅在Portlet上下文中才有效   

##### 六、初始化和销毁Bean的三种方式：
1.<small>init-method和destroy-method属性</small>
2.<small>实现Spring的InitializingBean和DisposableBean接口</small>
3.<small>上下文中定义的很多Bean拥有相同的初始化方法和销毁方法，可以使用<beans>元素的default-init-method和default-destroy-method属性</small>

##### 七、注入Bean属性：<property>在许多方面都与<constructor-arg>类似，只不过一个通过构造参数来注入值，一个是通过调用属性的setter方法来注入值
+注入简单值：value可以是任意值，spring会自动判断并转换值类型

        <bean id="id" class = "com.thomas.calss">   
            <property name="name" value="value"/>
        </bean>
        
+引用其他Bean：面向接口编程与依赖注入轻松实现了松耦合
      
        <bean id="id" class = "com.thomas.class">
            <property name="name" value="value"/>
            <property name="name" ref="beanName"/>
        </bean>
        
+注入内部Bean（内部Bean仅适用于一次注入，而且不能被其他Bean所引用，所以没必要配置一个ID）
        
        //setter注入内部Bean
        <bean id="id" class = "com.thomas.calss">
            <property name="name" value="value" />
            <property name="name">
                <bean class = "com.thomas.class1" />
            </property>
        </bean>
        
        //构造参数注入内部Bean
        <bean id="duck" class="com.thomas.class">
            <constructor-arg value="15" />
            <constructor-arg>
                <bean class="com.thomas.class1"/>
            </constructor-arg>
        </bean>
        
+使用Spring的命名空间p装配属性：略

##### 八、装配集合

    <bean id="hank" class="com.spring.qualifiers.OneManBand">
            <property name="instruments">
                <list>
                    <ref bean="guitar" />
                    <ref bean="cymbal" />
                    <ref bean="harmonica" />
                </list>
            </property>
        </bean>
    
        <bean id="guitar" class="com.spring.qualifiers.instruments.Guitar"/>
        <bean id="cymbal" class="com.spring.qualifiers.instruments.Cymbal"/>
        <bean id="harmonica" class="com.spring.qualifiers.instruments.Harmonica"/>
        
如果Bean的属性类型为数组类型或java.util.Collection接口的任意实现，都可以使用<list>元素。如`java.util.list<Instruments> instruments;`或者`Instruments[] instruments;`。同样也可以使用<set>元素来装配集合类型或者数组类型的属性,如果使用<set>元素装配java.util.List类型的属性也是可以的，只要保证List中的每一个成员都是唯一的。

##### 装配Map集合：键值可以为任何值

    <map>
        <entry key="KEY" value="value" />
        <entry key-ref="Bean" value-ref="Bean" />
    </map
    
##### 装配Properties集合：键值都是String类型

    <props>
        <prop key="Str1">La La La</prop>
        <prop key="Str2">Fa Fa Fa</prop>
    </props>
    
##### 装配空值：确定一个Bean属性的最初值都是null

    <property name="someNonNullProperty"><null/></property>
    
##### 使用表达式装配（暂留）

### 第三章 最小化Spring XML配置
    