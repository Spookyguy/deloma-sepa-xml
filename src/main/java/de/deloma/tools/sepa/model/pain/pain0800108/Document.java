//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2025.05.26 um 02:17:19 PM CEST
//

package de.deloma.tools.sepa.model.pain.pain0800108;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für Document complex type.
 *
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CstmrDrctDbtInitn" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.08}CustomerDirectDebitInitiationV08"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement(name = "Document")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder =
{
	"cstmrDrctDbtInitn"
})
public class Document
{

	@XmlElement(name = "CstmrDrctDbtInitn", required = true)
	protected CustomerDirectDebitInitiationV08 cstmrDrctDbtInitn;

	/**
	 * Ruft den Wert der cstmrDrctDbtInitn-Eigenschaft ab.
	 * 
	 * @return possible object is {@link CustomerDirectDebitInitiationV08 }
	 * 
	 */
	public CustomerDirectDebitInitiationV08 getCstmrDrctDbtInitn()
	{
		return this.cstmrDrctDbtInitn;
	}

	/**
	 * Legt den Wert der cstmrDrctDbtInitn-Eigenschaft fest.
	 * 
	 * @param value allowed object is {@link CustomerDirectDebitInitiationV08 }
	 * 
	 */
	public void setCstmrDrctDbtInitn(final CustomerDirectDebitInitiationV08 value)
	{
		this.cstmrDrctDbtInitn = value;
	}

}
