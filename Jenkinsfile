pipeline {
	agent any
   	stages {
    	stage('Environment') {
            steps {
                echo "Using environment:"
                echo "Building branch: ${env.GIT_BRANCH}"
            }
        }
        stage('Install') {
            steps {
                echo 'mvn -B install'
            }
        }
        stage('Deploy') {
            steps {
                bat 'mvn -B deploy'
            }
        }
    }
}