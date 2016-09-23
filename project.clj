(defproject sparkfund/aws-maven "5.1.0"
  :description "Maven wagon for S3"
  :url "http://github.com/SparkFund/aws-maven"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :source-paths ["src/clj"]

  :java-source-paths ["src/java"]

  :min-lein-version "2.0.0"

  :dependencies [[com.amazonaws/aws-java-sdk-core "1.11.36"]
                 [com.amazonaws/aws-java-sdk-s3 "1.11.36"]
                 [org.apache.maven.wagon/wagon-provider-api "2.10"]
                 [org.clojure/clojure "1.8.0"]]

  :deploy-repositories [["releases" :clojars]])
