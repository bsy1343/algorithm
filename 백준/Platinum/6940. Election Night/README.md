# [Platinum III] Election Night - 6940

[문제 링크](https://www.acmicpc.net/problem/6940)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>The nation of Cicoci elects its president using a winner-take-all electoral vote system. Each of the $N$ states has one electoral vote, and that vote is awarded to the candidate receiving the highest popular vote in that state. The candidate with the most electoral votes is elected president. If there is a tie, no president will be elected, a constitutional crisis will ensue and the country will be plunged into civil war.</p>

<p>As election returns are tabulated it becomes possible to determine the outcome of the vote in a number of states. But many remain too close to call. You have been retained by Cicoci Press (CP) to compute the possible winners and losers.</p>

### 입력

<p>The input may contain several test cases. The first line of each test case contains two positive integers: the number of states, followed by the number of candidates. Neither exceeds $100$. For each state there is a line stating the number of candidates who might yet win the state, and a list of the identifiers of the candidates who might yet win the state. Candidates are identified by consecutive integers starting from $1$.</p>

### 출력

<p>For each candidate numbered <code>X</code>, in ascending order, print one of the following messages, as appropriate.</p>

<pre>
Candidate X will become president.
Candidate X may become president.
Candidate X will not become president.</pre>

<p>Output a blank line after each test case. The input ends with a line indicating $0$ states and $0$ candidates.</p>