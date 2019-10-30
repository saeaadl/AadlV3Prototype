# AadlV3Prototype
Instructions for setting up the prototype:
* Download Eclipse
  * Go to https://www.eclipse.org/downloads/packages/ and download **Eclipse IDE for Java and DSL Developers**
  * Install and launch Eclipse
* Download additional dependencies
  * Within Eclipse, select **Help** -> **Install New Software...**
  * In the **Work with:** dropdown, select the update site for your version of Eclipse. For example, `2019-09 - http://download.eclipse.org/releases/2019-09`
    * Under **Modeling**, select **Sirius Integration with Xtext** and **Sirius Specifier Environment**
  * In **Work with:**, enter the URL `https://dl.bintray.com/itemis/generic/xtext-testing/updates/`
    * Select **Xtext Testing Framework**
  * Click **Next >** to install **Sirius Integration with Xtext**, **Sirius Specifier Environment**, and **Xtext Testing Framework**
* Check out the AadlV3Prototype sources
  * Switch to the **Git** perspective by selecting **Window** -> **Perspective** -> **Open Perspective** -> **Other...** -> **Git**
  * Select **Clone a Git repository** and use the URI `https://github.com/saeaadl/AadlV3Prototype.git`
  * Right click on the **AadlV3Prototype** repository and select **Import Projects...**
    * Import all projects except for `AadlV3Prototype` and `AadlV3Prototype/org.osate.xtext.aadlv3.tests/models/AV3Examples`
  * Switch back to the **Java** perspective
* Execute the prototype by launching a new Eclipse application
  * Create a run configuration by selecting **Run** -> **Run Configurations...**
  * Right click on **Eclipse Application** and select **New Configuration**
    * Give the run configuration a name such as **V3Prototype**
    * Switch to the **Plug-ins** tab and deselect **Validate Plug-ins automatically prior to launching**
    * Click **Run**
* Import the example project into your runtime workspace
  * In the Eclipse window that was launched used the run configuration, switch to the **Git** perspective
  * Select **Add an existing local Git repository** and select the **AadlV3Prototype** repository
  * Right click on the **AadlV3Prototype** repository and select **Import Projects...**
    * Import only the project `AadlV3Prototype/org.osate.xtext.aadlv3.tests/models/AV3Examples`
  * Switch back to the **Resource** perspective