# [Platinum V] CodeCoder vs TopForces - 13475

[문제 링크](https://www.acmicpc.net/problem/13475)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 227, 정답: 67, 맞힌 사람: 57, 정답 비율: 32.571%

### 분류

그래프 이론, 그래프 탐색, 정렬

### 문제 설명

<p>Competitive programming is very popular in Byteland. In fact, every Bytelandian citizen is registered&nbsp;at two programming sites &mdash; CodeCoder and TopForces. Each site maintains its own proprietary rating&nbsp;system. Each citizen has a unique integer rating at each site that approximates their skill. Greater rating&nbsp;corresponds to better skill.</p>

<p>People of Byteland are naturally optimistic. Citizen A thinks that he has a chance to beat citizen B in&nbsp;a programming competition if there exists a sequence of Bytelandian citizens A = P<sub>0</sub>, P<sub>1</sub>, . . . , P<sub>k</sub> = B for&nbsp;some k &ge; 1 such that for each i (0 &le; i &lt; k), P<sub>i</sub> has higher rating than P<sub>i+1</sub> at one or both sites.</p>

<p>Each Bytelandian citizen wants to know how many other citizens they can possibly beat in a programming&nbsp;competition.</p>

### 입력

<p>The first line of the input contains an integer n &mdash; the number of citizens (1 &le; n &le; 100 000). The&nbsp;following n lines contain information about ratings. The i-th of them contains two integers CC<sub>i</sub> and&nbsp;T F<sub>i</sub> &mdash; ratings of the i-th citizen at CodeCoder and TopForces (1 &le; CC<sub>i</sub>, T F<sub>i</sub> &le; 10<sup>6</sup>). All the ratings at&nbsp;each site are distinct.</p>

### 출력

<p>For each citizen i output an integer b<sub>i</sub> &mdash; how many other citizens they can possibly beat in a programming&nbsp;competition. Each b<sub>i</sub> should be printed in a separate line, in the order the citizens are given in the input.</p>