# [Bronze II] Davor - 15494

[문제 링크](https://www.acmicpc.net/problem/15494)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 270, 정답: 199, 맞힌 사람: 163, 정답 비율: 74.091%

### 분류

수학, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>After successfully conquering the South Pole, Davor is preparing for new challenges. Next up is the Arctic expedition to Siberia, Greenland and Norway. He begins his travels on 31 December 2018, and needs to collect N kunas (Croatian currency) by then. In order to do this, he has decided to put away X (X &le; 100) kunas every Monday to his travel fund, X + K kunas every Tuesday, X + 2*K every Wednesday, and so on until Sunday, when he will put away X + 6*K kunas. This way, he will collect money for 52 weeks, starting with 1 January 2018 (Monday) until 30 December 2018 (Sunday).</p>

<p>If we know the amount of money N, output the values X and K so that it is possible to collect the exact money amount in the given timespan. The solution will always exist, and if there are multiple, output the one with the greatest X and smallest K.</p>

### 입력

<p>The first line of input contains the integer N (1456 &le; N &le; 145600), the number from the task.</p>

### 출력

<p>The first line of output must contain the value of X (0 &lt; X &le; 100), and the second the value of K (K &gt; 0).</p>