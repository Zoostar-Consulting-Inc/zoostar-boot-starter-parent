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
        
        stage('Verify') {
			steps {
				script {
					if(env.CHANGE_TARGET == 'develop') {
						echo "mvn -B verify"
					} else {
						echo "fail"
					}
				}
			}
		}
    }
    
}