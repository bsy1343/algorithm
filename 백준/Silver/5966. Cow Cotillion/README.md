# [Silver IV] Cow Cotillion - 5966

[문제 링크](https://www.acmicpc.net/problem/5966)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 534, 정답: 291, 맞힌 사람: 268, 정답 비율: 56.660%

### 분류

자료 구조, 문자열, 스택

### 문제 설명

<p>The cow cotillion, a fancy dance every spring, requires the cows (shown as &quot;&gt;&quot;) and bulls (shown as &quot;&lt;&quot;) to bow to each other during a dance. Schematically, one properly bowing pair of cattle is shown like this: &quot;&gt;&lt;&quot;. Sometimes another pair of cattle will sashay between a pair of bowing cows: &quot;&gt; &gt;&lt; &lt;&quot;.</p>

<p>In fact, sometimes a larger number of cows will mix it up on the dance floor: &quot;&gt; &gt;&lt; &lt; &gt;&lt;&quot; (this includes a second set of bowing cows on the right). Complex arrangements can be perfectly legal dance&nbsp;<br />
formations:</p>

<pre>
              &gt; &gt; &gt; &gt;&lt; &lt; &gt;&lt; &lt; &gt;&lt; &gt;&lt; &gt;&lt; &lt;

              | | | -- | -- | -- -- -- |
              | | ------    |          |
              | -------------          |
              --------------------------</pre>

<p>Farmer John notices that a stray heifer sometimes sneaks into a group and unbalances it: &quot;&gt; &gt;&lt; &lt; &lt;&gt;&lt;&quot;. This is strictly forbidden; FJ wants to punish the interlopers.</p>

<p>FJ has copied down records of as many as 500 cows participating in dance lines and wonders if the dance line is properly balanced (i.e., all of the cattle can be paired off in at least one way as properly bowing pair by pair). He copied only the direction each cow was bowing without any extra spaces to help determine which cow was bowing to which bull, strings like this rendition of the illegal example from the previous paragraph: &quot;&gt;&gt;&lt;&lt;&lt;&gt;&lt;&quot;. He wants you to write a program to tell him if the dance line is legal.</p>

<p>FJ has N (1 &lt;= N &lt;= 1,000) pattern recordings P_i comprising just the characters &#39;&gt;&#39; and &#39;&lt;&#39; with varying length K_i (1 &lt;= K_i &lt;= 200). &nbsp;Print &quot;legal&quot; for those patterns that include proper pairs of bowing cows and &quot;illegal&quot; for those that don&#39;t.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i contains an integer followed by a space and a string of K characters &#39;&gt;&#39; and &#39;&lt;&#39;: K_i and P_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..N: Line i contains either the word &quot;legal&quot; or &quot;illegal&quot; (without the quotes, of course) depending on whether the input has a legal bowing configuration.</li>
</ul>

<p>&nbsp;</p>