# [Silver V] Insulator - 8016

[문제 링크](https://www.acmicpc.net/problem/8016)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 183, 정답: 114, 맞힌 사람: 83, 정답 비율: 66.935%

### 분류

수학, 그리디 알고리즘, 정렬

### 문제 설명

<p>The company Insumax produces multilayer thermal insulators. Each of the i layers, i=1,2,&hellip;,n, of such an insulator is characterized by positive insulation coefficient a<sub>i</sub>. The layers are numbered according to the direction the heat leaks.</p>

<p>&nbsp;&nbsp; &nbsp;heat &rarr; ||a<sub>1</sub>|a<sub>2</sub>|&hellip;|a<sub>i</sub>|a<sub>i+1</sub>|&hellip;|a<sub>n</sub>|| &rarr;</p>

<p>The insulation coefficient of the whole insulator, A, is described by the sum of insulation coefficients of its layers. Moreover, the coefficient A raises if a layer with a smaller insulation coefficient is followed by a layer with a larger coefficient, according to the formula:</p>

<p>\( A= \sum_{i=1}^{n} {a_i} + \sum_{i=1}^{n-1} {max(0, a_{i+1}-a_i)} \).</p>

<p>For example, the insulation coefficient of the insulator of the form</p>

<p>&nbsp;&nbsp; &nbsp;&rarr; ||5|4|1|7|| &rarr;</p>

<p>is A=(5+4+1+7)+(7-1)=23.</p>

<p>
Write a program which, for given insulation coefficients of layers a<sub>1</sub>,a<sub>2</sub>,&hellip;,a<sub>n</sub>, determines such an ordering of the layers that the insulation coefficient of the whole insulator is maximised.</p>

### 입력

<p>In the first line of the standard input there is the number of layers n, 1 &le; n &le; 100,000. In the successive n lines there are coefficients a<sub>1</sub>,a<sub>2</sub>,&hellip;,a<sub>n</sub>, one per line. Those coefficients are integers satisfying the inequalities 1 &le; a<sub>i</sub> &le; 10,000.</p>

### 출력

<p>In the first and only line of the standard output your program should write one integer equal to the largest possible value of the insulation coefficient A of the insulator built of the layers of the given coefficients, put in a particular order.</p>