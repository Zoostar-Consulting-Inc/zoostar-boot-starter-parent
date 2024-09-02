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
				if($destination == "develop") {
					echo "PASS"
				} else {
					echo "FAIL"
				}
			}
		}
    }
    
}