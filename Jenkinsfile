pipeline {
    agent {
        docker {
            image 'node:16.13.1-alpine'
            //args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'node --version'
            }
        }
    }
}