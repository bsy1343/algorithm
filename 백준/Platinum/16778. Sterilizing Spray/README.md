# [Platinum I] Sterilizing Spray - 16778

[문제 링크](https://www.acmicpc.net/problem/16778)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 90, 정답: 29, 맞힌 사람: 27, 정답 비율: 39.706%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Mr. JOI is working at the IOI Pharmaceutical Co., Ltd. In this company, researchers are busy with experimental work to develop new sterilization sprays.</p>

<p>In this company, the strength of a sterilization spray is defined as follows: when we use a spray of strength x once for a culture plate with y bacteria, the number of bacteria on it becomes &lfloor;y/x&rfloor;, which is the integer obtained from y/x by rounding off fractions. Now, a new spray of strength K is developed. In order to test the performance of this spray, they plan to experiment on it. They use N culture plates numbered 1, . . . , N. At the beginning, there are C<sub>i</sub> bacteria on the culture plate i. In the experiment, they implement Q operations in sequence. Each operation is one of the following:</p>

<ul>
	<li>Operation 1: Choose a culture plate a and an integer b, and adjust the number of bacteria on the culture plate a. After this operation, the number of bacteria on the culture plate a becomes b.</li>
	<li>Operation 2: Choose two integers l,r with 1 &le; l &le; r &le; N. Spray once for each of the culture plates l, l + 1, . . . ,r &minus; 1,r.</li>
	<li>Operation 3: Choose two integers l,r with 1 &le; l &le; r &le; N. Calculate the sum of the numbers of bacteria on the culture plates l, l + 1, . . . ,r &minus; 1,r, and record it.</li>
</ul>

<p>Mr. JOI is curious about the results of the experiment assuming that the new spray works as expected. Since you are a good programmer, he asks you to predict the results of the experiment.</p>

<p>Write a program which determines the numbers recorded by the operation 3s in the experiment.</p>

<p>Given the strength of the spray and the information on the operations in the experiment, write a program which determines the numbers recorded by the operation 3s.</p>

### 입력

<p>Read the following data from the standard input.</p>

<ul>
	<li>The first line of input contains three space separated integers N, Q, K. This means the strength of the spray is K, the number of culture plates is N, and the number of operations in the experiment is Q.</li>
	<li>The i-th line (1 &le; i &le; N) of the following N lines contains an integer C<sub>i</sub>. This means there are C<sub>i</sub> bacteria on the culture plate i at the beginning of the experiment.</li>
	<li>The i-th line (1 &le; i &le; Q) of the following Q lines contains three space separated integers S<sub>i</sub>, T<sub>i</sub>, U<sub>i</sub>. They indicate information on the i-th operation in the experiment.
	<ul>
		<li>When S<sub>i</sub> = 1, they mean the operation 1 with a = T<sub>i</sub>, b = U<sub>i</sub>.</li>
		<li>When S<sub>i</sub> = 2, they mean the operation 2 with l = T<sub>i</sub>, r = U<sub>i</sub>.</li>
		<li>When S<sub>i</sub> = 3, they mean the operation 3 with l = T<sub>i</sub>, r = U<sub>i</sub>.</li>
	</ul>
	</li>
</ul>

### 출력

<p>Write the numbers recorded by the operation 3s in the experiment. The number of lines in the output is equal to the number of the operation 3s implemented in the experiment.</p>

### 제한

<p>All input data satisfy the following conditions.</p>

<ul>
	<li>1 &le; N &le; 100 000.</li>
	<li>1 &le; Q &le; 100 000.</li>
	<li>1 &le; K &le; 10.</li>
	<li>0 &le; C<sub>i</sub> &le; 1 000 000 000 (1 &le; i &le; N).</li>
	<li>1 &le; S<sub>i</sub> &le; 3 (1 &le; i &le; Q).</li>
	<li>When S<sub>i</sub> = 1 is satisfied, 1 &le; T<sub>i</sub> &le; N and 0 &le; U<sub>i</sub> &le; 1 000 000 000 (1 &le; i &le; Q).</li>
	<li>When S<sub>i</sub> = 2, 3 is satisfied, 1 &le; T<sub>i</sub> &le; U<sub>i</sub> &le; N (1 &le; i &le; Q)．</li>
</ul>