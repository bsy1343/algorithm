# [Platinum V] 입자 실험 - 27360

[문제 링크](https://www.acmicpc.net/problem/27360)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 29, 맞힌 사람: 25, 정답 비율: 73.529%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Albert는 작은 입자를 이용한 연구를 하고 있다. 각 입자는 양성(<code>+</code>) 전하를 갖거나 음성(<code>-</code>) 전하를 갖는데, 실험 기구를 이용하여 이를 바꿀 수도 있다. 구체적으로, 크기가 $R \times C$ 인 격자 모양의 실험 기구를 이용하여 실험을 진행하는데, 실험 기구를 수직으로 세워둔 후 각 열의 1행 위에서 입자를 하나 발사하여 $R$행 아래에서 감지하는 방법으로 실험을 한다.</p>

<p>예를 들어 아래 그림의 경우 $R$ = 3, $C$ = 4 이며 문자열 $S$ = &quot;+-++&quot;는 각 열에 양성/음성/양성/양성의 입자를 순서대로 발사함을 알려준다. 각 입자는 1행부터 $R$행까지 직선으로 총 $R$개의 칸을 통과하여 가장 아래에 있는 감지 센서에 도달한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27360.%E2%80%85%EC%9E%85%EC%9E%90%E2%80%85%EC%8B%A4%ED%97%98/e1af41c0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27360.%E2%80%85%EC%9E%85%EC%9E%90%E2%80%85%EC%8B%A4%ED%97%98/e1af41c0.png" data-original-src="https://upload.acmicpc.net/540f8cc9-08ee-435e-9384-f0208f35f714/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>각 실험 기구의 일부 $1 \times 1$ 칸에는 미리 설치된 스위치가 있어 해당 칸을 지나가는 입자는 양성에서 음성으로 혹은 음성에서 양성으로 바뀌게 된다. 미리 설치된 스위치의 개수를 $K$라 하고 $i$번째 스위치가 설치된 행/열의 인덱스를 $X_i$, $Y_i$라 하자.</p>

<p>예를 들어 아래 그림처럼 $K = 3$개의 스위치가 있고 $X = [1, 1, 2]$, $Y = [2, 4, 4]$인 경우를 살펴보면 최종적으로 감지되는 입자의 성질은 모두 양성이 된다. 2번째 열의 입자는 음성에서 양성으로 바뀌고, 4번째 입자의 경우 음성으로 바뀐 뒤 다시 양성으로 바뀌기 때문이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27360.%E2%80%85%EC%9E%85%EC%9E%90%E2%80%85%EC%8B%A4%ED%97%98/b5564501.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27360.%E2%80%85%EC%9E%85%EC%9E%90%E2%80%85%EC%8B%A4%ED%97%98/b5564501.png" data-original-src="https://upload.acmicpc.net/e41cb620-3cd6-4516-8a9c-d5ca8baa9cba/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Albert는 $1 \times 2$ 크기의 (좌우로 두 칸을 차지하는) 스위치도 여럿 가지고 있는데, 이를 활용하여 모든 입자가 감지 센서에 도달할 때 양성이 되도록 하고 싶다. 단, 이 스위치의 특성상 언제나 가로로 두 칸을 덮도록 설치해야 하고, 임의의 칸이 두 개 이상의 스위치로 덮이면 안 된다. 위 예제의 경우 아래 세 가지 다른 방법으로 이를 달성할 수 있다.</p>

<ul>
	<li>좌측 그림: 2행 1-2열과 3행 1-2열에 스위치를 각각 설치한다.</li>
	<li>중앙 그림: 2행 2-3열과 3행 2-3열에 스위치를 각각 설치한다.</li>
	<li>우측 그림: 스위치를 추가로 설치하지 않는다.</li>
	<li>이 예제에서 편의상 두 개의 스위치를 AA와 BB로 표현했지만 스위치는 모두 동일하게 생겼기 때문에 구분이 가지 않는다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27360.%E2%80%85%EC%9E%85%EC%9E%90%E2%80%85%EC%8B%A4%ED%97%98/bd23fc7b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27360.%E2%80%85%EC%9E%85%EC%9E%90%E2%80%85%EC%8B%A4%ED%97%98/bd23fc7b.png" data-original-src="https://upload.acmicpc.net/337f5dac-beb5-470b-97cd-68866cc63fb8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>다른 예로, 아래 그림처럼 $R = 2$, $C = 4$, $K = 0$인 경우 Albert는 총 다섯 가지 다른 방법으로 목적을 달성할 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27360.%E2%80%85%EC%9E%85%EC%9E%90%E2%80%85%EC%8B%A4%ED%97%98/a1cc862e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27360.%E2%80%85%EC%9E%85%EC%9E%90%E2%80%85%EC%8B%A4%ED%97%98/a1cc862e.png" data-original-src="https://upload.acmicpc.net/602a2fe2-6806-4f08-ac2b-1e32a9ee4bcb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>입력으로 $R$, $C$, $K$, $X$, $Y$가 주어졌을 때, 몇 가지 다른 방법으로 $1 \times 2$ 스위치를 실험 기구에 추가하여 모든 입자가 양성인채로 감지 센서에 도달하게 할 수 있는지 구해보자. 단, 답이 매우 커질 수 있으므로 $10^9 + 7$로 나눈 나머지를 출력한다.</p>

### 입력

<p>입력 첫 줄에 테스트 케이스의 수 $T$가 주어진다.</p>

<p>각 테스트 케이스의 첫 줄에는 $R$, $C$, $K$가 공백으로 구분되어 주어진다. 둘째 줄에는 처음 실험기구에서 발사되는 입자의 양성/중성을 나타내는 길이 $C$인 문자열 $S$가 주어진다. 다음 $K$ 줄에 걸쳐 각 줄에 $X_i$, $Y_i$값이 공백으로 구분되어 주어진다.</p>

### 출력

<p>각 테스트 케이스의 정답을 각 줄에 공백으로 구분하여 출력한다.</p>

### 제한

<ul>
	<li>$1 \le T \le 5$</li>
	<li>$1 \le R \le 500$</li>
	<li>$1 \le C \le 10$</li>
	<li>$0 \le K \le \min(R\cdot C, 1000)$</li>
	<li>$1 \le i \le K$ 인 $i$에 대하여 $1 \le X_i \le R$ 이고 $1 \le Y_i \le C$ 이다.</li>
	<li>각 테스트 케이스 내에서 $(X_i, Y_i)$ 정수쌍은 고유하다 (즉, 같은 칸이 두 번 이상 입력으로 주어지지 않는다)</li>
	<li>Albert는 충분히 많은 스위치를 갖고 있기에 얼마든지 사용할 수 있다고 가정하자.</li>
</ul>