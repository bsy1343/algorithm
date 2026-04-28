# [Gold IV] Milk Pails (Silver) - 11998

[문제 링크](https://www.acmicpc.net/problem/11998)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 722, 정답: 264, 맞힌 사람: 228, 정답 비율: 39.652%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Farmer John has received an order for exactly \(M\) units of milk (\(1 \leq M \leq 200\)) that he needs to fill right away. Unfortunately, his fancy milking machine has just become broken, and all he has are two milk pails of integer sizes \(X\) and \(Y\) (\(1 \leq X, Y \leq 100\)) with which he can measure milk. Both pails are initially empty. Using these two pails, he can perform up to \(K\) of the following types of operations (\(1 \leq K \leq 100\)):</p>

<p>- He can fill either pail completely to the top.</p>

<p>- He can empty either pail.</p>

<p>- He can pour the contents of one pail into the other, stopping when the former becomes empty or the latter becomes full (whichever of these happens first).</p>

<p>Although FJ realizes he may not be able to end up with exactly \(M\) total units of milk in the two pails, please help him compute the minimum amount of error between \(M\) and the total amount of milk in the two pails. That is, please compute the minimum value of \(|M-M&#39;|\) such that FJ can construct \(M&#39;\) units of milk collectively between the two pails.</p>

### 입력

<p>The first, and only line of input, contains \(X\), \(Y\), \(K\), and \(M\).</p>

### 출력

<p>Output the smallest distance from \(M\) to an amount of milk FJ can produce.</p>

### 힌트

<p>In two steps FJ can be left with the following quanities in his pails</p>

<pre>
(0, 0) = 0 units
(14, 0) = 14 units
(0, 50) = 50 units
(0, 14) = 14 units
(14, 36) = 50 units
(14, 50) = 64 units
</pre>

<p>The closest we can come to 32 units is 14 for a difference of 18. Note that it would require an extra step to pour out the first pail to end up with (0, 36).</p>