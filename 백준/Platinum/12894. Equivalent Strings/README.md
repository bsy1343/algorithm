# [Platinum III] Equivalent Strings - 12894

[문제 링크](https://www.acmicpc.net/problem/12894)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 211, 정답: 75, 맞힌 사람: 55, 정답 비율: 42.969%

### 분류

분할 정복

### 문제 설명

<p>같은 길이를 가진 두 개의 문자열 a, b에 대해 아래 둘 중에 하나에 해당하면 우리는 이를 equivalent하다고 부른다.</p>

<ol>
	<li>두 문자열이 완전히 같다.</li>
	<li>a를 같은 길이의 a1, a2로 나누고, b를 같은 길이의 b1, b2로 나누었을 때 다음 둘 중 하나를 만족한다.
	<ol>
		<li>a1은 b1과 equivalent하고, a2는 b2와 equivalent하다.</li>
		<li>a1은 b2와 equivalent하고, a2는 b1과 equivalent하다.</li>
	</ol>
	</li>
</ol>

<p>&nbsp;두 문자열 a, b가 주어졌을 때 equivalent한지 판별해보자.</p>

### 입력

<p>첫 줄에 문자열 a, 두 번째 줄에 문자열 b가 주어진다. 각 문자열의 길이는 1보다 크거나 같고 200,000보다 작거나 같다. 모든 문자는 26개의 알파벳 소문자로만 이루어 진다. 주어지는 문자열 a, b의 길이는 동일하다.</p>

### 출력

<p>a, b가 equivalent하다면 &ldquo;YES&rdquo;, 아니라면 &ldquo;NO&rdquo;를 출력한다.</p>

### 힌트

<p>Sample1. a: &ldquo;aaba&rdquo; =&gt; a1: &ldquo;aa&rdquo;, a2: &ldquo;ba&rdquo; / b: &ldquo;abaa&rdquo; =&gt; b1: &ldquo;ab&rdquo;, b2: &ldquo;aa&rdquo;</p>

<p>&ldquo;ba&rdquo;와 &ldquo;ab&rdquo;에 대해 a2: &ldquo;ba&rdquo; =&gt; &ldquo;b&rdquo;, &ldquo;a&rdquo; / b1: &ldquo;ab&rdquo; =&gt; &ldquo;a&rdquo;, &ldquo;b&rdquo; 이므로 2-b에 의해 a2와 b1은 equivalent하다. 또 다시 2-b에 의해 a1이 b2와 같고, a2가 b1과 같으므로, a와 b는 equivalent하다.</p>

<p>Sample2. a: &ldquo;aabb&rdquo; =&gt; a1: &ldquo;aa&rdquo;, a2: &ldquo;bb&rdquo;</p>

<p>a1과 a2는 모두 같은 글자로만 이루어져 있으므로 a와 equivalent한 문자열은 &ldquo;aabb&rdquo;, &ldquo;bbaa&rdquo;밖에 존재하지 않는다.</p>