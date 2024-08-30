pipeline {
	agent any
   	
   	stages {
    	stage('Environment') {
            steps {
                echo "Using environment:"
                echo "Source branch: $BRANCH_NAME"
                echo "Target branch: $CHANGE_TARGET"
            }
        }
        
        stage('Verify') {
			steps {
				script {
					if($CHANGE_TARGET == 'develop') {
						echo "mvn -B verify"
					} else {
						echo "fail: $CHANGE_TARGET"
					}
				}
			}
		}
    }
    
}