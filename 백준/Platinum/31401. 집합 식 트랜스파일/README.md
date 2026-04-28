# [Platinum I] 집합 식 트랜스파일 - 31401

[문제 링크](https://www.acmicpc.net/problem/31401)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 49, 정답: 14, 맞힌 사람: 12, 정답 비율: 34.286%

### 분류

애드 혹, 많은 조건 분기, 자료 구조, 파싱, 재귀, 스택, 문자열, 트리

### 문제 설명

<p>은하는 정해진 전체집합 안에서 집합을 다룰 수 있는 &lsquo;아니야&rsquo;라는 언어를 생각했습니다. &lsquo;아니야&rsquo;는 <span style="color:#e74c3c;"><code>A</code></span>부터 <span style="color:#e74c3c;"><code>T</code></span>까지 총 $20$개의 집합과, 다음과 같은 세 연산을 지원해 다양한 집합을 표현할 수 있습니다.</p>

<ul>
	<li>교집합 연산자: 두 집합에 공통으로 속한 원소만을 추려 새로운 집합을 만듭니다. 기호는 <span style="color:#e74c3c;"><code>&amp;</code></span>입니다($A$ <strong>그리고</strong> $B$에 속한 원소).</li>
	<li>합집합 연산자: 두 집합 중 어느 한 쪽 이상에 속한 원소만을 추려 새로운 집합을 만듭니다. 기호는 <span style="color:#e74c3c;"><code>|</code></span>입니다($A$ <strong>또는</strong> $B$에 속한 원소).</li>
	<li>여집합 연산자: 집합에 속하지 않은 원소만을 추려 새로운 집합을 만듭니다. 기호는 <span style="color:#e74c3c;"><code>~</code></span>입니다($A$에 속하지 <strong>않은</strong> 원소).</li>
</ul>

<p>연산을 서로 도합할 수 있습니다. 예를 들어, <span style="color:#e74c3c;"><code>(A|B)&amp;~C</code></span>는 $A$와 $B$ 중 하나에 속한 원소 중 $C$에는 속하지 않은 원소들만을 추린 집합입니다. 이때, 연산자 우선순위는 <span style="color:#e74c3c;"><code>~</code></span>가 가장 높고, 그 다음이 <span style="color:#e74c3c;"><code>&amp;</code></span>, 마지막으로 <span style="color:#e74c3c;"><code>|</code></span> 순입니다. 앞서 보인 식처럼 괄호를 이용해 특정 연산자의 우선순위를 높일 수도 있습니다.</p>

<p>그런데, 자료조사 도중 주어진 집합에 원소가 있는지 판단하는, 엄청나게 빠르게 동작하는 구현체가 있는 &lsquo;빼버려&rsquo;라는 언어를 마주합니다. &lsquo;빼버려&rsquo;는 &lsquo;아니야&rsquo;와 다른 것은 모두 같고, 다음과 같은 차이점이 있습니다.</p>

<ul>
	<li>여집합 연산자를 <strong>지원하지 않습니다</strong>.</li>
	<li>대신 <strong>차집합 연산자</strong>를 지원합니다. 이 연산자는 두 집합 중 왼쪽에만 속하는 원소만를 추려 새로운 집합을 만듭니다. 기호는 <span style="color:#e74c3c;"><code>\</code></span>입니다. 즉, <span style="color:#e74c3c;"><code>A\B</code></span>는 $A$에만 속하고 $B$에는 속하지 않는 원소들만이 속하는 집합입니다.</li>
	<li>&lsquo;빼버려&rsquo;의 연산자 우선순위는 <span style="color:#e74c3c;"><code>&amp;</code></span>가 가장 높고, 그 다음이 <span style="color:#e74c3c;"><code>\</code></span>, 마지막으로 <span style="color:#e74c3c;"><code>|</code></span> 순입니다.</li>
</ul>

<p>은하는 &lsquo;아니야&rsquo;의 구현체를 만드는 데에 엄청나게 빠른 &lsquo;빼버려&rsquo;의 구현체를 이용할 생각을 했습니다. 그러려면 &lsquo;아니야&rsquo;의 식을 입력받아 빠른 시간 안에 다음과 같은 조건을 만족하는&nbsp;&lsquo;빼버려&rsquo;의 식으로 바꾸어 주는 <strong>트랜스파일러</strong>가 필요합니다.</p>

<ul>
	<li>당연히, &lsquo;아니야&rsquo;의 원래 식을 동등한 &lsquo;빼버려&rsquo;의 식으로 바꾼 결과는 <strong>원래 식과 동일한 집합을 표현</strong>해야 합니다.</li>
	<li>&lsquo;빼버려&rsquo;에서의 맥락은 &lsquo;아니야&rsquo;에서의 맥락과 동일하므로, &lsquo;아니야&rsquo;의 원래 식을 동등한 &lsquo;빼버려&rsquo;의 식으로 바꾼 결과는 <strong>원래 식에 등장하는 집합만을 사용</strong>해야 합니다.</li>
	<li>아무리 &lsquo;빼버려&rsquo;가 빠른 구현체라도, 긴 식을 처리하는 데에는 오랜 시간이 걸릴 것입니다. 따라서 &lsquo;아니야&rsquo;의 원래 식을 동등한 &lsquo;빼버려&rsquo;의 식으로 바꾼 결과는 <strong>원래 식의 길이의 $2$배를 넘어서는 안 됩니다</strong>.</li>
</ul>

<p>은하를 도와 이 트랜스파일러를 작성합시다!</p>

### 입력

<p>첫 줄에 올바른 &lsquo;아니야&rsquo;의 식이 주어집니다. 식은 공백 없이 주어지며, $2024$자 이하입니다.</p>

### 출력

<p>첫 줄에, 주어진 &lsquo;아니야&rsquo;의 식을 지문에서 설명한 조건을 만족하는 &lsquo;빼버려&rsquo;의 식으로 바꿀 수 있다면 <span style="color:#e74c3c;"><code>YES</code></span>를, 그렇지 않다면 <span style="color:#e74c3c;"><code>NO</code></span>를 출력합니다.</p>

<p>첫 줄에 <span style="color:#e74c3c;"><code>YES</code></span>를 출력했다면, 둘째 줄에 집합 식을 출력합니다. 이 식은 공백을 포함하지 않는 올바른 &lsquo;빼버려&rsquo;의 식이어야 하며, 지문에서 설명한 조건을 만족해야 합니다.</p>

### 힌트

<p>&lsquo;아니야&rsquo;와 &lsquo;빼버려&rsquo;의 BNF(Backus-Naur Form)는 다음과 같습니다. 입력으로는 &lsquo;아니야&rsquo;의 <code>Expression</code>이 주어지고, 여러분은 &lsquo;빼버려&rsquo;의 <code>Expression</code>을 출력해야 합니다. <span style="color:#e74c3c;"><code>[1]</code></span>은 &lsquo;아니야&rsquo;에서만, <span style="color:#e74c3c;"><code>[2]</code></span>는 &lsquo;빼버려&rsquo;에서만 사용 가능합니다.</p>
<style type="text/css">.nb td, .nb {
    border: none !important;
    vertical-align: middle !important;
}
</style>
<center>
<div style="text-align: center;">
<table border="1" cellpadding="1" cellspacing="1" class="nb table table-bordered" style="max-width: 25em; margin: 0px auto;">
	<tbody>
		<tr>
			<td>
			<p style="text-align: left;"><code>Expresssion =<br />
			&nbsp; | Set<br />
			&nbsp; | &quot;~&quot; Expression&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style="color:#e74c3c;"># [1]</span><br />
			&nbsp; | Expression &quot;&amp;&quot; Expression<br />
			&nbsp; | Expression &quot;\&quot; Expression <span style="color:#e74c3c;"># [2]</span><br />
			&nbsp; | Expression &quot;|&quot; Expression<br />
			&nbsp; | &quot;(&quot; Expression &quot;)&quot;</code></p>

			<p style="text-align: left;"><code>Set =<br />
			&nbsp; | &quot;A&quot; | &quot;B&quot; | &quot;C&quot; | &quot;D&quot; | &quot;E&quot;<br />
			&nbsp; | &quot;F&quot; | &quot;G&quot; | &quot;H&quot; | &quot;I&quot; | &quot;J&quot;<br />
			&nbsp; | &quot;K&quot; | &quot;L&quot; | &quot;M&quot; | &quot;N&quot; | &quot;O&quot;<br />
			&nbsp; | &quot;P&quot; | &quot;Q&quot; | &quot;R&quot; | &quot;S&quot; | &quot;T&quot;</code></p>
			</td>
		</tr>
	</tbody>
</table>
</div>
</center>