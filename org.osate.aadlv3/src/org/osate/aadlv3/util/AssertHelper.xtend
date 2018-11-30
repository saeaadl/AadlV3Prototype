package org.osate.aadlv3.util

import com.google.inject.Inject
import com.itemis.xtext.testing.FluentIssueCollection
import java.util.Comparator
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.serializer.tokens.SerializerScopeProviderBinding
import org.eclipse.xtext.validation.Issue
import org.junit.ComparisonFailure

import static extension org.eclipse.emf.ecore.util.EcoreUtil.getURI
import static extension org.junit.Assert.assertEquals

class AssertHelper {
	@Inject
	IScopeProvider scopeProvider

	@Inject
	@SerializerScopeProviderBinding
	IScopeProvider serializerScopeProvider

	def static assertError(EObject eObject, List<Issue> allIssues, FluentIssueCollection issueCollection,
		String... expectedMessages) {
		assertIssue(eObject, allIssues, issueCollection, Severity.ERROR, expectedMessages)
	}

	def static assertWarning(EObject eObject, List<Issue> allIssues, FluentIssueCollection issueCollection,
		String... expectedMessages) {
		assertIssue(eObject, allIssues, issueCollection, Severity.WARNING, expectedMessages)
	}

	def protected static assertIssue(EObject eObject, List<Issue> allIssues, FluentIssueCollection issueCollection,
		Severity severity, String... expectedMessages) {
		val issuesForEObject = allIssues.filter[it.severity == severity && uriToProblem == eObject.URI]
		val messagesForEObject = issuesForEObject.map[message]
		if (messagesForEObject.toSet != expectedMessages.toSet) {
			throw new ComparisonFailure("", expectedMessages.join("\n"), messagesForEObject.join("\n"))
		}
		issuesForEObject.forEach[issueCollection.addIssue(it)]
	}

	def assertScope(EObject context, EReference reference, Iterable<String> expected) {
		assertScope(scopeProvider, context, reference, expected)
	}

	def assertSerializerScope(EObject context, EReference reference, Iterable<String> expected) {
		assertScope(serializerScopeProvider, context, reference, expected)
	}

	def private assertScope(IScopeProvider scopeProvider, EObject context, EReference reference,
		Iterable<String> expected) {
		val expectedNames = expected
		val actual = scopeProvider.getScope(context, reference).allElements
		val actualNames = actual.map[name.toString("::")]
		expectedNames.assertEquals(actualNames)
	}


}
