# [Platinum V] Slastičarnica - 27911

[문제 링크](https://www.acmicpc.net/problem/27911)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

두 포인터

### 문제 설명

<p><em>There is a new bakery in town! Come and try delicious cakes from Dodo&rsquo;s bakery!</em></p>

<p>The bakers have prepared $n$ cakes, the $i$-th of which has sweetness $a_i$. They are displayed on a long table in the given order. There are $q$ people waiting in line to order the best cakes in town. Each of them has an order of the form: &ldquo;I would like to buy $d_i$ cakes whose sweetnesses are at least $s_i$&rdquo;.</p>

<p>Dorijan serves customers in a peculiar way. He will give $d_i$ continuous cakes from the table. To keep the table looking as nice as possible he will only give cakes from the left or the right edge of the table. He noticed that he cannot serve a lot of customers that way, so before serving a customer he will eat some cakes (possibly none) from the edges of the table.</p>

<p>If Dorijan cannot satisfy a customer, he will close the bakery for the day. What is the largest number of customers he can serve, before closing?</p>

### 입력

<p>The first line contains two integers $n$, $q$ ($1 &le; n &le; 5\,000$, $1 &le; q &le; 2 \cdot 10^5$), the number of cakes and the number of people in the line.</p>

<p>The second line contains $n$ numbers $a_i$ ($1 &le; a_i &le; 10^9$), where $a_i$ is the sweetness of the $i$-th cake.</p>

<p>In each of the next $q$ lines there are two integers $d_i$, $s_i$ ($1 &le; d_i &le; n$, $1 &le; s_i &le; 10^9$), the order of the $i$-th customer in line.</p>

### 출력

<p>In the first and only line output the number of customers Dorijan can serve.</p>

### 힌트

<p>Clarification of the third example: Dorijan first eats one cake from the left, then gives the next three cakes with sweetnesses $3$, $2$, and $5$ to the first customer. He then eats another cake from the left and gives the next two cakes with sweetnesses $4$ and $6$ to the second customer. The third customer gets a cake from the right with sweetness $1$ and the fourth gets the last cake with sweetness $2$. Dorijan unfortunately does not have more cakes, so the last customer goes home empty-handed.</p>