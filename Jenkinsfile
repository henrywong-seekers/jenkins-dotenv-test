@Library('test')

import com.seekerscapital.Test

def c = new Test()

def dotenv = c.test('./test.env')

podTemplate(yaml: """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: alpine
    image: $dotenv.IMAGE
    command:
    - cat
    tty: true
"""
) {
    node(POD_LABEL) {
      container('alpine') {
        sh 'echo Hello world'
      }
    }
}
