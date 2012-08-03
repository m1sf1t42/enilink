package net.enilink.vocab.auth;

import net.enilink.komma.core.URIImpl;
import net.enilink.komma.core.URI;

public interface AUTH {
	public static final String NAMESPACE = "http://enilink.net/vocab/auth#";
	public static final URI NAMESPACE_URI = URIImpl.createURI(NAMESPACE);

	/**
	 * An external id (OpenID, LDAP, ...) for this agent.
	 */
	public static final URI PROPERTY_EXTERNALID = NAMESPACE_URI
			.appendLocalPart("externalId");

}
