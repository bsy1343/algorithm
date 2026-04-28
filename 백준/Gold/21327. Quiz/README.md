# [Gold II] Quiz - 21327

[문제 링크](https://www.acmicpc.net/problem/21327)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 36, 맞힌 사람: 33, 정답 비율: 50.769%

### 분류

다이나믹 프로그래밍, 정렬, 배낭 문제

### 문제 설명

<p>In the quiz ProgrammeringsQuiz there are $N$ questions in total, distributed over $M$ different categories (for example, algorithm theory, compiler construction or Sven knowledge).</p>

<p>The questions are worth different amounts of points. Additionally, you will get a bonus $B$ if you answer all questions in a certain category. Simone has participated in Programmeringsolympiaden since 8th grade, so she is able to answer all the questions.</p>

<p>Unfortunately, there is a time limit to the quiz. Despite never giving the wrong answer, Simone will only have time to answer $K$ questions. What is the maximum number of points she can achieve?</p>

### 입력

<p>The first line consists of four integers $1 \le N \le 1000$, $1 \le M \le N$, $1 \le K \le N$, $1 \le B \le 100\,000$. The following $N$ lines consist of two integers each: the points given for answering the question (an integer between $1$ and $1\,000$) and which category it belongs to (between $1$ and $M$). Each category will have at least one question.</p>

### 출력

<p>Print one line containing the maximal possible number of points.</p>

### 힌트

<p>In the first sample Simone answers both questions from category 1 ($300 + 400 = 700$ points) and the only question in category 2 ($200$ points). Since these were the only questions in these two categories we get two bonuses, which gives a total of $200 + 700 + 2 \cdot 1000 = 2900$ points.</p>