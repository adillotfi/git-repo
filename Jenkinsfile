//Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                echo "Hello test"
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
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