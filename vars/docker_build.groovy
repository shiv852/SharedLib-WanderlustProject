// ye wanderlust project ki image build krne ki hai

def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}






// def call(String ProjectName, String ImageTag, String DockerHubUser){
//     ImageTag = ImageTag.trim()

//     if (ProjectName == "furniture-backend") {
//         sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} -f Dockerfile ."
//     } else if (ProjectName == "furniture-frontend") {
//         sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} -f Dockerfile ."
//     }
// }



