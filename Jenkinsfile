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
				when {
					expression {
						return $destination == "develop"
					}
				}
				step {
					echo "PASS"
				}
			}
		}
    }
    
}