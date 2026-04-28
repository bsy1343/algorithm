# [Gold II] 원 이동하기 2 - 22948

[문제 링크](https://www.acmicpc.net/problem/22948)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 466, 정답: 167, 맞힌 사람: 121, 정답 비율: 36.667%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 정렬, 트리, 너비 우선 탐색, 스택, 역추적

### 문제 설명

<p>좌표평면에 원의 중심이 x축 위에 있는 $N$개의 원이 존재한다. $N$개의 원 중 임의의 두개의 원을 선택했을 때 내접, 외접 등 교점이 존재하지 않도록 존재한다. 하나의 원이 다른 원 안에 포함될 수는 있다.</p>

<p>하나의 원 내부에서 다른 원의 내부로 이동하려고 한다. 원 내부는 <strong>단 한 번만 방문 할 수 있으며</strong> 두 번 이상 방문을 할 수 없다.</p>

<p>문제 편의상 좌표평면을 원점이 (0, 0)이고 반지름이 무수히 큰 하나의 원이라고 가정하자.</p>

<p>좌표평면에 두 원 A, B만 존재한 상황에서&nbsp;원 A 내부에서 원 B 내부로 올바르게 이동하는 경우는 아래와 같다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22948.%E2%80%85%EC%9B%90%E2%80%85%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0%E2%80%852/3119b05e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22948.%E2%80%85%EC%9B%90%E2%80%85%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0%E2%80%852/3119b05e.png" data-original-src="https://upload.acmicpc.net/bb24a122-acb9-4aa4-a619-c1ebaac3a086/-/crop/1358x768/281,155/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 283px; width: 500px;" /></p>

<p style="text-align: center;">1. 원 A와 원 B가 서로 포함관계가 아니고 만나지 않는 경우</p>

<p>첫 번째 경우는 원 A 내부 $\rightarrow$&nbsp;좌표평면 $\rightarrow$ 원 B 내부로 이동하였다. 이 경우를 제외한 올바른 경로는 존재하지 않는다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22948.%E2%80%85%EC%9B%90%E2%80%85%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0%E2%80%852/006d25d2.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22948.%E2%80%85%EC%9B%90%E2%80%85%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0%E2%80%852/006d25d2.png" data-original-src="https://upload.acmicpc.net/cda92dcb-b2c6-4c91-a99c-7dcf8ae73e74/-/crop/840x833/542,126/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 298px; width: 300px;" /></p>

<p style="text-align: center;">2. 원 B가 원 A안에 존재하는 경우</p>

<p>두 번째 경우는 원 A 내부 $\rightarrow$ 원 B 내부로 이동하였다. 이 경우를 제외한 올바른 경로는 존재하지 않는다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22948.%E2%80%85%EC%9B%90%E2%80%85%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0%E2%80%852/61ca0917.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22948.%E2%80%85%EC%9B%90%E2%80%85%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0%E2%80%852/61ca0917.png" data-original-src="https://upload.acmicpc.net/4a0e9613-390c-4b58-854f-5e37511f1315/-/crop/828x823/545,131/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 298px; width: 300px;" /></p>

<p style="text-align: center;">3. 원 A가 원 B안에 존재하는&nbsp;경우</p>

<p>세 번째 경우도&nbsp;원 A 내부 $\rightarrow$&nbsp;원 B 내부로 이동하였다. 이 경우를 제외한 올바른 경로는 존재하지 않는다.</p>

<p>아래 경우는 원 A 내부에서 원 B로 올바르게 이동하지 않은 경우들이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22948.%E2%80%85%EC%9B%90%E2%80%85%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0%E2%80%852/458aba0e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22948.%E2%80%85%EC%9B%90%E2%80%85%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0%E2%80%852/458aba0e.png" data-original-src="https://upload.acmicpc.net/b175d26f-3ff9-47a6-acff-36aded60f42e/-/crop/1361x773/281,155/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 284px; width: 500px;" /></p>

<p style="text-align: center;">4. 좌표평면 위에 원 A, B, C가 존재하고 서로 포함관계가 아니면서 만나지 않는 경우</p>

<p>이 경우는 원 A 내부 $\rightarrow$&nbsp;좌표평면 $\rightarrow$&nbsp;원 C 내부 $\rightarrow$&nbsp;좌표평면 $\rightarrow$ 원 B 내부로 이동한 경로이다. 좌표평면을 2번 방문하였기 때문에 올바르게 이동한게 아니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22948.%E2%80%85%EC%9B%90%E2%80%85%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0%E2%80%852/11ccf69a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22948.%E2%80%85%EC%9B%90%E2%80%85%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0%E2%80%852/11ccf69a.png" data-original-src="https://upload.acmicpc.net/f2dff913-6138-43ec-b8ab-d0b6ea21834a/-/crop/1462x907/230,88/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 310px; width: 500px;" /></p>

<p style="text-align: center;">4. 좌표평면 위에 원 A, B가 존재하고 원 B가 원 A의 내부에 있을 경우</p>

<p>이 경우는 원 A 내부 $\rightarrow$ 좌표평면 $\rightarrow$ 원 A 내부 $\rightarrow$ 원 B 내부로 이동한 경로이다. 원 A 내부를&nbsp;2번 방문하였기 때문에 올바르게 이동한게 아니다.</p>

<p>좌표평면에&nbsp;$N$개의 원이 있을 때,&nbsp;원 A 내부에서 원 B 내부로 이동할 때 방문한 원의 개수를 구해보자.</p>

### 입력

<p>첫 번째 줄에는 원의 개수 $N$이 주어진다.</p>

<p>두 번째 줄부터 $N + 1$번째 줄까지 원의&nbsp;번호 $k$와 원의 중심 좌표 중 $x$좌표, 원의 반지름 $r$이&nbsp;공백으로 구분되어 주어진다.</p>

<p>마지막 줄에는 두 원의 번호 $A$와 $B$가 공백으로 구분되어 주어진다.</p>

<p>주어지는 원의 번호 중 중복되는 수는 없다.</p>

<p>좌표평면의 번호는 <code>0</code>으로 가정한다.</p>

### 출력

<p>첫 번째 줄에는 방문한 원의 개수를 출력한다.</p>

<p>두 번째 줄에는 방문한 원의 번호를 순서대로 공백으로 구분하여&nbsp;출력한다.</p>

### 제한

<ul>
	<li>$2&nbsp;&le; N &le; 200,000$</li>
	<li>$-1,000,000 &le; x&nbsp;&le; 1,000,000$</li>
	<li>$1 &le; r &le; 10,000$</li>
	<li>$1 &le; A, B&nbsp;&le; N$, $A &ne; B$</li>
	<li>$1 &le; k &le; N$</li>
	<li>$x, r$는 정수</li>
</ul>

### 힌트

<h3><strong>두 원의 위치관계</strong></h3>

<p>두 원의 위치관계를 파악할 때 아래를 이용하면 된다.</p>

<p>원 A의 반지름은 $r_A$, 원 B의 반지름은 $r_B$, 원 A와&nbsp;원 B의 중심 사이의 거리를 $d$라고 가정하자.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td colspan="1" rowspan="2">두 점에서 만난다.</td>
			<td colspan="2" rowspan="1">한 점에서 만난다.</td>
			<td colspan="3" rowspan="1">만나지 않는다.</td>
		</tr>
		<tr>
			<td>외접</td>
			<td>내접</td>
			<td>외부에 있는 경우</td>
			<td>내부에 있는 경우</td>
			<td>동심원</td>
		</tr>
		<tr>
			<td>$|r_A-r_B|&lt;d&lt;r_A+r_B$</td>
			<td>$r_A+r_B=d$</td>
			<td>$|r_A-r_B|=d$</td>
			<td>$r_A+r_B&lt;d$</td>
			<td>$d&lt;|r_A-r_B|$</td>
			<td>$d=0$</td>
		</tr>
	</tbody>
</table>

<h3><strong>두 점 사이의 거리</strong></h3>

<p>$(x_1, y_1)$와 $(x_2, y_2)$ 사이의 거리 $d$를 구하는 식은 아래와 같다.</p>

<p>$d = \sqrt{(x_1-x_2)^2+(y_1-y_2)^2}$</p>