# [Platinum III] 피아노 연주 - 18191

[문제 링크](https://www.acmicpc.net/problem/18191)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 245, 정답: 53, 맞힌 사람: 43, 정답 비율: 23.497%

### 분류

이분 탐색

### 문제 설명

<p><em>N</em>개의 손가락을 가진 세빈이는 한 손만으로 모든 곡을 연주할 수 있는 최고의 피아니스트다.</p>

<p>세빈이의 두 인접한 손가락 사이의 거리는 <em>K</em>로 일정하다. 고로 <em>i</em>번째 손가락과 첫 번째 손가락 사이의 거리를 <em>X<sub>i</sub></em>라고 한다면, <em>X<sub>i</sub></em> = (<em>i</em>-1)<em>K</em>가 성립한다(1 &le;&nbsp;<em>i</em> &le; <em>N</em>).</p>

<p>세빈이는 <em>M</em>개의 음으로 이루어진 곡을 연주하려 한다. 이때 각각의 음을 어떤 손가락으로 연주하는지에 따라 곡을 연주하는 것이 쉬워질 수도, 어려워질 수도 있다.</p>

<p><em>i</em>번째 음의 음높이를 <em>P<sub>i</sub></em>라 하고, 이 음을 <em>F<sub>i</sub></em>번째 손가락으로 연주한다 하자. <em>i</em>번째 음과 이와 인접한 (<em>i</em>+1)번째 음을 연주할 때의 난이도는 |(<em>P<sub>i</sub></em><sub>+1</sub> - <em>P<sub>i</sub></em>) - (<em>X<sub>F<sub>i</sub></sub></em><sub><sub>+1</sub></sub> - <em>X<sub>F<sub>i</sub></sub></em>)|다.</p>

<p>곡의 난이도는 인접한 두 음을 연주할 때의 난이도의 최댓값으로 정의한다. 각각의 음을 어떤 손가락으로 연주할지 결정하여 곡의 난이도를 최소화하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 세빈이의 손가락의 수와 곡을 이루는 음의 수를 나타내는 두 자연수 <em>N</em>과 <em>M</em>, 두 인접한 손가락 사이의 거리를 나타내는 자연수 <em>K</em>가 사이에 공백을 두고 주어진다.</p>

<p>두번째 줄에는 <em>M</em>개의 정수 <em>P</em><sub>1</sub>, &middot;&middot;&middot;, <em>P<sub>M</sub></em>이 사이에 공백을 두고 주어진다.</p>

### 출력

<p>첫 번째 줄에 곡의 난이도의 최솟값을 출력한다.</p>

### 제한

<p>모든 입력 데이터는 다음 조건을 만족한다.</p>

<ul>
	<li>1 &le; <em>N</em> &le; 2 &times; 10<sup>5</sup></li>
	<li>2 &le; <em>M</em> &le; 2 &times; 10<sup>5</sup></li>
	<li>1 &le; <em>K</em>&nbsp;&le; 10<sup>9</sup></li>
	<li><em>X<sub>N</sub></em>&nbsp;&le; 10<sup>9</sup></li>
	<li>1 &le; <em>P<sub>i</sub></em>&nbsp;&le; 10<sup>9</sup> (1&nbsp;&le; <em>i</em>&nbsp;&le; <em>M</em>)</li>
</ul>