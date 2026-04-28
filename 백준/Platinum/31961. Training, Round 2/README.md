# [Platinum II] Training, Round 2 - 31961

[문제 링크](https://www.acmicpc.net/problem/31961)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 188, 정답: 48, 맞힌 사람: 44, 정답 비율: 29.333%

### 분류

다이나믹 프로그래밍, 비트 집합

### 문제 설명

<p>Ashley is training for another programming contest on Brandon&#39;s Online Judge. Brandon&#39;s Online Judge still has the same feature which allows Ashley&#39;s coach, Tom, to load in a list of problems for Ashley to work on.</p>

<p>Tom has curated some problems for Ashley to work on. Each problem is parameterized by &quot;implementation difficulty&quot; with a range, and &quot;thinking difficulty&quot; with a range.</p>

<p>Ashley starts out with a given implementation skill and thinking skill level. Ashley will train on Tom&#39;s curated list of problems as follows: she will look at the first problem on the list and either solve it or skip it. She will then repeat this for every problem in the list in the order Tom loaded the problems. Once she has skipped a problem, she can never go back to it. Ashley will only solve a problem if her current implementation skill and current thinking skill both land within the range, inclusive, for the given problem. After solving a problem, Ashley will reflect on her experience, which allows her to increase either her implementation skill level by one or her thinking skill level by one. She cannot increase both simultaneously, nor can she skip the reflection.</p>

<p>Compute the maximum number of problems that Ashley can solve if she plans her reflections optimally.</p>

### 입력

<p>The first line of input contains three integers $n$ ($1 \le n \le 5\,000$), $i$ and $t$ ($0 \le i,t \le 10^9$), where $n$ is the number of problems Tom has given Ashley, $i$ is Ashley&#39;s starting implementation skill level and $t$ is Ashley&#39;s starting thinking skill level.</p>

<p>Each of the next $n$ lines contains four integers $i_{low}$, $i_{high}$ ($0 \le i_{low} \le i_{high} \le 2 \cdot 10^9$), $t_{low}$, $t_{high}$ ($0 \le t_{low} \le t_{high} \le 2 \cdot 10^9$). Each line describes a problem, where its implementation difficulty is in the range $[i_{low},i_{high}]$ and its thinking difficulty is in the range $[t_{low},t_{high}]$, each inclusive. Ashley can only solve a problem if her current implementation skill levels falls within the implementation difficulty range and her thinking skill level falls within the thinking difficulty range, each inclusive.</p>

### 출력

<p>Output a single integer, which is the maximum number of problems Ashley can solve if she chooses her reflection after each solution optimally.</p>