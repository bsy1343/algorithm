# [Gold I] Rental Service - 15590

[문제 링크](https://www.acmicpc.net/problem/15590)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 670, 정답: 253, 맞힌 사람: 215, 정답 비율: 39.377%

### 분류

그리디 알고리즘, 정렬, 누적 합

### 문제 설명

<p>Farmer John realizes that the income he receives from milk production is insufficient to fund the growth of his farm, so to earn some extra money, he launches a cow-rental service, which he calls &quot;USACOW&quot; (pronounced &quot;Use-a-cow&quot;).</p>

<p>Farmer John has $N$ cows ($1 \leq N \leq 100,000$), each capable of producing some amount of milk every day. The $M$ stores near FJ&#39;s farm ($1 \leq M \leq 100,000$) each offer to buy a certain amount of milk at a certain price. Moreover, Farmer John&#39;s $R$ ($1 \leq R \leq 100,000$) neighboring farmers are each interested in renting a cow at a certain price.</p>

<p>Farmer John has to choose whether each cow should be milked or rented to a nearby farmer. Help him find the maximum amount of money he can make per day.</p>

### 입력

<p>The first line in the input contains $N$, $M$, and $R$. The next $N$ lines each contain an integer $c_i$ ($1 \leq c_i \leq 1,000,000$), indicating that Farmer John&#39;s $i$th cow can produce $c_i$ gallons of milk every day. The next $M$ lines each contain two integers $q_i$ and $p_i$ ($1 \leq q_i, p_i \leq 1,000,000$), indicating that the $i$th store is willing to buy up to $q_i$ gallons of milk for $p_i$ cents per gallon. Keep in mind that Farmer John can sell any amount of milk between zero and $q_i$ gallons to a given store. The next $R$ lines each contain an integer $r_i$ ($1 \leq r_i \leq 1,000,000$), indicating that one of Farmer John&#39;s neighbors wants to rent a cow for $r_i$ cents per day.</p>

### 출력

<p>The output should consist of one line containing the maximum profit Farmer John can make per day by milking or renting out each of his cows. Note that the output might be too large to fit into a standard 32-bit integer, so you may need to use a larger integer type like a &quot;long long&quot; in C/C++.</p>

### 힌트

<p>Farmer John should milk cows #1 and #4, to produce 13 gallons of milk. He should completely fill the order for 10 gallons, earning 250 cents, and sell the remaining three gallons at 15 cents each, for a total of 295 cents of milk profits.</p>

<p>Then, he should rent out the other three cows for 250, 80, and 100 cents, to earn 430 more cents. (He should leave the request for a 40-cent rental unfilled.) This is a total of 725 cents of daily profit.</p>