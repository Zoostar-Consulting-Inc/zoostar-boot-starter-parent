pipeline {
	agent any
	
   	stages {
    	stage('Environment') {
            steps {
				echo "Action: $action"
                echo "Source branch: $source"
                echo "Destination branch: $destination"
            }
        }
        stage('Verify') {
			steps {
				script {
					if("$action" == "open") {
						bat 'mvn -B verify'
					}
				}
			}
		}
        stage('Deploy') {
			steps {
				script {
					if("$action" == "closed") {
						bat 'mvn -B deploy'
					}
				}
			}
		}
    }
    
}