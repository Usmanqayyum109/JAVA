import java.io.IOException;

import java.nio.file.DirectoryStream;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;

import java.util.Scanner;


public class FileAndDirectoryInfo
{
	public static void main(String[]args)
	{ 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter file or directory name: ");
		
		Path path = Paths.get(input.nextLine());
		
		if (Files.exists(path))
		{
			System.out.printf("%n%s exists%n",path.getFileName());
			
			System.out.printf("%s a directory %n",
				Files.isDirectory(path) ? "Is" : "Is not");
				
			System.out.printf("%s an absolute path%n",
				path.isAbsolute() ? "Is" : "Is not");
				
			try
			{			
				
			System.out.printf("Last modified: %s%n",
				Files.getLastModifiedTime(path));
			}
			catch (IOException e){
				System.out.print("error");
			}
			
			try
			{
			System.out.printf("Size: %s%n",Files.size(path));
			}
			catch (IOException e){
				System.out.print("error");
			}
			System.out.printf("Path: %s%n",path);
			
			System.out.printf("Absolute path: %s%n",path.toAbsolutePath());
			
			if (Files.isDirectory(path))
			{
				System.out.printf("%nDirectory contents:%n");
			try {	
				DirectoryStream<Path> directoryStream = 
					Files.newDirectoryStream(path);
				
				
				for (Path p : directoryStream)
					System.out.println(p);
				}
				catch (IOException e){
					System.out.print("error");
				}
			}
		}
		else
		{
			System.out.printf("%s does not exist%n",path);
		}
	}
}