# [Silver III] A Smart Brain is a Tasty Brain - 4466

[문제 링크](https://www.acmicpc.net/problem/4466)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 239, 정답: 122, 맞힌 사람: 65, 정답 비율: 44.828%

### 분류

구현, 자료 구조, 문자열, 파싱, 스택

### 문제 설명

<p>The zombies have cornered you and your team. There&rsquo;s no hope...</p>

<p>But wait! Suddenly, they all stop advancing and offer you a deal instead. As it turns out, the zombies are having a problem finding good tasting brains, which, to a zombie, are the smart brains (there is nothing more disgusting to a zombie than the brains of a communications major). While your brains would be really delicious, the zombies realize that they could be put to better use by helping them to find other smart brains. The deal is this: help the zombies determine whether a given brain is smart (and therefore tasty) or not, and they will let your team go (at least for now).</p>

<p>Being the big-brained team that you are, you quickly discover that brains can be determined to be smart or not if the brain can return a correct answer to a given Boolean expression. You quickly compile a list of Boolean expressions together and set off testing one expression on each brain.</p>

<p>Every Boolean expression is deterministic and is recursively defined as follows</p>

<ol>
	<li>expression = &lsquo;(&rsquo; + (value or expression) + operation + (value or expression) + &lsquo;)&rsquo;&nbsp;</li>
	<li>value = &lsquo;t&rsquo; or &lsquo;f&rsquo;</li>
	<li>operation = &lsquo;&amp;&rsquo; or &lsquo;|&rsquo;</li>
	<li>All values and expressions can be preceded with an optional &lsquo;!&rsquo; symbol.</li>
</ol>

<p>There are no characters in the expression other than what&rsquo;s listed below. Here is each character&rsquo;s definition:</p>

<ol>
	<li>&lsquo;&amp;&rsquo; represents AND. (a&amp;b) evaluates to true if both a and b are true; false otherwise.</li>
	<li>&lsquo;|&rsquo; represents OR. (a|b) evaluates to false if both a and b are false; true otherwise.</li>
	<li>&lsquo;!&rsquo; represents NOT. !(a) evaluates to false if a is true; true otherwise.</li>
	<li>&lsquo;(&lsquo; and &lsquo;)&rsquo; are the endpoints of expressions. Order of operations stipulates that all expressions inside parentheses must be evaluated first. There is always a corresponding end parenthesis &lsquo;)&rsquo; for every beginning parenthesis &lsquo;(&rsquo;.</li>
	<li>&lsquo;t&rsquo; and &lsquo;f&rsquo; represent true and false, respectively.</li>
</ol>

### 입력

<p>The first line contains an integer x such that 0 &lt; x &le; 10000. This is followed by x lines each containing a complete Boolean expression (up to 50 characters long) followed by one space, the equals symbol &lsquo;=&rsquo;, another space, and the test brain&rsquo;s evaluation of the expression (either &lsquo;t&rsquo; or &lsquo;f&rsquo;).</p>

<p>&nbsp;</p>

### 출력

<p>On one line for each test brain, print the number of the brain followed by a colon and a space followed by either &ldquo;Good brain&rdquo; if the expression was evaluated correctly or &ldquo;Bad brain&rdquo; if the expression was not evaluated correctly. Once you are finished, I suggest you start running as fast as you can, as the zombies will only give you so much of a head start for your help.</p>