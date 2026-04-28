# [Platinum I] 올바른 괄호 문자열과 쿼리 - 32296

[문제 링크](https://www.acmicpc.net/problem/32296)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 20, 맞힌 사람: 19, 정답 비율: 38.000%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리

### 문제 설명

<p>이 문제는 출제자가 어떤 온라인 저지의 어떤 문제를 보고 영감이 떠올라 내용째로 가져와 약간만 수정한 문제입니다.</p>

<p><strong>올바른 괄호 문자열</strong>은 다음과 같이 정의된 문자열의 특성입니다.</p>

<ul>
	<li>빈 문자열 $\varnothing$은 올바른 괄호 문자열입니다.</li>
	<li>$\mathbf{A}$가 올바른 괄호 문자열이라면, $\mathbf{A}$를 괄호로 둘러싼 $\mathtt{\color{#e74c3c}{(}} \mathbf{A} \mathtt{\color{#e74c3c}{)}}$ 또한 올바른 괄호 문자열입니다.</li>
	<li>$\mathbf{A}$와 $\mathbf{B}$가 올바른 괄호 문자열이라면, $\mathbf{A}$와 $\mathbf{B}$를 붙인 $\mathbf{A} \mathbf{B}$ 또한 올바른 괄호 문자열입니다.</li>
</ul>

<p>길이가 $n$이며 <code>&#39;<span style="color:#e74c3c;">(</span>&#39;</code>, <code>&#39;<span style="color:#e74c3c;">)</span>&#39;</code>, <code>&#39;<span style="color:#e74c3c;">*</span>&#39;</code>로만 이루어진 문자열 $S$가 주어집니다. 여러분은 다음과 같은 쿼리 $q$개를 해결해야 합니다.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>1</code></span> $i \,\, c$: $S$의 $i$번째 문자를 $c$로 바꿉니다. $c$는 <code>&#39;<span style="color:#e74c3c;">(</span>&#39;</code>, <code>&#39;<span style="color:#e74c3c;">)</span>&#39;</code>, <code>&#39;<span style="color:#e74c3c;">*</span>&#39;</code> 중 하나입니다. ($1 \le i \le n$)</li>
	<li><span style="color:#e74c3c;"><code>2</code></span> $l \,\, r$: $S$의 부분 문자열 $S_lS_{l+1}\cdots S_{r-1}S_r$에서 등장하는 <code>&#39;<span style="color:#e74c3c;">*</span>&#39;</code>를 각각 임의로 <code>&#39;<span style="color:#e74c3c;">(</span>&#39;</code>, <code>&#39;<span style="color:#e74c3c;">)</span>&#39;</code>, 또는 빈 문자열 $\varnothing$로 바꾼 뒤, $\varnothing$으로 바꾼 부분을 제외하고 모두 원래 순서대로 이어붙여 <strong>올바른 괄호 문자열</strong>을 만들 수 있는지 구합니다. ($1 \le l \le r \le n$)</li>
</ul>

<p>과연 여러분은 <strong>충분히 빠르게</strong> 모든 쿼리를 해결할 수 있을까요?</p>

### 입력

<p>첫 번째 줄에 문자열 $S$의 길이 $n$과 쿼리의 수 $q$가 공백으로 구분되어 주어집니다. ($1 \le n,q \le 3\cdot 10^5$)</p>

<p>두 번째 줄에 길이 $n$의 문자열 $S$가 주어집니다. $S$의 모든 문자는 <code>&#39;<span style="color:#e74c3c;">(</span>&#39;</code>, <code>&#39;<span style="color:#e74c3c;">)</span>&#39;</code>, <code>&#39;<span style="color:#e74c3c;">*</span>&#39;</code> 중 하나입니다.</p>

<p>그다음 줄부터 $q$개의 줄에 걸쳐 각 줄에 쿼리가 하나씩 주어집니다. 각 쿼리는 지문에서 주어진 종류 중 하나입니다.</p>

### 출력

<p><span style="color:#e74c3c;"><code>2</code></span>번 쿼리가 입력될 때마다, <strong>올바른 괄호 문자열</strong>을 만들 수 있다면 <code>&#39;<span style="color:#e74c3c;">Yes</span>&#39;</code>를, 아니면 <code>&#39;<span style="color:#e74c3c;">No</span>&#39;</code>를 새로운 줄에 출력합니다.</p>