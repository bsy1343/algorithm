# [Silver I] 하이퍼 자석 체인 - 35459

[문제 링크](https://www.acmicpc.net/problem/35459)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 70, 정답: 56, 맞힌 사람: 43, 정답 비율: 76.786%

### 분류

구현, 홀짝성

### 문제 설명

<p>관빈이는 예전에 만든 <a href="/problem/17201">자석 체인</a>에 이어 $m\times n\times o\times p\times q\times r\times s\times t\times u\times v\times w$ 크기의 $11$차원 격자 모양 자석의 각 칸이 (+)극 또는 (-)극으로 이루어진 하이퍼 자석 체인을 만들었다. 관빈이는 하이퍼 자석 체인의 각 칸에 (+)극이면 $1$, (-)극이면 $0$을 써놓았다.</p>

<p>하이퍼 자석 체인의 모든 칸의 극이 $\begin{bmatrix}\pm 1\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\end{bmatrix}$, $\begin{bmatrix}0\\\pm 1\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\end{bmatrix}$, $\begin{bmatrix}0\\ 0\\\pm 1\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\end{bmatrix}$, $\begin{bmatrix}0\\ 0\\ 0\\\pm 1\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\end{bmatrix}$, $\begin{bmatrix}0\\ 0\\ 0\\ 0\\\pm 1\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\end{bmatrix}$, $\begin{bmatrix}0\\ 0\\ 0\\ 0\\ 0\\\pm 1\\ 0\\ 0\\ 0\\ 0\\ 0\end{bmatrix}$, $\begin{bmatrix}0\\ 0\\ 0\\ 0\\ 0\\ 0\\\pm 1\\ 0\\ 0\\ 0\\ 0\end{bmatrix}$, $\begin{bmatrix}0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\\pm 1\\ 0\\ 0\\ 0\end{bmatrix}$, $\begin{bmatrix}0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\\pm 1\\ 0\\ 0\end{bmatrix}$, $\begin{bmatrix}0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\\pm 1\\ 0\end{bmatrix}$, $\begin{bmatrix}0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\ 0\\\pm 1\end{bmatrix}$ 의 $22$방향으로 인접한 존재하는 모든 칸의 극과 다른 극이면 하이퍼 자석 체인이 연결되어 있다고 한다.</p>

<p>관빈이는 만든 하이퍼 자석 체인이 모두 연결되어 있는지 궁금해졌다. 하이퍼 자석 체인이 주어질 때 모두 연결되어 있는지 출력해 보자.</p>

### 입력

<p>첫 번째 줄에 양의 정수 $m$, $n$, $o$, $p$, $q$, $r$, $s$, $t$, $u$, $v$, $w$가 공백으로 구분되어 주어진다. $(1\le mnopqrstuvw\le 10^5)$</p>

<p>두 번째 줄부터 하이퍼 자석 체인의 극을 나타내는 정수 $A_{11111111111}$, $A_{11111111112}$, $\cdots$, $A_{mnopqrstuvw}$가 아래와 같이 주어진다. $(0\le A_{\alpha\beta\gamma\delta\epsilon\zeta\eta\theta\iota\kappa\lambda}\le 1$; $1 \le \alpha \le m$; $1 \le \beta \le n$; $1 \le \gamma \le o$; $1 \le \delta \le p$; $1 \le \epsilon \le q$; $1 \le \zeta \le r$; $1 \le \eta \le s$; $1 \le \theta \le t$; $1 \le \iota \le u$; $1 \le \kappa \le v$; $1 \le \lambda \le w)$</p>

<ul>
<li>두 번째 줄에는 $A_{11111111111},A_{11111111112},\cdots ,A_{1111111111w}$의 정수 $w$개가 공백으로 구분되어 주어진다.</li>
<li>이러한 줄이 $v$번 반복되어 $A_{11111111111},A_{11111111112},\cdots ,A_{111111111vw}$의 정수 $vw$개가 주어진다.</li>
<li>이러한 $v$개의 줄이 $u$번 반복되어 $A_{11111111111},A_{11111111112},\cdots ,A_{11111111uvw}$의 정수 $uvw$개가 주어진다.</li>
<li>이러한 $uv$개의 줄이 $t$번 반복되어 $A_{11111111111},A_{11111111112},\cdots ,A_{1111111tuvw}$의 정수 $tuvw$개가 주어진다.</li>
<li>이러한 $tuv$개의 줄이 $s$번 반복되어 $A_{11111111111},A_{11111111112},\cdots ,A_{111111stuvw}$의 정수 $stuvw$개가 주어진다.</li>
<li>이러한 $stuv$개의 줄이 $r$번 반복되어 $A_{11111111111},A_{11111111112},\cdots ,A_{11111rstuvw}$의 정수 $rstuvw$개가 주어진다.</li>
<li>이러한 $rstuv$개의 줄이 $q$번 반복되어 $A_{11111111111},A_{11111111112},\cdots ,A_{1111qrstuvw}$의 정수 $qrstuvw$개가 주어진다.</li>
<li>이러한 $qrstuv$개의 줄이 $p$번 반복되어 $A_{11111111111},A_{11111111112},\cdots ,A_{111pqrstuvw}$의 정수 $pqrstuvw$개가 주어진다.</li>
<li>이러한 $pqrstuv$개의 줄이 $o$번 반복되어 $A_{11111111111},A_{11111111112},\cdots ,A_{11opqrstuvw}$의 정수 $opqrstuvw$개가 주어진다.</li>
<li>이러한 $opqrstuv$개의 줄이 $n$번 반복되어 $A_{11111111111},A_{11111111112},\cdots ,A_{1nopqrstuvw}$의 정수 $nopqrstuvw$개가 주어진다.</li>
<li>이러한 $nopqrstuv$개의 줄이 $m$번 반복되어 $A_{11111111111},A_{11111111112},\cdots ,A_{mnopqrstuvw}$의 정수 $mnopqrstuvw$개가 주어진다.</li>
</ul>

### 출력

<p>첫 번째 줄에 하이퍼 자석 체인이 모두 연결되어 있다면 <span style="color:#e74c3c;"><code>Yes</code></span>, 그렇지 않다면 <span style="color:#e74c3c;"><code>No</code></span>를 출력한다.</p>