//Program to demonstrate user defined generic class
package DayFifteen.generics;
//Generic Class
public class GenericClass<T> {
	T data;
	void set(T data)
	{
		this.data=data;
	}
	
	T get()
	{
		return data;
	}

}
