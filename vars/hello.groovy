// def info(message) {
//     echo "INFO: ${message}"
// }

// def warning(message) {
//     echo "WARNING: ${message}"
// }

def hola(message) {
    pipeline {
        agent any

        stages {
            stage('Hola mundo') {
                steps {
                    echo "Hola: ${message}"
                }
            }
        }
    }
}

def adios(){
    echo "Hasta otra"
}
