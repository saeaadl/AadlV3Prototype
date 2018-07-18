Installation
===========

There is a develop.setup and an aadlv3.setup. The latter adds the github repository for AADL V3.

I have two projects set up. The first uses Xtext to generate the Ecore model for AADL V3. It uses a curly bracket syntax. The second one uses this Ecore model and defines a grammar that is more like AADL V2.

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

Component Categories
--------------------

Component classifier has category as attribute. Component interfaces may not have an explicit category with the default being COMPONENT. Component implementations have a category. They can refer to interfaces (currently without an explicit category).
Component configurations do not have a category themselves but inherit it from the implementation (or interface).
Should we require component implementations and configurations to point to interfaces with explicit category? (Currently the code retrieving the category assumes the interface has the category).
Should we allow subcomponents to set a different category for COMPONENT interfaces, implementations?

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

Currently we assume that implementations can only combine multiple implementations if they do not overlap. We could restrict implementations to extend a single implementation and add zero or more interfaces.

Currently we expect a configuration with multiple extends (composition) to identify the implementation or configuration that is the common root and all additional elements to be extensions of the common root.


To Do:

access to data component without requiring access features.

Configure features (handled without explicit validation)

Configure named interfaces (same as features)


Can refined to be replaced by configuration or have override semantics

