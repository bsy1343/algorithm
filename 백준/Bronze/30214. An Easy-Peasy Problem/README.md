# [Bronze V] An Easy-Peasy Problem - 30214

[문제 링크](https://www.acmicpc.net/problem/30214)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 4629, 정답: 3163, 맞힌 사람: 3040, 정답 비율: 68.546%

### 분류

수학, 사칙연산

### 문제 설명

<p>Travis was recently saddled with writing the easy problem for a competitive programming contest aimed at high school students. Writing an easy problem is a bit of a challenge for Travis; a problem labeled as &ldquo;Medium Difficulty Level&rdquo; by Travis typically ends up being the hardest problem of the set!</p>

<p>But this time things were different. When the contest was over, Travis was happy that everyone solved his problem. However, some of the other judges informed Travis a problem is easy only if at least half of the contestants solve the problem in the first half of the contest.</p>

<p>Travis has some data on his problem, and now he wants to determine: was his problem truly easy?</p>

<p>In programming competitions, the term &ldquo;solves&rdquo; is used to refer to the number of correct submissions for a problem, i.e., that many contestants solved the problem.</p>

<p>Given the number of solves for Travis&rsquo;s problem at the end of the first half and at the end of the contest, determine whether at least half the people solved the problem in the first half. Note that solves at the end of the contest includes solves of the first half as well.</p>

### 입력

<p>There is only one input line; it contains two integers, s<sub>1</sub> and s<sub>2</sub> (0 &le; s<sub>1</sub> &le; s<sub>2</sub>; 1 &le; s<sub>2</sub> &le; 100), representing solves of Travis&rsquo;s problem at the end of the first half and at the end of the contest, respectively.</p>

### 출력

<p>Print &ldquo;<code>E</code>&rdquo; (quotes for clarity) if the problem is considered easy by the other judges&rsquo; standards. Print &ldquo;<code>H</code>&rdquo; (quotes for clarity) if the problem is not considered easy by the other judges&rsquo; standards. Everyone knows that if Travis is not writing an easy problem, the problem is probably hard!</p>