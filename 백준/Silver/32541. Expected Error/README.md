# [Silver V] Expected Error - 32541

[문제 링크](https://www.acmicpc.net/problem/32541)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 94, 정답: 42, 맞힌 사람: 34, 정답 비율: 44.156%

### 분류

수학, 확률론

### 문제 설명

<p>You are typing your password at a <code>sudo</code> prompt, but suddenly, one of your fingers slipped onto a wrong key. Because the terminal hides the characters that you type, you are uncertain whether you have typed an extra character. To finish typing your password, you consider three possible strategies.</p>

<ol>
	<li><em>Continue</em> to type the rest of your password.</li>
	<li>Press <em>backspace</em> to delete the last character and type the rest of your password.</li>
	<li><em>Restart</em> typing your password from scratch.</li>
</ol>

<p>To determine the optimal strategy, make use of the following typing speed assumptions.</p>

<ul>
	<li>Typing any character of your password takes $0.1$ seconds.</li>
	<li>Pressing backspace or submitting your password also takes $0.1$ seconds.</li>
	<li>To restart typing your password, you delete all characters, which takes $0.3$ seconds.</li>
	<li>If you submit the wrong password, it takes an additional $0.3$ seconds to realize and start typing your password at a new, empty prompt.</li>
</ul>

<p>You are given the number of characters in your password $n$, the number of correctly typed characters $k$ before your finger slipped, and a probability of $p\%$ indicating the likelihood that you pressed a wrong key and ended up with $k+1$ characters. Assuming you make no further errors, determine which strategy yields the lowest expected time to finish typing your password.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $n$, $k$, and $p$ ($1\leq n\leq1000$, $1\leq k\leq n$, $0\leq p\leq100$), the number of characters in your password, the number of characters you correctly typed before your finger slipped, and the probability percentage that you pressed a wrong key.</li>
</ul>

### 출력

<p>Output one of the strings "<code>continue</code>", "<code>backspace</code>", or "<code>restart</code>" indicating the optimal strategy. It is guaranteed that the expected time of the optimal strategy is at least one millisecond shorter than the other strategies.</p>