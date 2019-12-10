package org.osate.graph.util;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.graph.DefaultEdge;

public class RefEObjectEdge extends DefaultEdge
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	EObject reference =null;

	@Override
    public String toString()
    {
        return "";
    }

	public RefEObjectEdge(EObject reference) {
		super();
		this.reference = reference;
	}

	public EObject getReference() {
		return reference;
	}

	public void setReference(EObject reference) {
		this.reference = reference;
	}
	
	
}
