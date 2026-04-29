# [Gold IV] C) - 33693

[문제 링크](https://www.acmicpc.net/problem/33693)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 218, 정답: 151, 맞힌 사람: 115, 정답 비율: 66.860%

### 분류

그리디 알고리즘, 문자열, 스택, 자료 구조

### 문제 설명

<p>UDPC만을 손꼽아 기다리던 포닉스는 어느새 어디를 봐도 알파벳 U, D, P, C가 보이는 수준에 이르렀다. 그중에서도, 알파벳 <span style="color:#e74c3c;"><code>C</code></span>, <span style="color:#e74c3c;"><code>U</code></span>와 괄호 <span style="color:#e74c3c;"><code>(</code></span> , <code><span style="color:#e74c3c;">)</span></code>는 굉장히 유사한 모양을 띠기 때문에 구별하기가 매우 힘들어졌다.</p>

<p>다행인 점은, 알파벳 <span style="color:#e74c3c;"><code>C</code></span>와 <span style="color:#e74c3c;"><code>U</code></span>를 돌려 마치 괄호처럼 사용할 수 있다는 점이다. <code><span style="color:#e74c3c;">C</span></code>는 그 모습 그대로 여는 괄호 <span style="color:#e74c3c;"><code>(</code></span> 로 사용하거나, 어느 방향으로든 90도씩 두 번을 돌려 닫는 괄호 <code><span style="color:#e74c3c;">)</span></code> 로 사용할 수 있다. <span style="color:#e74c3c;"><code>U</code></span>는 시계 방향으로 90도를 회전하면 여는 괄호 <code><span style="color:#e74c3c;">(</span></code> , 반시계 방향으로 90도를 회전하면 닫는 괄호 <span style="color:#e74c3c;"><code>)</code></span> 로 사용할 수 있다.</p>

<p>포닉스는 UDPC를 기다리느라 지쳤기 때문에 알파벳을 최소한으로 돌리고 싶다. 짝수 길이의 <span style="color:#e74c3c;"><code>C</code></span>와 <code><span style="color:#e74c3c;">U</span></code>로 이루어진 문자열이 주어지면, 알파벳 중 하나를 골라 어느 방향으로든 90도씩 회전해서 올바른 괄호 문자열을 만들기 위해 필요한 최소 회전 횟수를 구하여라.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수 $T$가 주어진다. $(1\le T\le 500\, 000)$</p>

<p>둘째 줄부터 $T$개의 줄에 걸쳐 비어 있지 않은 문자열 $S$가 주어진다. $S$는 길이가 짝수이며, 알파벳 <span style="color:#e74c3c;"><code>C</code></span>와 <span style="color:#e74c3c;"><code>U</code></span>로만 이루어져 있는 문자열이다.</p>

<p>모든 테스트 케이스에 대해서 $S$의 길이의 합은 $10^6$ 이하이다.</p>

### 출력

<p>각 테스트 케이스에 대해, 첫째 줄에 주어진 문자열 $S$를 올바른 괄호 문자열으로 만들기 위해 필요한 최소 회전 횟수를 출력한다.</p>

<p>각 테스트 케이스에 대해, 둘째 줄에 구성된 괄호 문자열 $S'$을 출력한다. $S'$는 길이가 $S$와 같고, <span style="color:#e74c3c;"><code>( </code></span>와 <span style="color:#e74c3c;"><code>)</code></span>로 이루어진 올바른 괄호 문자열이어야 한다.</p>

<p>가능한 답이 여러 가지라면 그중 하나만 출력한다.</p>

### 힌트

<p>올바른 괄호 문자열은 다음과 같이 정의된다.</p>

<ul>
	<li>빈 문자열은 올바른 괄호 문자열이다.</li>
	<li><code>S</code>가 올바른 괄호 문자열이라면, <code>(S)</code>도 올바른 괄호 문자열이다.</li>
	<li><code>S</code>와 <code>T</code>가 올바른 괄호 문자열이라면, 두 문자열을 이어 붙인 괄호 문자열 <code>ST</code>도 올바른 괄호 문자열이다.</li>
</ul>