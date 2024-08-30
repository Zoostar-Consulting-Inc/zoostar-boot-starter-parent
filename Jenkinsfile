node {
    stage('Build for zoostar') {
		echo "Building for Branch: ${env.BRANCH_NAME}"
		echo "Merging into Branch: ${CHANGE_TARGET}"
        if (env.CHANGE_TARGET == 'develop') {
            echo "I only execute when merge target is on the develop branch"
        } else {
            echo "I execute elsewhere"
        }
    }
}