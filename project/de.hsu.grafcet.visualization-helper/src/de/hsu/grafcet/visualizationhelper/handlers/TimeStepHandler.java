package de.hsu.grafcet.visualizationhelper.handlers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;


public class TimeStepHandler extends AbstractHandler {

	private static final String BACKWARD_COMMAND_ID = "de.hsu.grafcet.visualization-helper.commands.backwardCommand";
	private static final String FORWARD_COMMAND_ID = "de.hsu.grafcet.visualization-helper.commands.forwardCommand";
	private static int current = 0;
	
	private enum Direction {
		Backward,
		Forward
	}
	
	
	
	private class FileComparer implements Comparator<IFile> {

		private AlphaNumericComparator anc = new AlphaNumericComparator();
		
		@Override
		public int compare(IFile o1, IFile o2) {
			return anc.compare(o1.getName(), o2.getName());
		}
		
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		var root = ResourcesPlugin.getWorkspace().getRoot();
		
		List<IFile> files = new ArrayList<>();

		try {
			root.accept(resource -> {
			    if (resource.getType() == IResource.FILE && resource.getName().endsWith("grafcet")) {
			        files.add((IFile) resource);
			    }
			    return true; // true = weiter traversieren
			});
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		files.sort(new FileComparer());
		var MAX_VALUE = files.size();
		
		Direction direction;
		if (event.getCommand().getId() == BACKWARD_COMMAND_ID) {
			direction = Direction.Backward;
		} else if (event.getCommand().getId() == FORWARD_COMMAND_ID) {
			direction = Direction.Forward;
		} else {
			MessageDialog.openInformation(
					window.getShell(),
					"Visualization-helper",
					"Internal Error: Invalid command!");
			return null;
		}

		if(direction == Direction.Backward) {
			if(current > 0)
				current--;
		} else {
			if(current < MAX_VALUE - 1)
				current++;
		}

		
		var toOpen = files.get(current);
		
		try {
			IDE.openEditor(window.getActivePage(), toOpen);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
