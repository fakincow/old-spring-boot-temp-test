package r.sh.task2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*InMemCache&lt;K,V&gt;
		Need to build a class InMemCache&lt;K,V&gt; which will manage in-memory cache
		● All cache is in memory
		● No need for persistence
		● Single-Thread component
		● Can use any Java/C# object to implement InMemCache

		Public methods
		1. Set (K key , V value)
		2. V Get(K key)
		3. SetAll (V value)

		Example of code
		1. Set (1 , “one”)
		2. Set (2 , “two”)
		3. Get(1) =&gt; “one”
		4. Get(3) =&gt; Null
		5. SetAll (“all”)
		6. get(1) =&gt; “all”
		7. Set (1, “one”)
		8. Get (1) =&gt; “one”
		9. Get(2) =&gt; “all”
		10. Get(3) =&gt; “all”
///Get(3) =&gt; ? all / Exception*/
@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {
		SpringApplication.run(Task2Application.class, args);
		MemCache inMem = new MemCache();
		inMem.Set(1 ,"one");
		inMem.Get(1 );
		inMem.Get(1);// =&gt; “one”
		inMem.Get(3);// =&gt; Null
		inMem.SetAll("all");
		inMem.Get(2);
		inMem.Get(1);// =&gt; “all”
		inMem.Set (1,"one");
		inMem.Get (1);// =&gt; “one”
		inMem.Get(2);// =&gt; “all”
		inMem.Get(3);// =&gt; “all”
	}

}
