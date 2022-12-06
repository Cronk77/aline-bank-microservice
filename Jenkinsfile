def image

pipeline{
    environment{
        //variables are set as secret text credentials to maintain security and parameterization
        //ensures logs also don't shows secret values
        APP_PORT = 80
        IMAGE_NAME = "cc-bank-microservice" //acts as ecr repo name also
        IMAGE_TAG = "0.1." + "${env.BUILD_ID}"
        AWS_REGION = credentials('AWS_REGION')
        AWS_ACCOUNT_ID = credentials('AWS_ACCOUNT_ID')
        AWS_JENKINS_CRED = "cc-aws-cred"
        SONARQUBE_PROJECT = "cc-bank-microservice-project"
        AWS_CRED = credentials('cc-aws-cred')
        DEPLOYMENT_FILE = "bank-deployment-service.yaml"
        SERVICE_NAME = "bank"
    }
    agent any    
    tools{
        maven "M3"
        //dockerTool "docker"
        'org.jenkinsci.plugins.docker.commons.tools.DockerTool' 'docker-20.10.12'
    }
    stages{

        stage('Checkout'){
            steps{
                checkout scm
            }
        }
        // stage("Test"){
        //     steps{
        //         sh "mvn clean test"  
        //     }
        // }
        // stage('SonarQube Analysis') {
        //     steps{
        //         withSonarQubeEnv('SQ') {
        //             sh "mvn clean verify sonar:sonar -Dsonar.projectKey=${SONARQUBE_PROJECT}"
        //         }
        //     }
        // }
        // stage('Quality Gate'){//assess using custom qality gate cc-qualityGate
        //     steps{
        //         waitForQualityGate abortPipeline: true
        //     }
        // }
        // stage('Remove old Image(s)'){//to ensure the agent doesnt run out of space by deleting image builds
		// 	steps{
        //         //ensures build doesn't fail if there isnt any previous images to delete
        //         catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
        //             sh 'docker rmi -f $(docker images --filter reference="${IMAGE_NAME}" -q)'
		// 		    sh 'docker rmi --force $(docker images -q -f dangling=true)'
        //         }
		// 	}
		// }
        stage("Build"){
            steps{
                script{
                    image = docker.build("${IMAGE_NAME}:${IMAGE_TAG}", "--build-arg APP_PORT=${APP_PORT} .")
                }
            }
        }
        stage("Push Image"){
            steps{
                script{
                    docker.withRegistry(
                        "https://${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com",
                        "ecr:${AWS_REGION}:${AWS_JENKINS_CRED}"){
                        image.push("${IMAGE_TAG}")
                        image.push('latest')
                    }
                }
            }
        }
        stage("Deploy"){
            steps{
                script{
                    withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'cc-kubeconfig', namespace: '', serverUrl: '') {
                        sh 'kubectl delete deployment ${SERVICE_NAME}-deployment'
                        sh 'kubectl apply -f  ${DEPLOYMENT_FILE}'
                    }
                }
            }
        }
    }
}