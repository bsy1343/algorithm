# [Platinum V] Graph Automata Player - 16800

[문제 링크](https://www.acmicpc.net/problem/16800)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

수학, 선형대수학, 가우스 소거법

### 문제 설명

<p>You and your grandma are playing with graph automata, which is generalization of cell automata.</p>

<p>A graph automaton is expressed by a graph. The vertices of the graph have a time-dependent value, which can be either 0 or 1. There is no more than one edge between any of two vertices, but self-loops might exist.</p>

<p>The values of vertices change regularly according to the following rule: At time <var>t+1</var>, the value of vertex <var>i</var> will be 1 if and only if there are an odd number of edges from the vertex <var>i</var> to a vertex which has the value 1 at time <var>t</var>; otherwise 0.</p>

<p>Now, your forgetful grandma forgot the past states of the automaton. Your task is to write a program which recovers the past states from the current time and states --- time machines are way too expensive. There may be multiple candidates or no consistent states. For such cases, you must print an appropriate error message.</p>

### 입력

<p>The input is formatted as follows:</p>

<pre>
<var>N</var>
<var>a<sub>11</sub></var> ... <var>a<sub>1N</sub></var>
:
:
<var>a<sub>N1</sub></var> ... <var>a<sub>NN</sub></var>
<var>v<sub>1</sub></var>
:
:
<var>v<sub>N</sub></var>
<var>T</var>
</pre>

<p>The first line contains one integer <var>N</var> (<var>2 &le; N &le; 300</var>). <var>N</var> indicates the number of vertices. The following <var>N</var> lines indicate the adjacent matrix of the graph. When <var>(i,j)</var>-element is 1, there is an edge from vertex <var>i</var> to vertex <var>j</var>. Otherwise, there is no edge. The following <var>N</var> lines indicate the value vector of the vertices. The <var>i</var>-th element indicates the value of vertex <var>i</var> at time 0. Each element of the matrix and the vector can be 0 or 1. The last line contains one integer <var>T</var> (<var>1 &le; T &le; 100,000,000</var>). <var>-T</var> is the time your grandma wants to know the status at.</p>

### 출력

<p>Print the value vector at time <var>-T</var> separated one white space in one line as follows:</p>

<pre>
<var>v<sub>1</sub></var> ... <var>v<sub>N</sub></var></pre>

<p>Each value must be separated with one white space. If there is no consistent value vectors, you should print <code>none</code> in one line. Or if there are multiple candidates and the solution is not unique (i.e. the solution is not unique), you should print <code>ambiguous</code> in one line.</p>