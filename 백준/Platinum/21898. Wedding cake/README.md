# [Platinum V] Wedding cake - 21898

[문제 링크](https://www.acmicpc.net/problem/21898)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 5, 맞힌 사람: 5, 정답 비율: 35.714%

### 분류

해 구성하기

### 문제 설명

<p>Julia&#39;s wedding is going to have a huge one ton cake. All $n$ guests want to taste the cake, so it&#39;s going to be cut in $n$ pieces. But this task is not that easy, because all guests are on a special mathematical diet. Guest $i$ is only willing to eat the cake if the weight of his piece in tons $w_i$ has exactly $a_i$ significant digits after the decimal point. In decimal representation all digits up to the last non-zero digit after the decimal point are significant. For example, number <code>0.007</code> contains three significant digits after the decimal point, number <code>1.45</code> --- two, and number <code>17.0</code> has no significant digits after the decimal point.</p>

<p>Your task is to cut the cake for Julia&#39;s wedding so that every guest could taste it.</p>

### 입력

<p>First line contains single integer $n$ --- number of guests ($1 \le n \le 10^5$).</p>

<p>Next line contains $n$ integers $a_i$ --- constraint for the weight of $i$-th piece ($1 \le a_i \le 10^5$).&nbsp;</p>

<p>Sum of all $a_i$ doesn&#39;t exceed $10^5$.</p>

### 출력

<p>Output should contain &quot;<code>NO</code>&quot;, if there is no way to cut the cake.</p>

<p>Otherwise, output &quot;<code>YES</code>&quot; on the first line. Each of the next $n$ lines should contain one single real number $w_i$ --- weight of the piece for the $i$-th guest with exactly $a_i$ digits after the decimal point. All $a_i$ digits after the decimal point have to be significant.</p>