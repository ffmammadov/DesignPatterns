package com.github.ffmammadov.singleton

import spock.lang.Specification
import spock.lang.Unroll

class ApplicationDataTest extends Specification {

    def "test getInstance returns same instance"() {
        when:
        def instance1 = ApplicationData.instance
        def instance2 = ApplicationData.instance
        then:
        instance1 == instance2
    }

    @Unroll
    def "test getMessage returns correct data"(String value) {
        given:
        def instance = ApplicationData.instance
        when:
        def data = instance.data
        then:
        data.contains(value)
        where:
        value << ["Test Data #1", "Test Data #2", "Test Data #3", "Test Data #4", "Test Data #5"]
    }
}
