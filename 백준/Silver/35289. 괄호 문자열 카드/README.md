# [Silver II] 괄호 문자열 카드 - 35289

[문제 링크](https://www.acmicpc.net/problem/35289)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 272, 정답: 104, 맞힌 사람: 99, 정답 비율: 41.949%

### 분류

구현, 그리디 알고리즘, 많은 조건 분기

### 문제 설명

<p>괄호 문자열이란 <span style="color:#e74c3c;"><code>(</code></span>와 <span style="color:#e74c3c;"><code>)</code></span>로 구성된 문자열을 의미한다. 올바른 괄호 문자열은 아래의 조건을 만족한다.</p>

<ul>
<li>빈 문자열은 올바른 괄호 문자열이다.</li>
<li>문자열 A가 올바른 괄호 문자열이라면, 문자열 (A) 또한 올바른 괄호 문자열이다.</li>
<li>문자열 A, B가 올바른 괄호 문자열이라면, 문자열 AB 또한 올바른 괄호 문자열이다.</li>
</ul>

<p>당신은 길이가 $1$ 또는 $2$인 괄호 문자열이 적혀있는 카드들로 구성된 '괄호 문자열 카드 묶음'을 가지고 있다. 각 카드에는 여섯 종류의 괄호 문자열 <span style="color:#e74c3c;"><code>(</code></span>, <span style="color:#e74c3c;"><code>((</code></span>, <span style="color:#e74c3c;"><code>)</code></span>, <span style="color:#e74c3c;"><code>))</code></span>, <span style="color:#e74c3c;"><code>()</code></span>, <span style="color:#e74c3c;"><code>)(</code></span>중 하나가 적혀 있다. 카드는 뒤집거나 회전할 수 없으며, 카드에 적힌 문자열을 분리하여 사용할 수 없다. 즉, 적힌 문자열 그대로만 사용해야 한다.</p>

<p>각 종류의 카드가 몇 장씩 있는지 주어졌을 때, 카드를 임의의 순서로 나열하여 만들 수 있는 올바른 괄호 문자열의 최대 길이를 구하여라. 단, 모든 카드를 반드시 사용할 필요는 없다.</p>

### 입력

<p>첫 번째 줄에 괄호 문자열 카드 묶음에 들어 있는 <span style="color:#e74c3c;"><code>(</code></span>, <span style="color:#e74c3c;"><code>((</code></span>, <span style="color:#e74c3c;"><code>)</code></span>, <span style="color:#e74c3c;"><code>))</code></span>, <span style="color:#e74c3c;"><code>()</code></span>, <span style="color:#e74c3c;"><code>)(</code></span> 카드의 개수를 의미하는 $6$개의 정수 $A$, $B$, $C$, $D$, $E$, $F$가 공백으로 구분되어 주어진다. ($0 \leq A, B, C, D, E, F \leq 1\,000\,000$; $A+B+C+D+E+F \geq 1$)</p>

### 출력

<p>첫 번째 줄에 주어진 카드로 만들 수 있는 올바른 괄호 문자열의 최대 길이를 출력한다.</p>