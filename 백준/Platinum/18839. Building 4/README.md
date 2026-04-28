# [Platinum I] Building 4 - 18839

[문제 링크](https://www.acmicpc.net/problem/18839)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 141, 정답: 100, 맞힌 사람: 84, 정답 비율: 74.336%

### 분류

다이나믹 프로그래밍, 역추적

### 문제 설명

<p>The Olympic Games will be held in JOI Kingdom soon. In order to welcome participants from all over the world, the buildings on the way from the airport to the accommodation will be decorated. There are 2N buildings, numbered from 1 to 2N from the airport.</p>

<p>President K is in charge of the decoration project. He asked the public to make decoration plans. After examining them, he finally chose two plans, the plan A and the plan B. In the plan A, the luxury level of the building i (1 &le; i &le; 2N) is A<sub>i</sub>. In the plan B, the luxury level of the building i (1 &le; i &le; 2N) is B<sub>i</sub>.</p>

<p>Both plans are very good, and it is difficult to choose one of them. He decided to decorate the buildings in the following way: for each building, one of the plan A or B will be chosen. In order to decorate the buildings in a fair way, the plan A will be chosen for N buildings, and the plan B will be chosen for the remaining N buildings. Moreover, since the participants will be excited if the luxury levels are increasing on the way from the airport to the accommodation, the following condition should be satisfied: C<sub>i</sub> &le; C<sub>i+1</sub> for every i with 1 &le; i &le; 2N &minus; 1, where C<sub>i</sub> is the luxury level of the building i (1 &le; i &le; 2N).</p>

<p>Write a program which, given the number of buildings and the luxury levels of the buildings for each plan, decides whether it is possible to choose decoration plans satisfying the above condition, and output one way to decorate the buildings if it is possible.</p>

### 입력

<p>Read the following data from the standard input. All the values in the input are integers.</p>

<pre>
N
A<sub>1</sub> &middot; &middot; &middot; A<sub>2N</sub>
B<sub>1</sub> &middot; &middot; &middot; B<sub>2N</sub></pre>

### 출력

<p>If it is impossible to choose decoration plans satisfying the condition, output -1 to the standard output.</p>

<p>Otherwise, output a string S of length 2N describing a way to decorate the buildings to the standard output. Here the i-th character of S (1 &le; i &le; 2N) is A if the plan A is chosen for the building i, and is B if the plan B is chosen for the building i. If there are multiples ways satisfying the condition, output any of them.</p>

### 제한

<ul>
	<li>1 &le; N &le; 500 000．</li>
	<li>1 &le; A<sub>i</sub> &le; 1 000 000 000 (1 &le; i &le; 2N).</li>
	<li>1 &le; B<sub>i</sub> &le; 1 000 000 000 (1 &le; i &le; 2N).</li>
</ul>