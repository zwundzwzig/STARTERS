package college;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Directory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path currentDirectory = Paths.get(".");
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains("/");
		
		Files.list(currentDirectory).forEach(System.out::println);

		Files
			.walk(currentDirectory, 1)
			.filter(predicate)
			.forEach(System.out::println);
		
		BiPredicate<Path, BasicFileAttributes> pathMatcher 
			= (path, attributes) -> String.valueOf(path).contains("/");
			
		BiPredicate<Path, BasicFileAttributes> directoryMatcher 
		= (path, attributes) -> attributes.isDirectory();
			
		Files.find(currentDirectory, 4, pathMatcher ).forEach(System.out::println);
		Files.find(currentDirectory, 4, directoryMatcher ).forEach(System.out::println);
	}

}
