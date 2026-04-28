# [Gold III] Romualdych and remainders - 31130

[문제 링크](https://www.acmicpc.net/problem/31130)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

수학, 해 구성하기, 사칙연산

### 문제 설명

<p>Old man Romualdych learned about division with remainders and it just threw him off the hinges. The thing got him all mixed up and sweating like a pig. What a sad sight he was, hoping to find some number $x$ in the interval $[a,b]$, that would produce the specified remainder $r$ when divided by some number $y$. Let&#39;s face it --- Romualdych is not the sharpest tool in the shed, and even if he sinks his few remaining teeth into the task, he is not likely to cope without your help.</p>

### 입력

<p>The first line contains a single integer $T$ --- the number of tests in the file ($1 \le n \le 200\,000$).</p>

<p>Each of the following $T$ lines contains three integers: $a$, $b$ --- interval bounds, and $r$ --- required remainder ($0 \le a \le b \le 10^{18}$, $0 \le r \le 10^{18}$).</p>

### 출력

<p>Print $T$ answers in the same order as the tests in the input file are given, one answer per line.</p>

<p>Each answer consists of two integers $x$ and $y$, such that $a \le x \le b$, $1 \le y \le 2 \cdot 10^{18}$, and the remainder from the division of $x$ by $y$ equals $r$. If there are several possible answers that fit all the requirements, choose any answer with the minimal $x$. If there are no possible answers, print two integers: $x = -1$ and $y = -1$.</p>

### 힌트

<p>In the first test, 6 is divided by 3, and the remainder is indeed 0. Since 6 is the smallest number in the interval $[6,8]$, this is the correct answer. Instead, the following answer can be printed too: $x = 6$ and $y = 2$ (minimizing $y$ is not required), while the answer $x = 8$ and $y = 4$ cannot be printed, because its $x$ is not minimal.</p>

<p>In the second test, there are no answers, since it is impossible to get a remainder of 10 for $x$ in the interval [3,5] regardless of the $y$ it is divided by.</p>