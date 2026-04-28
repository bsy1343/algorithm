# [Platinum IV] 다채로운 큐브 - 31456

[문제 링크](https://www.acmicpc.net/problem/31456)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 9, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

구현

### 문제 설명

<p>Albert는 최근 3D 프린터를 구매했는데, 이를 이용해 장난감 큐브 (cube)를 만드는 취미가 있다. 구체적으로, $1 \times 1 \times 1$ 크기의 큐브가 $x$ 축으로 $N_x$개, $y$ 축으로 $N_y$개, $z$ 축으로 $N_z$개 놓이도록 하여 총 $N_x \times N_y \times N_z$ 개의 큐브를 만든다. 아래 그림은 $N_x = 3, N_y = 3, N_z = 2$인 경우 총 18개의 ($1 \times 1 \times 1$ 단위) 큐브가 있음을 보여준다. 편의상 각 큐브는 $x,y,z$ 좌표를 이용하여 표현할 수 있으며, 아래 그림의 경우 정면에 보이는 우측 상단의 큐브는 $x = 3, y = 3, z = 1$ 좌푯값을 가지므로 $(3, 3, 1)$로 표현 가능하다 (그림에서 빨간색 점선 화살표로 강조된 큐브이다).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31456.%E2%80%85%EB%8B%A4%EC%B1%84%EB%A1%9C%EC%9A%B4%E2%80%85%ED%81%90%EB%B8%8C/302b9fbd.png" data-original-src="https://upload.acmicpc.net/f1a252be-d02d-4406-863c-94061496a685/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 292px; width: 300px;" /></p>

<p>Albert의 3D 프린터를 이용하면 각 큐브의 면을 빨간색 (R), 초록색 (G), 혹은 파란색 (B)으로 칠할 수 있는데, 이를 위해 우선 길이가 각각 $N_x+1, N_y+1, N_z+1$ 이고 &quot;<code>RGB</code>&quot; 로만 구성된 문자열 $S_x, S_y, S_z$를 입력해야 한다. 편의상 $S_x[i]$, $S_y[j]$, $S_z[k]$ 는 각각 $S_x, S_y, S_z$ 의 $i,j,k$ 번째 글자라 하자 ($1 \le i \le N_x+1$, $1 \le j \le N_y+1$, $1 \le k \le N_z+1$). 이 때 $(i, j, k)$ 에 위치한 큐브의 여섯개의 면 색은 아래 규칙에 따라 칠해진다:</p>

<ul>
	<li>$y-z$ 평면에 평행한 좌측면의 색은 $S_x[i]$ 이고 우측면의 색은 $S_x[i+1]$ 이 된다.</li>
	<li>$z-x$ 평면에 평행한 하단면의 색은 $S_y[j]$ 이고 상단면의 색은 $S_y[j+1]$이 된다.</li>
	<li>$x-y$ 평면에 평행한 정면의 색은 $S_z[k]$ 이고 후면의 색은 $S_z[k+1]$이 된다.</li>
</ul>

<p>예를 들어 위 그림과 같은 18개의 큐브가 있을 때 $S_x = $<code>BBRR</code>, $S_y = $<code>BBRR</code>, $S_z = $<code>GGB</code> 라 하자.</p>

<ul>
	<li>(1, 1, 1)에 위치한 큐브의 경우 좌측/우측면의 색은 <code>B</code> (파랑), 하단/상단면의 색은 <code>B</code> (파랑), 그리고 정/후면의 색은 <code>G</code> (초록)이 된다.</li>
	<li>(1, 3, 1)에 위치한 큐브의 경우 좌측/우측면의 색은 <code>B</code>, 하단/상단면의 색은 <code>R</code>, 그리고 정/후면의 색은 <code>G</code>이 된다.</li>
	<li>(2, 2, 2)에 위치한 큐브의 경우 좌측면은 <code>B</code>, 우측면은 <code>R</code>, 하단은 <code>B</code>, 상단은 <code>R</code>, 정면은 <code>G</code>, 후면은 <code>B</code>가 된다.</li>
	<li>(3, 1, 1)에 위치한 큐브의 경우 좌측/우측면의 색은 <code>R</code>, 하단/상단면의 색은 <code>B</code>, 그리고 정/후면의 색은 <code>G</code>이 된다.</li>
</ul>

<p>Albert는 이 중 &quot;다채로운&quot; 큐브에 관심이 많은데, 다채로운 큐브란 좌측/우측면의 색이 같고, 하단/상단면의 색이 같고, 정면/후면의 색이 같으면서 R, G, B 모든 색을 사용하며 칠한 큐브를 말한다. 위 예제의 경우 두 개의 다채로운 큐브가 있다 - (1, 3, 1)과 (3, 1, 1)에 위치한 큐브.</p>

<p>Albert는 문득 다음과 같은 문제를 풀고 싶어졌다: 임의의 $S_x, S_y, S_z$에 대하여 위의 방법으로 큐브들을 칠했을 때 얻게되는 다채로운 큐브의 개수를 $F(S_x, S_y, S_z)$로 나타내자. 이 때, $U_x, U_y, U_z$는 $S_x, S_y, S_z$에서 각각 최대 1개의 문자만을 바꾸어 얻을 수 있은 문자열이라 했을 때, Albert가 달성할 수 있는 $F(U_x, U_y, U_z)$의 최댓값을 무엇일까? 즉, $U_x$는 $S_x$ 에서 최대 1개의 문자를 바꾸어 얻은 새로운 문자열이고 ($U_x = S_x$ 이어도 된다), $U_y$ 와 $U_z$도 유사하게 정의한다.</p>

<p>예를 들어 위 예제의 경우 $U_x = $<code>BRRR</code>, $U_y = $<code>BBBR</code>, $U_z = $<code>GGG</code> 혹은 $U_x = $<code>BBBR</code>, $U_y = $<code>BRRR</code>, $U_z $= <code>GGG</code> 일 때 $F(U_x, U_y, U_z)$ 값이 8이 되어 최대가 된다.</p>

<p>입력으로 $N_x, N_y, N_z, S_x, S_y, S_z$가 주어졌을 때, 위 조건에 따라 Albert가 달성할 수 있는 $F(U_x, U_y, U_z)$ 의 최댓값을 구해보자.</p>

### 입력

<p>입력 첫 줄에 테스트 케이스의 수 $T$가 주어진다.</p>

<p>각 테스트 케이스의 첫째줄에는 $N_x, N_y, N_z$가 공백으로 구분되어 주어진다. 각 케이스의 둘째 줄에는 길이가 $N_x+1$인 문자열 $S_x$가 주어진다. 각 케이스의 셋째 줄에는 길이가 $N_y+1$인 문자열 $S_y$가 주어진다. 각 케이스의 넷째 줄에는 길이가 $N_z+1$인 문자열 $S_z$가 주어진다.</p>

### 출력

<p>각 테스트 케이스의 정답을 각 줄에 출력한다.</p>

### 제한

<ul>
	<li>$ 1 \le T \le 20$</li>
	<li>$1 \le N_x, N_y, N_z \le 400000$</li>
	<li>$S_x, S_y, S_z$ 는 &#39;<code>R</code>&#39;, &#39;<code>G</code>&#39;, &#39;<code>B</code>&#39; 로만 구성되어있다.</li>
</ul>