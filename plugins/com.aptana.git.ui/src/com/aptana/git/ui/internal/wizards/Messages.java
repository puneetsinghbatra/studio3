package com.aptana.git.ui.internal.wizards;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
	private static final String BUNDLE_NAME = "com.aptana.git.ui.internal.wizards.messages"; //$NON-NLS-1$
	public static String CloneWizard_Job_title;
	public static String RepositorySelectionPage_Browse_Label;
	public static String RepositorySelectionPage_CannotCreateDirectory_ErrorMessage;
	public static String RepositorySelectionPage_Description;
	public static String RepositorySelectionPage_Destination_Label;
	public static String RepositorySelectionPage_DestinatioNRequired_Message;
	public static String RepositorySelectionPage_DirectoryExists_ErrorMessage;
	public static String RepositorySelectionPage_SourceURI_Label;
	public static String RepositorySelectionPage_SourceURIRequired_Message;
	public static String RepositorySelectionPage_Title;
	static
	{
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages()
	{
	}
}
