package org.osate.xtext.aadlv3.tests

import com.google.inject.Inject
import com.itemis.xtext.testing.XtextTest
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
import org.osate.av3instance.av3instance.ComponentInstance

import static extension org.junit.jupiter.api.Assertions.*
import static extension org.osate.aadlv3.util.AssertHelper.assertError
import com.itemis.xtext.testing.FluentIssueCollection
import org.osate.aadlv3.aadlv3.ComponentInterface
import org.junit.jupiter.api.DisplayName

@ExtendWith(InjectionExtension)
@InjectWith(AadlV3InjectorProvider)
@DisplayName("Verification Plan")
class testinstance extends XtextTest{
	@Inject
	TestHelper<PackageDeclaration> testHelper
	
	ComponentInstance root;

	@BeforeAll
	static def void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static def void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	def void setUp() throws Exception {
	}

	@AfterEach
	def void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Req 1")
	def void simpleinstancestest() {
		val pd = testHelper.parseFile("org.osate.xtext.aadlv3.tests/models/AV3Examples/simpleinstances.av3","org.osate.xtext.aadlv3.tests/models/AV3Examples/SimpleConfiguration.av3")
		val ws = pd.getElements().get(0) as Workingset
		root = new Instantiator().instantiateRoot(ws.getRootComponents().get(0));
		println("Instantiated "+root.getName());
		// all verification activities
		assertAll("Root ", 
			// VA 1
			[ assertEquals(root.getName(),"first")], 
			// VA 2
			[assertEquals(6,root.getComponents().size())]
		);
	}
	
	@Test
	def void basictest(){
		val testFileResult  = testHelper.testFile("org.osate.xtext.aadlv3.tests/models/AV3Examples/Basic.av3")
		issues = testFileResult
		val issueCollection = new FluentIssueCollection(testFileResult.resource, newArrayList, newArrayList)
		
		testFileResult.resource.contents.head as PackageDeclaration => [
			assertEquals(elements.size, 14)
			elements.get(9) as ComponentInterface => [
				assertError(testFileResult.issues, issueCollection, "Duplicate model element with name name")
				features.get(0) => [
					"name".assertEquals(name)
					assertError(testFileResult.issues, issueCollection, "Duplicate model element with name name")
				]
			]
			
		]
		issueCollection.sizeIs(2)
		assertConstraints(issueCollection)
		
	}
	
}