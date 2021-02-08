package com.example.demo;

import java.io.PrintStream;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;@SpringBootApplication



public class Application {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);
        System.out.println(studentRepository.getClass().getName());
		Student s=new Student();
		/*List<Student> list=Arrays.asList(
				new Student(106,"mahadevi","maha@gmail.com"),
				
				new Student(107,"kiran","kiran@gmail.com"),
				new Student(108,"chandu","chandu@gmail.com"),
				new Student(109,"madhu","madhu@gmail.com"));*/
	    // Iterable<Student> std=new Iterable<Student>();   
	     
		
		s.setId(117);
		s.setName("payal ");
		s.setEmail("payal@gmail.com");		
	studentRepository.save(s);
//		System.out.println(list);
//        System.out.println("Record Saved Successfully");
		/*java.util.Optional<Student> findById=studentRepository.findById(101);
		if(findById.isPresent())
		{
			System.out.println(findById.get());
		}*/
        
      /* Iterable<Student> findAll =studentRepository.findAll();
       findAll.forEach( s1->
        {
        	System.out.println(s1);
        });
        */
      /*  Iterable<Student>findAllById = studentRepository.findAllById(Arrays.asList(102,103,104));
        
        findAllById.forEach(s1 -> { 
        	System.out.println(s1);
        });*/
        
       // studentRepository.deleteById(101);
       // studentRepository.deleteAll();
       // studentRepository.count();
        //studentRepository.existsById(101);
        
        
        
        
        
		context.close();

	}

}
