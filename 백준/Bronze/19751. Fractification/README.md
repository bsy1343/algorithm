# [Bronze III] Fractification - 19751

[문제 링크](https://www.acmicpc.net/problem/19751)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 530, 정답: 362, 맞힌 사람: 327, 정답 비율: 68.987%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Little children love to break their toys so much! And little Andrew is no exception, he breaks into fragments everything he sees. This time he is about to break a set of four positive integers.</p>

<p>Let&#39;s say that <em>fractification</em> of four integers ($a$, $b$, $c$, $d$) is the sum $$ \frac{a}{b} + \frac{c}{d} $$. Little Andrew doesn&#39;t like anything larger that himself, so he wants <em>fractification</em> to be as small as possible.</p>

<p>You were asked to help Andrew in making the <em>fractification</em> of given four integers minimal possible if you are allowed to swap theese integers with each other any way you want.</p>

### 입력

<p>In the first and only line of input there are four positive integers $a$, $b$, $c$ and $d$ splitted by space ($ 1 \le a, b, c, d \le 10^9 $).</p>

### 출력

<p>Print four integers which are the permutation of given four, so their <em>fractification</em> is minimal possible. If there are more than one such permutations, print any.</p>

### 힌트

<p>In the first example output permutation gives us the value of&nbsp; $$ \frac{1}{3} + \frac{2}{4} = \frac{5}{6} $$ which is minimal.</p>

<p>In the second example only possible output leads to value of $$ \frac{5}{5} + \frac{5}{5} = 2 $$</p>