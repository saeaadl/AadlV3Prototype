/*
 * generated by Xtext 2.16.0
 */
package org.osate.xtext.emv3.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.osate.aadlv3.aadlv3.Aadlv3Package;
import org.osate.aadlv3.aadlv3.PackageDeclaration;
import org.osate.xtext.emv3.emv3.Emv3Package;
import org.osate.xtext.emv3.emv3.Emv3Subclause;
import org.osate.xtext.emv3.emv3.ErrorPropagation;
import org.osate.xtext.emv3.emv3.ErrorType;
import org.osate.xtext.emv3.services.Emv3GrammarAccess;

@SuppressWarnings("all")
public class Emv3SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Emv3GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Aadlv3Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Aadlv3Package.PACKAGE_DECLARATION:
				sequence_PackageEMV3(context, (PackageDeclaration) semanticObject); 
				return; 
			}
		else if (epackage == Emv3Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Emv3Package.EMV3_SUBCLAUSE:
				sequence_Subclause(context, (Emv3Subclause) semanticObject); 
				return; 
			case Emv3Package.ERROR_PROPAGATION:
				sequence_ErrorPropagation(context, (ErrorPropagation) semanticObject); 
				return; 
			case Emv3Package.ERROR_TYPE:
				sequence_ErrorType(context, (ErrorType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ErrorPropagation returns ErrorPropagation
	 *
	 * Constraint:
	 *     (name=ID type=[ErrorType|ID])
	 */
	protected void sequence_ErrorPropagation(ISerializationContext context, ErrorPropagation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Emv3Package.Literals.ERROR_PROPAGATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Emv3Package.Literals.ERROR_PROPAGATION__NAME));
			if (transientValues.isValueTransient(semanticObject, Emv3Package.Literals.ERROR_PROPAGATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Emv3Package.Literals.ERROR_PROPAGATION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getErrorPropagationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getErrorPropagationAccess().getTypeErrorTypeIDTerminalRuleCall_2_0_1(), semanticObject.eGet(Emv3Package.Literals.ERROR_PROPAGATION__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ErrorType returns ErrorType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ErrorType(ISerializationContext context, ErrorType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Aadlv3Package.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getErrorTypeAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PackageEMV3 returns PackageDeclaration
	 *
	 * Constraint:
	 *     (name=QualifiedName (elements+=Subclause+ | elements+=ErrorType+))
	 */
	protected void sequence_PackageEMV3(ISerializationContext context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Subclause returns Emv3Subclause
	 *
	 * Constraint:
	 *     (name=ClassifierName emv3statement+=ErrorPropagation)
	 */
	protected void sequence_Subclause(ISerializationContext context, Emv3Subclause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
