# [Platinum III] yo, i herd u liek ternary operators, so.. - 25321

[문제 링크](https://www.acmicpc.net/problem/25321)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 372, 정답: 143, 맞힌 사람: 108, 정답 비율: 40.000%

### 분류

수학, 자료 구조, 조합론, 스택

### 문제 설명

<p style="margin-bottom: 15px;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25321.%E2%80%85yo%2C%E2%80%85i%E2%80%85herd%E2%80%85u%E2%80%85liek%E2%80%85ternary%E2%80%85operators%2C%E2%80%85so../974a2462.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25321.%E2%80%85yo%2C%E2%80%85i%E2%80%85herd%E2%80%85u%E2%80%85liek%E2%80%85ternary%E2%80%85operators%2C%E2%80%85so../974a2462.png" data-original-src="https://upload.acmicpc.net/a2068ae8-c874-48c3-a2eb-4e104b3c38d5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 400px;" /></p>

<p>진수는 삼항 연산자를 아주 좋아한다. 삼항 연산자는</p>

<p style="text-align:center;"><code>(condition) ? (value_if_true) : (value_if_false)</code></p>

<p>와 같이 생긴 연산자로, <code>condition</code>이 참일 경우 <code>value_if_true</code>로 평가되고 아닐 경우 <code>value_if_false</code>로 평가된다.</p>

<p>진수가 삼항 연산자에서 재미있다고 느끼는 점은 삼항 연산자 안에 또 삼항 연산자를 쓸 수 있다는 것이다. 다시 말해 <code>condition</code>과 <code>value</code>에도 삼항 연산자가 들어갈 수 있다.</p>

<p>진수는 삼항 연산자를 너무 좋아한 나머지, 연산자가 삼항 연산자밖에 없는 프로그래밍 언어를 개발하기로 했다. 진수가 개발하는 언어의 특징은, 만약 주어진 식이 여러 가지로 해석될 수 있다면 실행할 때마다 다른 해석을 사용해서 다른 결과를 낼 수도 있다는 것이다. 예를 들어 <code>a?b:c?d:e</code> 는</p>

<p style="text-align:center;"><code>((a)?(b):(c)) ? (d) : (e)</code> &emsp;&emsp;또는 &emsp;&emsp;<code>(a) ? (b) : ((c)?(d):(e))</code></p>

<p>로 해석될 수 있다.</p>

<p>진수는 문득 본인이 작성한 식이 몇 가지 방법으로 해석될 수 있는지 궁금해졌다. 구체적으로 정의하자면,</p>

<p style="text-align:center;"><code>&lt;expr&gt; ::= (&lt;expr&gt;)?(&lt;expr&gt;):(&lt;expr&gt;) | &lt;variable&gt;</code><br />
<code>&lt;variable&gt; ::= a | b | c | ... | z</code></p>

<p>위의 BNF(Backus&ndash;Naur form)에서 <code>&lt;expr&gt;</code>로 나타낼 수 있는 문자열 중에서 괄호를 제거하고 비교하였을 때 진수가 작성한 식과 같은 문자열이 되는 경우의 수가 궁금한 것이다.</p>

<p>괄호가 없는 삼항 연산자로만 구성된 식이 주어지면 가능한 해석의 수를 출력하는 프로그램을 작성하자. 해석될 수 있는 방법의 수가 너무 클 수 있으므로, 이 수를 소수인 $1\, 000\, 000\, 007$$(=10^9+7)$로 나눈 나머지를 계산한다.</p>

### 입력

<p>첫 번째 줄에 알파벳 소문자와 <span style="color:#e74c3c;"><code>?</code></span>와 <span style="color:#e74c3c;"><code>:</code></span>만으로 이루어진 문자열 $S$가 주어진다. $(5\leq\left\vert S \right\vert\leq 300\, 000)$</p>

<p>주어진 문자열은 적어도 하나 이상의 유효한 식으로 해석될 수 있다.</p>

### 출력

<p>문제에서 요구하는 수를 $1\, 000\, 000\, 007$로 나눈 나머지를 출력한다.</p>