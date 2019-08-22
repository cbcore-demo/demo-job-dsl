folder('Agent Types') {

}

job('Agent Types/MyJob1') {
  label {'k8s'}
	steps {
		shell("echo \"Hello\"")
	}
}
