package com.gooddata.spark.example;

import com.gooddata.jdbc.util.Parameters;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.sql.*;

public class SparkExample {

    public static void main(String[] args) {

        Parameters p = new Parameters();

        SparkConf conf = new SparkConf().setAppName("GoodData Spark example").setMaster("local");
        SparkContext sc = new SparkContext(conf);

        SQLContext sql = new SQLContext(sc);

        /**
         * Requires execution of following statements
         * CREATE METRIC "REVENUE" AS SELECT SUM("ORDER_QUANTITY" * "PRODUCT_PRICE");
         * CREATE METRIC "QUANTITY" AS SELECT SUM("ORDER_QUANTITY");
         */
        Dataset<Row> gdData = sql.read()
                .format("jdbc")
                .option("driver", "com.gooddata.jdbc.driver.AfmDriver")
                .option("url", String.format("jdbc:gd://%s/gdc/projects/%s", p.getHost(),
                        "yxz8s0tw6tonswb8wkyxtu1ykasy8r9e"))
                .option("query", "SELECT \"Date (ORDER_DATE)\", \"CUSTOMER_REGION\", \"CUSTOMER_CITY\"," +
                        " \"PRODUCT_CATEGORY\", \"PRODUCT_NAME\", \"ORDER_STATUS\", \"REVENUE::DOUBLE\", " +
                        "\"QUANTITY::INTEGER\"")
                .option("user", p.getUsername())
                .option("password", p.getPassword())
                .load();

        gdData.printSchema();
        gdData.show();

    }

}
