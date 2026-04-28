# [Gold I] Subtransmutation - 22894

[문제 링크](https://www.acmicpc.net/problem/22894)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 25, 정답: 16, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

브루트포스 알고리즘, 확장 유클리드 호제법, 그리디 알고리즘, 수학, 정수론

### 문제 설명

<p>As the most skilled alchemist in your country, you were summoned yet again because powers beyond science were needed to satisfy your country&#39;s leader&#39;s ever increasing greed for rare metals.</p>

<p>Each metal is represented by a positive integer. You need to create U<sub>1</sub> units of metal 1, U<sub>2</sub> units of metal 2, &hellip; and U<sub>N</sub> units of metal N. Metals N+1, N+2, &hellip; do exist, but you are not required to create any specific amount of them. You are allowed to create excess amounts of any metal, which can just be discarded.</p>

<p>Unfortunately, budget cuts have left you only the materials for a simple alchemy spell. For some fixed numbers A and B, with A &lt; B, you can take one unit of metal i and destroy it to create one unit of metal (i &minus; A) and one unit of metal (i &minus; B). If either of those integers is not positive, that specific unit is not created. In particular, if i &le; A, the spell simply destroys the unit and creates nothing. If A &lt; i &le; B the spell destroys the unit and creates only a single unit of metal (i &minus; A).</p>

<p>You have been assigned an expert miner to assist you. The expert miner can fetch a single unit of any metal you want. From that unit, you can use your spell to create other metals and then use the spell on the resulting metals to create even more units. The picture below shows a single unit of metal 4 being converted into one unit of metal 1 and two units of metal 2 using two spells with A = 1 and B = 2.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22894.%E2%80%85Subtransmutation/e2004fcc.png" data-original-src="https://upload.acmicpc.net/5dc5ec48-b4ef-416c-ae13-d4cd6f0d3963/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 157px;" /></p>

<p>Metals represented by larger integers are heavier and more difficult to handle, so you want to ask the expert miner for a single unit of metal represented by the smallest possible integer that is sufficient to complete your task, or say that there is no such metal.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of two lines. The first line of a test case contains three integers N, A, and B, representing the largest metal number that you are required to create, and the two values that define the available spell as described above, respectively. The second line of a test case contains N integers U<sub>1</sub>, U<sub>2</sub>, &hellip;, U<sub>N</sub>, representing the required units of metals 1, 2, &hellip;, N, respectively.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;x&nbsp;is the test case number (starting from 1) and&nbsp;y&nbsp;is&nbsp;<code>IMPOSSIBLE</code>&nbsp;if it is not possible to create all required units starting from a single unit of metal. Otherwise,&nbsp;y&nbsp;is the smallest integer that represents a metal such that one unit of it is sufficient to create all the required units of metal.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>1 &le; N &le; 20.</li>
	<li>0 &le; U<sub>i</sub> &le; 20, for all i.</li>
	<li>1 &le; U<sub>N</sub>.</li>
	<li>2 &le; U<sub>1</sub> + U<sub>2</sub> + ⋯ + U<sub>N</sub>.</li>
</ul>