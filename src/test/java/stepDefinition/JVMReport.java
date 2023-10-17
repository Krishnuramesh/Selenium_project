package stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateDetailedReport(String jsonFileLoc) {
		File jvmportloc = new File(System.getProperty(("user.dir")+"src\\test\\resources\\Report"));
		Configuration con=new Configuration(jvmportloc,"Facebook");
		con.addClassifications("BrowserName","Chrome");
		con.addClassifications("Sprint","12");
		List<String>listofJsonFile = new ArrayList<String>();
		listofJsonFile.add(jsonFileLoc);
		ReportBuilder builder = new ReportBuilder(listofJsonFile,con);
		builder.generateReports();
	}

}
