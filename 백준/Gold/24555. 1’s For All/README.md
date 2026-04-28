# [Gold III] 1’s For All - 24555

[문제 링크](https://www.acmicpc.net/problem/24555)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 176, 정답: 42, 맞힌 사람: 30, 정답 비율: 22.222%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The <em>complexity</em>&nbsp;of an integer is the minimum number of $1$&#39;s needed to represent it using only addition, multiplication and parentheses. For example, the complexity of $2$ is $2$ (writing $2$ as $1+1$) and the complexity of $12$ is $7$ (writing $12$ as $(1+1+1)\times (1+1+1+1)$). We&#39;ll modify this definition slightly to allow the concatenation operation as well. This operation (which we&#39;ll represent using &copy;) takes two integers and &quot;glues&quot; them together, so $12\ $&copy;$\ 34$ becomes the four digit number $1234$. Using this operation, the complexity of $12$ is now $3$ (writing it either as $(1 \ $&copy;$\ 1) + 1$ or $1\ $&copy;$\ (1+1)$). &nbsp;Note that the concatenation operation ignores any initial zeroes in the second operand: $1\ $&copy;$\ 01$ does not result in $101$ but results in $11$.</p>

<p>We&#39;ll give you $1$ guess what the object of this problem is.</p>

### 입력

<p>Each test case consists of a single line containing an integer $n$, where $0 &lt; n \leq 100\, 000$.</p>

### 출력

<p>Output the complexity of the number, using the revised definition above.</p>