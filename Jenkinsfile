node {
   def mvnHome
   stage('Preparation') { // for display purposes
      git 'https://github.com/lilian-benoit/exemple-maven.git'
   }
   stage('Build') {
    withMaven(
        maven: 'maven3.5.3',

        // Maven settings.xml file defined with the Jenkins Config File Provider Plugin

        // Maven settings and global settings can also be defined in Jenkins Global Tools Configuration
        // mavenSettingsConfig: 'my-maven-settings',
        mavenLocalRepo: '.repository') {

        // Run the maven build
        sh "mvn clean install"
    }
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}