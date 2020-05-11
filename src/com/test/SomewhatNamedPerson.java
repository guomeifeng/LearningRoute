package com.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Definition of a person with lastName and age, and optionally a firstName as well...
 *
 * @author <a href="mailto:lj@jguru.se">Lennart J&ouml;relid</a>, jGuru Europe AB
 * @custom A custom JavaDoc annotation.
 */
@XmlRootElement
@XmlType(namespace = SomewhatNamedPerson.NAMESPACE, propOrder = {"firstName", "lastName", "age"})
@XmlAccessorType(XmlAccessType.FIELD)
public class SomewhatNamedPerson {

    /**
     * The XML namespace of this SomewhatNamedPerson.
     */
    public static final String NAMESPACE = "http://some/namespace";

    /**
     * The first name of the SomewhatNamedPerson.
     */
    @XmlElement(nillable = true, required = false)
    private String firstName;

    /**
     * The last name of the SomewhatNamedPerson.
     */
    @XmlElement(nillable = false, required = true)
    private String lastName;

    /**
     * The age of the SomewhatNamedPerson. Must be positive.
     */
    @XmlAttribute(required = true)
    private int age;


}