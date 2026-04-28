# [Gold V] Exam Manipulation - 21139

[문제 링크](https://www.acmicpc.net/problem/21139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 158, 정답: 97, 맞힌 사람: 86, 정답 비율: 82.692%

### 분류

비트마스킹, 브루트포스 알고리즘

### 문제 설명

<p>A group of students is taking a True/False exam. Each question is worth one point. You, as their teacher, want to make your students look as good as possible&mdash;so you cheat! (I know, you would never actually do that.) To cheat, you manipulate the answer key so that the lowest score in the class is as high as possible.</p>

<p>What is the best possible lowest score you can achieve?</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \le n \le 1,000$) and $k$ ($1 \le k \le 10$), where $n$ is the number of students, and $k$ is the number of True/False questions on the exam.</p>

<p>Each of the next $n$ lines contains a string of length $k$, consisting only of upper-case &lsquo;<code>T</code>&rsquo; and uppercase &lsquo;<code>F</code>&rsquo;. This string represents the answers that a student submitted, in the order the questions were given.</p>

### 출력

<p>Output, on a single line, the best possible lowest score in the class.</p>