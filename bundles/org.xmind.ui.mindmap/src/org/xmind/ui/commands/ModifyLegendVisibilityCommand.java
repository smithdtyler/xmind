/* ******************************************************************************
 * Copyright (c) 2006-2012 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.ui.commands;

import java.util.Collection;

import org.xmind.core.ILegend;
import org.xmind.gef.ISourceProvider;
import org.xmind.gef.command.ModifyCommand;

public class ModifyLegendVisibilityCommand extends ModifyCommand {

    public ModifyLegendVisibilityCommand(ILegend legend, boolean visible) {
        super(legend, visible);
    }

    public ModifyLegendVisibilityCommand(Collection<? extends ILegend> legends,
            boolean visible) {
        super(legends, visible);
    }

    public ModifyLegendVisibilityCommand(ISourceProvider legendProvider,
            boolean visible) {
        super(legendProvider, visible);
    }

    protected Object getValue(Object source) {
        if (source instanceof ILegend) {
            ILegend legend = (ILegend) source;
            return Boolean.valueOf(legend.isVisible());
        }
        return null;
    }

    protected void setValue(Object source, Object value) {
        if (source instanceof ILegend) {
            ILegend legend = (ILegend) source;
            if (value instanceof Boolean) {
                legend.setVisible(((Boolean) value).booleanValue());
            }
        }
    }

    @Override
    public void execute() {
        super.execute();
    }

}
