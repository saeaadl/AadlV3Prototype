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
				if (string.equals("access")) return FeatureCategory.DATAACCESS;
				if (string.equals("binding")) return FeatureCategory.BINDINGPOINT;
				return FeatureCategory.get(string);
			}

			@Override
			public String toString(FeatureCategory value) {
				if (value == FeatureCategory.DATAACCESS) return "access";
				if (value == FeatureCategory.BINDINGPOINT) return "binding";
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
//
//	@ValueConverter(rule = "ConnectionType")
//	public IValueConverter<AssociationType> ConnectionType() {
//		return new IValueConverter<AssociationType>() {
//			@Override
//			public AssociationType toValue(String string, INode node) {
//				if (string == null) {
//					return null;
//				}
//				return AssociationType.get(string.toLowerCase()+" connection");
//			}
//
//			@Override
//			public String toString(AssociationType value) {
//				return value.getName().replaceFirst(" connection", "");
//			}
//		};
//	}

	@ValueConverter(rule = "MappingType")
	public IValueConverter<AssociationType> MappingType() {
		return new IValueConverter<AssociationType>() {
			@Override
			public AssociationType toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return AssociationType.FEATUREMAPPING;
			}

			@Override
			public String toString(AssociationType value) {
				return "mapping";
			}
		};
	}


	@ValueConverter(rule = "FlowPath")
	public IValueConverter<AssociationType> FlowPath() {
		return new IValueConverter<AssociationType>() {
			@Override
			public AssociationType toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				return AssociationType.FLOWPATH;
			}

			@Override
			public String toString(AssociationType value) {
				return "path";
			}
		};
	}


	@ValueConverter(rule = "FlowSource")
	public IValueConverter<AssociationType> FlowSource() {
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


	@ValueConverter(rule = "FlowSink")
	public IValueConverter<AssociationType> FlowSink() {
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
	@ValueConverter(rule = "PropertyAssociationType")
	public IValueConverter<PropertyAssociationType> PropertyAssociationType() {
		return new IValueConverter<PropertyAssociationType>() {
			@Override
			public PropertyAssociationType toValue(String string, INode node) {
				if (string == null) {
					return null;
				}
				if (string.equals("final")) return PropertyAssociationType.FINAL_VALUE;
				if (string.equals("default")) return PropertyAssociationType.DEFAULT_VALUE;
				return PropertyAssociationType.OVERRIDE_VALUE;
			}

			@Override
			public String toString(PropertyAssociationType value) {
				if (value == PropertyAssociationType.FINAL_VALUE) return "final";
				if (value == PropertyAssociationType.DEFAULT_VALUE) return "default";
				return "override";
			}
		};
	}

	
}
