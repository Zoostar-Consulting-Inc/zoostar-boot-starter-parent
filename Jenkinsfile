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
			when {
				expression {
					return $destination == "develop"
				}
			}
			steps {
				step {
					echo "PASS"
				}
			}
		}
    }
    
}