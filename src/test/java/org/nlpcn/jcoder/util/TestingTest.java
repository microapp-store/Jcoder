package org.nlpcn.jcoder.util;

import org.junit.Test;
import org.nlpcn.jcoder.run.java.ApiTest;
import org.nutz.mvc.Mvcs;

public class TestingTest {

	@Test
	public void test() throws InterruptedException, Exception {
		Mvcs.getServletContext().getRealPath("/") ;
		Testing.startServer(null, new String[]{"cn.com.infcn"});
	}

}
