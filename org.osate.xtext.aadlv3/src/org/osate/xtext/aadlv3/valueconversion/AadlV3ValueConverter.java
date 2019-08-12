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
import org.osate.aadlv3.aadlv3.Composite;
import org.osate.aadlv3.aadlv3.Primitive;
import org.osate.aadlv3.aadlv3.LOperator;
import org.osate.aadlv3.aadlv3.EOperator;


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


	@ValueConverter(rule = "Composite")
	public IValueConverter<Composite> Composite() {
		return new IValueConverter<Composite>() {
			@Override
			public Composite toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return Composite.get(string);
			}

			@Override
			public String toString(Composite value) {
				return value.getName();
			}
		};
	}

	@ValueConverter(rule = "Primitive")
	public IValueConverter<Primitive> Primitive() {
		return new IValueConverter<Primitive>() {
			@Override
			public Primitive toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return Primitive.get(string);
			}

			@Override
			public String toString(Primitive value) {
				return value.getName();
			}
		};
	}

	@ValueConverter(rule = "LOperator")
	public IValueConverter<LOperator> LOperator() {
		return new IValueConverter<LOperator>() {
			@Override
			public LOperator toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return LOperator.get(string);
			}

			@Override
			public String toString(LOperator value) {
				return value.getName();
			}
		};
	}

	@ValueConverter(rule = "EOperator")
	public IValueConverter<EOperator> EOperator() {
		return new IValueConverter<EOperator>() {
			@Override
			public EOperator toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return EOperator.get(string);
			}

			@Override
			public String toString(EOperator value) {
				return value.getName();
			}
		};
	}
	@ValueConverter(rule = "NoQuoteString")
	public IValueConverter<String> NoQuoteString() {
		return new IValueConverter<String>() {
			@Override
			public String toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				if (string.charAt(0) == '"') {
					string = string.substring(1);
				}
				if (string.endsWith("\"")) {
					string = string.substring(0, string.length() - 1);
				}
				return string;
			}

			@Override
			public String toString(String value) {
				if (!value.isEmpty() && value.charAt(0) == '"') {
					return value;
				}
				return '"' + value + '"';
			}
		};
	}
	
}
