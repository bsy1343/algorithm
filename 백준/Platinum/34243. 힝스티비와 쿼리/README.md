# [Platinum IV] 힝스티비와 쿼리 - 34243

[문제 링크](https://www.acmicpc.net/problem/34243)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 170, 정답: 53, 맞힌 사람: 39, 정답 비율: 30.000%

### 분류

누적 합, 많은 조건 분기, 문자열, 세그먼트 트리, 자료 구조

### 문제 설명

<p>덧셈, 뺄셈, <em><strong style="background-color:#000;background-image:linear-gradient(163deg,#000 0%,#999 50%,#000 100%);background-size:100%;-webkit-background-clip:text;-moz-background-clip:text;-webkit-text-fill-color:transparent;-moz-text-fill-color:transparent;">XOR</strong></em>을 공부하던 나도리는 각 연산자를 나열하다가 표정 문자열이라는 것을 만들었다. 표정 문자열은 <code>+</code>, <code>-</code>, <code>^</code> 으로만 이루어진 문자열이다.<code>+^+</code>은 뭔가 신나 보이는 표정이고, <code>-^-</code>은 뭔가 힝스러운 표정이다.</p>

<p>표정 문자열의 흥미도는 문자열에 존재하는 아래 부분 문자열의 개수에 따라 정해진다.</p>

<ul>
	<li><code>+^+</code>: $1$점</li>
	<li><code>-^-</code>: $-1$점</li>
</ul>

<p>표정 문자열을 만든 후, 월간 향유회 멤버들은 표정 문자열을 이용하여 매일 아침에 운세를 보기 시작했다.</p>

<p>$1 \leq \ell \leq r \leq \left\vert S \right\vert$을 만족하는 두 정수 $\ell$, $r$을 고르면, 나도리는 표정 문자열 $S[\ell:r]$의 흥미도를 알려 준다. $S[\ell:r]$은 $S$의 $\ell$번째 문자부터 $r$번째 문자까지로 구성된 부분 문자열이다.</p>

<p>힝스한 표정이 너무 많으면 아침부터 기분도 힝스해지기 때문에 나도리는 기특한 생각을 하나 해 냈다.</p>

<blockquote>
<p>$S[\ell:r]$에서 최대 하나의 문자를 지운 상태에서 흥미도의 최대를 알려 주자!</p>
</blockquote>

<p>$Q$개의 운세 요청이 들어왔을 때 나도리가 적절한 운세를 볼 수 있게 해 주자.</p>

### 입력

<p>첫째 줄에 표정 문자열 $S$가 주어진다. ($1 \leq \left\vert S \right\vert \leq 300\,000$)</p>

<p>둘째 줄에 쿼리의 개수 $Q$가 주어진다. ($1 \leq Q \leq 300\,000$)</p>

<p>셋째 줄부터 $Q$줄에 걸쳐 구간을 나타내는 두 정수 $\ell$, $r$이 공백으로 구분되어 주어진다. ($1 \leq \ell \leq r \leq \left\vert S \right\vert$)</p>

### 출력

<p>쿼리마다 $S[\ell:r]$에서 최대 하나의 문자를 지운 상태에서 흥미도의 최댓값을 한 줄에 출력한다.</p>