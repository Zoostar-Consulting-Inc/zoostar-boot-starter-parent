pipeline {
	agent any
	
   	stages {
        stage('Verify') {
			steps {
				script {
					if("opened" == "$action" || "synchronize" == "$action" || "edited" == "$action" || "branch" == "$refType") {
						bat 'mvn -B verify'
					}
				}
			}
		}
        stage('Deploy') {
			steps {
				script {
					if("closed" == "$action") {
						bat 'mvn -Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true -B deploy'
					}
				}
			}
		}
    }
    
}