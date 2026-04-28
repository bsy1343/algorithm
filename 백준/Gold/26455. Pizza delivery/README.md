# [Gold III] Pizza delivery - 26455

[문제 링크](https://www.acmicpc.net/problem/26455)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 72, 정답: 38, 맞힌 사람: 32, 정답 비율: 53.333%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>JAG Pizza is the famous pizza shop. Since the number of delivery orders has been increasing, it has been busier than before.</p>

<p>One day, several orders came to this shop at the same time! There were $N$ orders, and $N$ customers who placed the order. The $i$-th customer placed the $i$-th order.</p>

<p>Through past orders, this shop knows information for each customer. For the $i$-th customer, it takes $t_i$ hours for delivering the pizza from the shop, and also takes $t_i$ hours for going back to the shop. Moreover, his or her &quot;irritability&quot; is $a_i$. The bigger irritability a person has, the easier to be angry.</p>

<p>JAG Pizza has to deliver orders for customers, and keep their minds on less customer stress. To formulate the amount of stress which the $i$-th customer feels, let $h_i$ be the time from order to delivery, and let $p_i$ be the number of other customers whose delivery time is faster than that of $i$-th customer. The amount of stress for the $i$-th customer ($s_i$) is formulated as follows: $s_i = a_i \times (h_i + p_i)$.</p>

<p>For less customer stress, and gaining high satisfaction rates, a better delivery plan is necessary. When you think about it, you must take the following things into account:</p>

<ul>
	<li>There is only one delivery person.</li>
	<li>A delivery person cannot deliver several orders in parallel. It means that he or she can deliver a single order at once, and when achieved, he or she gets back to the shop for delivering the next order.</li>
	<li>You can assume that it tooks no time for preparing an order, passing it from the shop to a delivery person, and passing it from a delivery person to a customer.</li>
</ul>

<p>You are the delivery planner of JAG Pizza. Above these information and conditions, you have to minimize the total amount of stress for all customers.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$N$</p>

<p>$t_1$ $a_1$</p>

<p>$\vdots$</p>

<p>$t_N$ $a_N$</p>
</blockquote>

<p>The first line is the number $N$ of customers ($1 &le; N &le; 100\,000$).</p>

<p>The $i$-th of the following $N$ lines consists of two integers $t_i$ and $a_i$, which represent that it takes $t_i$ ($1 &le; t_i &le; 1\,000$) hours for delivering the pizza from the shop to the $i$-th customer, and also takes $t_i$ hours for going back to the shop. Moreover, its irritability is $a_i$ ($1 &le; a_i &le; 1\,000$).</p>

### 출력

<p>Print the minimum total amount of stress.</p>