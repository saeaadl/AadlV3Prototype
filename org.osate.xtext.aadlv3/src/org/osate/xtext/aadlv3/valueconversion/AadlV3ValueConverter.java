package org.osate.xtext.aadlv3.valueconversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.osate.aadlv3.aadlv3.ComponentCategory;
import org.osate.aadlv3.aadlv3.FeatureCategory;
import org.osate.aadlv3.aadlv3.FeatureDirection;
import org.osate.aadlv3.aadlv3.AssociationType;
import org.osate.aadlv3.aadlv3.PropertyAssociationType;

public class AadlV3ValueConverter extends DefaultTerminalConverters {

	@ValueConverter(rule = "ComponentCategory")
	public IValueConverter<ComponentCategory> ComponentCategory() {
		return new IValueConverter<ComponentCategory>() {
			@Override
			public ComponentCategory toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return ComponentCategory.get(string);
			}

			@Override
			public String toString(ComponentCategory value) {
				return value.getName();
			}
		};
	}
	
	@ValueConverter(rule = "FeatureCategory")
	public IValueConverter<FeatureCategory> FeatureCategory() {
		return new IValueConverter<FeatureCategory>() {
			@Override
			public FeatureCategory toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return FeatureCategory.get(string);
			}

			@Override
			public String toString(FeatureCategory value) {
				return value.getName();
			}
		};
	}
	
	@ValueConverter(rule = "FeatureDirection")
	public IValueConverter<FeatureDirection> FeatureDirection() {
		return new IValueConverter<FeatureDirection>() {
			@Override
			public FeatureDirection toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return FeatureDirection.get(string);
			}

			@Override
			public String toString(FeatureDirection value) {
				return value.getName();
			}
		};
	}
	
	@ValueConverter(rule = "PropagationDirection")
	public IValueConverter<FeatureDirection> PropagationDirection() {
		return new IValueConverter<FeatureDirection>() {
			@Override
			public FeatureDirection toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return FeatureDirection.get(string);
			}

			@Override
			public String toString(FeatureDirection value) {
				return value.getName();
			}
		};
	}


	@ValueConverter(rule = "IsFlowSource")
	public IValueConverter<AssociationType> IsFlowSource() {
		return new IValueConverter<AssociationType>() {
			@Override
			public AssociationType toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return AssociationType.FLOWSOURCE;
			}

			@Override
			public String toString(AssociationType value) {
				return "source";
			}
		};
	}


	@ValueConverter(rule = "IsFlowSink")
	public IValueConverter<AssociationType> IsFlowSink() {
		return new IValueConverter<AssociationType>() {
			@Override
			public AssociationType toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return AssociationType.FLOWSINK;
			}

			@Override
			public String toString(AssociationType value) {
				return "sink";
			}
		};
	}

	@ValueConverter(rule = "IsFlow")
	public IValueConverter<AssociationType> IsFlow() {
		return new IValueConverter<AssociationType>() {
			@Override
			public AssociationType toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return AssociationType.FLOW;
			}

			@Override
			public String toString(AssociationType value) {
				return "flow";
			}
		};
	}

	@ValueConverter(rule = "PropertyAssociationType")
	public IValueConverter<PropertyAssociationType> PropertyAssociationType() {
		return new IValueConverter<PropertyAssociationType>() {
			@Override
			public PropertyAssociationType toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				if (string.equals("=")) return PropertyAssociationType.FINAL_VALUE;
				if (string.equals("=>")) return PropertyAssociationType.VARIABLE_VALUE;
				return PropertyAssociationType.DEFAULT_VALUE;
			}

			@Override
			public String toString(PropertyAssociationType value) {
				if (value == PropertyAssociationType.FINAL_VALUE) return "=";
				if (value == PropertyAssociationType.VARIABLE_VALUE) return "=>";
				return "*=>";
			}
		};
	}

	
}
