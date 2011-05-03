package org.grails.samples;

import org.apache.log4j.Logger

/**
 * Simple domain object representing a veterinarian.
 *
 * @author Graeme Rocher
 */
class Vet extends Person {

	static hasMany = [specialities:Speciality]
}
