pipeline {
	agent any
   	stages {
    	stage('Environment') {
            steps {
                echo "Using environment:"
                echo "Source branch: ${env.BRANCH_NAME}"
                echo "Target branch: ${env.CHANGE_TARGET}"
            }
        }
        if(${env.CHANGE_BRANCH} == 'develop') {
	        stage('verify') {
	            steps {
	                bat 'mvn -B verify'
	            }
	        }
        } else {
	        stage('Deploy') {
	            steps {
	                echo 'mvn -B deploy'
	            }
	        }
        }
    }
}