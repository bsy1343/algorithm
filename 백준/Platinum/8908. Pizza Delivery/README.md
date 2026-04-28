# [Platinum I] Pizza Delivery - 8908

[문제 링크](https://www.acmicpc.net/problem/8908)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 23, 맞힌 사람: 16, 정답 비율: 44.444%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>There is a pizza house located on a straight road, and there are many houses along the road which are customers to the pizza house. To attract more orders from his customers, the owner of the pizza house advertised that he will deduct a penalty for late delivery from the price of the delivered pizzas. The penalty is to be charged when some designated time period has passed after the order has been made, and the amount of penalty to be charged is 1 Korean Won per unit time thereafter. Today all houses on the road ordered pizza at the same time and the delivery of all the ordered pizzas has just started when the late delivery penalty is going to be charged. On a busy day like today, he may not deliver pizza to some customers if the late delivery penalty to be deducted for a customer is more than the earning to be made by selling pizza to the customer. Write a program to help him decide to which customers he has to deliver pizzas and which customers he may skip in order to make the greatest profit. Note that the profit made by delivering a pizza to a customer is the amount of earning from the service deducting the penalty for late delivery. You may assume that his moving velocity is one unit distance per unit time and it takes no time to hand over the pizza to the customer.</p>

<p>For example, the following figure shows the relative positions of five customers {c<sub>1</sub>, c<sub>2</sub>, , c<sub>5</sub>} to the pizza house and the earning to be made by selling pizzas to each customer.&nbsp;</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/8908/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%204.53.56.png" style="height:152px; width:433px" /></p>

<p>If the delivering sequence of customers is &lt;c<sub>4</sub>, c<sub>3</sub>, c<sub>2</sub>, c<sub>5</sub>, c<sub>1</sub>&gt;, then the amount of penalty for late delivery to each customer is 2 for c<sub>4</sub>, 5 for c<sub>3</sub>, 7 for c<sub>2</sub>, 15 for c<sub>5</sub> and 26 for c<sub>1</sub>. In this case the profit from each customer is 3 for c<sub>4</sub>, -3 for c<sub>3</sub>, 3 for c<sub>2</sub>, 5 for c<sub>5</sub> and 1 for c<sub>1</sub>. Since the profit from customer c<sub>3</sub> is -3, it is better not to deliver pizza to c<sub>3</sub>. Therefore the total profit by delivering pizzas to the customers in this order is 12. The best profit the owner can make, in this case, is 32, where the delivering sequence is &lt;c<sub>3</sub>, c<sub>2</sub>, c<sub>1</sub>, c<sub>5</sub>&gt;.</p>

<p>Given the relative positions of customers to pizza house, and earnings to be made by delivering pizzas to each customer, write a program to compute the maximum profits by delivering pizzas ordered from the customers.&nbsp;</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case consists of three lines. The first line of each test case contains an integer, n (1 &le; n &le; 100), which is the number of customers to pizza house. The second line of each test case contains n integers p<sub>1</sub>, p<sub>2</sub>, ..., p<sub>n</sub> ( p<sub>1</sub> &lt; p<sub>2</sub> &lt; ...&lt; p<sub>n</sub> and p<sub>i</sub>&nbsp;&ne; 0, i =1, ..., n), where p<sub>i</sub> is the relative position of&nbsp;the i-th customer ci to the pizza house on the straight road. The third line of each test case contains n integers e<sub>1</sub>, e<sub>2</sub>, ... , e<sub>n</sub> ( e<sub>i</sub> &gt; 0, i =1, ..., n), where e<sub>i</sub> is the earning to be made by delivering pizzas to the customer c<sub>i</sub>. All integers in the second and third lines are between -100,000 and 100,000 both inclusive.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain the maximum profit by delivering pizzas ordered from the customers.</p>