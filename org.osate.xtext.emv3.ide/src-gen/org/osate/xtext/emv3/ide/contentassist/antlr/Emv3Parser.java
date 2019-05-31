/*
 * generated by Xtext 2.16.0
 */
package org.osate.xtext.emv3.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.osate.xtext.emv3.ide.contentassist.antlr.internal.InternalEmv3Parser;
import org.osate.xtext.emv3.services.Emv3GrammarAccess;

public class Emv3Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(Emv3GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, Emv3GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPackageEMV3Access().getAlternatives_3(), "rule__PackageEMV3__Alternatives_3");
			builder.put(grammarAccess.getPackageEMV3Access().getGroup(), "rule__PackageEMV3__Group__0");
			builder.put(grammarAccess.getErrorTypeAccess().getGroup(), "rule__ErrorType__Group__0");
			builder.put(grammarAccess.getSubclauseAccess().getGroup(), "rule__Subclause__Group__0");
			builder.put(grammarAccess.getErrorPropagationAccess().getGroup(), "rule__ErrorPropagation__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getClassifierNameAccess().getGroup(), "rule__ClassifierName__Group__0");
			builder.put(grammarAccess.getClassifierNameAccess().getGroup_1(), "rule__ClassifierName__Group_1__0");
			builder.put(grammarAccess.getPackageEMV3Access().getNameAssignment_1(), "rule__PackageEMV3__NameAssignment_1");
			builder.put(grammarAccess.getPackageEMV3Access().getElementsAssignment_3_0(), "rule__PackageEMV3__ElementsAssignment_3_0");
			builder.put(grammarAccess.getPackageEMV3Access().getElementsAssignment_3_1(), "rule__PackageEMV3__ElementsAssignment_3_1");
			builder.put(grammarAccess.getErrorTypeAccess().getNameAssignment_2(), "rule__ErrorType__NameAssignment_2");
			builder.put(grammarAccess.getSubclauseAccess().getNameAssignment_2(), "rule__Subclause__NameAssignment_2");
			builder.put(grammarAccess.getSubclauseAccess().getEmv3statementAssignment_4(), "rule__Subclause__Emv3statementAssignment_4");
			builder.put(grammarAccess.getErrorPropagationAccess().getNameAssignment_0(), "rule__ErrorPropagation__NameAssignment_0");
			builder.put(grammarAccess.getErrorPropagationAccess().getTypeAssignment_2(), "rule__ErrorPropagation__TypeAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private Emv3GrammarAccess grammarAccess;

	@Override
	protected InternalEmv3Parser createParser() {
		InternalEmv3Parser result = new InternalEmv3Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Emv3GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Emv3GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}