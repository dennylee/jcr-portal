grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve true // whether to do a secondary resolve on plugin installation, not advised but here for backwards compatibility

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.22'
        runtime 'javax.jcr:jcr:2.0'
        runtime 'org.apache.jackrabbit:jackrabbit-jcr-commons:2.7.4'
        runtime 'org.apache.jackrabbit:jackrabbit-spi-commons:2.7.4'
        runtime 'org.apache.jackrabbit:jackrabbit-jcr2dav:2.7.4'
        runtime 'org.apache.jackrabbit:jackrabbit-spi:2.7.4'
        runtime 'org.apache.jackrabbit:jackrabbit-jcr2spi:2.7.4'
        runtime 'org.apache.jackrabbit:jackrabbit-spi2jcr:2.7.4'
        runtime 'org.apache.jackrabbit:jackrabbit-spi2dav:2.7.4'
        runtime 'org.apache.jackrabbit:jackrabbit-webdav:2.7.4'


        runtime 'commons-httpclient:commons-httpclient:3.1'
        runtime 'commons-codec:commons-codec:1.2'
        runtime 'commons-logging:commons-logging:1.0.4'


        runtime 'org.apache.jackrabbit:jackrabbit-core:2.7.4'
        runtime 'org.apache.jackrabbit:jackrabbit-ocm:1.5.3'
//        runtime 'org.apache.jackrabbit:jackrabbit-jca:2.7.4'

//        runtime 'org.apache.jackrabbit:jackrabbit-jcr2dav:2.7.4'
//        runtime 'org.apache.jackrabbit:jackrabbit-jcr-client:2.7.4'
//        runtime 'org.apache.jackrabbit:jackrabbit-spi:2.7.4'
//        runtime 'org.apache.jackrabbit:jackrabbit-webdav:2.7.4'
        runtime 'org.apache.jackrabbit:jackrabbit-jcr-rmi:2.7.4'
    }

    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.8.3"
        runtime ":resources:1.1.6"

        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0"
        //runtime ":cached-resources:1.0"
        //runtime ":yui-minify-resources:0.1.5"

        build ":tomcat:$grailsVersion"

        runtime ":database-migration:1.3.2"

        compile ':cache:1.0.1'
    }
}