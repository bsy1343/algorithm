# [Gold I] 와일드카드 괄호 문자열 - 28709

[문제 링크](https://www.acmicpc.net/problem/28709)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1192, 정답: 273, 맞힌 사람: 236, 정답 비율: 26.020%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>&lsquo;<span style="color:#e74c3c;"><code>(</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>)</code></span>&rsquo;로 이루어진 문자열이 올바른 괄호 문자열이라는 것은 다음을 의미합니다.</p>

<ul>
	<li>$S$가 빈 문자열이면, $S$는 올바른 괄호 문자열입니다.</li>
	<li>$S$가 올바른 괄호 문자열이면, $S$의 앞뒤에 각각 &lsquo;<span style="color:#e74c3c;"><code>(</code></span>&rsquo;와 &lsquo;<span style="color:#e74c3c;"><code>)</code></span>&rsquo;를 붙여 만든 문자열 &ldquo;<span style="color:#e74c3c;"><code>(</code></span>$S$<span style="color:#e74c3c;"><code>)</code></span>&rdquo; 는 올바른 괄호 문자열입니다.</li>
	<li>$S$와 $T$가 올바른 괄호 문자열이면, $S$와 $T$를 붙여 만든 문자열 &ldquo;$ST$&rdquo;는 올바른 괄호 문자열입니다.</li>
	<li>위 세 규칙을 통해 만들 수 없는 문자열은 올바른 괄호 문자열이 아닙니다.</li>
</ul>

<p>예를 들어, &ldquo;<span style="color:#e74c3c;"><code>(())()</code></span>&rdquo;, &ldquo;<span style="color:#e74c3c;"><code>()()</code></span>&rdquo;은 올바른 괄호 문자열이고 &ldquo;<span style="color:#e74c3c;"><code>)(</code></span>&rdquo;, &ldquo;<span style="color:#e74c3c;"><code>())(</code></span>&rdquo;는 올바른 괄호문자열이 아닙니다.</p>

<p>문자열 $S$가 주어집니다. $S$는 &lsquo;<span style="color:#e74c3c;"><code>(</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>)</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>?</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>*</code></span>&rsquo;로 이루어진 문자열입니다. &lsquo;<span style="color:#e74c3c;"><code>?</code></span>&rsquo; 문자를 &lsquo;<span style="color:#e74c3c;"><code>(</code></span>&rsquo;이나 &lsquo;<span style="color:#e74c3c;"><code>)</code></span>&rsquo;로, &lsquo;<span style="color:#e74c3c;"><code>*</code></span>&rsquo; 문자를 &lsquo;<span style="color:#e74c3c;"><code>(</code></span>&rsquo;와 &lsquo;<span style="color:#e74c3c;"><code>)</code></span>&rsquo;로 이루어진 길이가 $0$ 이상인 원하는 문자열로 대체하여 $S$를 올바른 괄호 문자열로 만들 수 있나요?</p>

### 입력

<p>첫 줄에 테스트케이스의 수 $T$가 주어집니다. $(1 \le T \le 10\,000)$</p>

<p>각 테스트케이스의 첫 줄에는 &lsquo;<span style="color:#e74c3c;"><code>(</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>)</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>?</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>*</code></span>&rsquo;로 이루어진 길이가 $1$ 이상 $500\,000$ 이하인 문자열 $S$가 주어집니다.</p>

<p>입력에서 주어진 문자열 $S$의 길이 합은 $500\,000$을 넘지 않습니다.</p>

### 출력

<p>각 테스트케이스마다 한 줄에 하나씩, &lsquo;<span style="color:#e74c3c;"><code>?</code></span>&rsquo; 문자를 &lsquo;<span style="color:#e74c3c;"><code>(</code></span>&rsquo;이나 &lsquo;<span style="color:#e74c3c;"><code>)</code></span>&rsquo;로, &lsquo;<span style="color:#e74c3c;"><code>*</code></span>&rsquo; 문자를 &lsquo;<span style="color:#e74c3c;"><code>(</code></span>&rsquo;, &lsquo;<span style="color:#e74c3c;"><code>)</code></span>&rsquo;로 이루어진 길이가 $0$ 이상인 원하는 문자열로 대체하여 $S$를 올바른 괄호 문자열로 만들 수 있다면 &ldquo;<span style="color:#e74c3c;"><code>YES</code></span>&rdquo;, 불가능하면 &ldquo;<span style="color:#e74c3c;"><code>NO</code></span>&rdquo;를 출력하세요.</p>