package day37_interface;
//abstract class
/**
 * 接口只有抽象方法，他比抽象类还要抽象，接口是彻底的抽象；
 * 接口是抽象方法和常量的属性集合；
 * 接口中只能包含抽象方法和常量，不能有变量、初始化快、构造器；
 * 接口的修饰符只有两种：默认和public
 * 接口内的变量会被设置成共有的、静态的和最终的字段；
 * 
 * @author tc
 *
 */
public interface Test {
	int i=1; //相当于public static final i=1;
	
}
