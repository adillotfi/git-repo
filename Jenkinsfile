//Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any
    tools { 
        maven 'Maven 11.2.3' 
        jdk 'jdk8' 
    }
    stages {
        stage('Build') {
            steps {
                sh 'make' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}