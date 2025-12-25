def call(String ProjectName, String ImagTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjetName}:${ImageTag} . "
}
