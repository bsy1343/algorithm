# [Platinum V] 곰곰이와 토너먼트 - 26078

[문제 링크](https://www.acmicpc.net/problem/26078)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 171, 정답: 101, 맞힌 사람: 69, 정답 비율: 51.111%

### 분류

조합론, 기댓값의 선형성, 수학, 모듈로 곱셈 역원, 정수론, 확률론

### 문제 설명

<p>곰곰이는 $2^K$마리가 참가하여 최고의 곰곰댄서를 뽑는 곰곰댄스 토너먼트에 출전하려 한다!</p>

<p style="text-align: center;"><img alt="곰곰 짜잔" src="%EB%B0%B1%EC%A4%80/Platinum/26078.%E2%80%85%EA%B3%B0%EA%B3%B0%EC%9D%B4%EC%99%80%E2%80%85%ED%86%A0%EB%84%88%EB%A8%BC%ED%8A%B8/c433a763.png" data-original-src="https://upload.acmicpc.net/76a9dc04-5936-47be-acea-247811fc6e4e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height:250px; object-fit:contain; display:inline-block;" /></p>

<p>토너먼트는 $K$개의 라운드에 걸쳐 진행되고, 참가자들은 각 라운드마다 2마리씩 짝을 이뤄 춤 대결을 펼친다.</p>

<p>$i(1 \leq i \leq K)$번째 라운드에서 승리했을 경우 $r_i$원의 상금을 얻고 마지막 라운드가 아니라면 다음 라운드에 진출하게 되고, 패배한 경우 탈락하여 그대로 집에 가게 된다. </p>

<p>$i(1 \leq i \leq 2^K)$번 참가자는 춤 실력을 나타내는 실력 지표 $a_i$가 있으며, 만약 두 참가자가 맞붙었을 경우 춤 실력 지표가 더 큰 참가자가 무조건 이기게 된다.</p>

<p style="text-align: center;"><img alt="4-1-3-2 순으로 돼있는 대진표" src="%EB%B0%B1%EC%A4%80/Platinum/26078.%E2%80%85%EA%B3%B0%EA%B3%B0%EC%9D%B4%EC%99%80%E2%80%85%ED%86%A0%EB%84%88%EB%A8%BC%ED%8A%B8/d89582b5.png" data-original-src="https://upload.acmicpc.net/c081bcab-47c6-45f9-9108-ff10d96c08b8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height:250px; object-fit:contain; display:inline-block;" /></p>

<p style="text-align: center;"><strong>[그림 1] 참가자가 4명일 때 나올 수 있는 24가지 대진표 중 하나. 원 안의 숫자는 참가자 번호를 의미한다.</strong></p>

<p>토너먼트의 대진표는 토너먼트가 시작하기 전, 가능한 $(2^K)!$가지의 조합 중 하나가 무작위로 선택되어 정해지게 된다. 각 대진표 조합이 선택될 확률은 모두 동일하다.</p>

<p>곰곰이는 대진표가 어떻게 만들어지냐에 따라 자신이 얻을 수 있는 상금이 달라질 수도 있음을 알게 되었다.</p>

<p>자신과 다른 참가자들의 춤 실력 지표가 주어졌을 때, 집으로 가지고 돌아갈 수 있는 상금의 기댓값을 곰곰이에게 알려주자!</p>

### 입력

<p>첫째 줄에 토너먼트의 라운드 수 $K$가 주어진다. $(1 \leq K \leq 18)$</p>

<p>둘째 줄에 참가자들의 춤 실력 지표 $a_1, ..., a_{2^K}$이 공백으로 구분되어 주어진다. $(1 \leq a_i \leq 10^9)$</p>

<p>셋째 줄에 각 라운드의 상금 $r_1, ..., r_K$이 공백으로 구분되어 주어진다. $(1 \leq r_i \leq 10^6)$</p>

<p><strong>모든 참가자들의 춤 실력 지표는 서로 다르기 때문에, 무승부가 발생하는 일은 없다.</strong></p>

<p>곰곰이는 $1$번 참가자이다.  </p>

<p>입력은 모두 양의 정수로 주어진다.</p>

### 출력

<p>곰곰이가 곰곰댄스 토너먼트에서 얻을 수 있는 상금의 기댓값은 언제나 유리수임을 증명할 수 있다.</p>

<p>기댓값을 $\frac{y}{x}$($x, y$는 서로소)꼴로 나타내었을 때, $0 \leq z \leq 998\ 244\ 352, xz\equiv y\pmod {998\ 244\ 353}$를 만족하는 값 $z$는 유일하다.</p>

<p>$z$를 출력하시오.</p>