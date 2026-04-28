# [Platinum II] Type Charts - 17900

[문제 링크](https://www.acmicpc.net/problem/17900)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 8, 맞힌 사람: 6, 정답 비율: 22.222%

### 분류

2-sat, 이분 그래프, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 강한 연결 요소

### 문제 설명

<p>You are playing the game Nudg&eacute;mon, a common element of which is Nudg&eacute;mon battles. In a battle, you and your opponent each start by sending out a Nudg&eacute;mon of your choice, and then take turns attacking the opposing Nudg&eacute;mon.</p>

<p>Each attack has a type (an integer between 1 and n), and the opposing Nudg&eacute;mon also has either one or two types. Depending on these types, the attack will do different amounts of damage.</p>

<p>When an attack of type i hits a Nudg&eacute;mon with single type j, the attack gets a damage multiplier a(i, j), where a is a type matchup table consisting of entries in {0, 0.5, 1, 2}. If it hits a Nudg&eacute;mon with double types j and k, it gets a damage multiplier of a(i, j) &middot; a(i, k).</p>

<p>Depending on the value v of the damage multiplier, the game will emit different messages:</p>

<table class="table table-bordered" style="width: 40%;">
	<tbody>
		<tr>
			<td>v = 0</td>
			<td>It had no effect.</td>
			<td>x</td>
		</tr>
		<tr>
			<td>0 &lt; v &lt; 1</td>
			<td>It&rsquo;s not very effective. . .</td>
			<td>-</td>
		</tr>
		<tr>
			<td>v = 1</td>
			<td>&lt;no message&gt;</td>
			<td>=</td>
		</tr>
		<tr>
			<td>v &gt; 1</td>
			<td>It&rsquo;s super effective!</td>
			<td>+</td>
		</tr>
	</tbody>
</table>

<p>You are new to this game and do not know what the table a looks like. Trying to learn its first row, you have gathered some observations about the game&rsquo;s output when attacking various Nudg&eacute;mon with attacks of type 1. Now you are trying to reconstruct the first row in a way that is consistent with this data.</p>

### 입력

<p>The first line of input contains two integers n and m (1 &le; n &le; 10<sup>5</sup>, 1 &le; m &le; 10<sup>5</sup>), where n is the number of types and m is the number of observations.</p>

<p>Then follow m lines, each containing two integers i, j and a character c (1 &le; i, j &le; n and c is one of x,-,= or +), where c is the observed effect when attacking a Nudg&eacute;mon with types i and j, as indicated in the table above. If i = j, the Nudg&eacute;mon has just a single type.</p>

### 출력

<p>Output a single line with n characters, each either x, -, = or +. The ith character should describe the effect of attacking a Nudg&eacute;mon of type i with an attack of type 1.</p>

<p>If there are multiple valid solutions, you may output any one of them. It is guaranteed that at least one solution exists.</p>