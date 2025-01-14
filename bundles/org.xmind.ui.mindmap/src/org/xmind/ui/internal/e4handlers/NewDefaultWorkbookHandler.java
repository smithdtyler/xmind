package org.xmind.ui.internal.e4handlers;

import javax.inject.Inject;

import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.ui.IWorkbenchWindow;
import org.xmind.ui.mindmap.MindMapUI;

public class NewDefaultWorkbookHandler {

    @Inject
    public void execute(final IWorkbenchWindow window) {
        if (window == null)
            return;

        SafeRunner.run(new SafeRunnable() {
            public void run() throws Exception {
                window.getActivePage().openEditor(
                        MindMapUI.getEditorInputFactory()
                                .createDefaultEditorInput(),
                        MindMapUI.MINDMAP_EDITOR_ID);
            }
        });
    }

}
