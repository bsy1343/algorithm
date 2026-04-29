# [Platinum I] 디미교도소 - 33584

[문제 링크](https://www.acmicpc.net/problem/33584)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 17, 맞힌 사람: 13, 정답 비율: 21.667%

### 분류

그리디 알고리즘, 세그먼트 트리, 자료 구조

### 문제 설명

<p>디미교도소는 단 한 명의 탈옥수도 발생한 적이 없을 정도로 철통같은 보안을 자랑한다. 하지만 디미교도소 역사상 처음으로 $1$번 죄수부터 $N$번 죄수까지 총 $N$명의 죄수가 탈옥을 시도한다.</p>

<p>각 죄수는 자신이 탈옥할 굴을 하나씩 만들어 총 $N$개의 굴을 만들었다. $i$번 죄수가 만든 굴은 목적지 $i$로 이어지며, $i$번 죄수가 만든 굴을 $i$번 굴이라고 부르기로 했다. 하지만 여러 이유로 $i$번 죄수는 목적지 $E_i$를 통해 탈옥하고자 한다. 또한, 죄수들은 간수들에게 들킬 위험을 줄이기 위해 모두 <strong>서로 다른 목적지</strong>를 통해 탈옥하고자 하였다.</p>

<p>죄수들은 자신이 원하는 목적지로 탈옥하기 위해 두 굴 사이를 연결할 샛길을 만들기로 했다. $a$번 굴과 $b$번 굴 사이의 <strong>거리</strong>는 $|a-b|$로 정의되며, 샛길은 거리가 $1$인 굴 사이에만 만들 수 있다. 혼란을 방지하기 위해 모든 샛길은 교도소로부터 거리가 모두 달라야 한다. 여러 죄수가 샛길에서 만나 시간을 지체할 수 있으므로 다음 규칙에 따라 탈옥하기로 했다.</p>

<ol>
	<li>굴을 따라 탈옥하는 방향으로만 이동한다. 즉, <strong>교도소 방향으로 되돌아가지 않는다</strong>.</li>
	<li>사용할 수 있는 샛길을 만나면 무조건 샛길을 통해 다른 굴을 향해 이동한다.</li>
	<li>출발한 굴과 거리가 $2$ 이상이라면 <strong>출발한 굴 방향으로 연결된 샛길은 사용할 수 없다</strong>.</li>
	<li>출발한 굴과 거리가 $1$이고 출발한 굴 방향의 샛길을 만나면 <strong>출발한 굴로 이동한 후 이후 만나는 모든 샛길을 무시하고 탈옥한다</strong>.</li>
</ol>

<p>아래는 순서대로 규칙 $3$번, $4$번의 상황을 나타낸 그림이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33584.%E2%80%85%EB%94%94%EB%AF%B8%EA%B5%90%EB%8F%84%EC%86%8C/bda43ec1.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33584-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 100%; height: 450px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33584.%E2%80%85%EB%94%94%EB%AF%B8%EA%B5%90%EB%8F%84%EC%86%8C/82fd2d1a.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33584-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 100%; height: 450px;"></p>

<p>샛길을 만드는 데에는 힘이 많이 들기 때문에 최소한의 샛길만 만들어서 모든 죄수가 탈옥해야 한다. 죄수들을 도와 필요한 최소 샛길의 개수를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 정수 $N$이 주어진다. $(1 \leq N \leq 5 \times 10^5)$ </p>

<p>두 번째 줄에 정수 $E_1, E_2, \cdots, E_N$이 공백으로 구분하여 주어진다. $(1 \leq E_1, E_2, \cdots, E_N \leq N; i \neq j \Rightarrow E_i \ne E_j)$ </p>

### 출력

<p>첫 번째 줄에 필요한 샛길의 최소 개수를 출력한다. 어떤 식으로 샛길을 만들어도 죄수들이 자신이 탈옥하고자 하는 목적지를 통해 탈옥할 수 없다면 대신 <code><span style="color:#e74c3c;">-1</span></code>을 출력한다.</p>