package DockerDemo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetupDockerGrid {
	

	@BeforeTest
	public void startdocker() throws IOException, InterruptedException{
		
	Runtime.getRuntime().exec("cmd /c start start_docker.bat");
	Thread.sleep(20000);
		
	}
	
	
		@AfterTest
		public void stopdocker() throws IOException, InterruptedException{
			
		Runtime.getRuntime().exec("cmd /c start stop_docker.bat");
		Thread.sleep(15000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");// to close prompt	(command prompt)
		}	

}
