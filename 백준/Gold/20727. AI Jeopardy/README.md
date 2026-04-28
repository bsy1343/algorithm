# [Gold IV] AI Jeopardy - 20727

[문제 링크](https://www.acmicpc.net/problem/20727)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 70, 정답: 23, 맞힌 사람: 14, 정답 비율: 25.926%

### 분류

이분 탐색, 수학

### 문제 설명

<p>The robot revolution is finally here, albeit not quite in the highly explosive way envisioned in various science fiction books and movies. It seems that, perhaps due to a small typo in the AI source code, the robots are not taking our lives but instead taking our livelihoods. One early job market fatality in this revolution was the (somewhat niche) occupation as jeopardy player: already in 2011 the <em>Watson</em> computer defeated two legendary but inferior human jeopardy champions.</p>

<p>Nowadays, more and more of Jeopardy&#39;s <em>viewers</em> are AIs themselves and as such the show is considering having categories on topics that are more popular with this new number-crunching viewer base. &nbsp;Focus group testing has revealed that AIs are particularly fond of the &quot;Binomial Coefficients&quot; category. &nbsp;The premise of this category is that the answer that contestants get is some positive integer $X$, and the contestants must respond with a question of the form &quot;What is $n$ choose $k$?&quot; (and this is a correct response if the binomial coefficient $n$ choose $k$ equals $X$).</p>

<p>Write an AI to play this new Jeopardy category. &nbsp;If there are several different possible solutions for $n$ and $k$, the AI should choose the most elegant solution, having the smallest value of $n$, and of those with the smallest $n$ it should choose the one with the smallest value of $k$.</p>

### 입력

<p>Input consists of a single integer $X$ ($1 \le X \le 10^{100}$).</p>

### 출력

<p>Output two non-negative integers $n$ and $k$ such that the binomial coefficient $n$ choose $k$ equals $X$, with ties between multiple solutions broken as explained above.</p>