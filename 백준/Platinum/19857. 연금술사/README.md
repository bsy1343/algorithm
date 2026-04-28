# [Platinum II] 연금술사 - 19857

[문제 링크](https://www.acmicpc.net/problem/19857)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 351, 정답: 111, 맞힌 사람: 99, 정답 비율: 35.740%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>각고의 노력 끝에 현자의 돌을 얻은 연금술사는 모든 물질로 금을 만들 수 있는 것은 아니라는 사실을 깨닫고 절망하였다. 그러나, 그는 현자의 돌을 이용해 가치가 낮은 광물로 가치가 높은 광물을 만들 수 있다는 사실을 발견하였다. 물론, 가치가 높은 광물을 사용해서 얻은 결과물의 가치가 낮을 수도 있다.</p>

<p>구체적으로, 광물 <span style="font-style: italic;">k</span>(<span style="font-style: italic;">k</span> &ge; 1)개와 현자의 돌을 이용해 새로운 광물을 만드는 경우를 생각해 보자. 사용한 광물 <span style="font-style: italic;">k</span>개의 가치를 각각 <span style="font-style: italic;">x</span><sub>1</sub>, <span style="font-style: italic;">x</span><sub>2</sub>, &hellip;, <span style="font-style: italic;">x</span><sub><span style="font-style: italic;">k</span></sub>라 할 때, <span style="font-style: italic;">S</span> = {<span style="font-style: italic;">x</span><sub>1</sub>, <span style="font-style: italic;">x</span><sub>2</sub>, &hellip;, <span style="font-style: italic;">x</span><sub><span style="font-style: italic;">k</span></sub>}에 포함되지 않는 가장 작은 음이 아닌 정수 <span style="font-style: none;">MEX</span>(<span style="font-style: italic;">S</span>)가 최종 산물의 가치가 된다. 예를 들어, 가치가 각각 0, 1, 4, 2, 1인 광물과 현자의 돌을 이용해 새로운 광물을 만드는 경우, <span style="font-style: none;">MEX</span>({0, 1, 4, 2, 1}) = 3이므로 결과 광물의 가치는 3이 된다.</p>

<p>현재 연금술사는 가치가 0, 1, 2, &hellip;, (<span style="font-style: italic;">N&nbsp;</span>&minus; 1)인 광물들을 각각 <span style="font-style: italic;">c</span><sub>0</sub>, <span style="font-style: italic;">c</span><sub>1</sub>, <span style="font-style: italic;">c</span><sub>2</sub>, &hellip;, <span style="font-style: italic;">c</span><sub><span style="font-style: italic;">N</span>-1</sub>개씩 가지고 있다. 연금술사는 이 광물들과 현자의 돌을 이용해 새로운 광물을 만드는 과정을 여러 번 반복할 수 있다. 결과물로 나온 광물도 다시 재료로 사용할 수 있다. 이 과정에서 현자의 돌은 무한히 사용할 수 있다.</p>

<p>연금술사의 목표는 최종적으로 단 하나의 광물만을 남기면서 그 광물의 가치를 최대로 하는 것이다. 단, 광물을 사용하지 않고 버릴 수는 없다.</p>

<p>연금술사가 최종적으로 얻게 될 단 하나의 광물의 가치의 최댓값을 구하여라.</p>

### 입력

<p>첫 줄에 정수 <span style="font-style: italic;">N</span>이 주어진다.</p>

<p>두 번째 줄에 <span style="font-style: italic;">N</span>개의 정수 <span style="font-style: italic;">c</span><sub>0</sub>, <span style="font-style: italic;">c</span><sub>1</sub>, &hellip;, <span style="font-style: italic;">c</span><sub><span style="font-style: italic;">N</span>-1</sub>이 공백으로 구분되어 주어진다. 단, 연금술사는 적어도 하나 이상의 광물을 갖고 있다.</p>

### 출력

<p>첫 줄에 최종적으로 남은 광물 하나의 가치의 최댓값을 출력한다.</p>

### 제한

<ul>
	<li>1 &le; <span style="font-style: italic;">N</span> &le; 100,000</li>
	<li>0 &le; <span style="font-style: italic;">c</span><sub><span style="font-style: italic;">i</span></sub> &le; 10<sup>9</sup></li>
	<li><span style="font-style: italic;">c</span><sub>0&nbsp;</sub>+&nbsp;<span style="font-style: italic;">c</span><sub>1&nbsp;</sub>+ &hellip; +&nbsp;<span style="font-style: italic;">c</span><sub><span style="font-style: italic;">N</span>-1</sub> &ge; 1</li>
</ul>