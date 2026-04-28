# [Gold III] 힘겨운 쿠기의 식당 개업기 - 25174

[문제 링크](https://www.acmicpc.net/problem/25174)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 141, 정답: 56, 맞힌 사람: 47, 정답 비율: 50.000%

### 분류

누적 합, 값 / 좌표 압축

### 문제 설명

<p>가톨릭대학교에서 고양이를 대상으로 식당을 운영하려고 하는 쿠기는 식당의 위치가 중요하다고 생각해서 최적의 위치를 고민하고 있다.</p>

<p>쿠기는 <em>N</em>마리 고양이들의 집의 좌표 (<em>X</em>, <em>Y</em>)와 출출함 <em>Z</em>를 조사했다. 단, 고양이들의 집은 서로 같은 좌표에 존재하지 않는다.</p>

<p>쿠기가 사는 나라에는 &quot;임의의 좌표를 기준으로 좌표축에 위치하는 고양이의 집이 있다면, 그 좌표에 식당을 개업할 수 없다&quot; 라는 법이 있다. 이를 고려하여 식당의 좌표를 정하려고 하며, 식당의 좌표는 정수가 아니어도 된다.</p>

<p>식당을 기준으로 사분면이 있을 때, <i>S</i>와<i> E</i>는 다음과 같다.</p>

<ul>
	<li><em>S<sub>i</sub></em> = <em>i</em> 사분면에 있는 고양이들의 출출함 <em>Z</em>의 합</li>
	<li><em>E</em> = (<em>S<sub>1, </sub>S<sub>2</sub><sub>, </sub>S<sub>3</sub><sub>, </sub>S<sub>4</sub></em>) 중 최댓값<em> - </em>(<em>S<sub>1, </sub>S<sub>2</sub><sub>, </sub>S<sub>3</sub><sub>, </sub>S<sub>4</sub></em>) 중 최솟값</li>
	<li><em>i</em> 사분면에 고양이가 한 마리도 없을 때 <em>S<sub>i</sub></em>는 0이다.</li>
	<li>식당을 개업할 수 없는 좌표라면, <em>E</em>는 100,000,000이다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25174.%E2%80%85%ED%9E%98%EA%B2%A8%EC%9A%B4%E2%80%85%EC%BF%A0%EA%B8%B0%EC%9D%98%E2%80%85%EC%8B%9D%EB%8B%B9%E2%80%85%EA%B0%9C%EC%97%85%EA%B8%B0/f7d773f3.png" data-original-src="https://upload.acmicpc.net/2b652158-1ae3-45a3-a1d2-654657c02f85/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 522px; width: 1000px;" /></p>

<p>쿠기는 <i>E</i>가 최솟값인 곳에 식당을 개업하려고 한다. 식당 개업 준비로 바쁜 쿠기를 도와 <em>E</em>의 최솟값을 구하여라.</p>

### 입력

<p>첫째 줄에 정수 <em>N</em> (4 &le; <em>N</em> &le; 1,000)이 주어진다.</p>

<p>둘째 줄부터 <em>N</em> + 1줄까지 각 고양이들의 세 정수 <em>X</em> (-100,000,000 &le; <em>X</em> &le; 100,000,000), <em>Y</em> (-100,000,000 &le; <em>Y</em> &le; 100,000,000), <em>Z </em>(1 &le; <em>Z</em> &le; 1,000)가 주어진다.</p>

### 출력

<p><em>E</em>의 최솟값을 출력한다.</p>