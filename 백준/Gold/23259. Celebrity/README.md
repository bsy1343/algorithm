# [Gold I] Celebrity - 23259

[문제 링크](https://www.acmicpc.net/problem/23259)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 194, 정답: 91, 맞힌 사람: 69, 정답 비율: 43.671%

### 분류

그래프 이론, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<blockquote>
<p><em>잊지마 넌 흐린 어둠 사이 왼손으로 그린 별 하나</em></p>

<p><em>보이니 그 유일함이 얼마나 아름다운지 말야</em></p>

<p><em>You are my celebrity</em></p>

<p><em>- 아이유, Celebrity 中</em></p>
</blockquote>

<p>별은 $5$개의 정점으로 이루어진 단순 그래프의 별명이다. (그래프 이론에서의 star graph와는 다르다)</p>

<p>어떤 별 $A$의 연결 관계를 유지한 채 정점을 적당히 이동시키거나 회전하여 별 $B$와 같은 모양으로 만들 수 있다면 $A$와 $B$는 같은 별이다. 예를 들어, 아래 이미지의 첫 번째 별과 두 번째 별은 같지만 세 번째 별은 다르다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23259.%E2%80%85Celebrity/2cd7620c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23259.%E2%80%85Celebrity/2cd7620c.png" data-original-src="https://upload.acmicpc.net/87f8f706-5a1b-4e0f-955d-d4debedb5ccd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>찬우는 왼손으로 별을 $N$개 그리고 각 별마다 $1$부터 $N$까지의 번호를 붙여 준 뒤, 한 번만 그려진 유일한 별들을 아름답다고 정의하였다. 찬우가 그린 별 $N$개가 주어질 때 아름다운 별의 개수를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 $N$이 주어진다.</p>

<p>둘째 줄부터 찬우가 그린 $N$개의 별이 $1$번 별부터 $N$번&nbsp;별까지 하나씩 주어진다.</p>

<p>각 별을 나타내는 데이터의&nbsp;첫 줄에는 별의 간선 수 $E$가 주어지며, 이후 $E$줄에 걸쳐 별의 연결 관계를 나타내는 두 정수&nbsp;$a$와 $b$가 공백으로 구분되어&nbsp;주어진다. 이는 $a$번 정점과 $b$번 정점이 연결되어 있다는 의미이다. 별의 각 정점은 $1$부터 $5$까지 번호가 매겨져 있지만, 두 별이 같은지 판단할 때는 정점의 번호를 고려하지 않는다.</p>

### 출력

<p>첫째 줄에 아름다운 별의 수를 출력한다.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 10\,000$</li>
	<li>$0 \leq E \leq 10$</li>
	<li>$1 \leq a, b \leq 5$</li>
	<li>$a \neq b$</li>
	<li>각 별에서&nbsp;임의의 두 정점을 잇는 간선은 최대 하나 존재한다.</li>
</ul>