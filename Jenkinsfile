pipeline {
	agent any
	
	withEnv(['DEST_BRANCH=$env.CHANGE_TARGET']) {
		echo 'Target branch: $DEST_BRANCH'
	}
	
   	stages {
    	stage('Environment') {
            steps {
                echo 'Using environment:'
                echo 'Source branch: $env.BRANCH_NAME'
                echo 'Target branch: $env.CHANGE_TARGET'
            }
        }
        
        stage('Verify') {
			steps {
				script {
					if($env.CHANGE_TARGET == 'develop') {
						echo 'mvn -B verify'
					} else {
						echo 'fail: $env.CHANGE_TARGET'
					}
				}
			}
		}
    }
    
}