# [Silver II] Roundabout Rounding - 33062

[문제 링크](https://www.acmicpc.net/problem/33062)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 488, 정답: 184, 맞힌 사람: 155, 정답 비율: 40.365%

### 분류

수학

### 문제 설명

<p>Bessie the cow is back in school! She has started doing her math homework in which she is tasked to round positive integers to powers of $10$.</p>

<p>To round a positive integer $a$ to the nearest $10^b$, where $b$ is a positive integer, Bessie first locates the $b$'th digit from the right. Let $x$ denote this digit.</p>

<p>If $x \geq 5$, Bessie adds $10^b$ to $a$.</p>

<p>Then, Bessie sets all the digits including and to the right of the $b$'th digit from the right to be $0$.</p>

<p>For instance, if Bessie wanted to round $456$ to the nearest $10^2$ (hundred), Bessie would first locate the $2$nd digit from the right which is $5$. This means $x = 5$. Then since $x \geq 5$, Bessie adds $100$ to $a$. Finally, Bessie sets all the digits in $a$ to the right of and including the $2$nd digit from the right to be $0$, resulting in $500$.</p>

<p>However, if Bessie were to round $446$ to the nearest $10^2$, she would end up with $400$.</p>

<p>After looking at Bessie's homework, Elsie thinks she has invented a new type of rounding: chain rounding. To chain round to the nearest $10^b$, Elsie will first round to the nearest $10^1$, then the nearest $10^2$, and so on until the nearest $10^b$.</p>

<p>Bessie thinks Elsie is wrong, but is too busy with math homework to confirm her suspicions. She tasks you to count how many integers $x$ at least $2$ and at most $N$ ($1 \leq N \leq 10^{9}$) exist such that rounding $x$ to the nearest $10^P$ is different than chain rounding to the nearest $10^P$, where $P$ is the smallest integer such that $10^P \geq x$.</p>

### 입력

<p>You have to answer multiple test cases.</p>

<p>The first line of input contains a single integer $T$ ($1 \leq T \leq 10^5$) denoting the number of test cases. $T$ test cases follow.</p>

<p>The first and only line of input in every test case contains a single integer $N$. All $N$ within the same input file are guaranteed to be distinct.</p>

### 출력

<p>Output $T$ lines, the $i$'th line containing the answer to the $i$'th test case. Each line should be an integer denoting how many integers at least $2$ and at most $N$ exist that are different when using the two rounding methods.</p>

### 힌트

<p>Consider the second test case in the sample. $48$ should be counted because $48$
chain rounded to the nearest $10^2$ is $100$ ($48\to 50\to 100$), but $48$
rounded to the nearest $10^2$ is
$0$.

</p><p>In the third test case, two integers counted are $48$ and $480$. $48$ chain 
rounds to $100$ instead of to $0$ and $480$ chain rounds to $1000$ instead of
$0$.  However, $67$ is not counted since it chain rounds to $100$ which is $67$
rounded to the nearest $10^2$.

				</p>