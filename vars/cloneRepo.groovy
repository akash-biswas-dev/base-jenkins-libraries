def call(String url, String branch){
  echo 'Started cloning the code.'
  git url: "${url}", branch: "${branch}"
  echo 'Code cloning successfull.'
}

def useEnv(){
  def url = env.GIT_URL
  def fullBranch = env.GIT_BRANCH
  def branch = fullBranch.tokenize('/').last()
  git url:"${url}", branch:"${branch}"
  echo "Code clone successfull."
}
