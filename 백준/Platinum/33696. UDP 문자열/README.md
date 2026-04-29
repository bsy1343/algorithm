# [Platinum IV] UDP 문자열 - 33696

[문제 링크](https://www.acmicpc.net/problem/33696)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 163, 정답: 89, 맞힌 사람: 65, 정답 비율: 52.419%

### 분류

다이나믹 프로그래밍, 수학, 정수론, 조합론, 페르마의 소정리

### 문제 설명

<p><span style="color:#e74c3c;"><code>U</code></span>, <span style="color:#e74c3c;"><code>D</code></span>, <span style="color:#e74c3c;"><code>P</code></span>로만 이루어져 있으며 <span style="color:#e74c3c;"><code>U</code></span>, <span style="color:#e74c3c;"><code>D</code></span>, <span style="color:#e74c3c;"><code>P</code></span>가 모두 동일한 개수가 들어 있는 문자열을 <strong>UDP 문자열</strong>이라고 한다. 또한, 어떤 두 개의 UDP 문자열을 이어 붙여도 만들 수 없는 UDP 문자열을 <strong>완전 UDP 문자열</strong>이라고 한다. 가령, 문자열 <span style="color:#e74c3c;"><code>UDPPUD</code></span>는 두 UDP 문자열 <span style="color:#e74c3c;"><code>UDP</code></span>와 <span style="color:#e74c3c;"><code>PUD</code></span>를 이어붙여 만들 수 있으므로 완전 UDP 문자열이 아니지만, <span style="color:#e74c3c;"><code>UUDDPP</code></span>는 완전 UDP 문자열이다.</p>

<p>길이 $3N$인 완전 UDP 문자열의 개수를 구해보자. 단, 답이 매우 클 수 있으므로 답을 $10^9+7$로 나눈 나머지를 구해보자.</p>

### 입력

<p>첫 번째 줄에 UDP 문자열의 길이를 $3$으로 나눈 정수 $N$이 주어진다. $(1\leq N\leq 5\,000)$</p>

### 출력

<p>길이 $3N$인 완전 UDP 문자열의 개수를 $10^9+7$로 나눈 나머지를 출력한다.</p>