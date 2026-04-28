# [Gold IV] 옛날에는 조판을 어떻게 했을까? - 2690

[문제 링크](https://www.acmicpc.net/problem/2690)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 247, 정답: 27, 맞힌 사람: 19, 정답 비율: 16.964%

### 분류

파싱, 정규 표현식, 문자열

### 문제 설명

<p>배비지등의 디지털 방식 조판이 없었던 시대에는, 조판은 숙련공들만이 할 수 있는 예술의 일종이었다. 인쇄 공간 절약과 아름다움을 위해 특정한 문자의 조합은 하나의 문자로 나타내었으며 이것을 ligature라 한다. 예를 들면 a-e의 ligature는 &lsquo;&aelig;&rsquo;이며 f-i의 ligature는 &lsquo;ﬁ&rsquo;이다. (힌트에 가능한 모든 ligature 조합을 표시한 표가 있다)</p>

<p>또한 소문자 s를 나타내는 방법에는 &ldquo;long s&rdquo;와 &ldquo;short s&rdquo; 두 가지 방법이 있었으며, 오늘날에는&ldquo;short s&rdquo;의 형태만 쓰인다. 어떤 방법을 쓸지 결정하는 규칙은 이상하지만 복잡하지는 않다.</p>

<ol>
	<li>Short s는 단어의 끝 또는 하이픈(-)과 어퍼스트로피(`)같은 단어 속에 있는 구두점 앞에 쓴다.
	<ul>
		<li>예)&nbsp;programs, ſucceſs, hocus-pocus, revis&rsquo;d</li>
	</ul>
	</li>
	<li>Short s는 &lsquo;f&rsquo;, &lsquo;b&rsquo;, &lsquo;k&rsquo;앞에 쓴다.
	<ul>
		<li>예)&nbsp;transfer, husband, ask, ſucceſsful</li>
	</ul>
	</li>
	<li>&lsquo;ss&rsquo;로 끝나는 단어 뒤에 &lsquo;s&rsquo;로 시작하는 단어가 합성되어 &lsquo;sss&rsquo;가 포함된 단어의 경우, 가운데 s는 short s로, 나머지 s는 long s로 쓴다.
	<ul>
		<li>예) croſsﬅitch, croſsﬅaﬀ</li>
	</ul>
	</li>
	<li>위의 경우 이외에는 모두 long s로 쓴다.</li>
</ol>

<p>조판에 있어 &ldquo;단어&rdquo;라는 말이 &ldquo;식별자&rdquo;와는 다른 것임에 주의하자. 식별자는 &lsquo;_&rsquo;나 &lsquo;\$&rsquo;같은 구두점도 포함할 수 있는 반면, 단어는 문자만을 의미한다. 따라서 &ldquo;radius3&rdquo;이나 &ldquo;adios_amigio&rdquo;같은 식별자는 &ldquo;radiu&int;3&rdquo;, &ldquo;adio&int;_amigo&rdquo;가 아니라 &ldquo;radius3&rdquo;, &ldquo;adios_amigo&rdquo;로 조판된다.</p>

### 입력

<p>입력의 첫 줄에 테스트의 개수인 정수 P(1 &le; P &le; 1000)가 주어진다.</p>

<p>각각의 테스트는 1000자 이하의 문자열이 한 줄로 주어진다. 입력으로 주어지는 문자열은 알파벳 대문자, 소문자, 숫자, 공백&nbsp;그리고 다음 특수문자 <code>.,&quot;&#39;$;:?()-&lt;&gt;=!</code>로만 이루어져 있다.</p>

### 출력

<p>각각의 테스트에 대해 입력 문자열을 적절한 ligature와 &ldquo;long s&rdquo; 코드로 대체하여 출력한다. 다음 페이지의 표에 기호와 ligature에 대응하는 코드가 표시되어 있다. (short s는 바꾸지 않고 그대로 출력하며, &lsquo;IE&rsquo;와 &lsquo;OE&rsquo;는 대문자 I-E, 대문자 O-E조합에 한해서 ligature로 나타낸다.)</p>

### 힌트

<table class="table table-bordered" style="width:25%">
	<thead>
		<tr>
			<th style="width:10%">입력</th>
			<th style="width:5%">심볼</th>
			<th style="width:10%">출력 코드</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>AE</td>
			<td>&AElig;</td>
			<td>[AE]</td>
		</tr>
		<tr>
			<td>ae</td>
			<td>&aelig;</td>
			<td>[ae]</td>
		</tr>
		<tr>
			<td>OE</td>
			<td>&OElig;</td>
			<td>[OE]</td>
		</tr>
		<tr>
			<td>oe</td>
			<td>&oelig;</td>
			<td>[oe]</td>
		</tr>
		<tr>
			<td>ct</td>
			<td></td>
			<td>[ct]</td>
		</tr>
		<tr>
			<td>ff</td>
			<td>ﬀ</td>
			<td>[ff]</td>
		</tr>
		<tr>
			<td>fi</td>
			<td>ﬁ</td>
			<td>[fi]</td>
		</tr>
		<tr>
			<td>fl</td>
			<td>ﬂ</td>
			<td>[fl]</td>
		</tr>
		<tr>
			<td>ffi</td>
			<td>ﬃ</td>
			<td>[ffi]</td>
		</tr>
		<tr>
			<td>ffl</td>
			<td>ﬄ</td>
			<td>[ffl]</td>
		</tr>
		<tr>
			<td>s (short)</td>
			<td>s</td>
			<td>s</td>
		</tr>
		<tr>
			<td>s (long)</td>
			<td>ſ</td>
			<td>[longs]</td>
		</tr>
		<tr>
			<td>si</td>
			<td></td>
			<td>[longsi]</td>
		</tr>
		<tr>
			<td>sh</td>
			<td></td>
			<td>[longsh]</td>
		</tr>
		<tr>
			<td>sl</td>
			<td></td>
			<td>[longsl]</td>
		</tr>
		<tr>
			<td>ss</td>
			<td></td>
			<td>[longss]</td>
		</tr>
		<tr>
			<td>st</td>
			<td>ﬅ</td>
			<td>[longst]</td>
		</tr>
		<tr>
			<td>ssi</td>
			<td></td>
			<td>[longssi]</td>
		</tr>
	</tbody>
</table>

<p>long과 short s는 혼합해서 사용할 수 있다. 예를 들어, crossstitch는 cro[longs]s[longst]itch이 된다. (cro[longs]s[longs]titch는 정답이 아니다)</p>