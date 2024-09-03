pipeline {
	agent any
	
   	stages {
    	stage('Environment') {
            steps {
				echo "Ref Type: $refType"
				echo "Action: $action"
                echo "Source branch: $source"
                echo "Destination branch: $destination"
            }
        }
        stage('Verify') {
			steps {
				script {
					if("$action" == "open" || "$refType" == "branch") {
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