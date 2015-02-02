package org.fhw.gradle.simplerpm

class SimpleRPMPluginExtension {
    def String wildfly_home = '/opt/wildfly'
    def String start_script = 'standalone.sh'    
    def String cli_script = 'jboss-cli.sh'
    def String start_regex = '^.*started in.*- Started.*$'    
    def String path_to_deployable = null 
    def String deployment_name = null 
}
   