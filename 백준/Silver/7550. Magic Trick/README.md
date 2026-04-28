# [Silver II] Magic Trick - 7550

[문제 링크](https://www.acmicpc.net/problem/7550)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 18, 맞힌 사람: 18, 정답 비율: 27.692%

### 분류

구현, 문자열, 시뮬레이션, 파싱

### 문제 설명

<p>Warning! This problem statement contains a serious spoiler. It shows the trick behind a magic trick. So if you still want to be amazed in case somebody shows this trick to you then do NOT read the rest of this problem statement. Stop reading... NOW!</p>

<p>Well, you&rsquo;re still reading, so obviously you have no respect for magic tricks. Be ashamed, please. Ok, here&rsquo;s what happens. The magician shows you a text with three paragraphs like this one:</p>

<pre>
It was a horribly dark night.
The moon was shining, but not much.

A suspicious stranger entered the
bar and went straight to John Doe.

&quot;I&rsquo;m searching for aliens, can I
borrow your computer?&quot;, he said.</pre>

<p>He then asks you to secretly pick a word in the first paragraph. Then you shall do this:</p>

<ol>
	<li>Count the number of characters in your word (call that number X).</li>
	<li>From your word move on X words.</li>
</ol>

<p>Repeat these two steps until you reach the third paragraph. Then tell the magician that you&rsquo;re done. After some hocus pocus he tells you the word you ended up with.</p>

<p>For our purposes, a &ldquo;word&rdquo; is defined as consecutive letters (A-Z,a-z). For example, &ldquo;I&rsquo;m&rdquo; is regarded as two separate words.</p>

<p>For example, let&rsquo;s say you choose &ldquo;night&rdquo; in the above example. It has 5 characters, so you move on five words: &ldquo;The&rdquo;, &ldquo;moon&rdquo;, &ldquo;was&rdquo;, &ldquo;shining&rdquo;, &ldquo;but&rdquo;. Our new word is &ldquo;but&rdquo;. You move on 3 words to &ldquo;A&rdquo;, then 1 to &ldquo;suspicious&rdquo;, then 10 to &ldquo;Doe&rdquo; and then 3 to &ldquo;searching&rdquo;. Now you tell the magician that you&rsquo;re ready. He says that you&rsquo;ve reached &ldquo;searching&rdquo;.</p>

<p>How can he know? Well, it doesn&rsquo;t matter where you start in the first paragraph, you&rsquo;ll always end up at &ldquo;searching&rdquo;. The magician needs new texts and asks you to help him to find all possible outcomes (in the above example, &ldquo;searching&rdquo; is the only one). Apart from words, a possible outcome is &ldquo;-outside-&rdquo;, which means it&rsquo;s possible to jump behind the third paragraph. Also, he&rsquo;s not interested if more than three outcomes are possible.</p>

### 입력

<p>The first line contains the number of scenarios. For each scenario, three lines are given, representing the three paragraphs. No line is longer than 100000 characters. Every paragraph will contain at least one word.</p>

### 출력

<p>The output for every scenario begins with a line containing &ldquo;Scenario #i:&rdquo;, where i is the number of the scenario starting at 1. Then print the possible outcomes (possibly including &ldquo;-outside-&rdquo;) in alphabetical/lexicographical order, one word per line. Write words in lower case. Don&rsquo;t list outcomes more than once. If however there are more than three possible outcomes, then print &ldquo;-too many-&rdquo; and do *not* print any of them. Terminate the output for the scenario with a blank line.</p>