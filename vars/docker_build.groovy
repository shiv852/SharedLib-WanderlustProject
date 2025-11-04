// ye wanderlust project ki image build krne ki hai

def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}


// ye own-furniture-web ki image build krne ki hai
// def call(String ProjectName, String ImageTag, String DockerHubUser) {
//     sh """
//         echo "🛠 Building Docker image for ${ProjectName}:${ImageTag}"
//         DOCKER_BUILDKIT=0 docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} .
//     """
// }
