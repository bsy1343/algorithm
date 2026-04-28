# [Platinum IV] Non-Interactive Guessing Number - 15847

[문제 링크](https://www.acmicpc.net/problem/15847)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 92, 정답: 30, 맞힌 사람: 19, 정답 비율: 34.545%

### 분류

구현

### 문제 설명

<blockquote>
<p><em>Romanos: &quot;Can I submit an interactive problem to ACM-ICPC 2017 Jakarta?&quot;</em></p>

<p><em>Theodora: &quot;No.&quot;</em></p>

<p><em>Romanos: &quot;Aww, man.. That&#39;s not fun.&quot;</em></p>
</blockquote>

<p>Then Romanos decided to submit a non-interactive version of his problem to the contest; and here it is, based on his playing with Theodora.&nbsp;</p>

<p>Romanos and Theodora are playing a game. Initially, Theodora picks a number between 1 to N inclusive. Romanos&#39; goal is to determine that number. He can make up to K guesses. For each guess, he will say a number out loud as his guess. Theodora will then say one of the following answers based on the exact condition:</p>

<ul>
	<li>&quot;My number is smaller than your guess (&lt;)&rdquo;,</li>
	<li>&quot;My number is greater than your guess (&gt;)&quot;, or</li>
	<li>&quot;Your guess is correct (=)&quot;.</li>
</ul>

<p>The game will end right after one of the following:</p>

<ul>
	<li>Romanos guesses the correct number (he wins), or</li>
	<li>All K guesses are wrong (he loses).</li>
</ul>

<p>Sadly, Romanos is not playing the game seriously. He knows the best strategy to win this game, but he does not always use it. Nevertheless, he pretends that he plays seriously, hence his guess will never be a dumb one. In other words, his guess will always be a number between 1 to N inclusive and will always be consistent with all of Theodora&#39;s previous answers.</p>

<p>For example, suppose N is 10 and Romanos&#39; first guess is 4. If Theodora answers &quot;My number is smaller than your guess (&lt;)&quot; then the next Romanos&#39;s guess will always be between 1 to 3, inclusive.</p>

<p>Contrast to Romanos, Theodora is playing the game too seriously. She wants to win (by making Romanos lose) and &quot;cheats&quot; as follows.</p>

<p>Adaptively, Theodora might change her number as far as it is consistent with all of her previous answers. To do that, whenever possible, Theodora will always answer either &quot;My number is smaller than your guess (&lt;)&quot; or &quot;My number is greater than your guess (&gt;)&quot; that maximizes the possible answer range. In the case of tie, she will always answer the first one (&lt;).</p>

<p>For example, suppose N is 10 and Romanos&#39; first guess is 4. Theodora will always answer &quot;My number is greater than your guess (&gt;)&quot; because the possible answer range will be between 5 to 10 inclusive; it is larger than 1 to 3 inclusive.</p>

<p>Now, this is the actual problem proposed by Romanos. You are given N, K, and Theodora&#39;s answer for each guess. Can you show one of the possible scenario for Romanos&#39; guesses or state that it is impossible?</p>

### 입력

<p>The first line contains two integers: N K (1 &le; N &le; 10<sup>18</sup>; 1 &le; K &le; 50,000) in a line denoting the number range and the number of guesses. The second line contains a string in a line denoting Theodora&#39;s answers. Each character of the string is either &#39;&lt;&#39;, &#39;&gt;&#39;, or &#39;=&#39;, and either:</p>

<ul>
	<li>The last character of the string is &#39;=&#39; and each character of the string other than the last character is either &#39;&lt;&#39; or &#39;&gt;&#39;, and the length of the string is not more than K, or</li>
	<li>The length of the string is exactly K and each character of the string is either &#39;&lt;&#39; or &#39;&gt;&#39;.&nbsp;</li>
</ul>

### 출력

<ul>
	<li>If there is a possible scenario for Romanos&#39; guesses, the output contains M integers: A<sub>1</sub> A<sub>2</sub> ... A<sub>M</sub> in a line denoting Romanos&#39; guesses where M is the length of the string and A<sub>i</sub> is Romanos&#39; i-th guess. If there are more than one possible scenario for Romanos&#39; guesses, you may output any of them.</li>
	<li>If there is no possible scenario for Romanos&#39; guesses, just output -1 in a line.</li>
</ul>