# [Silver II] dongshop - 34706

[문제 링크](https://www.acmicpc.net/problem/34706)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 248, 정답: 147, 맞힌 사람: 131, 정답 비율: 63.902%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>$N \times N$ 격자판이 있다. 격자판의 $r$행 $c$열 좌표는 $(r, c)$이며, 가장 왼쪽 위 칸은 $(1, 1)$, 가장 오른쪽 아래 칸은 $(N, N)$이다.</p>

<p>격자판에 비숍을 두면 비숍이 위치하는 자리와, 그 자리에서 한 번의 이동으로 갈 수 있는 모든 곳이 색칠된다. 예를 들어, $4 \times 4$ 격자판의 $(2, 2)$ 위치에 비숍을 두면 아래와 같이 색칠된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34706.%E2%80%85dongshop/834c94a0.png" data-original-src="https://boja.mercury.kr/assets/problem/34706-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 200px; width: 200px;"></p>

<p>동건이가 $N$개의 비숍을 겹치지 않게 두어 $N \times N$ 격자판을 모두 색칠할 수 있게 도와주자.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수 $T$가 주어진다. ($1 \le T \le 100$)</p>

<p>각 테스트 케이스마다 격자판의 크기를 나타내는 $N$이 주어진다. ($1 \le N \le 1\,000$)</p>

### 출력

<p>각 테스트 케이스마다 $N$줄에 걸쳐 배치한 비숍의 위치를 순서에 상관없이 출력한다.</p>

<p>각 줄에는 배치한 비숍의 행과 열을 나타내는 두 정수 $r$과 $c$를 공백으로 구분하여 출력한다. ($1 \le r, c \le N$)</p>

<p>답이 항상 존재함을 증명할 수 있다.</p>

### 힌트

<p>입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간 초과를 받을 수 있으므로, 언어별로 다음 방법을 사용하는 것이 권장된다.</p>

<ul>
<li><strong>C++</strong>: <code>cin/cout</code>을 사용하고자 한다면, <code>main</code> 함수의 첫 줄에 아래 두 줄을 입력하고, 출력할 때 <code>endl</code> 대신 개행 문자(<code>\n</code>)를 사용해야 한다. 단, 이렇게 하면 더 이상 <code>scanf/printf/puts/getchar/putchar</code> 등 C의 입출력 방식을 사용하면 안 된다.

<ul>
<li><code>cin.tie(nullptr);</code></li>
<li><code>sync_with_stdio(false);</code></li>
</ul>
</li>
<li><strong>Python</strong>: <code>input</code> 대신 아래 코드를 사용한다.
<ul>
<li><code>sys.stdin.readline.rstrip()</code></li>
</ul>
</li>
<li><strong>Java</strong>, <strong>Kotlin</strong>: <code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용한다. <code>BufferedWriter.flush</code>는 프로그램 종료 전에 한 번만 하면 된다.</li>
</ul>