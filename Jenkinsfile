pipeline {
	agent any
	
   	stages {
    	stage('Environment') {
            steps {
                echo "Source branch: $source"
                echo "Destination branch: $destination"
            }
        }
        stage('Verify') {
			steps {
				script {
					bat 'mvn -B verify'
				}
			}
		}
    }
    
}