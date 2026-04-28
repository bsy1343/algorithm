# [Silver III] 카드 교환 - 31845

[문제 링크](https://www.acmicpc.net/problem/31845)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 760, 정답: 310, 맞힌 사람: 269, 정답 비율: 43.040%

### 분류

구현, 그리디 알고리즘, 정렬, 시뮬레이션

### 문제 설명

<p>인하대학교 축제가 열리면, 인천 최대 규모의 카지노인 <strong>인하 카지노</strong>도 함께 문을 연다. 손님들의 더 많은 유입을 원했던 인하 카지노는 모두가 즐길 수 있는 새로운 카드 게임을 만들었다. 새로운 카드 게임의 진행 방식은 다음과 같다.</p>

<p>딜러와 플레이어는 각각 $1$부터 $N$까지의 정수가 적힌 카드를 한 장씩 받는다. 딜러는 <strong>아무것도 적혀있지 않은 더미 카드 한 장</strong>을 추가로 받는다. 그리고 플레이어는 가진 점수가 $0$인 상태에서 게임을 시작하여 턴을 $M$회 수행한다. 각 턴은 아래와 같은 순서대로 진행된다.</p>

<ol>
	<li>플레이어가 딜러의 패에서 원하는 카드를 하나 가져온다.</li>
	<li>플레이어의 패에서 같은 값을 가진 카드 쌍이 만들어진 경우, 그 카드 쌍은 패에서 제거된다. 그리고 해당 카드 쌍에 적힌 값이 $i$라면 플레이어는 $A_i$점을 얻는다. 얻는 점수가 음수일 수 있으며, 플레이어의 점수도 음수가 될 수 있다.</li>
	<li>플레이어가 딜러에게 자신의 패에서 원하는 카드를 하나 준다.</li>
	<li>딜러의 패에서 같은 값을 가진 카드 쌍이 만들어진 경우 그 카드 쌍은 패에서 제거된다. 이 경우 플레이어는 점수를 얻지 못한다.</li>
</ol>

<p>$M$번째 턴을 끝내거나 더미 카드를 제외한 모든 카드 쌍이 사라진 순간 게임이 종료된다. 즉, 턴이 수행되는 도중이라도 플레이어가 딜러에게 카드를 줄 수 없다면 게임이 즉시 종료된다.</p>

<p>이 카드 게임에서 게임이 종료되었을 때 플레이어가 얻을 수 있는 최대 점수를 구하는 프로그램을 작성해 보자.</p>

### 입력

<p>첫 번째 줄에 정수가 적힌 카드의 수 $N$과 게임의 최대 턴 수 $M$이 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄에 각 카드에 대해 플레이어의 패에 카드 쌍이 만들어질 때 얻을 수 있는 점수 $A_1$, $A_2$, $\cdots$, $A_N$이 공백으로 구분되어 주어진다.</p>

### 출력

<p>플레이어가 얻을 수 있는 최대 점수를 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N \le 1{,}000$</li>
	<li>$1 \le M \le 1{,}000$</li>
	<li>$-1{,}000 \le A_i \le 1{,}000$</li>
	<li>$A_i$는 정수이다.</li>
</ul>

### 힌트

<p><strong>아래에서 설명하는 예시는 예제 입출력의 상황과 다름에 주의한다.</strong></p>

<p>$N = 4$인 경우 플레이어가 첫 턴에서 더미 카드가 아닌, 정수가 적힌 카드를 선택한 턴의 예시는 아래와 같다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/bfc284b8.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/bfc284b8.png" data-original-src="https://upload.acmicpc.net/0cfade87-3954-4a6a-b9f4-3e6fab43800b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="600" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/1668990f.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/1668990f.png" data-original-src="https://upload.acmicpc.net/210b7e00-8c70-49b4-a015-077a7e7efce6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="600" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/f4655f17.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/f4655f17.png" data-original-src="https://upload.acmicpc.net/8d4c5bd6-e3cb-4f19-8e4c-542ec2ccd4c5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="600" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/32d9c906.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/32d9c906.png" data-original-src="https://upload.acmicpc.net/38c36f0d-e7cd-4547-93a0-80152cda47b5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="600" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/70dc301a.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/70dc301a.png" data-original-src="https://upload.acmicpc.net/7e017eaa-9655-4fe3-be9e-01ea6430f3a7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="600" /></p>

<p>만약 딜러의 패에서 더미 카드를 가져오거나 플레이어가 더미 카드를 딜러에게 준 경우, 아래 예시와 같이 더미 카드를 받은 쪽에서는 카드 쌍이 만들어지지 않으므로 아무 일도 일어나지 않는다.</p>

<p>아래 예시는 $N = 4$일 때 플레이어가 첫 턴에 더미 카드를 딜러에게 받고 받은 더미 카드를 다시 딜러에게 돌려주는 예시이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/7f4cdab0.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/7f4cdab0.png" data-original-src="https://upload.acmicpc.net/3cb954f0-ca4d-4520-a2f1-6bf88ab148dc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="600" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/725717b8.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/725717b8.png" data-original-src="https://upload.acmicpc.net/692ae434-5ac8-4608-bd15-bd03e2b03b7f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="600" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/16fe55bc.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/31845.%E2%80%85%EC%B9%B4%EB%93%9C%E2%80%85%EA%B5%90%ED%99%98/16fe55bc.png" data-original-src="https://upload.acmicpc.net/623e3d71-3cd1-4ce0-922a-4917b028639b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="600" /></p>