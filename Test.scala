// Databricks notebook source
println(sc.version)

// COMMAND ----------

sc.parallelize(1 to 10).map(_*2).collect
