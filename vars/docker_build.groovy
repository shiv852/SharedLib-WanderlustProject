// ye wanderlust project ki image build krne ki hai

// def call(String ProjectName, String ImageTag, String DockerHubUser){
//   sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
// }


// ye own-furniture-web ki image build krne ki hai
def call(String ProjectName, String ImageTag, String DockerHubUser){
    if (ProjectName == "furniture-backend") {
        sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} -f backend/Dockerfile backend"
    } else if (ProjectName == "furniture-frontend") {
        sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} -f finalProject/Dockerfile finalProject"
    }
}


