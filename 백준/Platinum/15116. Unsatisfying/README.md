# [Platinum I] Unsatisfying - 15116

[문제 링크](https://www.acmicpc.net/problem/15116)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 82, 정답: 23, 맞힌 사람: 19, 정답 비율: 35.185%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 많은 조건 분기, 최단 경로, 데이크스트라, 강한 연결 요소, 2-sat, 0-1 너비 우선 탐색

### 문제 설명

<p>Usually a computer scientist tries to satisfy some constraints. This time you will try to make some logical statements unsatisfiable.</p>

<p>You will be given a list of logical statements of the following form:</p>

<p style="text-align:center">p<sub>1</sub> &or; p<sub>2</sub>,<br />
&not;p<sub>2</sub> &or; p<sub>3</sub>,<br />
p<sub>3</sub> &or; &not;p<sub>4</sub>.</p>

<p>Each of the p<sub>i</sub> is a proposition that can be either <code>true</code> or <code>false</code>. The disjunction operator &or; can be interpreted as logical OR. The &not; symbol is negation, which negates the value of the subsequent proposition from <code>true</code> to <code>false</code>, and vice versa.</p>

<p>To satisfy a list of logical statements, you must assign either <code>true</code> or <code>false</code> to each of the propositions such that every disjunction in the list evaluates to <code>true</code>.</p>

<p>Your task is to add disjunctions to the list to make the list of statements unsatisfiable. But the additional disjunctions you add cannot use the negation symbol!</p>

<p>All disjunctions (both those given and ones you add) must have exactly 2 terms.</p>

### 입력

<p>The first line of input contains two space-separated integers n and m (1 &le; n, m &le; 2,000), with n representing the number of propositions and m representing the number of disjunctions.</p>

<p>Each of the next m lines contains two space-separated integers a<sub>i</sub> and b<sub>i</sub> (1 &le; |a<sub>i</sub>|, |b<sub>i</sub>| &le; n), which describes the two propositions of the ith disjunction in the given list. A positive value a<sub>i</sub>, for example, represents the proposition p<sub>a<sub>i</sub></sub>. On the other hand, if a<sub>i</sub> is negative, it represents the negated proposition, namely &not;p<sub>|a<sub>i</sub>|</sub>.</p>

<p>The second sample input corresponds to the following list of logical statements:</p>

<p style="text-align:center">p<sub>1</sub> &or; p<sub>2</sub>,<br />
&not;p<sub>1</sub> &or; &not;p<sub>3</sub>,<br />
&not;p<sub>2</sub> &or; p<sub>3</sub>,<br />
p<sub>3</sub> &or; &not;p<sub>4</sub>,<br />
&not;p<sub>2</sub> &or; &not;p<sub>3</sub>.</p>

### 출력

<p>Output, on a single line, a single integer representing the minimum number of additional disjunctions necessary to make the list unsatisfiable. If it is not possible to make the list unsatisfiable, print -1 instead. Each disjunction you add must have two (not necessarily distinct) propositions, and you may not use negated propositions.</p>

<p>&nbsp;</p>

### 힌트

<p>In the second sample case, adding a disjunction p<sub>2</sub> &or; p<sub>2</sub> makes the list unsatisfiable.</p>