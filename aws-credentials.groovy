// AWS credentials
// Public and private IP addresses
def publicIpAddress = '3.108.236.107'
def privateIpAddress = '172.31.39.73'
def pub_pvtserverIpAddress = '172.31.3.30'

// Key pair details
def keyPairName = 'mmkey.pem'
def keyPairPath = '/var/lib/jenkins/workspace/pranav/mmkey.pem'

// Print IP addresses
println "Public IP Address: $publicIpAddress"
println "Private IP Address: $privateIpAddress"
println "pub_pvtserverIpAddress: $pub_pvtserverIpAddress"

// Print key pair details
println "Key Pair Name: $keyPairName"
println "Key Pair Path: $keyPairPath"
