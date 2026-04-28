# [Gold V] Dollar Dayz - 26988

[문제 링크](https://www.acmicpc.net/problem/26988)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 115, 정답: 56, 맞힌 사람: 50, 정답 비율: 52.632%

### 분류

다이나믹 프로그래밍, 배낭 문제, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Farmer John goes to Dollar Days at The Cow Store and discovers an unlimited number of tools on sale. During his first visit, the tools are selling variously for \$1, \$2, and \$3. Farmer John has exactly \$5 to spend. He can buy 5 tools at \$1 each or 1 tool at \$3 and an additional 1 tool at \$2. Of course, there are other combinations for a total of 5 different ways FJ can spend all his money on tools. Here they are:</p>

<pre>
        1 @ US$3 + 1 @ US$2
        1 @ US$3 + 2 @ US$1
        1 @ US$2 + 3 @ US$1
        2 @ US$2 + 1 @ US$1
        5 @ US$1
</pre>

<p>Write a program than will compute the number of ways FJ can spend N dollars (1 &le; N &le; 1000) at The Cow Store for tools on sale with a cost of \$1..\$K (1 &le; K &le; 100).</p>

### 입력

<p>A single line with two space-separated integers: N and K.</p>

### 출력

<p>A single line with a single integer that is the number of unique ways FJ can spend his money.</p>