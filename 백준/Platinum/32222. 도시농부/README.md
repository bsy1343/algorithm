# [Platinum III] 도시농부 - 32222

[문제 링크](https://www.acmicpc.net/problem/32222)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 243, 정답: 31, 맞힌 사람: 23, 정답 비율: 14.650%

### 분류

그리디 알고리즘, 많은 조건 분기

### 문제 설명

<p>송도고의 급식실 앞 텃밭에서 도시농부 동아리 학생들이 상추를 기르고 있다.</p>

<p>상추는 오랜 시간과 정성을 들여 키우다, 비로소 크기가 $m$ 이상이 되었을 때 수확할 수 있다.</p>

<p style="display:flex;flex-direction:column;align-items:center;"><img src="%EB%B0%B1%EC%A4%80/Platinum/32222.%E2%80%85%EB%8F%84%EC%8B%9C%EB%86%8D%EB%B6%80/1b907668.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/32222.%E2%80%85%EB%8F%84%EC%8B%9C%EB%86%8D%EB%B6%80/1b907668.png" data-original-src="https://upload.acmicpc.net/1afebe07-f394-48e4-8b9d-22ede29a7403/-/crop/701x683/46,21/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height:359px;max-width:100%" /> <span style="text-align:center;">즐겁게 텃밭을 가꾸고 계신 윤○○ 선생님의 모습이다.</span></p>

<p>하지만 오늘 점심 메뉴가 삼겹살이기 때문에 진서는 상추를 수확 가능한 상태까지 빠르게 자라도록 영양제를 쓰기로 했다.</p>

<p>영양제는 A, B, C 세 가지 종류가 있고, 각 영양제의 효과는 다음과 같다.</p>

<ul>
	<li>영양제 A: 상추 세 개를 골라 사용하면 셋 중 가장 큰 상추의 크기를 $x$라고 할 때, 세 상추 모두 크기가 $x$가 된다.</li>
	<li>영양제 B: 상추 세 개를 골라 사용하면 셋 중 가장 작은 상추의 크기를 $x$라고 할 때, 세 상추 모두 크기가 $x$만큼 증가한다.</li>
	<li>영양제 C: 상추 한 개를 골라 사용하면 상추의 크기가 $m$이 된다.</li>
</ul>

<p>영양제는 동아리 예산을 통해 구입하기 때문에, 영양제를 막 썼다가는 윤○○ 선생님께 혼날 것이다!</p>

<p>진서를 도와 모든 상추를 수확 가능하게 만들기 위해 사용해야 하는 총 영양제 수를 최소화하는 프로그램을 작성하여라. 단, 영양제를 사용할 때의 성장 속도는 자연적인 성장 속도와 비교도 안 되게 빠르기 때문에, 자연적인 성장은 고려하지 않는다.</p>

### 입력

<p>첫 번째 줄에 상추의 개수 $n$과 상추의 수확 가능한 최소 크기를 나타내는 정수 $m$이 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄에는 각 상추의 처음 크기를 나타내는 $n$개의 정수 $s_1,s_2,\ldots,s_n$이 공백으로 구분되어 주어진다.</p>

### 출력

<p>모든 상추를 수확 가능하게 만들기 위해 사용해야 하는 총 영양제 수의 최솟값을 출력한다.</p>

### 제한

<ul>
	<li>$3 \le n \le 100\,000$.</li>
	<li>$1 \le m \le 100\,000$.</li>
	<li>$1\le s_i\le m$.</li>
</ul>

### 힌트

<ul>
	<li>배추처럼 생겼지만 아무튼 상추이다.</li>
	<li>본문의 영양제 설명을 수식적으로 표현하면 다음과 같다.
	<ul>
		<li>영양제 A : $(s_i, s_j, s_k)\leftarrow(\max \{s_i,s_j,s_k\}, \max \{s_i,s_j,s_k\}, \max \{s_i,s_j,s_k\})$</li>
		<li>영양제 B : $(s_i, s_j, s_k)\leftarrow(s_i+\min\{s_i,s_j,s_k\}, s_j+\min\{s_i,s_j,s_k\}, s_k+\min\{s_i,s_j,s_k\})$</li>
		<li>영양제 C : $(s_i)\leftarrow(m)$</li>
	</ul>
	</li>
</ul>