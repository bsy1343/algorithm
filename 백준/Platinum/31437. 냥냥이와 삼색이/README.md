# [Platinum II] 냥냥이와 삼색이 - 31437

[문제 링크](https://www.acmicpc.net/problem/31437)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 186, 정답: 31, 맞힌 사람: 29, 정답 비율: 19.079%

### 분류

애드 혹, 많은 조건 분기, 구현

### 문제 설명

<p>KSA의 남학생 기숙사인 견우관과 여학생 기숙사인 직녀관 사이에는 두 기숙사를 잇는 통로인 오작교가 있다. 오작교에는 크사냥이라 불리는 냥냥이와 삼색이 두 마리 고양이가 살고 있다.</p>

<p>왼쪽부터 냥냥이, 삼색이, 그리고 두 고양이가 함께 있는 모습이다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 500px;">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31437.%E2%80%85%EB%83%A5%EB%83%A5%EC%9D%B4%EC%99%80%E2%80%85%EC%82%BC%EC%83%89%EC%9D%B4/b2471cb5.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31437.%E2%80%85%EB%83%A5%EB%83%A5%EC%9D%B4%EC%99%80%E2%80%85%EC%82%BC%EC%83%89%EC%9D%B4/b2471cb5.jpg" data-original-src="https://u.acmicpc.net/e4ddd36d-04ae-401f-8b4c-7925a7bd1f99/%EB%83%A5%EB%83%A5.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 260px; width: 200px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31437.%E2%80%85%EB%83%A5%EB%83%A5%EC%9D%B4%EC%99%80%E2%80%85%EC%82%BC%EC%83%89%EC%9D%B4/69bc7848.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31437.%E2%80%85%EB%83%A5%EB%83%A5%EC%9D%B4%EC%99%80%E2%80%85%EC%82%BC%EC%83%89%EC%9D%B4/69bc7848.jpg" data-original-src="https://u.acmicpc.net/3febc680-c134-4c3c-9faa-5e1fce9f8495/%EC%82%BC%EC%83%89.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 195px; height: 260px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31437.%E2%80%85%EB%83%A5%EB%83%A5%EC%9D%B4%EC%99%80%E2%80%85%EC%82%BC%EC%83%89%EC%9D%B4/b42bf30a.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31437.%E2%80%85%EB%83%A5%EB%83%A5%EC%9D%B4%EC%99%80%E2%80%85%EC%82%BC%EC%83%89%EC%9D%B4/b42bf30a.jpg" data-original-src="https://u.acmicpc.net/6fe1c8d7-0ffa-4ebd-af67-58a1eb42bff3/%EB%83%A5%EB%83%A5%EC%82%BC%EC%83%89.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 347px; height: 260px;" /></td>
		</tr>
	</tbody>
</table>

<p>고양이를 사랑하는 지민이는 냥냥이와 삼색이를 원하는 위치로 유인해 완벽한 구도의 사진을 찍으려고 한다. 오작교는 정수 $0,1,2,\cdots,N-1,N$을 포함하는 수직선이라고 할 때, 견우관은 $0$, 직녀관은 $N$에 위치해 있다. 지민이와 고양이들은 정수 점 위에만 머무를 수 있다.</p>

<p>$0$초부터 시작해 다음 과정이 번갈아 가며 반복된다.</p>

<ol>
	<li>지민이가 오작교 위 원하는 한 점으로 이동한다. 이 단계는 $1$초가 걸린다.</li>
	<li>고양이들이 규칙에 따라 제각각 이동한다. 이 단계는 $0$초가 걸린다.</li>
</ol>

<p>단, 삼색이는 지민이를 할퀼 수도 있기 때문에 지민이는 삼색이가 있는 점으로는 이동할 수 없다.</p>

<p>냥냥이와 삼색이가 움직이는 규칙은 다음과 같다.</p>

<ul>
	<li>사람을 좋아하는 냥냥이는 매초 지민이가 있는 점으로 $1$만큼 다가온다. 냥냥이는 지민이와 같은 점에 있다면 곁을 맴돌며 그 점에 머문다.</li>
	<li>사람을 무서워하는 삼색이는 매초 지민이가 있는 점으로부터 $1$만큼 도망친다.</li>
	<li>다행히 삼색이는 냥냥이와 사이가 좋아서 함께 같은 점에 머무를 수 있다.</li>
</ul>

<p>또한 고양이들이 기숙사로 들어가면 안되므로 견우관 입구($0$)나 직녀관 입구($N$)에 오지 못하게 해야 한다. <strong>지민이는 기숙사 입구로 이동할 수 있다.</strong></p>

<p>고양이 두 마리가 모두 원하는 위치에 있는 순간 이동을 멈추고 사진을 찍을 수 있다.</p>

<p>오작교의 길이 $N$, 냥냥이와 삼색이의 처음 위치 $A$와 $B$, 지민이가 원하는 냥냥이와 삼색이의 위치 $C$와 $D$가 주어진다. 지민이를 도와 원하는 구도의 사진을 찍기 위해 어떻게 이동해야 하는지 알려주는 프로그램을 작성해 보자.</p>

### 입력

<p>첫 번째 줄에 정수 $N$이 주어진다.</p>

<p>두 번째 줄에 네 개의 정수 $A$, $B$, $C$, $D$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>첫 번째 줄에 지민이가 원하는 사진을 찍을 수 있는 방법이 존재한다면 <span style="color:#e74c3c;"><code>YES</code></span>를, 아니라면 <span style="color:#e74c3c;"><code>NO</code></span>를 출력한다.</p>

<p>만약 그러한 방법이 존재한다면, 지민이가 원하는 사진을 찍는데 $k$초가 걸린다고 하자.</p>

<p>$k&gt;0$이라면 두 번째 줄에 $k$개의 정수 $x_1, x_2, \cdots, x_k$를 공백으로 구분하여 출력한다. $x_i$는 $i$초에 지민이가 서 있는 위치를 나타낸다.</p>

<p>$k=0$인 경우 두 번째 줄을 출력하지 않는다.</p>

<p>단, $k$는 $3\times 10^5$를 넘지 않아야 한다. 사진을 찍을 수 있다면 항상 그러한 방법이 존재함을 증명할 수 있다.</p>

<p>정답이 여러 개 존재한다면 그중 아무거나 출력해도 상관없다. $k$를 최소화할 필요는 없음에 유의하라.</p>

### 제한

<ul>
	<li>$2\leq N\leq 10^5$</li>
	<li>$0&lt;A,B,C,D&lt;N$</li>
</ul>