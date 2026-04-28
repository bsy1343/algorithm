# [Platinum IV] The Math of Sailing - 24861

[문제 링크](https://www.acmicpc.net/problem/24861)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 9, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Captain Polycarp has been dreaming about owning a three-mast sailing ship since he was a child. And at last, his dream is about to come true, he has saved enough money and bought a beautiful caracca &quot;Pulcheria&quot;. However he overlooked the fact that it was sold without any sails on, so now he has to find them separately.</p>

<p>Caracca should have exactly four sails: one on the back mast, one on the front one, and two on the middle one. And Polycarp, coincidentally, has exactly four pieces of fabric with sizes $t_1$, $t_2$, $t_3$ and $t_4$. Polycarp can use those fabric pieces as sails in any order, making them smaller beforehand, if needed.</p>

<p>Let&#39;s denote the size of the front mast sail as $a_1$, the sizes of the middle mast sails as $a_2$ and $a_3$ and the size of the back mast one as $a_4$. The <em>maneuverability</em> of the ship is calculated as $a_1 a_4 + a_2 + a_3$ and its <em>stability</em> is calculated as $a_1 + a_4 + a_2 a_3$.</p>

<p>For the caracca to walk the sea safely captain has to adjust the sails in such a way that the maneuverability of the ship is equal to its stability. And for maximum comfort, these two values should be as large as possible.</p>

<p>To sum it up, Polycarp has to lower the values of $t_1, \ldots, t_4$ if needed, and then distribute the resulting sizes among the four sails in any order so that the following equality will hold and both of its sides will be maximal possible: $a_1 a_4 + a_2 + a_3 = a_1 + a_4 + a_2 a_3$.</p>

<p>Help him find a way to make the ship&#39;s maneuverability equal to its stability while maximizing both of these equal values.</p>

### 입력

<p>The first and only line of input contains four integers $t_1$, $t_2$, $t_3$ and $t_4$ --- the sizes of pieces of fabric Polycarp has ($1 \leq t_i \leq 10^4$).</p>

### 출력

<p>In the first line of output print $p$ --- a permutation of integers from $1$ to $4$, the $i$-th number in it should specify from which piece of fabric was the $i$-th sail created. For example, if the second sail was created by decreasing the size of the fourth piece of fabric then $p_2 = 4$.</p>

<p>In the second line print space-separated values $a_1$, $a_2$, $a_3$ and $a_4$ --- the resulting sizes of the sails ($1 \leq a_1, a_2, a_3, a_4 \leq 10^4$). These values don&#39;t have to be integers.</p>

<p>Your answer is accepted if the absolute error of the resulting maneuverability and stability compared to the correct answer does not exceed $2 \cdot 10^{-6}$ and both of those values differ from each other by no more than $10^{-6}$.</p>