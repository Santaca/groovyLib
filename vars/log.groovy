// def info(message) {
//     echo "INFO: ${message}"
// }

// def warning(message) {
//     echo "WARNING: ${message}"
// }

def hello(message) {
    pipeline {
        stages {
            stage('Hola mundo') {
                echo "Hola: ${message}"
            }
        }
    }
}
