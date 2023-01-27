def call(){

    pipeline{
        agent{
            label 'workstation'
        }
    stages{
        stage(compile/Build){
            steps{
                echo 'compile'
            }
        }




    }

    }

}
