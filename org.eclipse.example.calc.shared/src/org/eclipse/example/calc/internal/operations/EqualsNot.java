package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.Operation;

/**
 * EqualsNot operation to trigger binary operations
 */
public class EqualsNot extends AbstractOperation implements Operation {
    
    @Override
    public String getName() {
        return "!=";
    }

}
