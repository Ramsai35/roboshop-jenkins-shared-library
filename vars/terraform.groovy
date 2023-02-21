def call() {
    pipeline{
        agent {
            node {
                label 'workstation'
            }
        }
        options {
            ansiColor('xterm')
        }


        parameters {
            string(name: 'INFRA_ENV', defaultValue: '', description: 'Enter ENV like dev or prod')
            choice(name: 'ACTION', choices: ['apply', 'destroy'], description: 'Action')
        }

        stages {

            stage('Terraform Init') {
                steps {
                    sh "terraform init -backend-config=env-${INFRA_ENV}/state.tfvars"
                }
            }

            stage('Terraform Apply') {
                steps {
                    sh "terraform ${ACTION} -auto-approve  -var-file=env-${INFRA_ENV}/main.tfvars"
                }
            }


        }

        post {
            always {
                cleanWs()
            }
        }

    }
}
