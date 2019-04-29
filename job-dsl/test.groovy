println("This script will not work without a properly set up docker environment. Please define the environment variable 'DOCKER_HOST'")
runningDockers = "docker ps -q".execute().text.split(/\n/)
//runningDockers.each {id -> println("docker stop ${id}".execute().text)}
//runningDockers.each {id -> println("docker exec -it ${id} kill 1".execute().text)}
//println("docker exec -it df6df791eb64  kill 1")

def proc = "docker exec df6df791eb64  kill 1".execute()
def b = new StringBuffer()
proc.consumeProcessErrorStream(b)

println proc.text
println b.toString()

println('end of message!!')