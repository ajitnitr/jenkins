import org.jenkinsci.plugins.pipeline.modeldefinition.Utils


def sonarQube() {
//  sh 'sonar-scanner -Dsonar.projectKey=${COMPONENT} -Dsonar.sources=. -Dsonar.host.url=http://172.31.15.251:9000 -Dsonar.login=admin -Dsonar.password=admin123'
//  sh 'sonar-quality-gate.sh admin admin123 172.31.15.251 ${COMPONENT}'
  println 'SonarQube Testing'
}

def publishArtifacts() {
//  if(env.GIT_BRANCH == "*tag*") {
//    println 'Ran on Tag'
//  } else {
//    Utils.markStageSkippedForConditional('Publish Artifacts')
//  }

}

def prepareArtifacts() {
  if(env.PROG_LANG_NAME == "nodejs" && env.PROG_LANG_VERSION == "10") {
    sh '''
      echo hello
      echo bye
    '''
  }
}

