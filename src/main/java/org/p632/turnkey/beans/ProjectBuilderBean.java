package org.p632.turnkey.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * Test bean class
 *
 */
@Component
public class ProjectBuilderBean {

	
	public List<String> GetDependencyList()
	{
		List<String> depList = new ArrayList<String>();
		depList.add("sprin-core-3.2.2");
		depList.add("spring-webmvc-4.2.1");
		depList.add("spring-test-4.0.1");
		depList.add("junit-4.1");
		return depList;
	}
}
