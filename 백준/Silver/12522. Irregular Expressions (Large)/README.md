# [Silver III] Irregular Expressions (Large) - 12522

[문제 링크](https://www.acmicpc.net/problem/12522)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 30, 맞힌 사람: 27, 정답 비율: 56.250%

### 분류

브루트포스 알고리즘, 문자열

### 문제 설명

<p>You are competing at the 2011 World Witch and Warlock Tournament. In this round of the competition, the Head Witch challenges all contestants to test their spell deflection skills. Contestants stand in a circle, and the Head Witch stands in the center and starts casting spells. The contestants then have to cast counter-spells as quickly as possible. Any contestant who is too slow risks being turned into a toad or petrified.</p>

<p>Each spell that the Head Witch casts consists of three words -- the start, the middle and the end. Each word consists of one or more syllables. The start word is always the same as the end word and consists of at least two syllables. A syllable consists of any number of letters, including exactly one vowel. There are 5 vowels: &#39;a&#39;, &#39;e&#39;, &#39;i&#39;, &#39;o&#39; and &#39;u&#39;. All other letters are considered to be consonants, including the letter &#39;y&#39;.</p>

<p>Examples of valid syllables are &quot;ab&quot;, &quot;ra&quot;, &quot;cad&quot;, &quot;o&quot; and &quot;shabbr&quot;. Strings like &quot;ero&quot; and &quot;grrgh&quot; are not valid syllables.</p>

<p>To make things more difficult, the Head Witch speaks very fast, so you cannot easily figure out where one word ends and another one begins. What&#39;s worse, she sometimes says some useless gibberish before and after the spell in order to confuse the contestants, or she may not even cast any spell at all and say something completely unrelated instead.</p>

<p>For example, she may say &quot;abracadabra&quot;, which is a valid spell because it consists of the words &quot;abra&quot;, &quot;cad&quot; and &quot;abra&quot;, with the start word and the end word being the same. The word &quot;abra&quot; consists of two syllables -- &quot;ab&quot; and &quot;ra&quot;. The word &quot;cad&quot; consists of one syllable -- &quot;cad&quot;. (Alternatively, &quot;abra&quot; could also be interpreted as &quot;a-bra&quot; or &quot;abr-a&quot;.)</p>

<p>The Head Witch might also say &quot;kajabbamajabbajab&quot;, which contains the spell &quot;jabba ma jabba&quot;. Or she might say &quot;frufrumfuffle&quot;, which is gibberish and does not contain any spells.</p>

<p>For each expression that the Head Witch says, you want to determine quickly whether the expression contains a spell or not. Your molecular integrity depends on it! Fortunately, you have managed to conjure up a computer. Now all you need to do is determine which of the Witch&#39;s expressions contain spells.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow. Each one contains an expression, consisting of one or more lower case English letters and no spaces.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>At most 100 characters in each expression.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is either &quot;Spell!&quot; or &quot;Nothing.&quot; (be careful with spelling and punctuation).</p>