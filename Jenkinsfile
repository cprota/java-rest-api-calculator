pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
				git 'https://github.com/cprota/java-rest-api-calculator.git'
				sh './mvnw clean compile'
            }
        }
    }
}