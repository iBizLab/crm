```sql
SELECT T1.* FROM (
SELECT DISTINCT
null as ACCOUNT_ID,
null as ACCOUNT_NAME,
null as ALLOCATE_MODEL,
0 AS AMOUNT,
#{ctx.datacontext.n_business_line_eq} AS BUSINESS_LINE,
null as CLOSED_DATE,
null as CREATE_MAN,
null as CREATE_TIME,
UUID() AS ID,
null as IS_CLOSE_THIS_YEAR,
null as IS_IN_SALES_CAL,
null as IS_NEW_THIS_YEAR,
null as IS_PHYSICAL_ORDER,
null as LAST_ASSESS_TIME,
null as NAME ,
DATE_FORMAT(your_date, '%Y-%m') as ORDER_DATE,
null   AS OWNER,
null as O_NUMBER,
null as PID,
null as PNAME,
null as SETTLEMENT_AMOUNT,
null as SETTLEMENT_COST,
null as STATUS,
null as TAX,
null as UPDATE_MAN,
null as UPDATE_TIME,
null as YEAR 
FROM (
    SELECT
        DATE_ADD(
            DATE_FORMAT(STR_TO_DATE(#{ctx.datacontext.gt},'%Y-%m-%d'), '%Y-%m-01'),
            INTERVAL a.a + (10 * b.a) MONTH
        ) AS your_date
    FROM
        (SELECT 0 a UNION ALL SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3
         UNION ALL SELECT 4 UNION ALL SELECT 5 UNION ALL SELECT 6
         UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9) AS a  CROSS  JOIN
        (SELECT 0 a UNION ALL SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3
         UNION ALL SELECT 4 UNION ALL SELECT 5 UNION ALL SELECT 6
         UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9) AS b
    WHERE  DATE_ADD(DATE_FORMAT(STR_TO_DATE(#{ctx.datacontext.gt},'%Y-%m-%d'), '%Y-%m-01'),INTERVAL a.a + (10 * b.a) MONTH) <= DATE_FORMAT(STR_TO_DATE(#{ctx.datacontext.lt},'%Y-%m-%d'), '%Y-%m-01') - INTERVAL 1 DAY
) AS months
) T1

```