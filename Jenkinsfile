pipeline {
	agent any
	
   	stages {
        stage('Verify') {
			steps {
				script {
					if("opened" == "$action" || "synchronize" == "$action" || "branch" == "$refType") {
						bat 'mvn -B verify'
					}
				}
			}
		}
        stage('Deploy') {
			steps {
				script {
					if("closed" == "$action") {
						bat 'mvn -B deploy'
					}
				}
			}
		}
    }
    
}