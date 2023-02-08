def hello() {
    pipeline {
        agent none

        stages {
            stage('Hello') {
                echo 'Hola mundo'
            }
        }
    }
}
