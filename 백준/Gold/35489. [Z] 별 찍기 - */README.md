# [Gold I] [Z] 별 찍기 - * - 35489

[문제 링크](https://www.acmicpc.net/problem/35489)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

구현, 문자열, 재귀

### 문제 설명

<p>백준 온라인 저지의 별 찍기 시리즈를 보던 히볘는 문득 별 찍기 문제들은 그저 주어진 하나의 패턴만 찍는 간단한 문제라는 것을 깨달았다! 이러한 문제가 너무 쉽다고 생각한 히볘는 출력해야 하는 패턴을 입력으로 받는 문제를 만들기로 했다.</p>

<p>이 문제에서 입력으로 주어지는 패턴은 다음과 같은 특징을 가진다. 위에서부터 $r$번째 행의 왼쪽에서부터 $c$번째 열에 있는 칸의 중심을 $(r, c)$라고 하자.</p>

<ul>
<li>$N\times N$ 크기의 격자판 위에 그려진다.</li>
<li>$(1,1)$에서 시작해서 $(1,N)$에서 끝나며 중간에 꺾일 수 있는 선이다.</li>
<li>선의 방향은 항상 가로축 또는 세로축과 평행하다.</li>
<li>선의 방향은 칸의 중심에서만 바뀔 수 있다.</li>
<li>모든 칸을 정확히 $1$번씩 지난다.</li>
</ul>

<p>예를 들어, 다음 패턴들은 이 문제에서 주어질 수 있는 패턴들이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35489.%E2%80%85%5BZ%5D%E2%80%85%EB%B3%84%E2%80%85%EC%B0%8D%EA%B8%B0%E2%80%85-%E2%80%85*/3b5e2308.png" data-original-src="https://boja.mercury.kr/assets/problem/35489-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 624px; max-width: 100%"></p>

<p>반면, 다음 패턴들은 이 문제에서 주어질 수 없는 패턴들이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35489.%E2%80%85%5BZ%5D%E2%80%85%EB%B3%84%E2%80%85%EC%B0%8D%EA%B8%B0%E2%80%85-%E2%80%85*/b2f48fc8.png" data-original-src="https://boja.mercury.kr/assets/problem/35489-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 624px; max-width: 100%"></p>

<p>히볘는 별 찍기 문제 중에서도 재귀를 사용하는 문제를 좋아하기 때문에, 이 문제 역시 재귀적으로 정의되는 패턴을 출력시키기로 했다.</p>

<p>따라서, 이 문제에서 출력해야 하는 패턴은 주어진 패턴을 토대로 $M$번의 재귀를 거친 패턴이어야 한다. $M$번의 재귀를 거친 패턴은 다음과 같이 정의된다.</p>

<ul>
<li>$1$번의 재귀를 거친 패턴은 주어진 패턴과 동일하다.</li>
<li>$M$번의 재귀를 거친 패턴은 $N^M\times N^M$ 크기의 격자판 위에 그려진다.</li>
<li>$(1,1)$에서 시작해서 $(1,N^M)$에서 끝나며 중간에 꺾일 수 있는 선이다.</li>
<li>좌측 상단에서 시작해서 $N^{M-1}\times N^{M-1}$칸씩 묶어서 $N\times N$개의 구역을 만들면, 각 구역의 방문 순서는 주어진 패턴이 $N\times N$칸을 방문하는 순서와 동일하다.</li>
<li>각 구역에는 구역 내에서 처음으로 방문하는 칸인 시작점과, 구역 내에서 마지막으로 방문하는 칸인 끝점이 존재한다.</li>
<li>방문 순서상으로 인접한 두 구역에 대해, 먼저 방문하는 구역의 끝점은 다음 구역의 시작점과 인접해야 한다. 이때, 해당하는 끝점과 시작점을 선으로 이어준다.</li>
<li>각 구역의 안에서는, $M-1$번의 재귀를 거친 패턴을 적당히 회전 또는 대칭한 뒤, 해당 패턴의 시작점과 끝점을 구역의 시작점과 끝점에 맞춰서 그린다. 이 조건을 만족하도록 패턴을 그리는 방법은 항상 유일하다.</li>
</ul>

<p>예를 들어, 다음 사진은 입력으로 주어진 패턴과, 각각 $2$번, $3$번의 재귀를 거친 패턴이다. 화살표나 칸의 색깔, 선의 색깔 등은 이해를 돕기 위한 것으로 실제 패턴에는 영향을 끼치지 않는다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35489.%E2%80%85%5BZ%5D%E2%80%85%EB%B3%84%E2%80%85%EC%B0%8D%EA%B8%B0%E2%80%85-%E2%80%85*/d28191a0.png" data-original-src="https://boja.mercury.kr/assets/problem/35489-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 633px; max-width: 100%"></p>

<p>초기 패턴과 정수 $M$이 주어질 때, $M$번의 재귀를 거친 패턴을 출력해 보자.</p>

### 입력

<p>첫째 줄에는 문제에서 설명한 두 정수 $N$과 $M$이 공백으로 구분되어 주어진다. $(2\le N\le 10;$ $1\le M\le 10;$ $1\le 2N^M-1\le 2\, 000)$</p>

<p>둘째 줄부터 $2N-1$개의 줄에 걸쳐 다음과 같이 패턴이 주어진다. 각 줄에는 정확히 $2N-1$개의 글자가 있다. $P_{r,c}$를 입력의 $r+1$번째 줄의 $c$번째 글자라고 하자. $i$와 $j$를 임의의 정수라고 하자.</p>

<ul>
<li>$P_{2i-1,2j-1}$는 항상 <span style="color:#e74c3c;"><code>'*'</code></span>이다.</li>
<li>$P_{2i-1,2j}$는 패턴이 $(i,j)$와 $(i,j+1)$ 사이의 변을 지난다면 <span style="color:#e74c3c;"><code>'*'</code></span>이고, 아니라면 <span style="color:#e74c3c;"><code>' '</code></span>이다.</li>
<li>$P_{2i,2j-1}$는 패턴이 $(i,j)$와 $(i+1,j)$ 사이의 변을 지난다면 <span style="color:#e74c3c;"><code>'*'</code></span>이고, 아니라면 <span style="color:#e74c3c;"><code>' '</code></span>이다.</li>
<li>$P_{2i,2j}$는 항상 <span style="color:#e74c3c;"><code>' '</code></span>이다.</li>
</ul>

<p>작은따옴표는 글자를 표현하기 위한 것으로 실제 입력으로는 주어지지 않는다.</p>

### 출력

<p>첫째 줄부터 $2N^M-1$개의 줄에 걸쳐, 입력과 동일한 형식으로 $M$번의 재귀를 거친 패턴을 출력한다. 모든 줄에는 줄바꿈 문자를 제외하고 정확히 $2N^M-1$글자를 출력해야 하며, 모든 줄은 줄바꿈 문자로 끝나야 한다.</p>

<p>출력 형식을 <strong>정확히</strong> 지키지 않을 경우 <span style="color: #dd4124">틀렸습니다</span>를 받을 수 있음에 유의하라.</p>