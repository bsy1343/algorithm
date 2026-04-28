# [Bronze III] Water Journal - 31312

[문제 링크](https://www.acmicpc.net/problem/31312)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 424, 정답: 227, 맞힌 사람: 211, 정답 비율: 53.418%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>Every day, Eugene logs how many cups of water he drank. He forgot to log one entry in his journal though, but he remembers the minimum number and maximum number of cups of water he drank every day since he started logging his journal, and that there was at least one day where he drank the minimum and one day where he drank the maximum. Compute all possible amounts of cups of water he could have imbibed on the day he forgot to log.</p>

### 입력

<p>The first line of input contains three integers $n$ ($2 \le n \le 50$), $a$ and $b$ ($1 \le a \le b \le 50$), where $n$ is the number of days in Eugene&#39;s log, $a$ is the minimum number of cups of water he drank on any day, and $b$ is the associated maximum.</p>

<p>Each of the next $n-1$ lines contains a single integers $w$ ($a \le w \le b$). These are the entries in Eugene&#39;s log for every day except the day he forgot to log an entry. </p>

### 출력

<p>Output in increasing order, all of the possible values for the missing entry separated by whitespace, or simply output -1 if Eugene&#39;s memory is faulty and it isn&#39;t possible. </p>