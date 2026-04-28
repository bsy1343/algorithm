# [Gold II] Shopping Bags - 31667

[문제 링크](https://www.acmicpc.net/problem/31667)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 19, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>As usual, you forgot your reusable shopping bags at home. I guess you have to buy some paper bags. You only have two items on your shopping list, but you need to stock up on a certain quantity of each item since you are planing to throw a party. Each item has a size and the paper bags have a maximum total size they can hold. You will want to buy the fewest possible bags.</p>

<p>More precisely, you need to buy $N_1$ copies of the first item and $N_2$ copies of the second item. Each copy of the first item has size $S_1$ and each copy of the second has size $S_2$. The bags you can buy all have capacity $T$, meaning they can hold any collection of items whose total size is at most $T$.</p>

<p>Determine the fewest bags you must buy such that it is possible to distribute $N_1$ copies of the first item and $N_2$ copies of the second item between these bags while ensuring each bag receives a total item size of at most $T$.</p>

### 입력

<p>The first line of input contains a single integer $T$ ($1 \leq T \leq 10^9$). The second line contains integers $N_1$ and $N_2$ ($1 \leq N_1, N_2 \leq 2\, 000$) indicating the number of copies of the two items you must buy. The third line contains integers $S_1$ and $S_2$ ($1 \leq S_1, S_2 \leq T$) giving the size of a single copy of the respective item. Additionally, the second item will be pretty big: $S_2 \geq T/4$.</p>

### 출력

<p>Output a single integer $B$ on a line by itself indicating the fewest shopping bags that you need to purchase in order to pack all items into the bags.</p>