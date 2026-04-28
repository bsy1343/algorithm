# [Gold III] 디지털 회로 개론 - 4970

[문제 링크](https://www.acmicpc.net/problem/4970)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 287, 정답: 144, 맞힌 사람: 101, 정답 비율: 46.759%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 파싱, 스택, 재귀

### 문제 설명

<p>3차 논리는 논리값이 &quot;true&quot;, &quot;false&quot;, &quot;unknown&quot;을 가지는 논리 체계이다. 이 체계에서는 &quot;false&quot;는 0의 값을 가지고, &quot;unknown&quot;은 1, &quot;true&quot;는 2의 값을 갖는다.</p>

<p>&quot;-&quot;을 단항 연산자, &quot;*&quot;와 &quot;+&quot;는 이항 연산자라고 하자. 이 연산자는 각각 NOT, AND, OR을 의미한다. 3차 논리에서 3개 연산자는 다음과 같이 정의되어 있다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4970.%E2%80%85%EB%94%94%EC%A7%80%ED%84%B8%E2%80%85%ED%9A%8C%EB%A1%9C%E2%80%85%EA%B0%9C%EB%A1%A0/64cb44d6.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4970.%E2%80%85%EB%94%94%EC%A7%80%ED%84%B8%E2%80%85%ED%9A%8C%EB%A1%9C%E2%80%85%EA%B0%9C%EB%A1%A0/64cb44d6.png" data-original-src="https://www.acmicpc.net/upload/images/tv.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:187px; width:446px" /></p>

<p>P, Q, R을 3차 논리값을 갖는 변수라고 하자. 이때, 식이 주어졌을 때, 식의 값을 2로 만드는 (P,Q,R)쌍의 개수를 구하는 프로그램을 작성하시오. 식은 다음 중 하나의 형태를 갖는다. (X와 Y는 식을 의미한다)</p>

<ul>
	<li>상수: 0, 1, 2</li>
	<li>변수: P, Q, R</li>
	<li>NOT: -X</li>
	<li>AND: (X*Y)</li>
	<li>OR: (X+Y)</li>
</ul>

<p>AND와 OR은 항상 괄호로 둘러싸여 있다.</p>

<p>예를 들어, (P*Q)가 주어졌을 때, 식의 값을 2로 만드는 (P,Q,R)쌍은 (2,2,0), (2,2,1), (2,2,2) 3가지이다.</p>

### 입력

<p>입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있고, 식을 나타낸다. 식은 0, 1, 2, P, Q, R, -, *, +, (, )로만 이루어져 있다.</p>

<p>식의 BNF형 문법은 다음과 같다.</p>

<pre>
&lt;formula&gt; ::= 0 | 1 | 2 | P | Q | R |
              -&lt;formula&gt; | (&lt;formula&gt;*&lt;formula&gt;) | (&lt;formula&gt;+&lt;formula&gt;)</pre>

<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</p>

<p>입력은 80글자를 넘지 않는다. 마지막 줄에는 &#39;.&#39;이 주어진다.</p>

### 출력

<p>각 테스트 케이스에 대해서, 입력으로 주어진 식의 값을 2로 만드는 (P,Q,R) 쌍의 개수를 출력한다.</p>