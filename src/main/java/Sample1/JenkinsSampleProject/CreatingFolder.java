package Sample1.JenkinsSampleProject;

import java.io.File;

import org.testng.annotations.Test;

public class CreatingFolder
{
	@Test
	public void folder()
	{
		File file = new File("C:\\Users\\LENOVO\\Desktop\\TestJenkinss_2");
		file.mkdir();
		File file2 = new File("C:\\Users\\LENOVO\\Desktop\\TestJenkinss_1");
		file2.mkdir();
	}
}
