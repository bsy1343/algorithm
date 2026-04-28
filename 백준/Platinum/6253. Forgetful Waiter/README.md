# [Platinum III] Forgetful Waiter - 6253

[문제 링크](https://www.acmicpc.net/problem/6253)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

이분 매칭, 자료 구조

### 문제 설명

<p>Bob is a waiter, working for Pizza Round, a restaurant that offers different types of pizzas. Traditionally, all tables in Pizza Round are round tables with different sizes. Whenever a group of customers enters the restaurant, Bob helps them find a table of proper size and then gets their orders by writing down the number of orders for each type of pizza. Bob is also responsible for serving the pizzas by putting them on the table correctly such that each customer receives the type of pizza which she/he has ordered.</p>

<p>Unfortunately, Bob is forgetful and cannot memorize the type of pizza that each customer has ordered. So, most of the time, he puts the pizzas on the table in a wrong order. However, the customers kindly cooperate to pass along the pizzas to the right customers in several turns. In each turn, each customer can pick up a pizza in front of him with his left hand and pass it to the customer on his left side, or he can pick up a pizza in front of him with his right hand and pass it to the customer on his right side. A customer can use his both hands simultaneously to pass two pizzas to his two adjacent customers in one turn. But there is a space limitation of at most 5 pizzas in front of each customer on the table. So, a customer can only pass a pizza to one of his adjacent customers, when there is enough space in front of that customer.</p>

<p>With these limitations, there are various strategies for a group to pass the pizzas. We are interested in finding the minimum number of turns needed for passing the pizzas. Assume that it is always possible to do that, i.e., the number of pizzas of each type on the table is exactly equal to the number of pizzas ordered for that type by the customers. For example, in the following setting, there is a group of six customers sitting around a round table, there are labels on each customer, which indicates the type of pizza ordered by that customer. The numbers on each pizza indicates the type of the pizza. As you can see in the figure, it is possible to pass the pizzas in just two turns. However, it is not possible to&nbsp;pass the pizzas in one turn, as the single pizza with type 2 needs at least two turns to reach its destination.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6253.%E2%80%85Forgetful%E2%80%85Waiter/effad508.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6253/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-13%20%EC%98%A4%ED%9B%84%205.30.33.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:239px; width:640px" /><br />
Write a program to find the minimum number of turns needed to pass all pizzas on the table to their correct customers. The exact strategy of passing the pizzas is not important to us. We are only interested in the minimum number of turns needed.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains an integer n, the number of customers in the group (1 &lt; n &le; 1000). Suppose that the customers in the group are numbered from 1 to n and sit around a table of size n consecutively in a counter-clockwise order, so that customer 1 is adjacent to customer n. The next n lines (numbered from 1 to n) describe the customers&rsquo; orders and the current arrangement of the pizzas on the table. In each line i, there are two integer numbers a<sub>i</sub> and b<sub>i</sub> in range [1,n], separated by a space, where a<sub>i</sub> indicates the type of pizza ordered by customer i, and b<sub>i</sub> indicates the type of pizza actually placed by Bob in front of that customer. The sequence of b<sub>i</sub>&rsquo;s is actually a permutation of a<sub>i</sub>&rsquo;s sequence. The input terminates with a line containing &ldquo;0&rdquo;.</p>

### 출력

<p>In the output file, for each test case, just write a non-negative number m in a separate line, which is the minimum number of turns needed to transfer all pizzas, for that test case. If in a test case the pizzas are already placed correctly, you must write number 0 in the corresponding line of the output.</p>