node {
   def mvnHome
   stage('Preparation') { 
      git 'https://github.com/lilian-benoit/exemple-maven.git'
      mvnHome = tool 'maven3.5.3'
   }
   stage('Build') {
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts 'target/*.jar'

   }
}