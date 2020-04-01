node {
  checkout scm

  def props = readProperties file: 'test.env'

  podTemplate(yaml: """
  apiVersion: v1
  kind: Pod
  spec:
    containers:
    - name: alpine
      image: $props.IMAGE
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
}
