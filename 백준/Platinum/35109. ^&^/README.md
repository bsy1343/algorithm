# [Platinum III] ^&^ - 35109

[문제 링크](https://www.acmicpc.net/problem/35109)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 181, 정답: 55, 맞힌 사람: 40, 정답 비율: 27.586%

### 분류

많은 조건 분기, 애드 혹

### 문제 설명

<blockquote>
<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35109.%E2%80%85%5E%26%5E/486a69d1.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35109-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 80%"></p>

<p style="text-align: center;"><sub>▲ 현대모비스가 상해모터쇼에서 선보인 중국 시장 친화 AR-HUD 전개 화면</sub></p>

<p>자동차 헤드업 디스플레이(HUD)는 운전자의 시선 이동을 최소화해 안전을 확보하는 기술로, 최근에는 실제 도로 상황에 실시간 데이터를 결합한 AR HUD로 진화하며 직관적인 주행 정보를 제공하고 있다. 특히 현대모비스가 2025 상해모터쇼에서 선보인 '슬로프 AR HUD'와 같이 효율성과 화질을 개선한 차세대 기술들이 전기차 및 커넥티드카 시장을 중심으로 확산되면서, 운전자의 경험을 근본적으로 변화시키는 표준으로 자리 잡고 있다.</p>
</blockquote>

<p>현대모비스의 AR HUD는 외부 센서로부터 실시간으로 수집된 데이터를 연속된 정수로 변환하여 실시간 연산을 거쳐 전면 유리창에 투사하도록 한다. AR HUD는 수집된 데이터의 양에 따라 결정되는 $2$ 이상의 정수 $N$에 대하여 이를 $1, 2, \ldots, N$의 연속된 정수로 변환하여 $N$개의 수 사이에 bitwise XOR 연산자를 끼워 넣어 신호 값을 산출한다. 이 신호 값을 최대화하기 위해, $N-1$개의 bitwise XOR 연산자 중 하나를 bitwise AND로 바꾸려고 한다. 어느 연산자를 bitwise AND로 바꾸어야 최대의 신호 값을 얻을 수 있는지 찾아보자. 단, 연산은 우선순위를 고려하지 않고 <strong>왼쪽에서부터 오른쪽으로</strong> 차례대로 수행한다.</p>

### 입력

<p>첫째 줄에 정수 $N$이 선행 $0$(leading zero)이 없는 이진수로 주어진다. $\left(2 \le N &lt; 2^{100}\right)$</p>

### 출력

<p>신호 값의 최대를 선행 $0$이 없는 이진수로 출력한다.</p>