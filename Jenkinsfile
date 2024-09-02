pipeline {
	agent any
	
   	stages {
    	stage('Build') {
            steps {
                echo "Source branch: $source"
                echo "Destination branch: $destination"
            }
        }
        stage('Verify') {
			steps {
				script {
					if("$destination" == "main") {
						echo "FAIL"
					} else {
						echo "PASS"
					}
				}
			}
		}
    }
    
}