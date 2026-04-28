# [Platinum V] Oulipo - 9120

[문제 링크](https://www.acmicpc.net/problem/9120)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 252, 정답: 157, 맞힌 사람: 127, 정답 비율: 69.022%

### 분류

문자열, KMP

### 문제 설명

<p>The French author Georges Perec (1936&ndash;1982) once wrote a book, La disparition, without the letter &#39;e&#39;. He was a member of the Oulipo group. A quote from the book:</p>

<p style="margin-left: 40px;">Tout avait Pair normal, mais tout s&rsquo;affirmait faux. Tout avait Fair normal, d&rsquo;abord, puis surgissait l&rsquo;inhumain, l&rsquo;affolant. Il aurait voulu savoir o&ugrave; s&rsquo;articulait l&rsquo;association qui l&rsquo;unissait au roman : stir son tapis, assaillant &agrave; tout instant son imagination, l&rsquo;intuition d&rsquo;un tabou, la vision d&rsquo;un mal obscur, d&rsquo;un quoi vacant, d&rsquo;un non-dit : la vision, l&rsquo;avision d&rsquo;un oubli commandant tout, o&ugrave; s&rsquo;abolissait la raison : tout avait l&rsquo;air normal mais&hellip;</p>

<p>Perec would probably have scored high (or rather, low) in the following contest. People are asked to write a perhaps even meaningful text on some subject with as few occurrences of a given &ldquo;word&rdquo; as possible. Our task is to provide the jury with a program that counts these occurrences, in order to obtain a ranking of the competitors. These competitors often write very long texts with nonsense meaning; a sequence of 500,000 consecutive &#39;T&#39;s is not unusual. And they never use spaces.</p>

<p>So we want to quickly find out how often a word, i.e., a given string, occurs in a text. More formally: given the alphabet {&#39;A&#39;, &#39;B&#39;, &#39;C&#39;, &hellip;, &#39;Z&#39;} and two finite strings over that alphabet, a word W and a text T, count the number of occurrences of W in T. All the consecutive characters of W must exactly match consecutive characters of T. Occurrences may overlap.</p>

### 입력

<p>The first line of the input file contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with the word W, a string over {&#39;A&#39;, &#39;B&#39;, &#39;C&#39;, &hellip;, &#39;Z&#39;}, with 1 &le; |W| &le; 10,000 (here |W| denotes the length of the string W).</li>
	<li>One line with the text T, a string over {&#39;A&#39;, &#39;B&#39;, &#39;C&#39;, &hellip;, &#39;Z&#39;}, with |W| &le; |T| &le; 1,000,000.</li>
</ul>

### 출력

<p>For every test case in the input file, the output should contain a single number, on a single line: the number of occurrences of the word W in the text T.</p>