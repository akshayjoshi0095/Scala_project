pipeline {
    agent any

    tools {
        // maven 'maven_3.3.9'
        // jdk 'OPEN_JDK1.8.0'
        maven 'MAVEN'
        // jdk 'jdk18'

    }

    parameters{
        string(name:'Local_repo', defaultValue:'/Users/akshay.joshi/.jenkins/workspace/GIT_PROJECT_JOB_WITH_PLUGIN - 2/', description:"This is the local repo.")
        string(name:'AWS_repo', defaultValue:'s3://akshay-spark-learning/Jenkins_new/', description:"This is the local repo.")
    }

    stages {

        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage("test"){

            steps{
                sh """ pwd
                mvn test
                """
                }


        stage('Build') {
            steps {
                echo "Build step started"
                sh """
                    pwd
                    mvn clean install
                """
            }

            post {
                success {
                    echo "Build done, pushing jar to s3"
                    echo "value of local repo is ${Local_repo}"
                    echo "value of local repo is ${AWS_repo}/${currentBuild.fullDisplayName}/"
                    echo "aws s3 cp ${Local_repo} ${AWS_repo}/${currentBuild.fullDisplayName}/ --recursive"

                }
            }
        }
    }

    	post{
	        always{
	          emailext (
		        subject : "Pipeline ${currentBuild.fullDisplayName} Status : ${currentBuild.result}",
                body : "job name and build no. : ${currentBuild.fullDisplayName} <br> URL : ${env.BUILD_URL} <br> Result : ${currentBuild.result}",
        		to : "akshayjoshi0095@gmail.com",
        		from : "jenkins@example.com",
        		replyTo : "jenkins@example.com",
        		mimeType : "text/html"
		        )
	        }
	    }


}
