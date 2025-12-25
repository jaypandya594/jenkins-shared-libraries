def call(String projectName, String ImagTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${projectName}:${ImageTag} . "
}
