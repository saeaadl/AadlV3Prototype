package org.osate.xtext.aadlv3.tests

import com.google.inject.Inject
import com.itemis.xtext.testing.XtextTest
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.osate.aadlv3.aadlv3.PackageDeclaration
import org.osate.aadlv3.aadlv3.Workingset
import org.osate.aadlv3.instantiation.Instantiator
import org.osate.aadlv3.util.TestHelper
import org.osate.aadlv3.util.TestResourceSetHelper
import org.osate.av3instance.av3instance.ComponentInstance

@ExtendWith(InjectionExtension)
@InjectWith(AadlV3InjectorProvider)
class testinstance extends XtextTest{
	@Inject
	TestHelper<PackageDeclaration> testHelper

	@Inject
	TestResourceSetHelper rsHelper;
	static ComponentInstance root;

	@BeforeAll
	def void setUpBeforeClass() throws Exception {
		val rset = rsHelper.getResourceSet();
		val wsURI = URI.createFileURI("C:/Users/phf/Desktop/WSES/AadlV3Prototype/org.osate.xtext.aadlv3.tests/models/simpleinstances.av3");
		val wsres = rset.getResource(wsURI, true);
		val pd =  wsres.getContents().get(0) as PackageDeclaration
		val ws = pd.getElements().get(0) as Workingset
		root = new Instantiator().instantiateRoot(ws.getRootComponents().get(0));
		println("Instantiated "+root.getName());
	}

	@AfterAll
	def void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	def void setUp() throws Exception {
	}

	@AfterEach
	def void tearDown() throws Exception {
	}

	@Test
	def void test() {
	}
	
}