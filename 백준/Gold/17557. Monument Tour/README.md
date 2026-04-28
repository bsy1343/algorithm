# [Gold III] Monument Tour - 17557

[문제 링크](https://www.acmicpc.net/problem/17557)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 56, 맞힌 사람: 51, 정답 비율: 56.044%

### 분류

누적 합, 스위핑

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17557.%E2%80%85Monument%E2%80%85Tour/d0278df0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17557.%E2%80%85Monument%E2%80%85Tour/d0278df0.png" data-original-src="https://upload.acmicpc.net/3c4d1265-5c4d-4528-a23b-e9c192239eb5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 362px; height: 301px;" /></p>

<p>A tour operator proposes itineraries consisting of visits of N monuments and museums in Paris, modeled as a grid. The way the tour operates is the following: The bus enters the city from the west (on any street) and traverses the city, taking a left or a right turn to visit monuments when needed, returning to the same eastbound road it used to enter the city, and so on until it exits the city via the east.</p>

<p>A tour in a 6 &times; 5 grid city might look like the figure above. On the figure, the bus enters the city at coordinate (0, 2) (we consider (0, 0) to be the northwest corner of the city), first visits the monument at (1, 2) (already on the main road), takes a left turn and visits the monument at (1, 0), returns to the main road and moves east, takes a right turn and visits the monument at (2, 4), returns to the main road, visits the monument at (4, 2) (again on the main road), and then exits the city at coordinate (5, 2). The bus operator counts that the traversal of one block costs 1 unit of gas. For the example above, the cost is thus 5 + 2 &times; 2 + 2 &times; 2 = 13 units of gas.</p>

<p>Your task is to help the tour operator choose which eastbound road the bus should travel through, so that the cost of the tour is minimized while visiting all N monuments.</p>

### 입력

<p>The input comprises several lines, each consisting of integers separated with single spaces:</p>

<ul>
	<li>The first line contains the number X of northbound streets and the number Y of eastbound streets.</li>
	<li>The second line contains the number N of monuments the tour needs to visit.</li>
	<li>The next N lines each contain the coordinates xi and yi of each monument.</li>
</ul>

### 출력

<p>The output should consist of a single line, whose content is an integer, representing the minimal cost of a tour.</p>

### 제한

<ul>
	<li>1 &le; X,Y &le; 100 000;</li>
	<li>1 &le; N &le; 100 000;</li>
	<li>0 &le; x<sub>i</sub> &lt; X, 0 &le; y<sub>i</sub> &lt; Y.</li>
</ul>

### 힌트

<ul>
	<li>The bus operator is not allowed to return to a different, parallel, eastbound road; they have to use the same road as the one by which they entered the city.</li>
	<li>More than one monument can be present at the same coordinate</li>
</ul>