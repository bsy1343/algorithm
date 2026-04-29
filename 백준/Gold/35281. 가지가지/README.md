# [Gold III] 가지가지 - 35281

[문제 링크](https://www.acmicpc.net/problem/35281)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 144, 정답: 64, 맞힌 사람: 63, 정답 비율: 51.639%

### 분류

애드 혹, 해 구성하기, 홀짝성

### 문제 설명

<p>$N \times M$ 크기의 격자판에 $1 \times 2$ 크기의 도미노 형태인 가지를 놓으려고 한다. 가지는 다음 규칙에 따라 배치되어야 한다.</p>

<ul>
<li>각 가지는 <span style="color:#2ecc71;">꼭지</span>와 <span style="color:#9b59b6;">몸통</span>이 각각 $1$칸을 차지하는 모양이다.</li>
<li>가지의 <span style="color:#2ecc71;">꼭지</span>는 항상 <span style="color:#9b59b6;">몸통</span>의 왼쪽 또는 위쪽에 있어야 한다.</li>
<li>격자판의 모든 행과 열에 <span style="color:#2ecc71;">꼭지</span>가 홀수 개 존재해야 한다. $0$은 홀수가 아니다.</li>
<li>가지끼리는 겹칠 수 없다.</li>
</ul>

<p>이러한 규칙을 만족하면서 가지를 배치할 때, 필요한 가지의 최소 개수와 배치 방법을 출력하시오.</p>

### 입력

<p>첫 번째 줄에 격자판의 행의 개수와 열의 개수를 나타내는 두 정수 $N$, $M$이 공백으로 구분되어 주어진다. ($2 \le N, M \le 1\,000$)</p>

### 출력

<p>첫 번째 줄에 필요한 가지의 최소 개수를 출력한다. 만약 조건을 만족하는 배치 방법이 없다면 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다.</p>

<p>배치가 가능하다면, 두 번째 줄부터 $N$개의 줄에 걸쳐 격자판의 상태를 출력한다. 각 줄은 <strong>공백 없이</strong> 붙여진 길이 $M$의 문자열이어야 한다.</p>

<p>각 문자의 의미는 다음과 같다.</p>

<ul>
<li><span style="color:#e74c3c;"><code>.</code></span>: 빈 칸</li>
<li><span style="color:#e74c3c;"><code>G</code></span>: 가지의 <span style="color:#2ecc71;">꼭지</span></li>
<li><span style="color:#e74c3c;"><code>g</code></span>: 가지의 <span style="color:#9b59b6;">몸통</span></li>
</ul>

<p>가능한 배치 방법이 여러 가지라면 그중 아무거나 출력한다.</p>