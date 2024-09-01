pipeline {
	agent any
	
   	stages {
    	stage('Environment') {
            steps {
                echo 'Using environment:'
                echo 'github webhook action: $payload.number'
            }
        }
    }
    
}