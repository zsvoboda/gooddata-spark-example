# GoodData Spark Example 
This example shows how to create Spark Dataset on top of GoodData workspace. 
The dataset uses the workspace created in [this tutorial](https://github.com/zsvoboda/gooddata-jdbc/wiki/GoodData-metrics-tutorial).

![](https://github.com/zsvoboda/gooddata-jdbc/wiki/images/gd.spark.png)

## Setup

The example requires a ```.gooddata``` configuration file located in your home directory. 
The file has this structure:

```
{
    "host": "<your-gd-domain>.na.gooddata.com",
    "username": "<your-gd-username>",
    "password": "<your-gd-password>",
    "workspace":"<your-gd-workspace-id>"
}
```

## Code

Check out the [example code](https://github.com/zsvoboda/gooddata-spark-example/blob/master/src/main/java/com/gooddata/spark/example/SparkExample.java)  

## License
[MIT license](LICENSE)

## Tutorials and articles

- [Motivation: SQL and aggregated data: is there a better way?](https://medium.com/gooddata-developers/sql-and-aggregated-data-is-there-a-better-way-45b395516b91)
- [Accessing GoodData workspace from Apache Zeppelin notebook](https://medium.com/gooddata-developers/accessing-gooddata-workspace-from-apache-zeppelin-notebook-a057856030e6)  
- [DBeaver JDBC tutorial](https://github.com/zsvoboda/gooddata-jdbc/wiki/GoodData-metrics-tutorial)

## Let me know
Submit github [issue](https://github.com/zsvoboda/gooddata-spark-example/issues). 