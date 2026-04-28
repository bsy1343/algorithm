# [Silver IV] 겹다각형의 각 - 30011

[문제 링크](https://www.acmicpc.net/problem/30011)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 400, 정답: 274, 맞힌 사람: 242, 정답 비율: 72.892%

### 분류

수학, 기하학

### 문제 설명

<p>당신은 $N$개의 <strong>볼록다각형</strong>으로 이루어진 그림을 그려야 한다. 이 그림은 다음 세 조건을 만족해야 한다.</p>

<ul>
	<li>$i$번째 다각형은 $A_i$개의 꼭짓점을 가져야 한다. $(1 \le i \le N)$</li>
	<li>$i+1$번째 다각형의 모든 꼭짓점은 $i$번째 다각형의 내부 또는 경계에 속해야 한다. $(1 \le i &lt; N)$</li>
	<li>두 개 이상의 다각형이 한 꼭짓점을 공유할 수 없다.</li>
</ul>

<p>이때, $i$번째 다각형은 $i+1$번째 다각형보다 꼭짓점 수가 많거나 같다. 즉, $1 \le i &lt; N$인 정수 $i$에 대해 $A_i \ge A_{i+1}$이다.</p>

<p>아래 그림은 $A=\{ 4, 4, 3 \}$일 때, 조건에 맞게 그린 도형과 조건에 맞지 않는 도형의 예이다. </p>

<table class="table table-bordered td-center th-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30011.%E2%80%85%EA%B2%B9%EB%8B%A4%EA%B0%81%ED%98%95%EC%9D%98%E2%80%85%EA%B0%81/06be3b99.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/30011.%E2%80%85%EA%B2%B9%EB%8B%A4%EA%B0%81%ED%98%95%EC%9D%98%E2%80%85%EA%B0%81/06be3b99.png" data-original-src="https://upload.acmicpc.net/3d109975-5435-404a-8b20-4c583449cd12/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />
			<p> </p>
			</td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30011.%E2%80%85%EA%B2%B9%EB%8B%A4%EA%B0%81%ED%98%95%EC%9D%98%E2%80%85%EA%B0%81/13148722.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/30011.%E2%80%85%EA%B2%B9%EB%8B%A4%EA%B0%81%ED%98%95%EC%9D%98%E2%80%85%EA%B0%81/13148722.png" data-original-src="https://upload.acmicpc.net/746ed35c-d6f8-4d21-b094-a0d063866fa0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />
			<p> </p>
			</td>
		</tr>
		<tr>
			<td>조건에 맞는 도형</td>
			<td>조건에 맞지 않는 도형</td>
		</tr>
	</tbody>
</table>

<p>당신은 그림의 <strong>점수</strong>가 최대가 되도록 그림을 그리려고 한다. 그림의 <b>점수</b>는 그림에 그려진 선분으로 만들어지는 $180 ^\circ$ 미만의 각 중 다른 각을 완전히 포함하지 않는 것의 각도의 합으로 정의된다. </p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30011.%E2%80%85%EA%B2%B9%EB%8B%A4%EA%B0%81%ED%98%95%EC%9D%98%E2%80%85%EA%B0%81/542c35d7.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/30011.%E2%80%85%EA%B2%B9%EB%8B%A4%EA%B0%81%ED%98%95%EC%9D%98%E2%80%85%EA%B0%81/542c35d7.png" data-original-src="https://upload.acmicpc.net/66042671-45e1-4fbe-89af-f894f1385f4b/-/crop/513x297/0,12/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>예를 들어, 다음 그림의 $\angle DBA$와 $\angle CBD$는 조건에 맞지만, $\angle CBA$는 $\angle DBA$와 $\angle CBD$를 포함하기 때문에 조건에 맞지 않는다.</p>

<p>조건에 맞춰서 도형을 그렸을 때 가능한 그림의 점수의 최댓값을 구해 보자.</p>

### 입력

<p>첫째 줄에 다각형의 수 $N$이 주어진다.</p>

<p>둘째 줄에 $N$개의 수 $A_1$, $A_2$, $\cdots$, $A_N$가 공백으로 구분되어 주어진다. </p>

### 출력

<p>첫째 줄에 가능한 그림의 점수의 최댓값을 출력한다.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 1\,000$</li>
	<li>$3 \leq A_i \leq 100$ $(1 \leq i \leq N)$</li>
	<li>$A_i \ge A_{i+1}$ $(1 \leq i &lt; N)$</li>
</ul>