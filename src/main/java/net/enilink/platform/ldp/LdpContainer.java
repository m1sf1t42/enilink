package net.enilink.platform.ldp;

import java.util.Set;

import net.enilink.composition.annotations.Iri;

/**
 * LDP Container
 * <p>
 * "An LDP-RS representing a collection of linked documents or information
 * resources [...]"
 * 
 * @see https://www.w3.org/TR/ldp/#h-terms
 * @see https://www.w3.org/TR/ldp/#ldpc
 */
@Iri("http://www.w3.org/ns/ldp#Container")
public interface LdpContainer extends LdpRdfSource {

	/**
	 * The relationship binding an LDPC to LDPRs whose lifecycle it controls and
	 * is aware of. The lifecycle of the contained LDPR is limited by the
	 * lifecycle of the containing LDPC; that is, a contained LDPR cannot be
	 * created (through LDP-defined means) before its containing LDPC exists.
	 * 
	 * @see https://www.w3.org/TR/ldp/#dfn-containment
	 */
	@Iri("http://www.w3.org/ns/ldp#contains")
	Set<LdpResource> contains();
	void contains(Set<LdpResource> resources);
}
