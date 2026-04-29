# [Platinum IV] Bracket Sequence Endgame - 34833

[문제 링크](https://www.acmicpc.net/problem/34833)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 43, 맞힌 사람: 41, 정답 비율: 74.545%

### 분류

누적 합, 다이나믹 프로그래밍, 수학, 조합론

### 문제 설명

<p>각 문자가<span style="color:#e74c3c;"><code>(</code></span>, <span style="color:#e74c3c;"><code>)</code></span>로만 이루어진 문자열을 <strong>괄호 문자열</strong>이라고 한다. 이때, <strong>올바른 괄호 문자열</strong>의 정의는 다음과 같다.</p>

<ul>
<li><span style="color:#e74c3c;"><code>()</code></span>은 올바른 괄호 문자열이다.</li>
<li>$A$가 올바른 괄호 문자열일 때, <span style="color:#e74c3c;"><code>(</code></span>$A$<span style="color:#e74c3c;"><code>)</code></span>는 올바른 괄호 문자열이다.</li>
<li>$A$, $B$가 각각 올바른 괄호 문자열일 때, $AB$는 올바른 괄호 문자열이다.</li>
</ul>

<p>예를 들어 <span style="color:#e74c3c;"><code>()()</code></span>와 <span style="color:#e74c3c;"><code>(())</code></span>는 올바른 괄호 문자열이고, <span style="color:#e74c3c;"><code>)(</code></span>와 <span style="color:#e74c3c;"><code>(()</code></span>는 올바른 괄호 문자열이 아니다.</p>

<p><strong>괄호 문자열</strong> $S$가 주어진다. 당신은 이 괄호 문자열에 다음 연산을 원하는 만큼 시행할 수 있다.</p>

<ol>
<li>현재 문자열을 $T$라고 하자. 당신은 <strong>올바른 괄호 문자열</strong>인 $T[l,r]$을 선택한다. 이는 $T$의 $l$번째부터 $r$번째의 문자들로 이루어진 부분 문자열을 의미한다. ($1 \leq l \leq r \leq N$)</li>
<li>$l \leq i \leq r$인 모든 $i$에 대해 $T_i =$<span style="color:#e74c3c;"><code>(</code></span>이라면 <span style="color:#e74c3c;"><code>)</code></span>로 바꾸고, $T_i =$<span style="color:#e74c3c;"><code>)</code></span>이라면 <span style="color:#e74c3c;"><code>(</code></span>로 바꾼다.</li>
</ol>

<p>당신은 시작 괄호 문자열 $S$로부터 연산을 원하는 만큼 진행하여 만들 수 있는 서로 다른 괄호 문자열의 개수가 궁금해졌다. 두 괄호 문자열이 다른 과정을 통해 같은 괄호 문자열이 되었을 때도 하나의 괄호 문자열로 인정됨에 주의하라.</p>

### 입력

<p>첫째 줄에 괄호 문자열의 길이 $N$이 주어진다. ($1 \leq N \leq 5\,000$)</p>

<p>둘째 줄에 괄호 문자열 $S$가 주어진다.</p>

### 출력

<p>연산을 시행하여 만들 수 있는 서로 다른 괄호 문자열의 개수를 $998\,244\,353$으로 나눈 나머지를 출력하라.</p>