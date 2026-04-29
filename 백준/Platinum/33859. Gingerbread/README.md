# [Platinum IV] Gingerbread - 33859

[문제 링크](https://www.acmicpc.net/problem/33859)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 113, 정답: 45, 맞힌 사람: 38, 정답 비율: 41.304%

### 분류

백트래킹, 수학, 애드 혹, 유클리드 호제법, 정수론

### 문제 설명

<p>Toruń has been known for its traditional gingerbread since the Middle Ages. Young Nicolaus would like to buy a set of $n$ boxes with gingerbread cookies in his favourite shop. The shop has very strict rules, though: Nicolaus initially obtains n boxes that are already filled with cookies: the $i$-th box initially contains $a_i$ of them. Then, Nicolaus can order some extra cookies. He adds extra cookies to some boxes so that the greatest common divisor$^∗$ of the numbers of cookies in all of the boxes becomes equal to $1$. It can be proven that this is always possible.</p>

<p>Help Nicolaus by calculating the smallest number of cookies that need to be added in order to make the greatest common divisor of all the numbers equal to $1$.</p>

<hr>
<p>$^∗$The greatest common divisor (GCD) of multiple numbers is the largest positive integer that divides all of them without remainder.</p>

### 입력

<p>The first line contains an integer $n$ ($2 ≤ n ≤ 10^6$), denoting the number of boxes.</p>

<p>The second line contains $n$ integers $a_1, a_2, \dots , a_n$ ($1 ≤ a_i ≤ 10^7$), where the $i$-th integer $a_i$ denotes the initial number of cookies in the $i$-th box.</p>

### 출력

<p>Output one line with a single integer denoting the smallest number of cookies that Nicolaus should add to the boxes. If Nicolaus doesn’t have to add any cookies to make the greatest common divisor of the numbers equal to $1$, output $0$.</p>

### 힌트

<p>Explanation of the example: Indeed, the greatest common divisor (GCD) of $90$, $84$, and $140$ is $2$, so some cookies must be added. If we add only one cookie, we may obtain the quantities $91$, $84$, $140$ with GCD of $7$, or $90$, $85$, $140$ with GCD of $5$, or $90$, $84$, $141$ with GCD of $3$, so this is not enough. After adding two cookies, one to the first box, and one to the second box, we obtain the quantities $91$, $85$, $140$ with GCD of $1$; hence the answer is $2$. Note that adding both cookies to the first box does not help: we obtain quantities $92$, $84$, $140$ with GCD of $4$.</p>