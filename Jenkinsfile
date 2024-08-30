node {
    stage('Build for zoostar') {
        if (env.CHANGE_TARGET == 'develop') {
            echo 'I only execute when merge target is on the develop branch'
        } else {
            echo 'I execute elsewhere'
        }
    }
}