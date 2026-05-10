pipeline {
 agent any // Use any available agent
 tools {
 maven 'Maven' // Ensure this matches the name configured in Jenkins
 }
 stages {
 stage('Checkout') {
 steps {
 git branch: 'main', url: 'https://github.com/SaiHarithK/selenium-login01.git'
 }
 }
 stage('Build') {
 steps {
 sh 'mvn clean package' // Run Maven build
 }
 }
 stage('Test') {
 steps {
 sh 'mvn test' // Run unit tests
 }
 }
stage('Check Target Folder') {
 steps {
 sh 'ls -l target'
 }
} 
stage('Run Application') {
    steps {
        // This command automatically includes all Selenium dependencies
        sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
    }
}
}
 post {
 success {
 echo 'Build and deployment successful!'
 }
 failure {
 echo 'Build failed!'
 }
 }
}
