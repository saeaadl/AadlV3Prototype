Installation
===========

There is a develop.setup and an aadlv3.setup. The latter adds the github repository for AADL V3.

I have two projects set up. The first uses Xtext to generate the Ecore model for AADL V3. It uses a curly bracket syntax. The second one uses this Ecore model and defines a grammar that is more like AADL V2.


Usage and Examples
==================

Examples can be found in org.osate.xtext.aadlv3.tests. It is set up as a project so it can be included in a workspace used by an instance of AADLV3 started from the development environment.

To instantiate example model you create a package with a working set (see example simpleinstances and testinstances). 
Working set is not an AADL V3 langauge concept but a declarative build and execute script.
For each instance to be created you specify the root classifier to be used as starting point of instantiation. 
In addition, you can specify certain analyses to be performed on the instance model. 
In testinstances you can see examples of safety analysis - specifying @EM as the type of annotated behavior of interest and the specific analysis. 
The result is the creation of the isntance model and if specified the appropriate token trace representing fault cause trace, tree and fault effect traces. these files can then be viewed in the EMF based instance editor or through a Sirius based graphical viewer for a table view (similar to the EMV2 viewer).
While in OSATE 2 the viewer is invoked automatically, here you have to open it on the trace file (*.tt) yourself.

See InstantiateWorkingSetHandler.java for more details.

There is also code in place for product line constraint checking, which is documented in constraintsandtokens. See the simpleinstances example and the Xtext grammar rule for workingset in org.osate.xtext.aadlv3. 


Concept Topics
==============

Features
--------

Generic features which may be directional (in,out, bi). Cross connections are from out to in. feature mappings are in -> in(down) and out -> out(up)

Ports which are directional (in,out, in out); in out is connected with two directional connections. Directionality represents information flow.

Data "access" (read/write): provides/requires to indicate the ownership; cross connection req -> provides; mappings req -> req(up) and provides -> provides(down). Read, write and read-write represent directionality of data flow. Connection instances represent the information flow. prov/read -> req/read and req/write -> prov/write is information flow for cross connections. For feature mappings req/write -> req/write (up), prov/write -> prov/write (down) and req/read <- req/read (up), prov/read <- prov/read (up)

"Bus" access: provides/requires for ownership. No directionality of flow. Connections from the accessor to the component being accessed


Connections
-----------

Directional: flow
Nondirectional: bus access
interface: group of features (may may directionality constraint (as did feature group)
binding: directional to the resource

Reverse in Interface Composition and Named Interfaces
------------------------------------------------

Interfaces can be extensions of other interfaces. Those extensions can be marked with *reverse* to indicate opposite direction in - out and provides - requires. For data access it does not reverse read - write but provides - requires.

Access Features for Data Components
-------------------------------

We currently assume all connection endpoints are features. This means bus access is to bus access features and data access is to data access features. Note that data components do not refer to an interface, but to a primitive type. We currently ask users to define the access feature in curly brackets of the component declaration. We could change that to allow the component itself to be the endpoint.

Option 1: add an unnamed access feature instance to the instance model - allow connection to data component.
Option 2: add default access feature to declarative model.

Component Categories
--------------------

Component classifier has category as attribute. Component interfaces may not have an explicit category with the default being COMPONENT. Component implementations have a category. They can refer to interfaces (currently without an explicit category).
Component configurations do not have a category themselves but inherit it from the implementation (or interface).
Should we require component implementations and configurations to point to interfaces with explicit category? (Currently the code retrieving the category assumes the interface has the category).
Should we allow subcomponents to set a different category for COMPONENT interfaces, implementations?

End To End Flows
----------------

End to end flows can optionally only point to component/flowspecs or to connections.

When a connection reaches into subcomponents and there is a preceding reference to a component/flowspec that reference also has to reach in. In the case of a flowspec we could look up the flow implementation to derive the mapping further down. However, that requires a flow implementation to include the mapping.

Flow implementations can also optionally only include components/flowspecs or connections. We currently also allow the feature mapping at the beginning and end to be omitted. 

Current assumptions
===================

Implementation and configuration names are define din the context of a component interface. The qualified name before the *dot* refers to the interface, the *ID* after the dot is the implementation/configuration name.

We have ComponentInterface, ComponentImplementation, and ComponentConfiguration.

Component configurations can be parameterized.

ComponentInterfaces cannot extend implementations or configurations.
ComponentImplementations cannot extend configurations.

ComponentInterfaces and ComponentImplemetnations do not contain configuration assignments.

When composing multiple interfaces we currently assume no overlap in features. The allContent and allFeatures methods currently return duplicates. 
NOTE: There is a Util method to check whether two features are the same including name, category, direction and type that can be used for filtering out merge duplicates.

Currently we assume that implementations can only extend one implementation.
( only combine multiple implementations if they do not overlap. We could restrict implementations to extend a single implementation and add zero or more interfaces.)

Currently we expect a configuration with multiple extends (composition) to identify the implementation or configuration that is the common root and all additional elements to be extensions of the common root.


Also supported:

validate that configurations can only do classifier assignments that do not extend the present implementation. Implementations as extensions can override a component classifier with a implementation extension.

validate that there are no conflicting property value assignments in compositions. Question: If one composition assigns by reach down the other more locally and the a combined is that a conflict or is it ok since one is further in?

Extend grammar to allow implementations to perform refinements by configuration assignment.

access to data component without requiring access features.

Configure features (handled without explicit validation)

Configure named interfaces (same as features)


