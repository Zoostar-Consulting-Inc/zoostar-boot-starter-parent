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
					if("$destination" == "main" && "$source" == "feature/*") {
						bat 'mvn -B verify'
					}
				}
			}
		}
    }
    
}