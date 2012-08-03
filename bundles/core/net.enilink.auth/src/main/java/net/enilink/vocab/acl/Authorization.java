package net.enilink.vocab.acl;

import net.enilink.vocab.foaf.Agent;

import net.enilink.composition.annotations.Iri;

import net.enilink.vocab.rdfs.Resource;

/**
 * An element of access control, allowing agent to agents access of some kind to
 * resources or classes of resources.
 */
@Iri("http://www.w3.org/ns/auth/acl#Authorization")
public interface Authorization {
	/**
	 * A mode of access such as read or write.
	 */
	@Iri("http://www.w3.org/ns/auth/acl#mode")
	net.enilink.vocab.rdfs.Class getAclMode();

	/**
	 * A mode of access such as read or write.
	 */
	void setAclMode(net.enilink.vocab.rdfs.Class mode);

	/**
	 * The information resource to which access is being granted.
	 */
	@Iri("http://www.w3.org/ns/auth/acl#accessTo")
	Resource getAclAccessTo();

	/**
	 * The information resource to which access is being granted.
	 */
	void setAclAccessTo(Resource resource);

	/**
	 * A class of information resources to which access is being granted.
	 */
	@Iri("http://www.w3.org/ns/auth/acl#accessToClass")
	net.enilink.vocab.rdfs.Class getAclAccessToClass();

	/**
	 * A class of information resources to which access is being granted.
	 */
	void setAclAccessToClass(net.enilink.vocab.rdfs.Class accessToClass);

	/**
	 * A person or social entity to being given the right.
	 */
	@Iri("http://www.w3.org/ns/auth/acl#agent")
	Agent getAclAgent();

	/**
	 * A person or social entity to being given the right.
	 */
	void setAclAgent(Agent agent);

	/**
	 * A class of persons or social entities to being given the right.
	 */
	@Iri("http://www.w3.org/ns/auth/acl#agentClass")
	net.enilink.vocab.rdfs.Class getAclAgentClass();

	/**
	 * A class of persons or social entities to being given the right.
	 */
	void setAclAgentClass(net.enilink.vocab.rdfs.Class agentClass);
}
