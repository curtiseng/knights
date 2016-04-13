# Spring inAction 学习笔记

### 第一章 Spring之旅

##### 一、依赖注入：营救女孩骑士只可以营救女孩，但勇敢的骑士可以解决所有继承了Quest接口的问题。具体的问题不是由骑士决定而是由问题本身决定，实现了解耦。

##### 二、AOP应用切面：呤游诗人记录骑士的事迹，但不侵入Knight。

##### 三、使用模板消除样板式代码：例如JDBC。

### 第二章 装配Bean

##### 一、声明Bean： 
            `<bean id="id" class="com.thomas.class"/>`
##### 二、通过构造器注入：
            `<bean id="id" class="com.thomas.calss">
                <constructor-arg value="value" />
             </bean>`
##### 三、通过构造器引用对象
            `<bean id="id" class="com.thomas.calss">
                <constructor-arg value="value" />
                <constructor-arg ref="id1" />
             </bean>
             <bean id="id1" class="com.thomas.class1"/>`
##### 四、通过工厂方法创建Bean
            `<bean id="id" class="com.thomas.calss" factory-method="method" />`
##### 五、Bean的作用域：所有Spring Bean默认都是单例。如果需要每次请求时都获得唯一的Bean实例时，配置Bean的scope属性设为prototype.
          |helloe    |定义                                                      |
          |----------|:--------------------------------------------------------:|
          |singleton |在每一个Spring容器中，一个Bean定义只有一个对象实例          |
          |prototype |允许Bean的定义可以被实例化任意次（每次调用都创建一个实例）   |
          |request   |在一次HTTP请求中，每个Bean定义对应一个实例。该作用域仅在基于Web的Spring上下文中才有效|
          |session   |在一个HTTP Session中，每个Bean定义对应一个实例。该作用域仅在基于Web的Spring上下文中才有效|
          |global-session|在一个全局HTTP Session中，每个Bean定义对应一个实例。该作用域仅在Portlet上下文中才有效|