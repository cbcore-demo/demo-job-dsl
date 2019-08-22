folder('Cross Team Collaboration') {

}

pipelineJob("Cross Team Collaboration/CTC Build job") {
	definition {
		cps {
		script('''pipeline {
		    agent { label 'master' } 
		    stages {
			stage('Build') { 
			    steps {
				echo 'This is the build stage'
			    }
			}
			stage('Test') { 
			    steps {
				echo 'This is the test stage'
			    }
			}
			stage('Deploy') { 
			    steps {
				echo 'This is the deploy stage'
			    }
			}
			stage('Trigger next job') {
			    steps {
				echo 'sending triggerjob'
				publishEvent jsonEvent('{"eventName":"triggerjob"}')
			    }
			}
		    }
		}''')
		sandbox()
	   }
	}
}
