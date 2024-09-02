pipeline {
	agent any
	
	environment {
		source = "${pull_request.head.ref}"
		destination = "${pull_request.base.ref}"
	}
	
   	stages {
    	stage('Build') {
            steps {
                echo 'Source branch: $source'
                echo 'Destination branch: $destination'
            }
        }
    }
    
}