package org.anddev.andengine.extension.multiplayer.protocol.adt.message;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author Nicolas Gramlich
 * @since 18:24:50 - 19.09.2009
 */
public interface IMessage {
	// ===========================================================
	// Final Fields
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public void transmit(final DataOutputStream pDataOutputStream) throws IOException;
}
