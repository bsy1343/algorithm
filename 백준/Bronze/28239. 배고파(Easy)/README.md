# [Bronze I] 배고파(Easy) - 28239

[문제 링크](https://www.acmicpc.net/problem/28239)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1877, 정답: 738, 맞힌 사람: 604, 정답 비율: 40.320%

### 분류

수학, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p><strong>이 문제는 배고파(Hard)의 하위 문제이고, 배고파(Hard)의 정답 코드를 제출하여 맞힐 수 있다.</strong></p>

<p>송도고등학교는 경관이 참 예쁘다. 도훈이는 특히 학교 뒤쪽에 만개한 벚꽃을 보고 감탄하였다.</p>

<p style="text-align: center;"><img alt="" height="405" src="%EB%B0%B1%EC%A4%80/Bronze/28239.%E2%80%85%EB%B0%B0%EA%B3%A0%ED%8C%8C(Easy)/192aee6f.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/28239.%E2%80%85%EB%B0%B0%EA%B3%A0%ED%8C%8C(Easy)/192aee6f.png" data-original-src="https://upload.acmicpc.net/485976e4-1833-4a33-8883-8906465a1f42/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="542" /></p>

<p style="text-align: center;">2021년 봄에 찍은 송도고등학교 뒤쪽 벚꽃 나무들의 풍경이다.</p>

<p>남고에서 만개한 벚꽃을 보고 있자니 괜스레 속이 쓰린 도훈이는 밥이나 먹어야겠다고 생각했다. 그런데 도훈이에게는 치료가 필요할 정도로 심각한 결정 장애가 있어서 메뉴를 고르는 것이 쉽지 않다. 따라서 도훈이는 $n$개의 메뉴를 각각 다음과 같은 규칙으로 골라 먹을 생각이다.</p>

<ul>
	<li>주어진 양의 정수 $m$에 대해 $2^x + 2^y = m$인 음이 아닌 정수 $x$와 $y$를 찾은 뒤 메뉴판의 $(x,y)$ 위치에 적힌 메뉴를 고른다. 단, $x\le y$인 경우만 다룬다.</li>
</ul>

<p>하지만 도훈이는 $n$과 $m$이 너무 커서 메뉴를 주문하는 데 어려움을 겪고 있다. 도훈이를 도와 $n$개의 메뉴를 주문하는 프로그램을 작성하여라.</p>

### 입력

<p>첫 번째 줄에 메뉴의 수 $n$이 주어진다.</p>

<p>이어서 $n$개의 각 줄에 메뉴를 고를 때 사용할 양의 정수 $m$이 하나씩 주어진다.</p>

### 출력

<p>$n$개의 줄에 각각 주문할 메뉴의 위치 $(x,y)$의 $x$, $y$를 공백으로 구분하여 출력한다.</p>

### 제한

<ul>
	<li>$1\le n\le 10\,000$.</li>
	<li>$1\le m\le 10^{18}$.</li>
	<li>주어지는 <strong>모든 $m$에 대해 가능한 $x\le y$인 $(x,y)$ 순서쌍이 정확히 하나 존재함</strong>이 보장된다.</li>
</ul>

### 힌트

<ul>
	<li>$2^0=1$이고, 양의 정수 $k$에 대해 $2^k = \overbrace{2\times 2\times \cdots \times 2}^{k}$로 정의된다.</li>
	<li>C/C++의 경우, 32bit 정수형 <span style="color:#e74c3c;"><code>int</code></span>의 범위를 넘어가는 정수를 다루게 되므로 64bit 정수형 <span style="color:#e74c3c;"><code>long long</code></span> 사용을 권장한다.</li>
</ul>