# [Gold III] Kool Strings - 33145

[문제 링크](https://www.acmicpc.net/problem/33145)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 57, 정답: 40, 맞힌 사람: 36, 정답 비율: 75.000%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Professor Kardashi is known for always being fashionable and for her passion for computer science. Her current obsessions are binary strings and efficiency. In particular, she says that a binary string is <em>kool</em> if it does not contain $K$ or more consecutive identical characters.</p>

<p>To test your skills, Professor Kardashi gives you a binary string $S$ and allows you to perform the following operation on it: choose an index $i$ and flip the value of $S_i$ (changing a “<code>0</code>” to “<code>1</code>” or a “<code>1</code>” to “<code>0</code>”).</p>

<p>Your task is to transform $S$ into a kool string using the minimum number of operations.</p>

### 입력

<p>The input consists of a single line that contains an integer $K$ and a binary string $S$ ($2 ≤ K ≤ |S| ≤ 10^5$).</p>

### 출력

<p>Output a single line with an integer indicating the minimum number of operations needed to transform $S$ into a kool string, followed by a kool string that can be obtained after applying that number of operations to $S$. If there are multiple solutions, output any of them.</p>