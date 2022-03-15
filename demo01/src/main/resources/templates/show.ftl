<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<table border="1px">
    <tr>
        <th>cartId</th>
        <th>userId</th>
        <th>mealId</th>
        <th>count</th>
    </tr>
    <#if info ??>
        <#--<#list info.list as fl>-->
        <#list info as fl>
            <tr>
                <th>${fl.cartId}</th>
                <th>${fl.userId}</th>
                <th>${fl.mealId}</th>
                <th>${fl.count}</th>
            </tr>
        </#list>

        <#--<tr>
            <th colspan="4">
                <a href="findAllCart?page=1">首页</a>
                <#if info.pageNum gt 1>
                    <a href="findAllCart?page=${info.pageNum-1}">上一页</a>
                </#if>
                <#if info.pageNum lt info.pages>
                    <a href="findAllCart?page=${info.pageNum+1}">下一页</a>
                </#if>
                <a href="findAllCart?page=${info.pages}">尾页</a>
            </th>
        </tr>-->
    </#if>

</table>

</body>
</html>