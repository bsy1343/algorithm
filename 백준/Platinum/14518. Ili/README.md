# [Platinum I] Ili - 14518

[문제 링크](https://www.acmicpc.net/problem/14518)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 24, 맞힌 사람: 22, 정답 비율: 57.895%

### 분류

브루트포스 알고리즘, 애드 혹, 비트마스킹, 비트 집합

### 문제 설명

<p>Mirko is building a simple logic circuit in his workshop. The circuit consists of n starting wires denoted with x<sub>1</sub>, x<sub>2</sub>, . . . , x<sub>n</sub> and m logic elements OR denoted with c<sub>1</sub>, c<sub>2</sub>, . . . , c<sub>m</sub>. Each element has exactly two inputs and one output. Each of the inputs is connected to either a starting wire x<sub>j</sub> or to the output of another element c<sub>j</sub>. Of course, there are no cycles in a logic circuit and, moreover, it holds that the input of c<sub>j</sub> can be connected to the output of c<sub>i</sub> only when it holds i &lt; j.</p>

<p>Each starting wire in the circuit can be set to value 0 or 1, and the value of the output of each element is the logic OR operation of its inputs &mdash; the value is 0 if the values of both inputs are 0, otherwise it is 1.</p>

<p>Mirko does not know the initial values of the starting wires, but with careful measurements, he has determined the values of the output of some elements. Find the remaining values of the outputs that can be unambiguously determined based on the measurements.</p>

### 입력

<p>The first line of input contains the positive integers n and m &mdash; the number of starting wires and the number of elements in the circuit. The following line contains a string of exactly m characters that describes the measured value of the output of the element c<sub>j</sub>, or is equal to &ldquo;?&rdquo; if Mirko did not perform this measurement. The j th of the following m lines contains labels of two inputs of the circuit c<sub>j</sub>, each label being either a label of the starting wire in the form of &ldquo;x<sub>i</sub>&rdquo; where it holds 1 &le; i &le; n, or a label of the element &ldquo;c<sub>i</sub>&rdquo; where it holds 1 &le; i &lt; j. The two inputs of the element c<sub>j</sub> may be the same. You can assume that the measured values are mutually consistent.</p>

### 출력

<p>The first line of output must contain a string of m characters &mdash; the j th character in the string must correspond to the value of the output of c<sub>j</sub> or be &ldquo;?&rdquo; if that value cannot be unambiguously determined.</p>