package uk.co.gidley.projectView.components;

import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import uk.co.gidley.projectView.dao.Build;
import uk.co.gidley.projectView.dao.BuildExecution;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 17, 2010 Time: 7:35:21 AM
 */
public class BuildList {

	@Parameter
	private Build build;

	@Property
	private BuildExecution buildExecution;

	public Build getBuild() {
		return build;
	}

	public String getStatus() {
		if (build.getBuildExecutions().size() > 0) {
			if (build.getBuildExecutions().get(0).isPassed()) {
				return "Passed";
			} else {
				return "Failed";
			}
		} else {
			return "Not yet executed";
		}
	}
}
