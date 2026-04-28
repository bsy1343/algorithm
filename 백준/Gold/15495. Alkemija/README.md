# [Gold I] Alkemija - 15495

[문제 링크](https://www.acmicpc.net/problem/15495)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 38, 정답: 32, 맞힌 사람: 27, 정답 비율: 87.097%

### 분류

방향 비순환 그래프, 그래프 이론, 위상 정렬

### 문제 설명

<p>In ancient times, when alchemists were searching for gold, the world was familiar with a total of N distinct substances, denoted with 1 to N. During many years of hard work, searching for the secret formula, alchemists discovered a series of interesting regularities - alchemical reactions. In one reaction, it&rsquo;s possible to transform substance set {X<sub>1</sub>, X<sub>2</sub>, &hellip;, X<sub>L</sub>} to another substance set {Y<sub>1</sub>, Y<sub>2</sub>, &hellip;, Y<sub>R</sub>}. For example, the substance set {1, 4, 5} might react once and create the new substance set {2, 6}.</p>

<p>Jo&scaron;ko is a modern alchemist and has M distinct substances denoted with A<sub>1</sub>, A<sub>2</sub>, &hellip;, A<sub>M</sub>. He has an unlimited quantity of each substance from that set. Jo&scaron;ko wants to know which substances he can create using a list of reactions of ancient alchemists, so he&rsquo;s asking you to help him solve this problem.</p>

### 입력

<p>The first line of input contains two integers N and M (1 &le; M &le; N &le; 100 000), the numbers from the task.</p>

<p>The second line of input contains M integers Ai (1 &le; A<sub>i</sub> &le; N), labels of the substances Jo&scaron;ko has in the beginning.</p>

<p>The third line of input contains the integer K (1 &le; K &le; 100 000), the number of known reactions.</p>

<p>The following 3&middot;K lines contain a list of reactions. Each reaction is described with 3 lines in the following way:</p>

<ul>
	<li>The first line contains the integers L and R (1 &le; L, R &le; N).</li>
	<li>The second line contains L distinct integers X<sub>i</sub> (1 &le; X<sub>i</sub> &le; N).</li>
	<li>The third line contains R distinct integers Y<sub>i</sub> (1 &le; Y<sub>i</sub> &le; N).</li>
	<li>This describes the reaction with which the substance set {X<sub>1</sub>, X<sub>2</sub>, &hellip;, X<sub>L</sub>} transforms into substance set {Y<sub>1</sub>, Y<sub>2</sub>, &hellip;, Y<sub>R</sub>}.</li>
</ul>

<p>The sum of all L values won&rsquo;t exceed 100 000.</p>

<p>The sum of all R values won&rsquo;t exceed 100 000.</p>

### 출력

<p>The first line of output must contain the integer X, the number of obtainable substances. The second line of output must contain X distinct integers B<sub>i</sub>, sorted ascendingly, that represent the labels of the obtainable substances.</p>

### 힌트

<p><strong>Clarification of the first test case:</strong></p>

<p>There are 2 reactions.</p>

<p>The first reaction transforms substance set {1, 2} into substance set {3}.</p>

<p>The second reaction transforms substance set {1, 3} into substance set {4}.</p>

<p>Jo&scaron;ko initially has substances from the set {1, 2}.</p>

<p>Using the first reaction, Jo&scaron;ko can obtain substance 3, after which he has substances from the set {1, 2, 3}.</p>

<p>After that, using the second reaction, he can also obtain substance 4.</p>

<p><strong>Clarification of the second test case:</strong></p>

<p>Jo&scaron;ko initially has substances from the set {1, 4, 5}.</p>

<p>Using the second reaction, it is possible to obtain substance 6, after which it is possible to apply the third reaction, giving substance 2.</p>

<p>The first reaction is impossible to apply because Jo&scaron;ko doesn&rsquo;t have substance 3.</p>