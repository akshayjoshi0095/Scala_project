pipeline {
    agent any



    stages {

        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage("Checkout Project"){

            steps{
                checkout scmGit(
                branches: [[name: '*/master']],
                extensions: [],
                userRemoteConfigs: [
                    [url: 'https://github.com/akshayjoshi0095/py_repository.git']
                    ]
                    )
            }

        }


        stage('Build') {
            steps {
                echo "Build step started"
                sh """
                    pwd
                    ls
                    cd Inter_prog
                    python3 Interview_Programs.py
                """

                // Get some code from a GitHub repository
                //git 'https://github.com/jglick/simple-maven-project-with-tests.git'

                // Run Maven on a Unix agent.
                //sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    // junit '**/target/surefire-reports/TEST-*.xml'
                    // archiveArtifacts 'target/*.jar'
                    echo "Build done, pushing jar to s3"
                }
            }
        }
    }

    	post{
	        always{
	          emailext (
		        subject : "Pipeline ${currentBuild.fullDisplayName} Status : ${currentBuild.result}",
		      //  body : '''<html> <body>
        //         			<p>Build Status:"${currentBuild.result}"</p>
        //         			<p>Build Status:"${currentBuild.number}"</p>
        //         			<p>Check the <a href="${env.BUILD_URL}">console output </a> </p>
        //         			</body>
        //         			</html>''',
                body : "job - ${currentBuild.fullDisplayName}, URL : ${env.BUILD_URL}  ${currentBuild.result}",
        		to : "akshayjoshi0095@gmail.com",
        		from : "jenkins@example.com",
        		replyTo : "jenkins@example.com",
        		mimeType : "text/html"
		        )
	        }
	    }


}
