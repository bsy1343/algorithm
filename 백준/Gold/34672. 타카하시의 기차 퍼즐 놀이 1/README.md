# [Gold V] 타카하시의 기차 퍼즐 놀이 1 - 34672

[문제 링크](https://www.acmicpc.net/problem/34672)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 90, 정답: 44, 맞힌 사람: 43, 정답 비율: 52.439%

### 분류

비트마스킹, 애드 혹

### 문제 설명

<p>타카하시는 컴퓨터로 기차 퍼즐 게임을 하고 있었습니다. 반복된 퍼즐 게임에 질렸던 타카하시는 여러분들에게 다음과 같은 질문을 하였습니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34672.%E2%80%85%ED%83%80%EC%B9%B4%ED%95%98%EC%8B%9C%EC%9D%98%E2%80%85%EA%B8%B0%EC%B0%A8%E2%80%85%ED%8D%BC%EC%A6%90%E2%80%85%EB%86%80%EC%9D%B4%E2%80%851/c1b285fc.png" data-original-src="https://boja.mercury.kr/assets/problem/34672-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 281px; height: 276px;"></p>

<p style="text-align: center;">[그림 1] 왼쪽 위부터 시계 방향으로 $1$번, $2$번, $4$번, $3$번 블록</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34672.%E2%80%85%ED%83%80%EC%B9%B4%ED%95%98%EC%8B%9C%EC%9D%98%E2%80%85%EA%B8%B0%EC%B0%A8%E2%80%85%ED%8D%BC%EC%A6%90%E2%80%85%EB%86%80%EC%9D%B4%E2%80%851/b3df49fe.png" data-original-src="https://boja.mercury.kr/assets/problem/34672-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 287px; height: 270px;"></p>

<p style="text-align: center;">[그림 2] 덮이지 않는 공간이 하나 이상 있는 경우</p>

<blockquote>
<p>세로 길이가 $r$이고 가로 길이가 $c$인 직사각형 모양의 퍼즐이 있어. 퍼즐에는 $1$번부터 $4$번까지 회전할 수 없는 $4$가지 블록이 있고, 각 블록은 제한 없이 쓸 수 있어. 블록들을 퍼즐 영역 내부에 빈틈없이 채우려고 해. 블록들을 모두 채운 후에, $r$행 $c$열에 있는 블록에 아래와 같은 규칙으로 문자를 하나 쓸 거야.</p>

<ul>
<li>$b$번 블록이 있으면 문자 $b$를 적는다.</li>
</ul>

<p>$r$행 $1$열에 있는 문자부터, $r$행 $c$열까지 쓰여 있는 문자까지 차례대로 이어서 만든 문자열을 $S_{r}$이라고 할 거야. 나는 $S_{1}$부터 $S_{r}$까지 차례대로 이어 붙여서 문자열 $R$을 만들려고 해. 채울 수 있는 방법이 여러 가지라면 문자열 $R$도 여러 개 나올 수 있겠지? 나는 이 중, 사전순으로 $k$번째인 문자열을 알고 싶어.</p>
</blockquote>

<p>타카하시의 질문을 해결해 주세요.</p>

### 입력

<p>첫 번째 줄에 $Q$가 주어집니다.</p>

<p>두 번째 줄부터 $Q$개의 줄에 걸쳐 $r$, $c$, $k$가 공백으로 구분되어 주어집니다.</p>

### 출력

<p>$Q$개의 줄에 걸쳐 문제의 답을 아래와 같이 한 줄에 하나씩 출력해 주세요.</p>

<ul>
<li>세로 길이가 $r$이고 가로 길이가 $c$인 직사각형 모양의 퍼즐을 채울 수 있는 방법이 없거나 답이 되는 문자열 $R$이 없다면, <span style="color:#e74c3c;"><code>-1</code></span>을 출력해 주세요.</li>
<li>그렇지 않으면 사전순으로 $k$번째인 문자열 $R$을 만들기 위해 사용했던 $S_{1}, .. , S_{r}$을 $r$개의 줄에 걸쳐서 다음 조건에 맞춰 출력해 주세요.
<ul>
<li>$i$번째 줄에 $S_{i}$를 출력합니다.</li>
</ul>
</li>
</ul>

<p>각 질문에 대한 답은 <strong>개행으로 구분</strong>합니다.</p>

### 제한

<ul>
<li>$1 \leq Q \leq 10^{6}$</li>
<li>$1 \leq r \leq 2$</li>
<li>$1 \leq c \leq 10^{6}$</li>
<li>$1 \leq k \leq 10^{18}$</li>
<li>입력으로 주어지는 모든 수는 정수입니다.</li>
<li>테스트 케이스에 있는 모든 $c$의 합은 $10^{6}$을 넘지 않습니다.</li>
</ul>